package com.shu.example.study.dozer;

import org.dozer.DozerEventListener;
import org.dozer.event.DozerEvent;
import org.slf4j.LoggerFactory;

import com.shu.example.study.dozer.vo.VoPayAdvice;

public class CustomEventListener implements DozerEventListener {
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(CustomEventListener.class.getName());
	public void mappingStarted(DozerEvent event) {
		logger.debug("--------- inside event mappingStarted --------------");
		Class<? extends Object> sourceObjectClass = event.getSourceObject().getClass();
		if (VoPayAdvice.class.isAssignableFrom(sourceObjectClass)) {
			logger.debug("The source {} is a child of VoPayAdvice, so using specific dozer event listener PayAdviceBeanFactory", sourceObjectClass);
			event.getClassMap().setBeanFactory(PayAdviceBeanFactory.class.getName());
		} else {
			if(event.getClassMap().getBeanFactory() != null && PayAdviceBeanFactory.class.getName().equals(event.getClassMap().getBeanFactory())) {
				logger.debug("Remove old dozer event listener PayAdviceBeanFactory.");
			}
		}
	}

	public void preWritingDestinationValue(DozerEvent event) {
		

	}

	public void postWritingDestinationValue(DozerEvent event) {
		

	}

	public void mappingFinished(DozerEvent event) {
		
	}
}
