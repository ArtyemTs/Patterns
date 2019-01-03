package factory;

import buttons.Button;
import buttons.WindowsButton;

// 6.WindowsDialog
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
