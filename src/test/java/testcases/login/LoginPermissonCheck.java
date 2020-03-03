package testcases.login;

import common.BaseTestCase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * The type Login permisson check.
 */
public class LoginPermissonCheck extends BaseTestCase {

    /**
     * Test login permisson.
     */
    @Test
    public void testLoginPermisson() {
        pageHelper.getPageCommon().goToMySettingsTab();

        pageHelper.getPageMySettings().clickLoginIcon();
        check();

        pageHelper.getPageMySettings().clickMyMessageItem();
        check();

        pageHelper.getPageMySettings().clickMyMedalItem();
        check();
    }

    private void check(){
        assertTrue(pageHelper.getPageLogin().isLoginShown());
        pageHelper.getPageCommon().goBack();
    }
}
