package com.spring.support;

import com.spring.bean.DemoBean;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * ClassName:DomeBeanDefinitionParser
 * Date     : 2017年02月06日 16:55:23
 *
 * @author huangsenfa
 * @since JDK 1.7
 */
public class DemoBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    protected Class<?> getBeanClass(final Element element) {
        return DemoBean.class;
    }

    protected void doParse(final Element element, final BeanDefinitionBuilder bean) {
        bean.addPropertyValue("name",element.getAttribute("name"));
        bean.addPropertyValue("address",element.getAttribute("address"));
    }
}
