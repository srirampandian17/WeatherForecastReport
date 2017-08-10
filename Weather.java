package com.weather.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.weather.modules.APIHandler;
@Controller
public class Weather 
{

	@RequestMapping(value="/calculate/{city}")
	public ModelAndView calculate(@PathVariable String city)
	{
		com.weather.objects.Weather weather=APIHandler.getWeatherData(city);
		return new ModelAndView("weatherreport","weatherResult",weather);
	}
	
}