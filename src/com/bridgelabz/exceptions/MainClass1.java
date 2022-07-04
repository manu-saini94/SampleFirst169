package com.bridgelabz.exceptions;


import java.io.IOException;

public class MainClass1 {


    private static void writeIntoFile() throws IOException {
//        try {
            FileOperations.writeOperation();
//        }
//        catch(IOException ioe){
//            System.out.println("Catch block");
//        }
    }

    private static void readFromFile() {
      FileOperations.readOperation();
    }

    public static void main(String[] args)     {
        readFromFile();
        try {
            writeIntoFile();
        }catch(IOException ioe){
            System.out.println("catch block");
        }
    }

}
