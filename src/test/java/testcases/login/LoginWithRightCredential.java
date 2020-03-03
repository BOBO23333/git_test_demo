package testcases.login;

import common.BaseTestCase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginWithRightCredential extends BaseTestCase {
    @Test
    public void testLoginWithRightCredential() {
        pageHelper.getPageCommon().goToMySettingsTab();
        pageHelper.getPageMySettings().clickLoginIcon();
        pageHelper.getPageLogin().login("735723619@qq.com","12345678");
        assertEquals("您的账户因长时间未登录而被锁定，请绑定手机号激活账户",pageHelper.getPageMySettings().getTips());
    }
}
