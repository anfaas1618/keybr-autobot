import org.openqa.selenium.safari.SafariDriver;

import org.openqa.selenium.safari.SafariOptions;

import java.sql.Driver;

import java.util.Random;

import java.util.Scanner;

public class rock

{

    public static void main(String []args) {


        SafariOptions options = new SafariOptions();

        SafariDriver driver = new SafariDriver(options);

        driver.get("https://www.keybr.com");

        driver.findElementByXPath("/html/body/div[2]/div/div[2]/div/a").click();
        driver.findElementByXPath("//*[@id=\"root\"]/section/div[3]/div/div[3]").click();


    }
}