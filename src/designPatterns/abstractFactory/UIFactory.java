package designPatterns.abstractFactory;

import designPatterns.abstractFactory.components.Buttons.Button;
import designPatterns.abstractFactory.components.Dropdowns.Dropdown;
import designPatterns.abstractFactory.components.Menus.Menu;

public interface UIFactory {
    public Button createButton();

    public Menu createMenu();

    public Dropdown createDropdown();
}
