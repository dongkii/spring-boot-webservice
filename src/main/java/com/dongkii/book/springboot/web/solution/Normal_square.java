package com.dongkii.book.springboot.web.solution;

public class Normal_square {
    public static long solution(int w, int h) {
        long answer = 1;
    
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

        int cnt = gcd(w, h);

        answer = (w * h) - ((int)Math.pow(cnt, 2));

        return answer;
    }

    public static int gcd(int w, int h) {
        if(w % h == 0) {
            return h;
        }

        return gcd(h, w%h);
    }
}
