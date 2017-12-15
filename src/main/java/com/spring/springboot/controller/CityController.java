package com.spring.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.springboot.domain.City;
import com.spring.springboot.server.CityService;

/**
 * 城市 Controller 实现 Restful HTTP 服务 
 * Title: CityController.java
 * Description: 
 * Company: ylink
 * @author lizhi
 * @date 2017年11月16日下午6:11:24
 */
@Controller
public class CityController {

	@Autowired
	private CityService cityService;
	
	@RequestMapping(value="/api/city/{id}", method = RequestMethod.GET)
	public String findOneCity(Model model,@PathVariable("id") Long id){
		model.addAttribute("city",this.cityService.findCityById(id));
		return "city";
	}
	
	@RequestMapping(value = "/api/city", method = RequestMethod.GET)  
    public String findAllCity(Model model) {  
        List<City> cityList = this.cityService.findAllCity();  
        model.addAttribute("cityList",cityList);  
        return "cityList";  
    }  
}
