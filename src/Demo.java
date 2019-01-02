import app.Appication;
import factories.GUIFactory;
import factories.MacFactory;
import factories.WinFactory;

public class Demo {
    private static Appication configApp (){
        Appication app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new MacFactory();
            app = new Appication(factory);
        } else {
            factory = new WinFactory();
            app = new Appication(factory);
        }
        return app;
    }

    public static void main(String[] args) {

        Appication app = configApp();
        app.paint();
    }
}
