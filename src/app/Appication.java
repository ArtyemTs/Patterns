package app;

import button.Button;
import checkbox.Checkbox;
import factories.GUIFactory;

public class Appication {
    private Button button;
    private Checkbox checkbox;

    public Appication(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint (){
        button.paint();
        checkbox.paint();
    }
}
