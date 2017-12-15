package com.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.springboot.domain.City;

/**
 * 城市DAO接口类
 * Title: CityDao.java
 * Description: 
 * Company: ylink
 * @author lizhi
 * @date 2017年11月16日下午5:15:07
 */
public interface CityDao {

	/**
	 * 获取城市信息列表
	 * @return
	 */
	List<City> findAllCity();
	
	/**
	 * 根据城市ID,获取城市信息
	 * @param id
	 * @return
	 */
	City findById(@Param("id") Long id);
	
	Long saveCity(City city);
	
	Long updateCity(City city);
	
	Long deleteCity(Long id);
	
}
