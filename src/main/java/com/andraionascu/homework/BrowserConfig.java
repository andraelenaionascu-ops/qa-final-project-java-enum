package com.andraionascu.homework;

public class BrowserConfig {
    // Câmpuri private (Încapsulare)
    private BrowserType browser;
    private String version;
    private boolean isHeadless;

    // 1. Constructorul complet (Primește toți cei 3 parametri)
    public BrowserConfig(BrowserType browser, String version, boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }

    // 2. Constructor care primește browser și version
    public BrowserConfig(BrowserType browser, String version) {
        // Apelează primul constructor și setează isHeadless la false implicit
        this(browser, version, false);
    }

    // 3. Constructor care primește doar browser
    public BrowserConfig(BrowserType browser) {
        // Apelează al doilea constructor și setează versiunea la "latest"
        this(browser, "latest");
    }

    // Metoda Statică "Factory"
    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    // Metoda de afișare
    public void afiseazaConfig() {
        System.out.println("Browser: " + browser +
                ", Version: " + version +
                ", Headless: " + isHeadless);
    }
}
