package com.jlook.infra.product;

import java.util.Date;

public class ProductDto {

	private String productSeq;
	private String productName;
	private String productPrice;
	private String productSalePrice;
	private Integer productHotCd;
	private Integer productGenderCd;
	private Integer productSeasonCd;
	private Integer productColorCd;
	private Integer productSizeCd;
	private Integer productDelNy;
	private Date productRegDate;
	private Date productModDate;
	public String getProductSeq() {
		return productSeq;
	}
	public void setProductSeq(String productSeq) {
		this.productSeq = productSeq;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductSalePrice() {
		return productSalePrice;
	}
	public void setProductSalePrice(String productSalePrice) {
		this.productSalePrice = productSalePrice;
	}
	public Integer getProductHotCd() {
		return productHotCd;
	}
	public void setProductHotCd(Integer productHotCd) {
		this.productHotCd = productHotCd;
	}
	public Integer getProductGenderCd() {
		return productGenderCd;
	}
	public void setProductGenderCd(Integer productGenderCd) {
		this.productGenderCd = productGenderCd;
	}
	public Integer getProductSeasonCd() {
		return productSeasonCd;
	}
	public void setProductSeasonCd(Integer productSeasonCd) {
		this.productSeasonCd = productSeasonCd;
	}
	public Integer getProductColorCd() {
		return productColorCd;
	}
	public void setProductColorCd(Integer productColorCd) {
		this.productColorCd = productColorCd;
	}
	public Integer getProductSizeCd() {
		return productSizeCd;
	}
	public void setProductSizeCd(Integer productSizeCd) {
		this.productSizeCd = productSizeCd;
	}
	public Integer getProductDelNy() {
		return productDelNy;
	}
	public void setProductDelNy(Integer productDelNy) {
		this.productDelNy = productDelNy;
	}
	public Date getProductRegDate() {
		return productRegDate;
	}
	public void setProductRegDate(Date productRegDate) {
		this.productRegDate = productRegDate;
	}
	public Date getProductModDate() {
		return productModDate;
	}
	public void setProductModDate(Date productModDate) {
		this.productModDate = productModDate;
	}
	@Override
	public String toString() {
		return "ProductDto [productSeq=" + productSeq + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productSalePrice=" + productSalePrice + ", productHotCd=" + productHotCd
				+ ", productGenderCd=" + productGenderCd + ", productSeasonCd=" + productSeasonCd + ", productColorCd="
				+ productColorCd + ", productSizeCd=" + productSizeCd + ", productDelNy=" + productDelNy
				+ ", productRegDate=" + productRegDate + ", productModDate=" + productModDate + "]";
	}
	
	
	
}
