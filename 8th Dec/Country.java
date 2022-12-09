package Demo;

import java.util.HashSet;
import java.util.Iterator;

public class Country {
	HashSet<String> h=new HashSet<>(); //ob of hashset
	public void storeCountryNames(String CountryName) { //create method
		h.add(CountryName);
	}
	public String retrieveCountry(String CountryName) { //create method
		Iterator<String> value=h.iterator();
		while(value.hasNext()) {
			if(value.next().equals(CountryName))
				return CountryName;
		}
		return null;
		}
public static void main(String[] args) {
	Country countries = new Country();
	countries.storeCountryNames("India"); //add value
	countries.storeCountryNames("USA");
	countries.storeCountryNames("Japan");
	System.out.println(countries.h);
	countries.retrieveCountry("USA");
	System.out.println(countries.retrieveCountry("India")+" "+"Present in the ArrayList"); //return value
	System.out.println(countries.retrieveCountry("Australia"));
	}
}