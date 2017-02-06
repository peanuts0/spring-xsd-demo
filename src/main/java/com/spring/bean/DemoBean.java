package com.spring.bean;

import org.springframework.stereotype.Component;

/**
 * ClassName:DemoBean
 * Date     : 2017年02月06日 16:45:08
 *
 * @author huangsenfa
 * @since JDK 1.7
 */
@Component
public class DemoBean {

    private String name;

    private String address;

    public DemoBean() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
