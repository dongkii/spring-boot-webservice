package com.dongkii.book.springboot.web.solution;

import java.util.*;

public class Keypad {
    public static String solution(int[] numbers, String hand) {
        String answer = "";

        int left = 10;
        int right = 12;

        for(int num : numbers) {
            // 왼쪽 키패드 일 때
            if(num == 1 || num == 4 || num == 7) {
                answer += "L";
                left = num;
            }
            // 오른쪽 키패드 일 때
            else if(num == 3 || num == 6 || num == 9) {
                answer += "R";
                right = num;
            }

            else {
                if(num == 0) num = 11;
                int leftmi = Math.abs(num-left)/3 + Math.abs(num-left)%3;
                int rightmi = Math.abs(num-right)/3 + Math.abs(num-right)%3;

                // 오른손이 가까움
                if(leftmi > rightmi) {
                    answer += "R";
                    right = num;
                } else if(leftmi < rightmi) {
                    answer += "L";
                    left = num;
                } else {
                    if("right".equals(hand)) {
                        answer += "R";
                        right = num;
                    } else {
                        answer += "L";
                        left = num;
                    }
                }
            }
        }

        return answer;
    }
}
