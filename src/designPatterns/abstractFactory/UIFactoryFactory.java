package designPatterns.abstractFactory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms platform) {
        if (platform.equals(SupportedPlatforms.Android))
            return new AndroidUIFactory();
        else if (platform.equals(SupportedPlatforms.Ios))
            return new IosUIFactory();
        return null;
    }
}

