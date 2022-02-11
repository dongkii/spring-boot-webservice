package com.dongkii.book.springboot.web.solution;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class String_Revers {
    public static String solution(String s) {
        String answer = "";

        int[] arr = new int[s.length()];

        for(int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        Arrays.sort(Arrays.stream(arr).boxed().toArray(Integer[]::new), Collections.reverseOrder());

        for(int j = arr.length-1; j >= 0; j--) {
            answer += (char)arr[j];
        }
        System.out.println(answer);

        return answer;
    }
}
