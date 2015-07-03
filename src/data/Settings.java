package data;


import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Settings {
    private static WebDriver driver;
    private DataStorage dataStorage;
    private static final String RESOURCES_PATH = "properties/${NAME}.properties";
    private boolean acceptNextAlert = true;

    protected Settings() {
        this.setDataStorage(DataStorage.getInstance());
        try {
            initProperties("Settings");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    protected static void setDriver(WebDriver driver) {
        Settings.driver = driver;
    }

    protected String getBaseUrl() {
        
        return DataStorage.getProperty("Settings").getProperty("url.base");
    }

    protected String getChromeDriverPath() {
        return DataStorage.getProperty("Settings").getProperty("path.chromedriver");
    }



    protected void initProperties() throws FileNotFoundException {
        initProperties(getClass().getSimpleName());
    }

    void initProperties(String propertiesFileName) {
        String workingDir = System.getProperty("user.dir");

        if (!DataStorage.exists(propertiesFileName)) {
            Properties properties = new Properties();
            File propertiesFile = new File(workingDir + "/properties/" + propertiesFileName + ".properties");

            try {
                properties.load(new FileReader(propertiesFile));
                DataStorage.setProperty(propertiesFileName, properties);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public final String getProperty(String key) {
        return DataStorage.getProperty(getClass().getSimpleName()).getProperty(key);
    }

    void setDataStorage(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public DataStorage getDataStorage() {
        return dataStorage;
    }

    public String getResourcesPath(String name) {
        return RESOURCES_PATH.replaceAll("\\$\\{NAME\\}", name);
    }

    protected void goHome() {
        driver.get(getBaseUrl());
    }

    public void driverClose() {
        driver.close();
    }


    protected void wait_sec() throws InterruptedException {
        Thread.sleep(Long.parseLong(DataStorage.getProperty("Settings").getProperty("wait")));
    }

    protected void alertAcept() {
        driver.switchTo().alert().accept();
    }


}
