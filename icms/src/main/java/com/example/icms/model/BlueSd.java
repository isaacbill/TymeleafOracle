package com.example.icms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BlueSd {
	
	@Id
	private String SD_REG_NO;
	private String REGISTRATION_ID;
	private int VERSION;
	private int SD_VERSION;
	private String SD_STATUS;
	
	
	public BlueSd() {
		
	}
	public BlueSd(String sD_REG_NO, String rEGISTRATION_ID, int vERSION, int sD_VERSION, String sD_STATUS) {
		
		SD_REG_NO = sD_REG_NO;
		REGISTRATION_ID = rEGISTRATION_ID;
		VERSION = vERSION;
		SD_VERSION = sD_VERSION;
		SD_STATUS = sD_STATUS;
	}
	
	public String getSD_REG_NO() {
		return SD_REG_NO;
	}
	public void setSD_REG_NO(String sD_REG_NO) {
		SD_REG_NO = sD_REG_NO;
	}
	public String getREGISTRATION_ID() {
		return REGISTRATION_ID;
	}
	public void setREGISTRATION_ID(String rEGISTRATION_ID) {
		REGISTRATION_ID = rEGISTRATION_ID;
	}
	public int getVERSION() {
		return VERSION;
	}
	public void setVERSION(int vERSION) {
		VERSION = vERSION;
	}
	public int getSD_VERSION() {
		return SD_VERSION;
	}
	public void setSD_VERSION(int sD_VERSION) {
		SD_VERSION = sD_VERSION;
	}
	public String getSD_STATUS() {
		return SD_STATUS;
	}
	public void setSD_STATUS(String sD_STATUS) {
		SD_STATUS = sD_STATUS;
	}
		

}
