package com.github.service;


import com.github.model.ResultInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 康盼Java开发工程师
 */
@FeignClient(name="provider",contextId = "resultController", path = "/api")
public interface ResultService {

    /**
     * retry
     *
     * @return
     */
    @GetMapping("/retry")
    ResultInfo retry();
}
