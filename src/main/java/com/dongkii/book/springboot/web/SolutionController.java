package com.dongkii.book.springboot.web;

import com.dongkii.book.springboot.web.solution.Report_results;
import com.dongkii.book.springboot.web.solution.String_zip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolutionController {

    @GetMapping("/solution/report_result")
    public Report_results reportResult(@RequestParam("id_list") String[] id_list,
                                       @RequestParam("report") String[] report,
                                       @RequestParam("k") int k) {
        return new Report_results(id_list, report, k);
    }

    @GetMapping("/solution/string_zip")
    public String_zip stringzip(@RequestParam("s") String s) {
        return new String_zip(s);
    }
}
