package com.sandbox.chapter15_Annotations.annotationsForJavaFeatures;

/**
 * Created by Jolin&Vash on 2014/9/21.
 */
import java.io.*;

public class BookClient { // This is Java
    public static void main(String[] args) {
        Book book = new Book();
        try {
            book.read("war-and-peace.txt");
            System.out.println(book.text().substring(0, 100));
        } catch(IOException ex) {
            System.out.println("Can't open file");
        }
    }
}
