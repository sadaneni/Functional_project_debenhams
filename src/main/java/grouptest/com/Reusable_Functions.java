package grouptest.com;


        import org.junit.Assert;
        import org.openqa.selenium.By;

        import java.util.concurrent.TimeUnit;
public class Reusable_Functions extends BaseClass{




    public void login(String Username, String Password) {

        //driver.findElement(By.id("headerLogin")).click();
        driver.findElement(By.linkText("Create Account/Sign In")).isDisplayed();
        driver.findElement(By.linkText("Create Account/Sign In")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(By.className("h_tnav_but")).click();
        driver.findElement(By.id("WC_AccountDisplay_FormInput_logonId_In_Logon_1")).sendKeys(Username);
        driver.findElement(By.id("WC_AccountDisplay_FormInput_logonPassword_In_Logon_1")).sendKeys(Password);
        driver.findElement(By.id("WC_AccountDisplay_links_2")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void logout() {
        driver.findElement(By.linkText("Sign Out")).click();
    }

    public void WomenPage() {
        driver.findElement(By.linkText("Women")).click();
        driver.findElement(By.xpath("//*[@id='topnav_Women']/div[2]/ul[2]/li[10]/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    public void MenPage() {
        driver.findElement(By.linkText("Men")).click();
        driver.findElement(By.xpath("//*[@id='topnav_Men']/div[1]/div/div/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void BeautyPage() {
        driver.findElement(By.linkText("Beauty")).click();
        driver.findElement(By.xpath("//*[@id='topnav_Beauty']/div[2]/ul[3]/li[19]/a")).click();
    }

    public void Store_Finder() {

        driver.findElement(By.linkText("Store Finder")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //driver.findElement(By.xpath("")).isDisplayed();
        driver.findElement(By.xpath(".//*[@id='postcode']")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='postcode']")).clear();
        driver.findElement(By.xpath(".//*[@id='postcode']")).sendKeys("Ilford");
        // driver.findElement(By.cssSelector("html body.page-home div#page div.storeform form div input#postcode.text")).sendKeys("ilford");
        driver.findElement(By.className("submit")).click();

    }

    public void Kids() {

        driver.findElement(By.linkText("Kids")).click();
        driver.findElement(By.xpath("//*[@id='topnav_Kids']/div[2]/ul[4]/li[18]/a")).click();
        driver.findElement(By.xpath("//*[@id='pagination']/span[4]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("BODY")).isDisplayed());



    }
}