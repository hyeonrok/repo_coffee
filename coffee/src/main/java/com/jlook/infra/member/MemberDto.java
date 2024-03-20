package com.jlook.infra.member;

import java.util.Date;

public class MemberDto {

	private String seq;
	private String memberName;
	private String memberId;
	private String memberPwd;
	private String memberEmail;
	private Integer genderCd;
	private String birthDay;
	private String phoneNumber;
	private Integer delNy;
	private Date regDatetime;
	private Date modDatetime;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public Integer getGenderCd() {
		return genderCd;
	}
	public void setGenderCd(Integer genderCd) {
		this.genderCd = genderCd;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Integer getDelNy() {
		return delNy;
	}
	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
	}
	public Date getRegDatetime() {
		return regDatetime;
	}
	public void setRegDatetime(Date regDatetime) {
		this.regDatetime = regDatetime;
	}
	public Date getModDatetime() {
		return modDatetime;
	}
	public void setModDatetime(Date modDatetime) {
		this.modDatetime = modDatetime;
	}
	
	
}
