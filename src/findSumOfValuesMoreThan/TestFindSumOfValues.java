package findSumOfValuesMoreThan;

import java.util.HashSet;

public class TestFindSumOfValues{

	     public HashSet<Integer> mySet;

	     public TestFindSumOfValues() 
	     {
	         mySet = new HashSet<Integer>();
	     }
	     
	    // Write your findSumOfValuesMoreThan(Integer) method here
	    public void findSumOfValuesMoreThan(Integer x){
	        
	        HashSet<Integer> tempSet =  new HashSet<>();
	        Integer sum = 0;
	        
	        for(Integer y: mySet){
	            if(x < y){
	                tempSet.add(y);
	            }
	        }
	        for(Integer z: tempSet) {
	            sum += z;
	        }
	        if(tempSet.isEmpty()){
	            System.out.println("none found");
	        } else {
	            System.out.println(sum);
	        }
	    }
	}

