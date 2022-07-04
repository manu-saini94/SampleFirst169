package com.bridgelabz.datastructures;

public class StringClassConcepts {

    public static void main(String[] args) {
        
        // String constant Pool
        // String immutable nature

        int j = 10;
        String str = "BridgeLabz";  // new String("Bridgelabz");
        Integer i = 10; // new Integer(10);
        System.out.println(str.length());
        System.out.println(str.hashCode());
        System.out.println(str.getBytes());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(4));
        System.out.println();
        for (char ch:str.toCharArray()) {
            System.out.println(ch);
        }
        System.out.println();
        System.out.println(str.chars());
        System.out.println(str.toCharArray());
        System.out.println(str.concat(" Employee"));
        System.out.println(str.replace('B','C'));
        System.out.println(str);

        String str2 = new String("Bridgelabz-is-cool");
        String[] strArray = str2.split("-");

        for (String s:strArray) {
            System.out.println(s);
        }


        // String Constant Pool

        // Heap area

        String str3 = "BCD";  //
        String str4 = "EFG";  //
        String str5 = "HIJ";
        String str6 = "BCD";
        String str7 = "EFG";

        String str8 = new String("EFG");

        String str9 = new String("EFG");

        System.out.println("----------------------");
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str5.hashCode());
        System.out.println(str6.hashCode());
        System.out.println(str7.hashCode());
        System.out.println(str8.hashCode());




        System.out.println(str3 == str4); // false

        System.out.println(str3 == str6);  // true

        System.out.println(str4 == str7);

        System.out.println(str7 == str8);

        System.out.println(str8 == str9);

        System.out.println(str3.equals(str4));

        System.out.println(str7.equals(str8));

        System.out.println(str8.equals(str9));


        // String immutable nature
        // immutable => That cannot be changed
        System.out.println("__________");
        String str10 = "JHI"; // new object will be created
        System.out.println(str10.hashCode());
        str10 = "MNO";
        System.out.println(str10.hashCode());
        str10 = "JHI";
        System.out.println(str10.hashCode());











    }
}
