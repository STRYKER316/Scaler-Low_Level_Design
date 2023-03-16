package designPatterns.abstractFactory;

import designPatterns.abstractFactory.components.Buttons.IosButton;
import designPatterns.abstractFactory.components.Dropdowns.IosDropdown;
import designPatterns.abstractFactory.components.Menus.IosMenu;

public class IosUIFactory implements UIFactory{
    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return null;
    }

    @Override
    public IosDropdown createDropdown() {
        return null;
    }
}
