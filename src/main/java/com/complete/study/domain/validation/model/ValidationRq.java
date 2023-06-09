package com.complete.study.domain.validation.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ValidationRq {

    // 필수값, 공백불가, 30자 제한
    @NotBlank
    @Size(max = 30)
    private String title;

    // 필수값, 공백불가, 100자 제한
    @NotBlank
    @Size(max = 100)
    private String description;

    // null 가능, 최대 list size 5,
    // 각 keyword 공백 불가, 20자 제한
    @Size(max = 5)
    private List<@NotBlank @Size(max = 20) String> keywordList = new ArrayList<>();

    // null 가능, 최소 1자 제한
    @Size(min = 1)
    private String imageFileUid;

}

