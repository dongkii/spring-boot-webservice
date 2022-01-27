package com.dongkii.book.springboot.web.solution;

import java.util.*;

public class SecretMap {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};

        for(int i = 0; i < n; i++) {
            int tmp1 = 0;
            String str1 = "";
            int tmp2 = 0;
            String str2 = "";

            for(int j = 0; j < n; j++) {
                System.out.println(arr1[i] % Math.pow(2, n-j-1));
                str1 += String.valueOf(arr1[i] / Math.pow(2, n-j-1));
                tmp1 = (int)(arr1[i] % Math.pow(2, n-j-1));

                str2 += String.valueOf(arr2[i] / Math.pow(2, n-j-1));
                tmp2 = (int)(arr2[i] % Math.pow(2, n-j-1));
            }

            //System.out.println(str1);
            //System.out.println(str2);
        }

        return answer;
    }
}