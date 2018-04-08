package com.shu.example.study.dozer.vo;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VoPayDda extends VoPayAdvice {
	private Long payddaId;

    private Date effectiveDate;

    private String requestType;

    private String crDr;

    private String debitPartyType;

    private String debitPartyCode;

    private String debitPartyName;

    private String debitCcy;

    private BigDecimal debitAmt;

    private BigDecimal debitFxrate;

    private String debitAcctCode;

    private String debitAcctNo;

    private String debitAcctType;

    private Long debitCustAcctId;

    private String debitAcctOwner;

    private String debitAcctOwnerName;

    private String debitAcctBankId;

    private String debitAcctBankBr;

    private String debitAcctCity;

    private String creditPartyType;

    private String creditPartyCode;

    private String creditPartyName;

    private String creditCcy;

    private BigDecimal creditAmt;

    private BigDecimal creditFxrate;

    private String creditAcctCode;

    private String creditAcctNo;

    private String creditAcctType;

    private Long creditCustAcctId;

    private String creditAcctOwner;

    private String creditAcctOwnerName;

    private String creditAcctBankId;

    private String creditAcctBankBr;

    private String creditAcctCity;

    private String payddaStatus;

    private Long payddaFileId;

    private String isRealtime;

    private String wfCmdParms;

    private Date createTime;

    private Date sendTime;

    private Date updateTime;

    private String remInfo;
    
    public Long getPayddaId() {
        return payddaId;
    }

    public void setPayddaId(Long payddaId) {
        this.payddaId = payddaId;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getCrDr() {
        return crDr;
    }

    public void setCrDr(String crDr) {
        this.crDr = crDr;
    }

    public String getDebitPartyType() {
        return debitPartyType;
    }

    public void setDebitPartyType(String debitPartyType) {
        this.debitPartyType = debitPartyType;
    }

    public String getDebitPartyCode() {
        return debitPartyCode;
    }

    public void setDebitPartyCode(String debitPartyCode) {
        this.debitPartyCode = debitPartyCode;
    }

    public String getDebitPartyName() {
        return debitPartyName;
    }

    public void setDebitPartyName(String debitPartyName) {
        this.debitPartyName = debitPartyName;
    }

    public String getDebitCcy() {
        return debitCcy;
    }

    public void setDebitCcy(String debitCcy) {
        this.debitCcy = debitCcy;
    }

    public BigDecimal getDebitAmt() {
        return debitAmt;
    }

    public void setDebitAmt(BigDecimal debitAmt) {
        this.debitAmt = debitAmt;
    }

    public BigDecimal getDebitFxrate() {
        return debitFxrate;
    }

    public void setDebitFxrate(BigDecimal debitFxrate) {
        this.debitFxrate = debitFxrate;
    }

    public String getDebitAcctCode() {
        return debitAcctCode;
    }

    public void setDebitAcctCode(String debitAcctCode) {
        this.debitAcctCode = debitAcctCode;
    }

    public String getDebitAcctNo() {
        return debitAcctNo;
    }

    public void setDebitAcctNo(String debitAcctNo) {
        this.debitAcctNo = debitAcctNo;
    }

    public String getDebitAcctType() {
        return debitAcctType;
    }

    public void setDebitAcctType(String debitAcctType) {
        this.debitAcctType = debitAcctType;
    }

    public Long getDebitCustAcctId() {
        return debitCustAcctId;
    }

    public void setDebitCustAcctId(Long debitCustAcctId) {
        this.debitCustAcctId = debitCustAcctId;
    }

    public String getDebitAcctOwner() {
        return debitAcctOwner;
    }

    public void setDebitAcctOwner(String debitAcctOwner) {
        this.debitAcctOwner = debitAcctOwner;
    }

    public String getDebitAcctOwnerName() {
        return debitAcctOwnerName;
    }

    public void setDebitAcctOwnerName(String debitAcctOwnerName) {
        this.debitAcctOwnerName = debitAcctOwnerName;
    }

    public String getDebitAcctBankId() {
        return debitAcctBankId;
    }

    public void setDebitAcctBankId(String debitAcctBankId) {
        this.debitAcctBankId = debitAcctBankId;
    }

    public String getDebitAcctBankBr() {
        return debitAcctBankBr;
    }

    public void setDebitAcctBankBr(String debitAcctBankBr) {
        this.debitAcctBankBr = debitAcctBankBr;
    }

    public String getDebitAcctCity() {
        return debitAcctCity;
    }

    public void setDebitAcctCity(String debitAcctCity) {
        this.debitAcctCity = debitAcctCity;
    }

    public String getCreditPartyType() {
        return creditPartyType;
    }

    public void setCreditPartyType(String creditPartyType) {
        this.creditPartyType = creditPartyType;
    }

    public String getCreditPartyCode() {
        return creditPartyCode;
    }

    public void setCreditPartyCode(String creditPartyCode) {
        this.creditPartyCode = creditPartyCode;
    }

    public String getCreditPartyName() {
        return creditPartyName;
    }

    public void setCreditPartyName(String creditPartyName) {
        this.creditPartyName = creditPartyName;
    }

    public String getCreditCcy() {
        return creditCcy;
    }

    public void setCreditCcy(String creditCcy) {
        this.creditCcy = creditCcy;
    }

    public BigDecimal getCreditAmt() {
        return creditAmt;
    }

    public void setCreditAmt(BigDecimal creditAmt) {
        this.creditAmt = creditAmt;
    }

    public BigDecimal getCreditFxrate() {
        return creditFxrate;
    }

    public void setCreditFxrate(BigDecimal creditFxrate) {
        this.creditFxrate = creditFxrate;
    }

    public String getCreditAcctCode() {
        return creditAcctCode;
    }

    public void setCreditAcctCode(String creditAcctCode) {
        this.creditAcctCode = creditAcctCode;
    }

    public String getCreditAcctNo() {
        return creditAcctNo;
    }

    public void setCreditAcctNo(String creditAcctNo) {
        this.creditAcctNo = creditAcctNo;
    }

    public String getCreditAcctType() {
        return creditAcctType;
    }

    public void setCreditAcctType(String creditAcctType) {
        this.creditAcctType = creditAcctType;
    }

    public Long getCreditCustAcctId() {
        return creditCustAcctId;
    }

    public void setCreditCustAcctId(Long creditCustAcctId) {
        this.creditCustAcctId = creditCustAcctId;
    }

    public String getCreditAcctOwner() {
        return creditAcctOwner;
    }

    public void setCreditAcctOwner(String creditAcctOwner) {
        this.creditAcctOwner = creditAcctOwner;
    }

    public String getCreditAcctOwnerName() {
        return creditAcctOwnerName;
    }

    public void setCreditAcctOwnerName(String creditAcctOwnerName) {
        this.creditAcctOwnerName = creditAcctOwnerName;
    }

    public String getCreditAcctBankId() {
        return creditAcctBankId;
    }

    public void setCreditAcctBankId(String creditAcctBankId) {
        this.creditAcctBankId = creditAcctBankId;
    }

    public String getCreditAcctBankBr() {
        return creditAcctBankBr;
    }

    public void setCreditAcctBankBr(String creditAcctBankBr) {
        this.creditAcctBankBr = creditAcctBankBr;
    }

    public String getCreditAcctCity() {
        return creditAcctCity;
    }

    public void setCreditAcctCity(String creditAcctCity) {
        this.creditAcctCity = creditAcctCity;
    }

    public String getPayddaStatus() {
        return payddaStatus;
    }

    public void setPayddaStatus(String payddaStatus) {
        this.payddaStatus = payddaStatus;
    }

    public Long getPayddaFileId() {
        return payddaFileId;
    }

    public void setPayddaFileId(Long payddaFileId) {
        this.payddaFileId = payddaFileId;
    }

    public String getIsRealtime() {
        return isRealtime;
    }

    public void setIsRealtime(String isRealtime) {
        this.isRealtime = isRealtime;
    }

    public String getWfCmdParms() {
        return wfCmdParms;
    }

    public void setWfCmdParms(String wfCmdParms) {
        this.wfCmdParms = wfCmdParms;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemInfo() {
        return remInfo;
    }

    public void setRemInfo(String remInfo) {
        this.remInfo = remInfo;
    }
    
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
