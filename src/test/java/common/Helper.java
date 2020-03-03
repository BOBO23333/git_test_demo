package common;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * The type Helper.
 */
public class Helper {
    private AppiumDriver driver;
    private final int DEFAULT_TIMEOUT = 5;

    /**
     * Instantiates a new Helper.
     *
     * @param driver the driver
     */
    public Helper(AppiumDriver driver){
        this.driver = driver;
    }

    /**
     * Wait for element.
     *
     * @param by the by
     */
    public void waitForElement(By by){
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /**
     * 定义常见的定位方式
     *
     * @param id the id
     * @return the web element
     */
    public WebElement findById(String id){
        return findById(id, 0);
    }

    /**
     * Find by id web element.
     *
     * @param id    the id
     * @param index the index
     * @return the web element
     */
    public WebElement findById(String id, int index){
        waitForElement(By.id(id));
        return (WebElement) driver.findElements(By.id(id)).get(index);
    }

    public WebElement findByClsName(String clsName, int index){
        waitForElement(By.className(clsName));
        return (WebElement) driver.findElements(By.className(clsName)).get(index);
    }

    public WebElement findByClsName(String clsName){
        return findByClsName(clsName,0);
    }

    public WebElement findByText(String text, int index){
        String xpathStr = "//*[@text='" + text +"']";
        waitForElement(By.xpath(xpathStr));
        return (WebElement) driver.findElements(By.xpath(xpathStr)).get(index);
    }

    public WebElement findByText(String text){
        return (WebElement) findByText(text, 0);
    }

    public void click(WebElement element){
        System.out.println("执行控件点击操作----->");
        element.click();
    }

    public void enter(WebElement element, String string){
        System.out.println("执行输入操作，输入的文本为：" + string);
        element.sendKeys(string);
    }

    public void clear(WebElement element){
        System.out.println("执行输入框清空的操作----->");
        element.clear();
    }

    public void enterWithPreClear(WebElement element, String text){
        clear(element);
        enter(element, text);
    }

    public String getText(WebElement element){
        String text = element.getText();
        System.out.println("执行获取控件文本的操作-----> " + text);
        return text;
    }

    public void goBack(){
        driver.navigate().back();
    }
}
