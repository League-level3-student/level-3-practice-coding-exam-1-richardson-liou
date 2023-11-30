package practice;

import java.util.ArrayList;

public class Finder {
	 public int lastIndexOf(ArrayList<String> arrayList, String target) {
	        int lastIndex = -1;
	        
	        for (int i = 0; i < arrayList.size(); i++) {
	            String currentElement = arrayList.get(i);
	            if (currentElement.toLowerCase().equals(target.toLowerCase())){
	                lastIndex = i;
	            }
	        }

	        return lastIndex;
	    }

}
