package com.jlook.infra.codegroup;

import java.util.Date;

public class CodeGroupDto {

	private String codeGroupSeq;
	private String codeGroupName;
	private String codeGroupMemo;
	private Integer codeGroupDelNy;
	private Date codeGroupModDate;
	private Date codeGroupRegDate;
	public String getCodeGroupSeq() {
		return codeGroupSeq;
	}
	public void setCodeGroupSeq(String codeGroupSeq) {
		this.codeGroupSeq = codeGroupSeq;
	}
	public String getCodeGroupName() {
		return codeGroupName;
	}
	public void setCodeGroupName(String codeGroupName) {
		this.codeGroupName = codeGroupName;
	}
	public String getCodeGroupMemo() {
		return codeGroupMemo;
	}
	public void setCodeGroupMemo(String codeGroupMemo) {
		this.codeGroupMemo = codeGroupMemo;
	}
	public Integer getCodeGroupDelNy() {
		return codeGroupDelNy;
	}
	public void setCodeGroupDelNy(Integer codeGroupDelNy) {
		this.codeGroupDelNy = codeGroupDelNy;
	}
	public Date getCodeGroupModDate() {
		return codeGroupModDate;
	}
	public void setCodeGroupModDate(Date codeGroupModDate) {
		this.codeGroupModDate = codeGroupModDate;
	}
	public Date getCodeGroupRegDate() {
		return codeGroupRegDate;
	}
	public void setCodeGroupRegDate(Date codeGroupRegDate) {
		this.codeGroupRegDate = codeGroupRegDate;
	}
	
	
}
