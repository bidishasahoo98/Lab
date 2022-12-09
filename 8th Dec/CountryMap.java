package Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountryMap {
 
	HashMap<String,String> a=new HashMap<String,String>();
	HashMap<String,String> b=new HashMap<String,String>();
	ArrayList<String> list = new ArrayList<String>();//create string type arraylist
	
	public void storeCountryCapital(String CountryName,String Capital) {
		a.put(CountryName, Capital);
	}
	public String retrieveCapital(String CountryName) { //create method
           return a.get(CountryName);
	}
	public HashMap reverseHash() {
		for(Entry<String,String>entry:a.entrySet()) {
			b.put(entry.getValue(), entry.getKey());
		}
		return b;
	}
	public String retrieveCountry(String CapitalName) { //create method
        return b.get(CapitalName);
	}
	public ArrayList iterateArrayList() {
		for(Entry<String, String> entry:a.entrySet()) {
			list.add( entry.getKey());
		}
		return list;
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			CountryMap map=new CountryMap();
			map.storeCountryCapital("India","Delhi");
			map.storeCountryCapital("Bangladesh","Dhaka");
			map.storeCountryCapital("Japan","Tokyo");
			
			System.out.println(map.reverseHash());
			System.out.println("Enter name of Capital to see Country");
            String Capital=sc.next();
            System.out.println("country of "+Capital+" is:"+map.retrieveCountry(Capital));
            System.out.println("ArrayList with keys:"+ map.iterateArrayList());
}}