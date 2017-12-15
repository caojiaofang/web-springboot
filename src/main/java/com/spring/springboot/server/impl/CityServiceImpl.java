package com.spring.springboot.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springboot.dao.CityDao;
import com.spring.springboot.domain.City;
import com.spring.springboot.server.CityService;

/**
 * 城市业务逻辑实现类
 * Title: CityServiceImpl.java
 * Description: 
 * Company: ylink
 * @author lizhi
 * @date 2017年11月16日下午5:22:06
 */
@Service
public class CityServiceImpl implements CityService{

	@Autowired
	private CityDao cityDao;
	
	@Override
	public List<City> findAllCity() {
		return this.cityDao.findAllCity();
	}

	@Override
	public City findCityById(Long id) {
		return this.cityDao.findById(id);
	}

	@Override
	public Long saveCity(City city) {
		return this.cityDao.saveCity(city);
	}

	@Override
	public Long updateCity(City city) {
		return this.cityDao.updateCity(city);
	}

	@Override
	public Long deleteCity(Long id) {
		return this.cityDao.deleteCity(id);
	}

	
}
