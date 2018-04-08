package com.shu.example.study.dozer.vo;

public class MyPayDetail {
	private Long setlId;
	private String paycode;
    private VoPayAdvice paymentData = null;
	/**
	 * @return the setlId
	 */
	public Long getSetlId() {
		return setlId;
	}
	/**
	 * @param setlId the setlId to set
	 */
	public void setSetlId(Long setlId) {
		this.setlId = setlId;
	}
	/**
	 * @return the paycode
	 */
	public String getPaycode() {
		return paycode;
	}
	/**
	 * @param paycode the paycode to set
	 */
	public void setPaycode(String paycode) {
		this.paycode = paycode;
	}
	/**
	 * @return the paymentData
	 */
	public VoPayAdvice getPaymentData() {
		return paymentData;
	}
	/**
	 * @param paymentData the paymentData to set
	 */
	public void setPaymentData(VoPayAdvice paymentData) {
		this.paymentData = paymentData;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyPayDetail [setlId=" + setlId + ", paycode=" + paycode + ", paymentData=" + paymentData + "]";
	}
    
}
