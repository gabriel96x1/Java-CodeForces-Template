package org.example;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = rInt();
        function(n);
    }

    public static void function(int n) {
        System.out.println(n);
    }

    public static int rInt() {
        Scanner in = new Scanner(System.in) ;
        int i = in.nextInt();
        in.close();
        return i;
    }

    public static String rStr() {
        Scanner in = new Scanner(System.in) ;
        String s = in.next();
        in.close();
        return s;
    }
}