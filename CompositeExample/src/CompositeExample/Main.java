package CompositeExample;

import CompositeExample.editor.ImageEditor;
import CompositeExample.shapes.Circle;
import CompositeExample.shapes.CompoundShape;
import CompositeExample.shapes.Dot;
import CompositeExample.shapes.Rectangle;


import java.awt.*;

public class Main {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, Color.BLUE, 10),

                new CompoundShape(
                        new Circle(110, 110, Color.RED, 50),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, Color.GREEN, 100, 100),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
