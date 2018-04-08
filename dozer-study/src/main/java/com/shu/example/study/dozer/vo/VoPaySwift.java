package com.shu.example.study.dozer.vo;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VoPaySwift extends VoPayAdvice {
	private Long payswiftId;

    private String payswiftType;

    private String caseCode;

    private String hasCoverMsg;

    private String coverMsgReceiver;

    private String beneIsBank;

    private String transferCcy;

    private BigDecimal transferAmt;

    private Date valueDate;

    private String msgUserRef;

    private String senderRef;

    private String relatedRef;

    private String bankOpCode;

    private String chargesFor;

    private String priority;

    private String custType;

    private String custCode;

    private Object custName;

    private Long custAcctId;

    private String thirdPartyType;

    private String thirdPartyCode;

    private Object thirdPartyName;

    private String aggreFlag;

    private String aggreSwiftFlag;

    private Long aggrePayswiftId;

    private String payswiftStatus;

    private Date updateTime;
    public Long getPayswiftId() {
		return payswiftId;
	}

	public void setPayswiftId(Long payswiftId) {
		this.payswiftId = payswiftId;
	}

	public String getPayswiftType() {
		return payswiftType;
	}

	public void setPayswiftType(String payswiftType) {
		this.payswiftType = payswiftType;
	}

	public String getCaseCode() {
		return caseCode;
	}

	public void setCaseCode(String caseCode) {
		this.caseCode = caseCode;
	}

	public String getHasCoverMsg() {
		return hasCoverMsg;
	}

	public void setHasCoverMsg(String hasCoverMsg) {
		this.hasCoverMsg = hasCoverMsg;
	}

	public String getCoverMsgReceiver() {
		return coverMsgReceiver;
	}

	public void setCoverMsgReceiver(String coverMsgReceiver) {
		this.coverMsgReceiver = coverMsgReceiver;
	}

	public String getBeneIsBank() {
		return beneIsBank;
	}

	public void setBeneIsBank(String beneIsBank) {
		this.beneIsBank = beneIsBank;
	}

	public String getTransferCcy() {
		return transferCcy;
	}

	public void setTransferCcy(String transferCcy) {
		this.transferCcy = transferCcy;
	}

	public BigDecimal getTransferAmt() {
		return transferAmt;
	}

	public void setTransferAmt(BigDecimal transferAmt) {
		this.transferAmt = transferAmt;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public String getMsgUserRef() {
		return msgUserRef;
	}

	public void setMsgUserRef(String msgUserRef) {
		this.msgUserRef = msgUserRef;
	}

	public String getSenderRef() {
		return senderRef;
	}

	public void setSenderRef(String senderRef) {
		this.senderRef = senderRef;
	}

	public String getRelatedRef() {
		return relatedRef;
	}

	public void setRelatedRef(String relatedRef) {
		this.relatedRef = relatedRef;
	}

	public String getBankOpCode() {
		return bankOpCode;
	}

	public void setBankOpCode(String bankOpCode) {
		this.bankOpCode = bankOpCode;
	}

	public String getChargesFor() {
		return chargesFor;
	}

	public void setChargesFor(String chargesFor) {
		this.chargesFor = chargesFor;
	}


	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}


	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public Object getCustName() {
		return custName;
	}

	public void setCustName(Object custName) {
		this.custName = custName;
	}

	public Long getCustAcctId() {
		return custAcctId;
	}

	public void setCustAcctId(Long custAcctId) {
		this.custAcctId = custAcctId;
	}

	public String getThirdPartyType() {
		return thirdPartyType;
	}

	public void setThirdPartyType(String thirdPartyType) {
		this.thirdPartyType = thirdPartyType;
	}

	public String getThirdPartyCode() {
		return thirdPartyCode;
	}

	public void setThirdPartyCode(String thirdPartyCode) {
		this.thirdPartyCode = thirdPartyCode;
	}

	public Object getThirdPartyName() {
		return thirdPartyName;
	}

	public void setThirdPartyName(Object thirdPartyName) {
		this.thirdPartyName = thirdPartyName;
	}

	public String getAggreFlag() {
		return aggreFlag;
	}

	public void setAggreFlag(String aggreFlag) {
		this.aggreFlag = aggreFlag;
	}

	public String getAggreSwiftFlag() {
		return aggreSwiftFlag;
	}

	public void setAggreSwiftFlag(String aggreSwiftFlag) {
		this.aggreSwiftFlag = aggreSwiftFlag;
	}

	public Long getAggrePayswiftId() {
		return aggrePayswiftId;
	}

	public void setAggrePayswiftId(Long aggrePayswiftId) {
		this.aggrePayswiftId = aggrePayswiftId;
	}

	public String getPayswiftStatus() {
		return payswiftStatus;
	}

	public void setPayswiftStatus(String payswiftStatus) {
		this.payswiftStatus = payswiftStatus;
	}


	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}