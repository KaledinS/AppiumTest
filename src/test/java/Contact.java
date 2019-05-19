
public class Contact extends TestBase {

    public void create(String firsName, String lastName, String Phone) {
        driver.findElementByAccessibilityId("Create new contact").click();
        driver.findElementById("com.android.contacts:id/left_button").click();
        driver.findElementByXPath("//android.widget.EditText[@text = 'First name']").sendKeys(firsName);
        driver.findElementByXPath("//android.widget.EditText[@text = 'Last name']").sendKeys(lastName);
        driver.findElementByXPath("//android.widget.EditText[@text = 'Phone']").sendKeys(Phone);
        driver.findElementById("com.android.contacts:id/editor_menu_save_button").click();
        driver.navigate().back();
    }

    public void search(String name) {
        driver.findElementByAccessibilityId("Search contacts").click();
        driver.findElementById("com.android.contacts:id/search_view").sendKeys(name);
    }

    public void select(String name) {
        driver.findElementByAccessibilityId(name).click();
    }

    public String verifyName() {
        return driver.findElementById("com.android.contacts:id/large_title").getText();
    }

    public String verifyPhone() {
        return driver.findElementById("com.android.contacts:id/header").getText();
    }

    public void delete() {
        driver.findElementByAccessibilityId("More options").click();
        driver.findElementByXPath("//android.widget.TextView[@text = 'Delete']").click();
        driver.findElementById("android:id/button1").click();
    }
}
