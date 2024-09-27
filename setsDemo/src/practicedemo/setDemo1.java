package practicedemo;

/**
*
* @author ajay
*/

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> numset = new HashSet<>();
		numset.add(1);
		numset.add(2);
		numset.add(-23);
		numset.add(23);
		numset.add(5);
		numset.add(23);
		
		System.out.println("set size is : "+ numset.size());
		System.out.println(numset);
		
		int sum =0;
		for(int num:numset) {
			sum = sum + num;
		}
		int avg = sum/numset.size();
		System.out.println("Average of set is: " +avg);
		
		//Polymorphic substitution  
		Set<String> cities = new TreeSet<>();
		
		cities.add("Maryville");
		cities.add("Newyork");
		cities.add("chicago");
		cities.add("12Omaha");
		cities.add("Maryville");
		
		System.out.println("Size of cities: "+cities.size());
		System.out.println(cities);
		
		for(String city:cities) {
			System.out.println(city+" - "+city.length());
		}
		
		System.out.println("***************************");
		for(String city:cities) {
			if(city.length()>=7) {
				//Cities greater then length of 7
				System.out.println(city);
			}
		}
		
	}

}
