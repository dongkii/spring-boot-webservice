package com.dongkii.book.springboot.web;

import com.dongkii.book.springboot.web.solution.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionControllerTest {

    // 1st week Q1
    @Test
    public void 신고결과받기() {
        assertThat(Report_results.solution(new String[] {"muzi", "frodo", "apeach", "neo"}, new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2)).isEqualTo(new int[] {2, 1, 1, 0});
        assertThat(Report_results.solution(new String[] {"con", "ryan"}, new String[] {"ryan con", "ryan con", "ryan con", "ryan con"}, 3)).isEqualTo(new int[] {0, 0});
    }

    // 1st week Q2
    @Test
    public void 문자열압축() {
        assertThat(String_zip.solution("aabbacc")).isEqualTo(7);
        assertThat(String_zip.solution("ababcdcdababcdcd")).isEqualTo(9);
        assertThat(String_zip.solution("abcabcdede")).isEqualTo(8);
        assertThat(String_zip.solution("abcabcabcabcdededededede")).isEqualTo(14);
        assertThat(String_zip.solution("xababcdcdababcdcd")).isEqualTo(17);
    }

    // 2nd week Q1
    @Test
    public void x만큼_간격이_있는_n개의_숫자() {
        assertThat(XInterval_NNumber.solution(2, 5)).isEqualTo(new long[] {2, 4, 6, 8, 10});
        assertThat(XInterval_NNumber.solution(4, 3)).isEqualTo(new long[] {4, 8, 12});
        assertThat(XInterval_NNumber.solution(-4, 2)).isEqualTo(new long[] {-4, -8});
    }

    // 2nd week Q2
    @Test
    public void 더_맵게() {
        assertThat(The_spicy.solution(new int[] {1, 2, 3, 9, 10, 12}, 7)).isEqualTo(2);
        assertThat(The_spicy.solution(new int[] {5, 5, 6, 6, 9, 9}, 8)).isEqualTo(2);
        assertThat(The_spicy.solution(new int[] {5, 5, 5, 5, 5, 5}, 7)).isEqualTo(3);
        assertThat(The_spicy.solution(new int[] {1, 7, 9}, 7)).isEqualTo(1);
    }

    // 2nd week Q3
    @Test
    public void 오픈채팅방() {
        assertThat(OpenChatting_room
                .solution(new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"}))
                .isEqualTo(new String[] {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."});
    }

    // Practice 2022.01.28
    // Level 1
    @Test
    public void 비밀지도() {
        assertThat(SecretMap.solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28})).isEqualTo(new String[] {"#####","# # #", "### #", "# ##", "#####"});
        //assertThat(SecretMap.solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10})).isEqualTo(new String[] {"######", "### #", "## ##", " #### ", " #####", "### # "});
    }

    // Practice 2022.01.31
    // Level 1
    @Test
    public void 키패드_누르기() {
        assertThat(Keypad.solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right")).isEqualTo("LRLLLRLLRRL");
        assertThat(Keypad.solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left")).isEqualTo("LRLLRRLLLRR");
        assertThat(Keypad.solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right")).isEqualTo("LLRLLRLLRL");
    }

    // Practice 2022.02.02
    // Level 1
    @Test
    public void 예산() {
        assertThat(Budget.solution(new int[] {1,3,2,5,4}, 9)).isEqualTo(3);
        assertThat(Budget.solution(new int[] {2, 2, 3, 3}, 10)).isEqualTo(4);
    }

    // Practice 2022.02.07
    // Level 1
    @Test
    public void 다트게임() {
        assertThat(Dart.solution("1S2D*3T")).isEqualTo(37);
        assertThat(Dart.solution("1D2S#10S")).isEqualTo(9);
        assertThat(Dart.solution("1D2S0T")).isEqualTo(3);
        assertThat(Dart.solution("1S*2T*3S")).isEqualTo(23);
        assertThat(Dart.solution("1D#2S*3S")).isEqualTo(5);
        assertThat(Dart.solution("1T2D3D#")).isEqualTo(-4);
        assertThat(Dart.solution("1D2S3T*")).isEqualTo(59);
    }

    // 4st week Q2
    // Level 2
    @Test
    public void 멀쩡한사각형() {
        assertThat(Normal_square.solution(8, 12)).isEqualTo(80);
        assertThat(Normal_square.solution(5, 2)).isEqualTo(4);
        assertThat(Normal_square.solution(3, 5)).isEqualTo(8);
        assertThat(Normal_square.solution(7, 3)).isEqualTo(12);
        assertThat(Normal_square.solution(5, 19)).isEqualTo(72);
    }

    // Practice 2022.02.10
    // Level 1
    @Test
    public void 소수찾기() {
        assertThat(Minority.solution(10)).isEqualTo(4);
        assertThat(Minority.solution(5)).isEqualTo(3);
    }

    // Practice 2022.02.11
    // Level 1
    @Test
    public void 제일_작은_수_제거하기() {
        assertThat(minNum_Delete.solution(new int[] {4, 3, 2, 1})).isEqualTo(new int[] {4, 3, 2});
        assertThat(minNum_Delete.solution(new int[] {10})).isEqualTo(new int[] {-1});
    }

    // Practice 2022.02.11
    // Level 1
    @Test
    public void 문자열_내림차순으로_배치하기() {
        assertThat(String_Revers.solution("Zbcdefg")).isEqualTo("gfedcbZ");
    }

    // Practice 2022.02.11
    // Level 1
    @Test
    public void 행렬의덧셈() {
        assertThat(Matrix_sum.solution(new int[][] {{1, 2}, {2, 3}}, new int[][] {{3, 4}, {5, 6}})).isEqualTo(new int[][] {{4, 6}, {7, 9}});
        assertThat(Matrix_sum.solution(new int[][] {{1}, {2}}, new int[][] {{3}, {4}})).isEqualTo(new int[][] {{4}, {6}});
    }

    // Practice 2022.02.11
    // Level 1
    @Test
    public void 하샤드수() {
        assertThat(Hashard.solution(10)).isEqualTo(true);
        assertThat(Hashard.solution(12)).isEqualTo(true);
        assertThat(Hashard.solution(11)).isEqualTo(false);
        assertThat(Hashard.solution(13)).isEqualTo(false);
    }

    // Practice 2022.02.11
    // Level 1
    @Test
    public void 콜라츠추측() {
        assertThat(Collatz.solution(6)).isEqualTo(8);
        assertThat(Collatz.solution(16)).isEqualTo(4);
        assertThat(Collatz.solution(626331)).isEqualTo(-1);
    }

    // Practice 2022.02.11
    // Level 1
    @Test
    public void 정수_내림차순으로_배치하기() {
        assertThat(Integer_desc.solution(118372)).isEqualTo(873211);
    }

    // Practice 2022.02.11
    // Level 1
    @Test
    public void 문자열_내마음대로_정렬하기() {
        assertThat(String_sort.solution(new String[] {"sun", "bed","car"}, 1)).isEqualTo(new String[] {"car", "bed", "sun"});
        assertThat(String_sort.solution(new String[] {"abce", "abcd", "cdx"}, 2)).isEqualTo(new String[] {"abcd", "abce", "cdx"});
    }

    // Practice 2022.02.11
    // Level 1
    @Test
    public void 체육복() {
        assertThat(Gymsuit.solution(5, new int[] {2, 4}, new int[] {1, 3, 5})).isEqualTo(5);
        assertThat(Gymsuit.solution(5, new int[] {2, 4}, new int[] {3})).isEqualTo(4);
        assertThat(Gymsuit.solution(3, new int[] {3}, new int[] {1})).isEqualTo(2);
    }
}
