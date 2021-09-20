package com.github.controller;

import com.github.model.ResultInfo;
import com.github.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 康盼Java开发工程师
 */
@RestController
@RequestMapping("/api")
public class ResultController {

    @Autowired
    private ResultService resultService;


    @GetMapping(path = "/retry")
    public ResultInfo retry() {
        try {
            return resultService.retry();
        } catch (Exception exception) {
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.setMessage(exception.getMessage());
            return resultInfo;
        }
    }
}
