package facultymapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class FacultyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, ArrayList<String>> facultyMap;
		facultyMap = new TreeMap<String, ArrayList<String>>();
		
		ArrayList<String> bandiList = new ArrayList<String>();
		bandiList.add("Patterns");
		bandiList.add("iOS");
		bandiList.add("GenAI");
		bandiList.add("Visualization");
		
		ArrayList<String> HootList = new ArrayList<String>();
		HootList.add("GenAI");
		HootList.add("Andriod");
		HootList.add("GDP-II");
		HootList.add("Capstone");
		
		ArrayList<String> CaseList = new ArrayList<String>();
		CaseList.add("Capstone");
		CaseList.add("Visualization");
		CaseList.add("Patterns");
		CaseList.add("GDP-II");
		
		ArrayList<String> FellahList = new ArrayList<String>();
		FellahList.add("Prog Lang");
		FellahList.add("SE practice");
		FellahList.add("Patterns");
		FellahList.add("GDP-II");
		FellahList.add("GDP-II");
		
		ArrayList<String> TuList = new ArrayList<String>
		(Arrays.asList("Project","Project","System Analysis","System Analysis"));
		
		
		
		//Populate the Map
		facultyMap.put("Bandi", bandiList);
		facultyMap.put("Hoot", HootList);
		facultyMap.put("Case", CaseList);
		facultyMap.put("Fellah", FellahList);
		facultyMap.put("Tu", TuList);
		
		System.out.println("Size of the Map: " + facultyMap.size());
		System.out.println(facultyMap);
		
		//Who is teaching maximum number of classes?
		Set<String> facultySet = facultyMap.keySet();
		int max=0;
		String name="";
		for(String f:facultySet) {
			if(facultyMap.get(f).size()>max) {
				name=f;
				max = facultyMap.get(f).size();
				}
		}
		System.out.println("Max num of classes are taught by "+name+" - "+ max);
			
		//Who all teaching GDP-II?
		System.out.println("Faculty who teaches GDP-II are: ");
		for(String facultyName: facultySet) {
			List<String> courses = facultyMap.get(facultyName);
			if(courses.contains("GDP-II"))
			{
				System.out.println(facultyName);
			}
		}
		
		//How many  unique number of classes each faculty is teaching?
		
		 System.out.println("Number of unique classes each faculty is teaching: ");
	        for (String facultyName : facultySet) {
	            List<String> courses = facultyMap.get(facultyName);
	            Set<String> uniqueCourses = new HashSet<>(courses);  // Using HashSet to remove duplicates
	            System.out.println(facultyName + " is teaching " + uniqueCourses.size() + " unique classes.");
	        }

	        // 4. Which faculty is teaching the least number of unique classes?
	        int min = Integer.MAX_VALUE;
	        String leastFaculty = "";
	        for (String f : facultySet) {
	            Set<String> uniqueCourses = new HashSet<>(facultyMap.get(f));
	            if (uniqueCourses.size() < min) {
	                leastFaculty = f;
	                min = uniqueCourses.size();
	            }
	        }
	        System.out.println("Faculty teaching the least number of unique classes: " + leastFaculty + " - " + min);

	        // 5. List all unique courses offered across all faculties.
	        Set<String> allUniqueCourses = new HashSet<>();
	        for (String facultyName : facultySet) {
	            allUniqueCourses.addAll(facultyMap.get(facultyName));
	        }
	        System.out.println("All unique courses offered: " + allUniqueCourses);


	}

}
