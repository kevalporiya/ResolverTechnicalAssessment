package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public Properties properties;

    public ConfigReader() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/main/java/resources/config.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getURL() {
        return properties.getProperty("url");        
    }
    public String getEmailInput() {
        return properties.getProperty("email");        
    }
    public String getPasswordInput() {
        return properties.getProperty("password");     
    }
    public String getExpectedCellValue() {
        return properties.getProperty("expectedCellValue");
    }
    public String getExpectedOptionCellValue() {
        return properties.getProperty("optionCellValue");
    }
    public String getExpectedOptionSelectListValue() {
        return properties.getProperty("optionSelectList");
    }
    public int getExpectedListgroupCount() {
        return Integer.parseInt(properties.getProperty("listGroup"));
    }
    public String getExpectedSecondListItem() {
        return properties.getProperty("secondListItem");
    }
    public int getExpectedSecondListItemBadgeValue() {
        return Integer.parseInt(properties.getProperty("secondItembadgeValue"));
    }
    public String getExpectedSuccessMessage() {
        return properties.getProperty("successMessage");
    }
}
