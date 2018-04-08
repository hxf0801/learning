package com.shu.example.study.dozer;

import org.dozer.CustomFieldMapper;
import org.dozer.classmap.ClassMap;
import org.dozer.fieldmap.FieldMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyCustomFieldMapper implements CustomFieldMapper {
	private static Logger logger = LoggerFactory.getLogger(MyCustomFieldMapper.class);

	@Override
	public boolean mapField(Object source, Object destination, Object sourceFieldValue, ClassMap classMap,
			FieldMap fieldMapping) {

		String specialClassName = "com.shu.example.study.dozer.vo.VoPayAdvice";
		if (sourceFieldValue != null && (sourceFieldValue.getClass().getSuperclass().getName().equals(specialClassName)
				|| sourceFieldValue.getClass().getName().equals(specialClassName))) {
			logger.debug("******** handling VoPayAdvice source {}", source);
			logger.debug("******** handling VoPayAdvice source field value {}", sourceFieldValue);
			logger.debug("******** handling VoPayAdvice destination {}", destination);
			logger.debug("******** handling VoPayAdvice give source value to destination");
			fieldMapping.writeDestValue(destination, sourceFieldValue);
			return true;
		}

		return false;
	}

}
