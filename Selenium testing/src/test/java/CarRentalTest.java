import org.example.GuiTasks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.assertEquals;

public class CarRentalTest {

    GuiTasks guitasks = new GuiTasks();
    WebDriver driver;
    Properties appProps;

    @Before
    public void setUp() {
        appProps = guitasks.readPropertyFile();
        driver = guitasks.login();

    }

    @After
    public void tearDown() {
        guitasks.logout(driver);
    }

    @Test
    public void testAddBrand() {
            String expected = "SUCCESS:Brand Created successfully";
            driver.findElement(By.id("managebooking")).click();
            driver.findElement(By.id("brand")).click();
            WebElement web = driver.findElement(By.xpath("//*[@id=\"createbrand\"]"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            web.click();
            driver.findElement(By.name("brand")).sendKeys("Tesla");
            driver.findElement(By.id("luxury")).click();
            driver.findElement(By.id("evbrand")).click();
            driver.findElement(By.name("submit")).click();
            String actual = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div[2]/form/div[1]")).getText();
            assertEquals(expected, actual);
    }


    @Test
    public void testAddVehicle() {
            String expected = "SUCCESS:Vehicle posted successfully";
            driver.findElement(By.id("managebooking")).click();
            driver.findElement(By.id("vehicles")).click();
            WebElement web = driver.findElement(By.xpath("//*[@id=\"postavehicle\"]"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            web.click();
            driver.findElement(By.name("vehicletitle")).sendKeys("Tesla Model S");
            driver.findElement(By.name("priceperday")).sendKeys("80");
            driver.findElement(By.id("electric")).click();
            driver.findElement(By.name("vehicletitle")).sendKeys("Tesla Model S");
            driver.findElement(By.id("airconditioner")).click();
            driver.findElement(By.id("brakeassist")).click();
            driver.findElement(By.id("passengerairbag")).click();
            driver.findElement(By.name("submit")).click();
            String actual = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]")).getText();
            assertEquals(expected, actual);
        }


    @Test
    public void ProfileImageSizecheck() {
        List<WebElement> elements = driver.findElements(By.cssSelector("img"));
        assert (elements.size() > 0);
        WebElement element = elements.get(0);
        int height = element.getSize().getHeight();
        int width = element.getSize().getWidth();
        assertEquals(28, height);
        assertEquals(28, width);
    }

        @Test
    public void TestGUIElementLocationcheck() {
            List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[2]/div/div/div[1]/div/h2"));
            assert (elements.size() > 0);
            int xCoordinate = elements.get(0).getLocation().getX();
            int yCoordinate = elements.get(0).getLocation().getY();
            assertEquals(265, xCoordinate);
            assertEquals(95, yCoordinate);
    }


    @Test
    public void TestPageFlowCheck() {
            String expected1 = "Dashboard";
        String expected2 = "Manage Bookings";
        String actual1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/h2")).getText();
        assertEquals(expected1,actual1);
        driver.findElement(By.id("managebooking")).click();
        String actual2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/h2")).getText();
        assertEquals(expected2,actual2);
        }







    @Test
    public void TestContentOfGUIElement() {
        String expected = "Dashboard";
        String actual = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/h2")).getText();
        assertEquals(expected,actual);
    }
}
