package com.stech.jttapi;

import java.io.Serializable;

public class Agreement implements Serializable {
	private static final long serialVersionUID = 6333775234341292121L;
	private long agId;
	private long noOfPartiesInvoloved;
	private String licensor;
	private String licensee;
	private Address licenseeAddress;
	private Address licensorAddress;
	private String termsAndCondition;
	
	public Agreement(){
		
	}

	public Agreement(long agId, long noOfPartiesInvoloved, String licensor, String licensee, Address licenseeAddress, Address licensorAddress, String termsAndConditions){
		super();
		this.agId = agId;
		this.noOfPartiesInvoloved = noOfPartiesInvoloved;
		this.licensor = licensor;
		this.licensee = licensee;
		this.licenseeAddress = licenseeAddress;
		this.licensorAddress = licensorAddress;
		this.termsAndCondition = termsAndConditions;
	}
	
	public long getAgId() {
		return agId;
	}

	public String getTermsAndCondition() {
		return termsAndCondition;
	}

	public void setTermsAndCondition(String termsAndCondition) {
		this.termsAndCondition = termsAndCondition;
	}

	public void setAgId(long agId) {
		this.agId = agId;
	}

	public long getNoOfPartiesInvoloved() {
		return noOfPartiesInvoloved;
	}

	public void setNoOfPartiesInvoloved(long noOfPartiesInvoloved) {
		this.noOfPartiesInvoloved = noOfPartiesInvoloved;
	}

	public String getLicensor() {
		return licensor;
	}

	public void setLicensor(String licensor) {
		this.licensor = licensor;
	}

	public String getLicensee() {
		return licensee;
	}

	public void setLicensee(String licensee) {
		this.licensee = licensee;
	}

	public Address getLicenseeAddress() {
		return licenseeAddress;
	}

	public void setLicenseeAddress(Address licenseeAddress) {
		this.licenseeAddress = licenseeAddress;
	}

	public Address getLicensorAddress() {
		return licensorAddress;
	}

	public void setLicensorAddress(Address licensorAddress) {
		this.licensorAddress = licensorAddress;
	}

}
