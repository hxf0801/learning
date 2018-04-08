package com.shu.example.study.dozer;

import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;
import org.junit.Assert;
import org.junit.Test;

import com.shu.example.study.dozer.vo.MyPayDetail;
import com.shu.example.study.dozer.vo.MyPayDetailModel;
import com.shu.example.study.dozer.vo.VoPayDda;

public class PayDetailDozerTest {
	@Test
	public void copyMyTest(){
		MyPayDetail pd = new MyPayDetail();
		pd.setSetlId(1L);
		pd.setPaycode("DDA");
		VoPayDda payDda = new VoPayDda();
		payDda.setPayddaId(2921L);
		payDda.setRequestType("DDA");
		payDda.setCrDr("C");
		payDda.setDebitPartyType("BANK");
		payDda.setDebitPartyCode("FSCSBK");
		pd.setPaymentData(payDda);
		
		Mapper beanMapper = DozerBeanMapperBuilder.create().withCustomFieldMapper(new MyCustomFieldMapper())
				.withEventListener(new CustomEventListener()).build();
		MyPayDetailModel pdModel = beanMapper.map(pd, MyPayDetailModel.class);
		
		Assert.assertEquals("DDA", pdModel.getPaycode());
		Assert.assertTrue(pdModel.getPaymentData() instanceof VoPayDda);
		Assert.assertEquals("FSCSBK", ((VoPayDda)pdModel.getPaymentData()).getDebitPartyCode());
		
		MyPayDetail pd2 = beanMapper.map(pdModel, MyPayDetail.class);
		Assert.assertEquals("DDA", pd2.getPaycode());
		Assert.assertTrue(pd2.getPaymentData() instanceof VoPayDda);
		Assert.assertEquals("FSCSBK", ((VoPayDda)pd2.getPaymentData()).getDebitPartyCode());
		Assert.assertEquals(((VoPayDda)pd.getPaymentData()).getDebitPartyCode(), ((VoPayDda)pd2.getPaymentData()).getDebitPartyCode());
	}
}
