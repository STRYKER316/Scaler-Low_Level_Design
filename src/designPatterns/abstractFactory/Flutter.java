package designPatterns.abstractFactory;

public class Flutter {
    private SupportedPlatforms platform = null;

    public Flutter(SupportedPlatforms platform) {
        this.platform = platform;
    }

    public void setTheme() {

    }

    public void setRefreshRate() {

    }

    public UIFactory createUIFactory() {
        return UIFactoryFactory.getUIFactory(this.platform);
    }

}

