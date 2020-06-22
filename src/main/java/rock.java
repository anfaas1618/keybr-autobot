import org.openqa.selenium.Keys;
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

import static java.util.regex.Pattern.compile;

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
        list.add(firstkey[0]);
    //  System.out.println(htmlData);
         final Pattern
                rx1 = Pattern.compile("class=\"TextInput-item\">(.*?)</span"),
                rx2 = Pattern.compile("TextInput-item--special\">(.*?)</");
        Matcher      m1 = rx1.matcher(htmlData),m2=rx2.matcher(htmlData);

                        while (m1.find() ) {
                            System.out.println(m1.group(1));
                               m2.find();
                               System.out.println(m2.group(1));

//                    list.add(m.group(1));
                }
//        driver.findElementByXPath("//*[@id=\"root\"]/section/div[3]/div/div[3]").click();
//        driver.findElementByXPath("//*[@id=\"root\"]/section/div[3]/div")
//                .sendKeys(firstkey[0]);
//                        for (String letter :list)
//
//        driver.findElementByXPath("//*[@id=\"root\"]/section/div[3]/div")
//                .sendKeys(letter);

    }

}