package main.externalapi.model.openweathermap;

public class Cloud {

	private int all;

	public int getAll() {
		return all;
	}

	public void setAll(int all) {
		this.all = all;
	}

	@Override
	public String toString() {
		return "Cloud [all=" + all + "]";
	}

}
