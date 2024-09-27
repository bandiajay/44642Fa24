package Hashsetdemo;

/**
*
* @author ajay
*/

import java.util.HashSet;

public class TreeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree t1 = new Tree("Jasmine",true);
		Tree t2 = new Tree("Sun Flower",false);
		Tree t3 = new Tree("Sun Flower",true);
		Tree t4 = new Tree("Sun Flower",true);
		
		HashSet<Tree> plantset=new HashSet<Tree>();
		plantset.add(t1);
		plantset.add(t3);
		plantset.add(t2);
		plantset.add(t4);
		
		System.out.println("Size of hashset: " + plantset.size());
		
		System.out.println(plantset);
		
		
		
		
		
		
		
		
	}

}
