package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {

    @Test
    public void should_return_IE_on_Mac_when_renderBanner_given_strings_include_MAC_and_IE() {
        //given
        BannerRender bannerRender = new BannerRender();

        //when
        String result = bannerRender.renderBanner("MACMAC", "IEIE");

        //then
        assertEquals("IE on Mac?", result);
    }

    @Test
    public void should_return_banner_when_renderBanner_given_one_string_include_MAC_or_IE() {
        //given
        BannerRender bannerRender = new BannerRender();

        //when
        String result = bannerRender.renderBanner("MA", "IEIE");

        //then
        assertEquals("banner", result);
    }

    @Test
    public void should_return_banner_when_renderBanner_given_strings_not_include_MAC_and_IE() {
        //given
        BannerRender bannerRender = new BannerRender();

        //when
        String result = bannerRender.renderBanner("MA", "II");

        //then
        assertEquals("banner", result);
    }
}