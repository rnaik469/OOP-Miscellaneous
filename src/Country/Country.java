package Country;

public class Country {
	// Instance memebers
	private String country_name = getCountry_name();
	private long population;
	private static double area;

	// Getters Setters
	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public static double getArea() {
		return area;
	}

	public static void setArea(double area) {
		Country.area = area;
	}

	// return population density
	public double populationDensity(long population, double area) {
		double pop_density = population / area;
		return pop_density;
	}
}
