package com.tws.refactoring.extract_variable;

public class BannerRender {
    public String renderBanner(String platform, String browser) {
        return platform.toUpperCase().contains("MAC") && browser.toUpperCase().contains("IE")
                ? "IE on Mac?" : "banner";
    }
}
