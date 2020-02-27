package com.epam.hometask1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Birthday {

    public static void main(String[] args) throws IOException {
        int n, height = 1;
        int result = 0;
        int i;
       
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
         int arr[] = new int[n];
        for(i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > height) {
                height = arr[i];
                result = 1;
            }
            else if(arr[i] == height) {
                result++;
            }
        }
        System.out.println(result);
        }

        
    
}
