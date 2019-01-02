package factories;

import buttons.Button;
import checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
