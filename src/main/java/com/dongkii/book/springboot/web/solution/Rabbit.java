package com.dongkii.book.springboot.web.solution;

public class Rabbit {
    public static int solution(int n, int k) {
        // n 토끼굴까지의 거리
        // k 토끼의 점프 횟수
        // n = 9이고 k = 3 이면 토끼굴까지의 거리는 9, 3번점프해서 도착하는 경우의 수 리턴
        // 점프할때마다 힘이 빠짐
        // n=9, k=3 경우 1 2 6, 1 3 5, 2 3 4
        // n=10, k=2 경우 1 9, 2 8, 3 7, 4 6
        // n=9, k=4 경우 1 2 3 4 = 10이라 불가

        int answer = 0;

        // 0부터 k까지의 합, k = 10일때 n은 55보다 커야함
        if((k * (k+1)) / 2 > n) {
            return 0;
        }

        return answer;
    }
}
