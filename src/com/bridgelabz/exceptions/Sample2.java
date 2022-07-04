package com.bridgelabz.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Sample3{

    public void m4() throws IOException {
        System.out.println("Sample3 m4()");
        File file = null;
        FileInputStream fileInputStream = null;
        try {
           file = new File("/home/manu/newfolder1/RFPSample140/src/com/bridgelabz/exceptions/gitcommands");
            fileInputStream = new FileInputStream(file);
        }
        finally {
            fileInputStream.close();
        }
    }
}
public class Sample2 extends Sample3 {

    public static void m1(){

    }

    private int m3(){
        return 0;
    }
    public void m2() {
        File file = new File("/home/manu/newfolder1/RFPSample140/src/com/bridgelabz/exceptions/gitcommands");
      try(FileInputStream fileInputStream = new FileInputStream(file);){
          System.out.println(fileInputStream.available());
          System.out.println(fileInputStream.getFD());
      }
      catch (IOException ioe){

      }
      // try-with-resources will close the resource once the end of try block is reached
    }

    @Override
    public void m4() throws FileNotFoundException {
        System.out.println("Sample2 m4()");
        File file = new File("/home/manu/newfolder1/RFPSample140/src/com/bridgelabz/exceptions/gitcommands");
        FileInputStream fileInputStream = new FileInputStream(file);
    }
}
