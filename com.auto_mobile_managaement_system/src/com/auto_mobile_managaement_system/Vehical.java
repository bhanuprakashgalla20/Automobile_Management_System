package com.auto_mobile_managaement_system;

public class Vehical {
	private String vehicalType;
	private String vehicalBrand;
	private String vehicalModel;
	private String vehicalColor;
	private double vehicalPrice;
	private String engineType;
	public Vehical(String vehicalType, String vehicalBrand, String vehicalModel, String vehicalColor,
			double vehicalPrice, String engineType) {
		this.vehicalType = vehicalType;
		this.vehicalBrand = vehicalBrand;
		this.vehicalModel = vehicalModel;
		this.vehicalColor = vehicalColor;
		this.vehicalPrice = vehicalPrice;
		this.engineType = engineType;
	}
	public String getVehicalType() {
		return vehicalType;
	}
	public void setVehicalType(String vehicalType) {
		this.vehicalType = vehicalType;
	}
	public String getVehicalBrand() {
		return vehicalBrand;
	}
	public void setVehicalBrand(String vehicalBrand) {
		this.vehicalBrand = vehicalBrand;
	}
	public String getVehicalModel() {
		return vehicalModel;
	}
	public void setVehicalModel(String vehicalModel) {
		this.vehicalModel = vehicalModel;
	}
	public String getVehicalColor() {
		return vehicalColor;
	}
	public void setVehicalColor(String vehicalColor) {
		this.vehicalColor = vehicalColor;
	}
	public double getVehicalPrice() {
		return vehicalPrice;
	}
	public void setVehicalPrice(double vehicalPrice) {
		this.vehicalPrice = vehicalPrice;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	@Override
	public String toString() {
		return "Vehical [vehicalType=" + vehicalType + ", vehicalBrand=" + vehicalBrand + ", vehicalModel="
				+ vehicalModel + ", vehicalColor=" + vehicalColor + ", vehicalPrice=" + vehicalPrice + ", engineType="
				+ engineType + "]";
	}
	
	
	
	
}
