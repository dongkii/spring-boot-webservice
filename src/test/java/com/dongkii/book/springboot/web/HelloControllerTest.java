package com.dongkii.book.springboot.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)    // 1
@WebMvcTest(controllers = HelloController.class)    // 2
public class HelloControllerTest {

    @Autowired  // 3
    private MockMvc mvc;    // 4

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))  // 5
                .andExpect(status().isOk())     // 6
                .andExpect(content().string(hello));    // 7
    }

    @Test
    public void helloDto가_리턴된다() throws Exception {
        String name = "hello";
        int amount = 1000;

        mvc.perform(get("/hello/dto")
                .param("name", name)        // 2-1
                .param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))    // 2-2
                .andExpect(jsonPath("$.amount", is(amount)));
    }

    @Test
    public void
}

/*
    2-1 param
        - API 테스트할 때 사용될 요청 파라미터를 설정합니다.
        - 단, 값은 String만 허용됩니다.
        - 그래서 숫자/날짜 등의 데이터도 등록할 때는 문자열로 변경해야만 합니다.

    2-2 jsonPath
        - JSON 응답값을 필드별로 검증할 수 있는 메소드입니다.
        - $를 기준으로 필드명을 명시합니다.
        - 여기서는 name과 amount를 검증하니 $.name, $.amount로 검증합니다.
 */