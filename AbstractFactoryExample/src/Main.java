import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

import java.util.Locale;

public class Main {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if(osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
	    Application app = configureApplication();
        app.paint();
    }
}
