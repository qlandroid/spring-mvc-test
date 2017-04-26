package com.ql.mvc.pojo;

public class PhotoMeal {
	private int id;
	private double normalPrice;
	private double discountPrice;
	private String icons;
	private int userId;
	private int psId;
	private String introduce;
	private int collectQty;
	private int praiseQty;
	private int level;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getNormalPrice() {
		return normalPrice;
	}
	public void setNormalPrice(double normalPrice) {
		this.normalPrice = normalPrice;
	}
	public double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	public String getIcons() {
		return icons;
	}
	public void setIcons(String icons) {
		this.icons = icons;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPsId() {
		return psId;
	}
	public void setPsId(int psId) {
		this.psId = psId;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public int getCollectQty() {
		return collectQty;
	}
	public void setCollectQty(int collectQty) {
		this.collectQty = collectQty;
	}
	public int getPraiseQty() {
		return praiseQty;
	}
	public void setPraiseQty(int praiseQty) {
		this.praiseQty = praiseQty;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}
