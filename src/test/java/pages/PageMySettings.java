package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageMySettings {
    private Helper helper;

    public PageMySettings(Helper helper){
        this.helper = helper;
    }

    public WebElement getSettingLogo(){
        return helper.findById("net.oschina.app:id/iv_logo_setting");
    }

    public WebElement getLoginIcon(){
        return helper.findById("net.oschina.app:id/iv_portrait");
    }

    public WebElement getMyMessageItem(){
        return helper.findById("net.oschina.app:id/rl_message");
    }

    public WebElement getMyMedalItem(){
        return helper.findById("net.oschina.app:id/rl_medal");
    }

    public WebElement getMyReadHistoryItem(){
        return helper.findById("net.oschina.app:id/rl_read");
    }

    public WebElement getMyBlogItem(){
        return helper.findById("net.oschina.app:id/rl_blog");
    }

    public WebElement getMyBlacklistItem(){
        return helper.findById("net.oschina.app:id/rl_blacklist");
    }

    public WebElement getMyQuestionAndswerItem(){
        return helper.findById("net.oschina.app:id/rl_info_question");
    }

    public WebElement getMyArticleItem(){
        return helper.findById("net.oschina.app:id/rl_info_article");
    }

    public WebElement getMyActivityItem(){
        return helper.findById("net.oschina.app:id/rl_info_activities");
    }

    public WebElement getTagsItem(){
        return helper.findById("net.oschina.app:id/rl_info_tags");
    }

    public WebElement getShareFriendsItem(){
        return helper.findById("net.oschina.app:id/rl_share");
    }

    public void clickSettingLogo(){
        helper.click(getSettingLogo());
    }

    public void clickLoginIcon(){
        helper.click(getLoginIcon());
    }

    public void clickMyMessageItem(){
        helper.click(getMyMessageItem());
    }

    public void clickMyMedalItem(){
        helper.click(getMyMedalItem());
    }

    public void clickMyReadHistoryItem(){
        helper.click(getMyReadHistoryItem());
    }

    public void clickMyBlogItem(){
        helper.click(getMyBlogItem());
    }

    public void clickMyBlacklistItem(){
        helper.click(getMyBlacklistItem());
    }

    public void clickMyQuestionAndswerItem(){
        helper.click(getMyQuestionAndswerItem());
    }

    public void clickMyArticleItem(){
        helper.click(getMyArticleItem());
    }

    public void clickMyActivityItem(){
        helper.click(getMyActivityItem());
    }

    public void clickTagsItem(){
        helper.click(getTagsItem());
    }

    public void clickShareFriendsItem(){
        helper.click(getShareFriendsItem());
    }

    public String getTips() {
        return helper.getText(getTipsElement());
    }

    private WebElement getTipsElement() {
        return (WebElement)helper.findById("net.oschina.app:id/tv_message");
    }
}
