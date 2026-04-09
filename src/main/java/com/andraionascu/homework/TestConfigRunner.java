package com.andraionascu.homework;

public class TestConfigRunner {
    public static void main(String[] args) {
        // Instanta folosind constructorul cu 3 parametri
        BrowserConfig config1 = new BrowserConfig(BrowserType.FIREFOX, "115.0", true);

        // Instanta folosind constructorul cu 2 parametri (isHeadless va fi false)
        BrowserConfig config2 = new BrowserConfig(BrowserType.EDGE, "118.0");

        // Instanta folosind constructorul cu 1 parametru (version "latest", isHeadless false)
        BrowserConfig config3 = new BrowserConfig(BrowserType.CHROME);

        // Instanta folosind metoda statica (Factory method)
        BrowserConfig configStatic = BrowserConfig.createDefaultChromeConfig();

        // Afisare rezultate
        System.out.println("--- Rezultate Configuratii ---");
        config1.afiseazaConfig();
        config2.afiseazaConfig();
        config3.afiseazaConfig();
        configStatic.afiseazaConfig();
    }
}