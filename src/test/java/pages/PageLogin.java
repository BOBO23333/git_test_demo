package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageLogin {
    private Helper helper;

    public PageLogin(Helper helper){
        this.helper = helper;
    }

    public WebElement getLoginUsername(){
        return helper.findById("net.oschina.app:id/et_login_username");
    }

    public WebElement getLoginPwd(){
        return helper.findById("net.oschina.app:id/et_login_pwd");
    }

    public WebElement getForgetPwd(){
        return helper.findById("net.oschina.app:id/tv_login_forget_pwd");
    }

    public WebElement getLoginSubmit(){
        return helper.findById("net.oschina.app:id/bt_login_submit");
    }

    public WebElement getLoginRegister(){
        return helper.findById("net.oschina.app:id/bt_login_register");
    }

    public void clearLoginUsername(){
        helper.clear(getLoginUsername());
    }

    public void clearLoginPwd(){
        helper.clear(getLoginPwd());
    }

    public void enterLoginUsername(String username){
        helper.enter(getLoginUsername(), username);
    }

    public void enterLoginPwd(String pwd){
        helper.enter(getLoginPwd(),pwd);
    }

    public void clickLoginBtn(){
        helper.click(getLoginSubmit());
    }

    public void login(String username, String pwd){
        clearLoginUsername();
        enterLoginUsername(username);

        clearLoginPwd();
        enterLoginPwd(pwd);

        clickLoginBtn();
    }

    public boolean isLoginShown(){
        boolean result = false;
        if(getLoginSubmit() != null)
            result = getLoginSubmit().isDisplayed();
        return result;
    }
}
