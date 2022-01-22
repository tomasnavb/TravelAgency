package main.externalapi.model.openweathermap;

public class Wind {

	private double speed;
	private double deb;
	private double gust;

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getDeb() {
		return deb;
	}

	public void setDeb(double deb) {
		this.deb = deb;
	}

	public double getGust() {
		return gust;
	}

	public void setGust(double gust) {
		this.gust = gust;
	}

	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", deb=" + deb + ", gust=" + gust + "]";
	}

}
