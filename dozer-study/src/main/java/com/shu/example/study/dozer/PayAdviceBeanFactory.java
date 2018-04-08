package com.shu.example.study.dozer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.dozer.BeanFactory;
import org.dozer.util.MappingUtils;
import org.slf4j.LoggerFactory;

import com.shu.example.study.dozer.vo.VoPayAdvice;

public class PayAdviceBeanFactory implements BeanFactory {
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(PayAdviceBeanFactory.class.getName());

	@Override
	public Object createBean(Object source, Class<?> sourceClass, String targetBeanId) {
		logger.debug("source is {}, its class is {}", source, sourceClass);
		if (VoPayAdvice.class.isAssignableFrom(sourceClass)) {
			logger.debug("It is child of VoPayAdvice, so give itself to target.");
			return source;
		}
		// Create using public or private no-arg constructor
	      try {
	        return newInstance(sourceClass);
	      } catch (Exception e) {
	          MappingUtils.throwMappingException(e);
	      }
	      return null;
	}
	
	private static <T> T newInstance(Class<T> clazz) {
	      //Create using public or private no-arg constructor
	      Constructor<T> constructor = null;
	      try {
	        constructor = clazz.getDeclaredConstructor();
	      } catch (SecurityException e) {
	        MappingUtils.throwMappingException(e);
	      } catch (NoSuchMethodException e) {
	        MappingUtils.throwMappingException(e);
	      }

	      if (constructor == null) {
	        MappingUtils.throwMappingException("Could not create a new instance of the dest object: " + clazz
	                + ".  Could not find a no-arg constructor for this class.");
	      }

	      // If private, make it accessible
	      if (!constructor.isAccessible()) {
	        constructor.setAccessible(true);
	      }

	      T result = null;
	      try {
	        result = constructor.newInstance();
	      } catch (IllegalArgumentException e) {
	        MappingUtils.throwMappingException(e);
	      } catch (InstantiationException e) {
	        MappingUtils.throwMappingException(e);
	      } catch (IllegalAccessException e) {
	        MappingUtils.throwMappingException(e);
	      } catch (InvocationTargetException e) {
	        MappingUtils.throwMappingException(e);
	      }
	      return result;
	    }
}
