package com.example.demo;

import static java.util.Arrays.asList;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;
@Component
public class MyDynamicBeanFactory implements BeanFactoryPostProcessor, InitializingBean {
	private List<String> bookInstances;
	@Override
	public void afterPropertiesSet() throws Exception {
		this.bookInstances = asList(PropertiesLoaderUtils
				.loadProperties(new ClassPathResource("/application.properties"))
				.getProperty("book.instances", "")
				.split(","));
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		final BeanDefinitionRegistry registry = (BeanDefinitionRegistry) beanFactory;
		for(String instance: bookInstances){
			registry.registerBeanDefinition(instance, BeanDefinitionBuilder
				.rootBeanDefinition(instance).setScope(BeanDefinition.SCOPE_PROTOTYPE)
				.getBeanDefinition());
		}
	}

}
