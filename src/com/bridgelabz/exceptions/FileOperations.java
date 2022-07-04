package com.bridgelabz.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


class A{

    A(){
        
    }
    A(int a){

    }
}

class B extends A{

    B(int a){

    }
}

public class FileOperations {


    public static void readOperation() {
        try {
            FileReader fileReader = new FileReader("D:\\manu\\New folder (2)\\PerfiosLaptopData\\newfolder1\\RFPSample151\\src\\com\\bridgelabz\\exceptions\\ABC.txt");
            int content;
            while ((content = fileReader.read()) != -1) {
                System.out.print((char) content);
            }
            fileReader.close();
        } catch (IOException e) {

        }
        System.out.println();
        System.out.println("after");
    }

    public static void writeOperation() throws IOException {

        FileWriter fileWriter = new FileWriter("D:\\manu\\New folder (2)\\PerfiosLaptopData\\newfolder1\\RFPSample151\\src\\com\\bridgelabz\\exceptions\\ABC.txt");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Bridgelabz!!!");
        stringBuffer.append("Developer");
        String str = stringBuffer.toString();
        fileWriter.write(str);
        fileWriter.close();
    }
}
