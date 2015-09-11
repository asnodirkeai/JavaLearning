package com.soika.logger;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by Andrei_Soika on 9/9/2015.
 */
public class OldSchoolLoggers {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Print in System.out");
        System.err.println("Print in System.err");
        System.setErr(new PrintStream("d:/err.txt"));
        System.setOut(new PrintStream("d:/out.txt"));
        System.out.println("Print in System.out1");
        System.err.println("Print in System.err1");
    }
}
