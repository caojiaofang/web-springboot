package com.spring.springboot.server;

import java.util.List;

import com.spring.springboot.domain.City;

/**
 * 城市业务逻辑接口类
 * Title: CityService.java
 * Description: 
 * Company: ylink
 * @author lizhi
 * @date 2017年11月16日下午5:28:08
 */
public interface CityService {

	/**  
     * 获取城市信息列表  
     *  
     * @return  
     */  
    List<City> findAllCity();
    
    /**  
     * 根据城市 ID,查询城市信息  
     *  
     * @param id  
     * @return  
     */  
    City findCityById(Long id);
    
    /**  
     * 新增城市信息  
     *  
     * @param city  
     * @return  
     */  
    Long saveCity(City city); 
    
    /**  
     * 更新城市信息  
     *  
     * @param city  
     * @return  
     */  
    Long updateCity(City city); 
    
    /**  
     * 根据城市 ID,删除城市信息  
     *  
     * @param id  
     * @return  
     */  
    Long deleteCity(Long id);
}
