package com.dongkii.book.springboot.web.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Integer_desc {
    public static long solution(long n) {
        return Long.valueOf(Arrays.stream(String.valueOf(n).split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining()));
    }
}
