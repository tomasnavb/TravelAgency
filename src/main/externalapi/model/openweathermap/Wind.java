package main.externalapi.model.openweathermap;

public class Wind {

	private double speed;
	private double deg;
	private double gust;

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getDeg() {
		return deg;
	}

	public void setDeg(double deg) {
		this.deg = deg;
	}

	public double getGust() {
		return gust;
	}

	public void setGust(double gust) {
		this.gust = gust;
	}

	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", deb=" + deg + ", gust=" + gust + "]";
	}

}
