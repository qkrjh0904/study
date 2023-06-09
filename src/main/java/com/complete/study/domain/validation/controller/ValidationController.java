package com.complete.study.domain.validation.controller;

import com.complete.study.domain.validation.model.ValidationRq;
import com.complete.study.global.ApiPath;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ValidationController {

    @PostMapping(ApiPath.RECORD)
    public void validation(@Validated @RequestBody ValidationRq rq) {
        System.out.println(rq.getTitle());
        System.out.println(rq.getDescription());
        rq.getKeywordList().forEach(System.out::println);
    }

}
