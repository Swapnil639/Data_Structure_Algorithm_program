package com.bridgelabz;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static String name = "<<name>>";
    static String fullName = "<<full name>>";
    static String mobileNumber = "xxxxxxxxxx";
    static String date = "xx/xx/xxxx";

    static String print;

    public static void main(String[] args) {
        String input = "Hello <<name>>, We have your full name as <<full name>> in our system. Your contact number is +91 xxxxxxxxxx. Please,let us know in case of any clarification. Thank you BridgeLab 01/01/2016.";
        customizedMessage(input);

    }

    public static void customizedMessage(String input) {
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(input);
        print = matcher.replaceAll("Swapnil");
        Pattern pattern1 = Pattern.compile(fullName);
        Matcher matcher1 = pattern1.matcher(print);
        print = matcher1.replaceAll("Swapnil Patil");
        Pattern pattern2 = Pattern.compile(mobileNumber);
        Matcher matcher2 = pattern2.matcher(print);
        print = matcher2.replaceAll("9967891679");
        LocalDateTime localDateTime = LocalDateTime.now();
        Pattern pattern3 = Pattern.compile(date);
        Matcher matcher3 = pattern3.matcher(print);
        print = matcher3.replaceAll(date.format(String.valueOf(localDateTime)));
        System.out.println(print);
    }
}