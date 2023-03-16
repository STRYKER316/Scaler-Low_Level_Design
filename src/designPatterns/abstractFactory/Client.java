package designPatterns.abstractFactory;

import designPatterns.abstractFactory.components.Buttons.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.Android);

        UIFactory uiFactory = flutter.createUIFactory();
//        UIFactory uiFactory = flutter.createUIFactory();

        Button button = uiFactory.createButton();
        button.changeSize();
    }
}

