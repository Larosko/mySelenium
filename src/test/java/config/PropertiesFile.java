package config;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {

    private static Properties prop = new Properties();
    private static String projectPath = System.getProperty("user.dir");

    public static void main(String[] args) {
        getProperties();
        setProperties();
        getProperties();
    }

    public static void getProperties() {

        try {

            InputStream input = new FileInputStream(projectPath + "\\src\\test\\java\\config\\config.properties");
            prop.load(input);
            String browser = prop.getProperty("browser");
            System.out.println(browser);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
            System.out.println("Localized msg: " + e.getLocalizedMessage());
        }
    }

    private static void setProperties(){
        try {
            OutputStream output = new FileOutputStream(projectPath + "\\src\\test\\java\\config\\config.properties");
            prop.setProperty("browser", "chrome");
            prop.store(output, null);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
            System.out.println("Localized msg: " + e.getLocalizedMessage());
        }
    }
}
