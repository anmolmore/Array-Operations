package com.anmol;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/***
 * source - http://javarevisited.blogspot.co.uk/2012/02/how-to-check-or-detect-duplicate.html
 * @author Anmol More
 *
 */
public class CheckDuplicationInArray {
	
	public static void main(String[] args) {
		String[] withDuplicates = new String[] {"one","two","three","one"};
        String[] withoutDuplicates = new String[] {"one","two","three"};

        //bad way
        for(int i=0;i<withDuplicates.length;i++) {
        	for(int j=0;j<withDuplicates.length;j++) {
        		if(withDuplicates[i].equals(withDuplicates[j]) && i!=j) {
        			System.out.println("Duplicate found : " + withDuplicates[i]);
        		}
        	}
        }
        
        //check duplicates using set
        List arrayList = Arrays.asList(withDuplicates);
        Set set = new HashSet(arrayList);
        if(arrayList.size() != set.size())
        	System.out.println("Array has duplicates");
        
      //check duplicates using set
        Set mySet = new HashSet();
        for(String item : withDuplicates) {
        	if(mySet.contains(item)) {
        		System.out.println("Duplicate element :: " + item);
        	}
        	else
        		System.out.println(mySet.add(item));  //if item is added, its true ..
        }
	}
}
