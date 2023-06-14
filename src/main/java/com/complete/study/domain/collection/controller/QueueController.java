package com.complete.study.domain.collection.controller;

import com.complete.study.domain.collection.controllermodel.QueueTestRq;
import com.complete.study.global.ApiPath;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.Queue;

@RestController
public class QueueController {

    @PostMapping(ApiPath.QUEUE)
    public void queueTest(@Validated @RequestBody QueueTestRq rq) {

        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");

        for (int i = 0; i < 5; ++i) {
            System.out.println(queue.poll() + " 입니다.");
        }

    }

}
