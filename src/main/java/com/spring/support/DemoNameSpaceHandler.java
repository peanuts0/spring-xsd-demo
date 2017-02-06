package com.spring.support;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
/**
 * ClassName:DemoNameSpaceHandler
 * Date     : 2017年02月06日 16:54:02
 *
 * @author huangsenfa
 * @since JDK 1.7
 */
public class DemoNameSpaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("bean", new DemoBeanDefinitionParser());
    }
}
