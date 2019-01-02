package factories;

import buttons.Button;
import buttons.WinButton;
import checkbox.Checkbox;
import checkbox.WinCheckbox;

public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
