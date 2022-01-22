package main.externalapi.model.openweathermap;

import java.util.Arrays;

public class OpenWeatherMap {

	private Coord coord;
	private Weather[] weather;
	private String base;
	private Main main;
	private int visibility;
	private Wind wind;
	private Cloud cloud;
	private Rain rain;
	private Snow snow;
	private long dt;
	private Sys sys;
	private double timezone;
	private long id;
	private String name;
	private int cod;

	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public Weather[] getWeather() {
		return weather;
	}

	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Cloud getCloud() {
		return cloud;
	}

	public void setCloud(Cloud cloud) {
		this.cloud = cloud;
	}

	public Rain getRain() {
		return rain;
	}

	public void setRain(Rain rain) {
		this.rain = rain;
	}

	public Snow getSnow() {
		return snow;
	}

	public void setSnow(Snow snow) {
		this.snow = snow;
	}

	public long getDt() {
		return dt;
	}

	public void setDt(long dt) {
		this.dt = dt;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public double getTimezone() {
		return timezone;
	}

	public void setTimezone(double timezone) {
		this.timezone = timezone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	@Override
	public String toString() {
		return "OpenWeatherMap [coord=" + coord + ", weather=" + Arrays.toString(weather) + ", base=" + base + ", main="
				+ main + ", visibility=" + visibility + ", wind=" + wind + ", cloud=" + cloud + ", rain=" + rain
				+ ", snow=" + snow + ", dt=" + dt + ", sys=" + sys + ", timezone=" + timezone + ", id=" + id + ", name="
				+ name + ", cod=" + cod + "]";
	}

}
