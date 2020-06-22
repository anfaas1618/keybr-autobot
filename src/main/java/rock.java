import org.openqa.selenium.safari.SafariDriver;

import org.openqa.selenium.safari.SafariOptions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.sql.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import java.util.Scanner;
import java.util.regex.Pattern;

public class rock

{

    public static void main(String []args) {

        List<String> list=new ArrayList<String>();

        SafariOptions options = new SafariOptions();

        SafariDriver driver = new SafariDriver(options);

        driver.get("https://www.keybr.com");
        driver.findElementByXPath("/html/body/div[2]/div/div[2]/div/a").click();
        String htmlData =driver.getPageSource();
        String[] firstkey_split=htmlData.split("\"TextInput-item TextInput-item--cursor\">");
        String[] firstkey=firstkey_split[1].split("</span>");

        System.out.println(firstkey[0]);
//        Pattern   p = Pattern.compile("<img src=\"(.*?)\" alt");
//        Matcher      m = p.matcher(htmlData);
        driver.findElementByXPath("//*[@id=\"root\"]/section/div[3]/div/div[3]").click();



    }
}