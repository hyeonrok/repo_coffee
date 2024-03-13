package com.jlook.infra.code;

import java.util.Date;

public class CodeDto {

	private String seq;
	private String name;
	private String memo;
	private Date reqDatetime;
	private Date modDatetime;
	private Integer delNy;
	private String codeGroup_seq;
	private String codegroupname;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getReqDatetime() {
		return reqDatetime;
	}
	public void setReqDatetime(Date reqDatetime) {
		this.reqDatetime = reqDatetime;
	}
	public Date getModDatetime() {
		return modDatetime;
	}
	public void setModDatetime(Date modDatetime) {
		this.modDatetime = modDatetime;
	}
	public Integer getDelNy() {
		return delNy;
	}
	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
	}
	public String getCodeGroup_seq() {
		return codeGroup_seq;
	}
	public void setCodeGroup_seq(String codeGroup_seq) {
		this.codeGroup_seq = codeGroup_seq;
	}
	public String getCodegroupname() {
		return codegroupname;
	}
	public void setCodegroupname(String codegroupname) {
		this.codegroupname = codegroupname;
	}
	
	

}
