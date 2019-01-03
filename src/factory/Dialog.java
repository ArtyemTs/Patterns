package factory;

import buttons.Button;

public abstract class Dialog {

    public void renderWindow(){

        Button okBatton = createButton();

    }

    public abstract Button createButton();

}
