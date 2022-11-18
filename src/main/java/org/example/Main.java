package org.example;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int n = rint(in);
        function(n);
        in.close();
    }

    public static void function(int n) {
        System.out.println(n);
    }
    
    public static int rint(Scanner in) {
        return in.nextInt();
    }

    public static String rstr(Scanner in) {
        return in.next();
    }
}
