package com.example.demo.controller;

import com.example.demo.entity.ModelTemplate;
import com.example.demo.message.ServiceMessage;
import com.example.demo.service.DemoService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class DemoController {

    @Autowired
    DemoService service;

    @ApiOperation(value = "测试案例-事务控制", notes = "测试自定义查询", httpMethod = "POST")
    @PostMapping("/demo/add-info")
    public ServiceMessage<?> add(@RequestBody ModelTemplate userInfo) {
		  log.info("start get cust");
	      int count = service.add(userInfo);
	      return ServiceMessage.success(count);
    }
    
    @ApiOperation(value = "测试案例-事务控制", notes = "测试自定义查询", httpMethod = "POST")
    @PostMapping("/demo/add-list")
    @Transactional
    public ServiceMessage<?> add(@RequestBody List<ModelTemplate> userList) {
		  log.info("start get cust");
		  service.add(userList.get(0));
		  int count = 1 / 0;
		  service.add(userList.get(1));
	      return ServiceMessage.success(count);
    }
}