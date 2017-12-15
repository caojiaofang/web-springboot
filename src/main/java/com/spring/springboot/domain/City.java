package com.spring.springboot.domain;

import java.io.Serializable;

public class City implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 城市编号
	 */
	private Long id;
	
	/**
	 * 省份编号
	 */
	private Long provinceId;
	
	/**  
     * 城市名称  
     */  
    private String cityName;
    
    /**  
     * 描述  
     */  
    private String description;

	public Long getId() {
		return id;
	}

	public Long getProvinceId() {
		return provinceId;
	}

	public String getCityName() {
		return cityName;
	}

	public String getDescription() {
		return description;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", provinceId=" + provinceId + ", cityName=" + cityName + ", description="
				+ description + "]";
	}
    
}
