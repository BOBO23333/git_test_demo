package common;

import pages.*;

/**
 * The type Page helper.
 */
public class PageHelper {
    private Helper helper;
    private PageCommon pageCommon;
    private PageLogin pageLogin;
    private PageMySettings pageMySettings;
    private PageSettings pageSettings;
    private PageAbout pageAbout;
    private PageNews pageNews;

    /**
     * Instantiates a new Page helper.
     *
     * @param helper the helper
     */
    public PageHelper(Helper helper) {
        this.helper = helper;
    }

    /**
     * Gets page common.
     *
     * @return the page common
     */
    public PageCommon getPageCommon() {
        if (pageCommon == null) {
            pageCommon = new PageCommon(helper);
        }
        return pageCommon;
    }

    /**
     * Gets page login.
     *
     * @return the page login
     */
    public PageLogin getPageLogin() {
        if (pageLogin == null) {
            pageLogin = new PageLogin(helper);
        }
        return pageLogin;
    }

    /**
     * Gets page my settings.
     *
     * @return the page my settings
     */
    public PageMySettings getPageMySettings() {
        if (pageMySettings == null) {
            pageMySettings = new PageMySettings(helper);
        }
        return pageMySettings;
    }

    /**
     * Gets page settings.
     *
     * @return the page settings
     */
    public PageSettings getPageSettings() {
        if (pageSettings == null) {
            pageSettings = new PageSettings(helper);
        }
        return pageSettings;
    }

    /**
     * Gets page about.
     *
     * @return the page about
     */
    public PageAbout getPageAbout() {
        if (pageAbout == null) {
            pageAbout = new PageAbout(helper);
        }
        return pageAbout;
    }

    public PageNews getPageNews(){
        if(pageNews == null) {
            pageNews = new PageNews(helper);
        }
        return pageNews;
    }
}
