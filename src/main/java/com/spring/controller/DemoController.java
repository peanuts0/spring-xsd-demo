package com.spring.controller;

import com.spring.bean.DemoBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName:DemoController
 * Date     : 2017年02月06日 14:32:57
 *
 * @author huangsenfa
 * @since JDK 1.7
 */
@RestController
public class DemoController {

    @Resource
    private DemoBean demoBean;

    @RequestMapping("/demo")
    public String index() {
        return demoBean.getName()+ ":" +demoBean.getAddress();
    }
}
