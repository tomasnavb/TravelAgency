package main.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;

import main.externalapi.model.openweathermap.OpenWeatherMap;

public interface ExternalAPIsService {
	
	public OpenWeatherMap getData(HttpServletRequest request);
}
