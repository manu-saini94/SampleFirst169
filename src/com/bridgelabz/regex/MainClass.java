package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {


//    static final String EXP_1 = "^[0-9a-zA-Z]{5,}$";

    //  * => zero or more times
    //  + => one or more times
    //  ? => zero or one time
    //  [] => to group a set of characters
    //  () => to group multiple expressions
    //  ^ => start of the string
    //  $ => represent end of the string


    static Pattern abc = Pattern.compile("^([0-9]+[a-zA-Z]){3,}[0-9]*$");

    public static void main(String[] args) {

        String exp = "123ab1c9299292929292929c1221";
        Matcher matcher = abc.matcher(exp);
        System.out.println(matcher.matches());


    }
}
