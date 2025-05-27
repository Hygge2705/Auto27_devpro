package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //khởi tạo trình duyệt chrome
        WebDriver driver = new FirefoxDriver();

        //mở trang swag labs
        driver.get("https://www.saucedemo.com/");

        // in ra tiêu đề trang để kiểm tra
        System.out.println("Title: " +driver.getTitle());

        // đợi vài giây để quan sát (số giây tuỳ chọn)
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}