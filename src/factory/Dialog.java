package factory;

import buttons.Button;

// 4/Dialog
public abstract class Dialog {

    public void renderWindow(){

        Button okBatton = createButton();

    }

    public abstract Button createButton();

}
