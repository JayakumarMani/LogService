package com.cl.hibernate.dao;

import java.util.Date;

/**
 * LogEntries generated by hbm2java
 */
public class LogEntries implements java.io.Serializable {

	private String logId;
	private Integer appId;
	private String sourceIp;
	private String moduleName;
	private String functionName;
	private String transactionRefId;
	private String subTransactionId;
	private Integer logLevel;
	private Date logDatetime;
	private String logBy;
	private Date logCreateddatetime;
	private String logEntryType;
	private String logMessage;

	public LogEntries() {
	}

	public LogEntries(String logId) {
		this.logId = logId;
	}

	public LogEntries(String logId, Integer appId, String sourceIp,
			String moduleName, String functionName, String transactionRefId,
			String subTransactionId, Integer logLevel, Date logDatetime,
			String logBy, Date logCreateddatetime, String logEntryType,
			String logMessage) {
		this.logId = logId;
		this.appId = appId;
		this.sourceIp = sourceIp;
		this.moduleName = moduleName;
		this.functionName = functionName;
		this.transactionRefId = transactionRefId;
		this.subTransactionId = subTransactionId;
		this.logLevel = logLevel;
		this.logDatetime = logDatetime;
		this.logBy = logBy;
		this.logCreateddatetime = logCreateddatetime;
		this.logEntryType = logEntryType;
		this.logMessage = logMessage;
	}

	public String getLogId() {
		return this.logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public Integer getAppId() {
		return this.appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getTransactionRefId() {
		return this.transactionRefId;
	}

	public void setTransactionRefId(String transactionRefId) {
		this.transactionRefId = transactionRefId;
	}

	public String getSubTransactionId() {
		return this.subTransactionId;
	}

	public void setSubTransactionId(String subTransactionId) {
		this.subTransactionId = subTransactionId;
	}

	public Integer getLogLevel() {
		return this.logLevel;
	}

	public void setLogLevel(Integer logLevel) {
		this.logLevel = logLevel;
	}

	public Date getLogDatetime() {
		return this.logDatetime;
	}

	public void setLogDatetime(Date logDatetime) {
		this.logDatetime = logDatetime;
	}

	public String getLogBy() {
		return this.logBy;
	}

	public void setLogBy(String logBy) {
		this.logBy = logBy;
	}

	public Date getLogCreateddatetime() {
		return this.logCreateddatetime;
	}

	public void setLogCreateddatetime(Date logCreateddatetime) {
		this.logCreateddatetime = logCreateddatetime;
	}

	public String getLogEntryType() {
		return this.logEntryType;
	}

	public void setLogEntryType(String logEntryType) {
		this.logEntryType = logEntryType;
	}

	public String getLogMessage() {
		return this.logMessage;
	}

	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}

}
