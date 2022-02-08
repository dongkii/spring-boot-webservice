package com.dongkii.book.springboot.web.solution;

public class Normal_square {
    public static long solution(int w, int h) {
        long answer = 1;

        int all = w * h;

        // 높이와 넓이가 같을 경우
        if( w == h ){
            return w * w - w;
        }

        // 항상 w가 크도록
        if( h > w ) {
            int tmp = h;
            h = w;
            w = tmp;
        }

        // 최대공약수를 구함
        int cnt = gcd(w, h);
        System.out.println(cnt);

        // 높이와 넓이를 최대공약수로 나누고 처리
        w = w/cnt;
        h = h/cnt;

        // 대각선 길이를 구함
        int line = (int)Math.ceil(Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2)));

        answer = all - (line * cnt);
        System.out.println(answer);

        return answer;
    }

    public static int gcd(int w, int h) {
        if(w % h == 0) {
            return h;
        }

        return gcd(h, w%h);
    }
}
