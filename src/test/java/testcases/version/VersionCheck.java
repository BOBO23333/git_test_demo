package testcases.version;

import common.BaseTestCase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class VersionCheck extends BaseTestCase {
    @Test
    public void testVersionCheck() {
        pageHelper.getPageCommon().goToMySettingsTab();
        pageHelper.getPageMySettings().clickSettingLogo();
        pageHelper.getPageSettings().clickAboutItem();
        assertEquals("v4..2 (2001200800)", pageHelper.getPageAbout().getVersion());
    }
}
