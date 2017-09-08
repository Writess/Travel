package dddd;

import java.util.Arrays;

/**
 * 功能:Location
 * 作者:王朋飞
 * 2017年7月24日下午7:49:20
 */
public class Location {
	
	private String type = "Point";
	
	private double[] coordinates;

	public Location(double[] coordinates) {
		super();
		this.coordinates = coordinates;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(double[] coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public String toString() {
		return "Location [type=" + type + ", coordinates=" + Arrays.toString(coordinates) + "]";
	}
}
