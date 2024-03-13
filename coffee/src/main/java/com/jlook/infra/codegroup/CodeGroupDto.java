package com.jlook.infra.codegroup;

import java.util.Date;

public class CodeGroupDto {

	private String seq;
	
	
	private String name;
	private String memo;
	private Integer delNy;
	private Date regDatetime;
	private Date modDatetime;
	private Integer xseqCount;
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
	public Integer getXseqCount() {
		return xseqCount;
	}
	public void setXseqCount(Integer xseqCount) {
		this.xseqCount = xseqCount;
	}
	@Override
	public String toString() {
		return "CodeGroupDto [seq=" + seq + ", name=" + name + ", memo=" + memo + ", delNy=" + delNy + ", regDatetime="
				+ regDatetime + ", modDatetime=" + modDatetime + ", xseqCount=" + xseqCount + "]";
	}
	
}
