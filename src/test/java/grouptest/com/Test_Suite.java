package grouptest.com;


        import org.junit.*;
        import org.openqa.selenium.By;
        import org.openqa.selenium.firefox.FirefoxDriver;


public class Test_Suite extends BaseClass{

    //object

    Reusable_Functions reuse= new Reusable_Functions();
    //----------Test Data--------------
    String Username="rex.friendship@gmail.com",Password="v478478K";

    @BeforeClass
    public static void setUp(){
        driver = new FirefoxDriver();
        //Url
        driver.get("http://www.debenhams.com/");
        driver.manage().window().maximize();
    }

    @Before
    public void login()
    {
        reuse.login(Username,Password);
    }
    @After
    public void logout(){
        reuse.logout();

    }
    @AfterClass
    public static void tearDown(){

        // driver.close();
        // driver.quit();
    }
    @Test
    //Method-1
    public void method_1() {
        //women page
        reuse.WomenPage();
        //logout

    }

    @Test
    public void method_2(){

        reuse.MenPage();


    }
    @Test
    public void method_3(){

        reuse.BeautyPage();
        Assert.assertTrue(driver.findElement(By.id("herobox")).isDisplayed());
    }

    @Test

    public void method_4(){

        reuse.Kids();

    }



}
