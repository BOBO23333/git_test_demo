package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageNews {
    private Helper helper;

    public PageNews(Helper helper){
        this.helper = helper;
    }

    public WebElement getNewsTitleElementByIndex(int index){
        return helper.findById("net.oschina.app:id/tv_title", index);
    }

    public void clickNewsTitleByIndex(int index){
        helper.click(getNewsTitleElementByIndex(index));
    }
}
