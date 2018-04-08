package com.example.demo.dynamicbeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.stereotype.Component;

@Component
class DynamicBeanFactoryProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		final BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry) beanFactory;
		for(int index=0; index < 5; index++){
			beanDefinitionRegistry.registerBeanDefinition("repeatableBean" + index, BeanDefinitionBuilder
				.rootBeanDefinition(DynamicBeanExample.class)
				.setFactoryMethodOnBean("createInstance", "dynamicBeanFactoryProcessor")
				.addConstructorArgValue("repeatable bean " + index)
				.addConstructorArgReference("testDependency")
				.getBeanDefinition());
		}
	}

	DynamicBeanExample createInstance(String beanId, TestDependency testDependency) {
		return new DynamicBeanExample(beanId, testDependency);
	}
}
