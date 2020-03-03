package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

/**
 * The type Page common.
 */
public class PageCommon {
    private Helper helper;

    /**
     * Instantiates a new Page common.
     *
     * @param helper the helper
     */
    public PageCommon(Helper helper){
        this.helper = helper;
    }

    /**
     * Get home tab web element.
     *
     * @return the web element
     */
    public WebElement getHomeTab(){
        return helper.findById("net.oschina.app:id/nav_item_news");
    }

    /**
     * Get moment tab web element.
     *
     * @return the web element
     */
    public WebElement getMomentTab(){
        return helper.findById("net.oschina.app:id/nav_item_tweet");
    }

    /**
     * Get publish tab web element.
     *
     * @return the web element
     */
    public WebElement getPublishTab(){
        return helper.findById("net.oschina.app:id/nav_item_tweet_pub");
    }

    /**
     * Get explore tab web element.
     *
     * @return the web element
     */
    public WebElement getExploreTab(){
        return helper.findById("net.oschina.app:id/nav_item_explore");
    }

    /**
     * Get my settings tab web element.
     *
     * @return the web element
     */
    public WebElement getMySettingsTab(){
        return helper.findById("net.oschina.app:id/nav_item_me");
    }

    /**
     * Go to home tab.
     */
    public void goToHomeTab(){
        helper.click(getHomeTab());
    }

    /**
     * Go to moment tab.
     */
    public void goToMomentTab(){
        helper.click(getMomentTab());
    }

    /**
     * Go to publish tab.
     */
    public void goToPublishTab(){
        helper.click(getPublishTab());
    }

    /**
     * Go to explore tab.
     */
    public void goToExploreTab(){
        helper.click(getExploreTab());
    }

    /**
     * Go to my settings tab.
     */
    public void goToMySettingsTab(){
        helper.click(getMySettingsTab());
    }

    public void goBack(){
        helper.goBack();
    }
}
