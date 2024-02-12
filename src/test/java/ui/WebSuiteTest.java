package ui;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class WebSuiteTest extends BaseTest {

    @Test
    public void openRedRoverWebsite(){
        getDriver().get("https://redrover.school");
        Assert.assertEquals("RedRover | Non-commercial it-school", getDriver().getTitle());
    }


    @Test
    public void headerIsPresent(){
        getDriver().get("https://redrover.school");
        Assert.assertTrue(getDriver().findElement(By.xpath("//a[@href = '/#training']")).isDisplayed());
    }


    @Test
    public void openTeachersPage(){
        getDriver().get("https://redrover.school");
        getDriver().findElement(By.xpath("//a[@href = '/en/teachers']")).click();
        Assert.assertEquals(getDriver().getTitle(), "RedRover | Teachers");
    }

}
