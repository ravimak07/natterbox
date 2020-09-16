package com.natterbox.cucumber;



import com.cucumber.listener.Reporter;
import com.natterbox.basepage.BasePage;
import com.natterbox.browserselector.BrowserSelector;
import com.natterbox.loadproperty.LoadProperty;
import com.natterbox.utility.UtilityRM;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
 * Ravi's Creation
 * Date of Creation
 */

public class Hook extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseURL = loadProperty.getProperty("baseURL");
    String browser = loadProperty.getProperty("browser");
    private String screenShotPath;

    @Before
    public void openBrowser(){
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        Reporter.assignAuthor("NATTERBOX","RM");
    }
    @After
    public void closeBrowse(Scenario scenario){

        if (scenario.isFailed()){
            String screenShotPath = UtilityRM.getScreenshot(driver,scenario.getName().replace(" ","_"));
        }

        try {
            Reporter.addScreenCaptureFromPath(screenShotPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}