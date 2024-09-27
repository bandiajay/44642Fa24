package states;

/**
*
* @author ajay
*/

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class PracticeDemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,String> statesMap = new TreeMap<>();
		
		statesMap.put("MO", "Missouri");
		statesMap.put("MT", "Montana");
		statesMap.put("MS", "Mississipi");
		statesMap.put("HI", "Hawaii");
		statesMap.put("KS", "Kansas");
		statesMap.put("MS", "Minnesota");
		statesMap.put("NE", null);
		//statesMap.put(null,"Iowa"); Key Cannot be null in Maps
		statesMap.put("IA", "Iowa");
		
		System.out.println("Size of the map: "+ statesMap.size());
		System.out.println(statesMap);
		System.out.println("Values: " + statesMap.values());
		
		Collection<String> stateNames = statesMap.values();
		for (String stname:stateNames) {
			System.out.println(stname);
		}
		
		System.out.println("KeySet: " + statesMap.keySet());
		
		Set<String> stateCodes = statesMap.keySet();
		for(String stcode:stateCodes) {
			System.out.println(stcode);
		}
		
		//print all the state names with the length < = 6
		//IA - Iowa -- 4(print format)
		Set<String> stateAb = statesMap.keySet();
		String StateName;
		for(String stAb: stateAb) {
			StateName = statesMap.get(stAb);
			if(StateName != null && StateName.length() <= 6) {
				System.out.println(stAb + "-"
			+StateName+"--"+StateName.length());
			}
		}	
		//print all the keys that has null values
		//NE-null (print format)
		
		for(String stcode: stateAb) {
			if(statesMap.get(stcode)== null) {
				System.out.println("null Value Keys");
				System.out.println(stcode + "-"+
				statesMap.get(stcode));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
