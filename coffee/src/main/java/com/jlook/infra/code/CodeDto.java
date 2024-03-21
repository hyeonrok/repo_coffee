package com.jlook.infra.code;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodeDto {

	private String seq;
	private String name;
	private String memo;
	private Date regDatetime;
	private Date modDatetime;
	private Integer delNy;
	private String codeGroup_seq;
	private String codeGroupName;
	
	public String getSeq() {
		return seq;
	}
	public String getName() {
		return name;
	}
	public String getMemo() {
		return memo;
	}
	public Date getRegDatetime() {
		return regDatetime;
	}
	public Date getModDatetime() {
		return modDatetime;
	}
	public Integer getDelNy() {
		return delNy;
	}
	public String getCodeGroup_seq() {
		return codeGroup_seq;
	}
	public String getCodeGroupName() {
		return codeGroupName;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public void setRegDatetime(Date regDatetime) {
		this.regDatetime = regDatetime;
	}
	public void setModDatetime(Date modDatetime) {
		this.modDatetime = modDatetime;
	}
	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
	}
	public void setCodeGroup_seq(String codeGroup_seq) {
		this.codeGroup_seq = codeGroup_seq;
	}
	public void setCodeGroupName(String codeGroupName) {
		this.codeGroupName = codeGroupName;
	}
	@Override
	public String toString() {
		return "CodeDto [seq=" + seq + ", name=" + name + ", memo=" + memo + ", regDatetime=" + regDatetime
				+ ", modDatetime=" + modDatetime + ", delNy=" + delNy + ", codeGroup_seq=" + codeGroup_seq
				+ ", codeGroupName=" + codeGroupName + "]";
	}
	
	
//	for cache
	public static List<CodeDto> cachedCodeArrayList = new ArrayList<CodeDto>();

	public static List<CodeDto> getCachedCodeArrayList() {
		return cachedCodeArrayList;
	}
	public static void setCachedCodeArrayList(List<CodeDto> cachedCodeArrayList) {
		CodeDto.cachedCodeArrayList = cachedCodeArrayList;
	}
	
	
	
}
