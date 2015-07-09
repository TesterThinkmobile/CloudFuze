package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class DeleteCloudPage extends BasePage {

    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public DeleteCloudPage() {
        super();

    }


    public void Delete_all_Clouds() throws InterruptedException {

        List <WebElement> delete_button = driver.findElements(By.id("CFDeleteCloud"));
       for (WebElement element : delete_button ){
           element.click();
           wait_sec();

           WebElement delete_window = driver.findElement(By.cssSelector("#CFCLdeleteModal"));
           delete_window.isDisplayed();
           wait_sec();

           WebElement yes_button = driver.findElement(By.cssSelector("#CFCLDelete"));
           yes_button.click();
           wait_sec();

       }




    }


}
