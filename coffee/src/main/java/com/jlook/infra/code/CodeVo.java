package com.jlook.infra.code;

public class CodeVo {

	private Integer shUseNy = 1; /* null 값을 받아야 되는 경우가 있어서 int 대신 Integer 사용 */
	private Integer shDelNy = 0; /* null 값을 받아야 되는 경우가 있어서 int 대신 Integer 사용 */
	private Integer shOptionDate = 2; /* null 값을 받아야 되는 경우가 있어서 int 대신 Integer 사용 */
	private String shDateStart;
	private String shDateEnd;
	private Integer shOption; /* null 값을 받아야 되는 경우가 있어서 int 대신 Integer 사용 */
	private String shValue;

	private String seq;

	public Integer getShUseNy() {
		return shUseNy;
	}

	public Integer getShDelNy() {
		return shDelNy;
	}

	public Integer getShOptionDate() {
		return shOptionDate;
	}

	public String getShDateStart() {
		return shDateStart;
	}

	public String getShDateEnd() {
		return shDateEnd;
	}

	public Integer getShOption() {
		return shOption;
	}

	public String getShValue() {
		return shValue;
	}



	public void setShUseNy(Integer shUseNy) {
		this.shUseNy = shUseNy;
	}

	public void setShDelNy(Integer shDelNy) {
		this.shDelNy = shDelNy;
	}

	public void setShOptionDate(Integer shOptionDate) {
		this.shOptionDate = shOptionDate;
	}

	public void setShDateStart(String shDateStart) {
		this.shDateStart = shDateStart;
	}

	public void setShDateEnd(String shDateEnd) {
		this.shDateEnd = shDateEnd;
	}

	public void setShOption(Integer shOption) {
		this.shOption = shOption;
	}

	public void setShValue(String shValue) {
		this.shValue = shValue;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	@Override
	public String toString() {
		return "CodeVo [shUseNy=" + shUseNy + ", shDelNy=" + shDelNy + ", shOptionDate=" + shOptionDate
				+ ", shDateStart=" + shDateStart + ", shDateEnd=" + shDateEnd + ", shOption=" + shOption + ", shValue="
				+ shValue + ", ifcgseq=" + seq + "]";
	}

}
