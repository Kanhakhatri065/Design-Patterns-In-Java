package CompositeExample.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CompoundShape extends BaseShape {
    protected List<Shape> children = new ArrayList<Shape>();

    public CompoundShape(Shape... components) {
        super(0, 0, Color.BLACK);
        this.add(components);
    }

    public void add(Shape component) {
        this.children.add(component);
    }

    public void add(Shape... components) {
        this.children.addAll(Arrays.asList(components));
    }

    public void remove(Shape child) {
        this.children.remove(child);
    }

    public void remove(Shape... components) {
        this.children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        this.children.clear();
    }

    @Override
    public int getX() {
        if(this.children.size() == 0) {
            return 0;
        }

        int x = this.children.get(0).getX();
        for(Shape child : this.children) {
            x = Math.min(x, child.getX());
        }

        return x;
    }

    @Override
    public int getY() {
        if(this.children.isEmpty()) {
            return 0;
        }

        int y = this.children.get(0).getY();
        for(Shape shape : this.children) {
            y = Math.min(y, shape.getY());
        }

        return y;
    }

    @Override
    public int getWidth() {
        int maxWidth = 0;
        int x = this.getX();
        for(Shape child : this.children) {
            int childRelativeX = child.getX() - x;
            int childWidth = childRelativeX + child.getWidth();
            maxWidth = Math.max(maxWidth, childWidth);
        }

        return maxWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = 0;
        int y = this.getY();
        for(Shape child : this.children) {
            int childRelativeY = child.getY() - y;
            int childHeight = childRelativeY + child.getHeight();
            maxHeight = Math.max(maxHeight, childHeight);
        }

        return maxHeight;
    }

    @Override
    public void move(int x, int y) {
        for(Shape child : this.children) {
            child.move(x, y);
        }
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        for(Shape child : this.children) {
            if(child.isInsideBounds(x, y)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void unSelect() {
        super.unSelect();
        for(Shape child : this.children) {
            child.unSelect();
        }
    }

    public boolean selectChildAt(int x, int y) {
        for(Shape child : this.children) {
            if(child.isInsideBounds(x, y)) {
                child.select();
                return true;
            }
        }

        return false;
    }

    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            this.enableSelectionStyle(graphics);
            graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
            this.disableSelectionStyle(graphics);
        }

        for (Shape child : this.children) {
            child.paint(graphics);
        }
    }
}
