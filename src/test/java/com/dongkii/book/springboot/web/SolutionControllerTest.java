package com.dongkii.book.springboot.web;

import com.dongkii.book.springboot.web.solution.Report_results;
import com.dongkii.book.springboot.web.solution.String_zip;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionControllerTest {

    @Test
    public void 신고결과받기() {
        assertThat(Report_results.solution(new String[] {"muzi", "frodo", "apeach", "neo"}, new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2)).isEqualTo(new int[] {2, 1, 1, 0});
        assertThat(Report_results.solution(new String[] {"con", "ryan"}, new String[] {"ryan con", "ryan con", "ryan con", "ryan con"}, 3)).isEqualTo(new int[] {0, 0});
    }

    @Test
    public void 문자열압축() {
        assertThat(String_zip.solution("aabbacc")).isEqualTo(7);
        assertThat(String_zip.solution("ababcdcdababcdcd")).isEqualTo(9);
        assertThat(String_zip.solution("abcabcdede")).isEqualTo(8);
        assertThat(String_zip.solution("abcabcabcabcdededededede")).isEqualTo(14);
        assertThat(String_zip.solution("xababcdcdababcdcd")).isEqualTo(17);
    }
}
