package practice;

import java.util.HashMap;

public class FishingContest {
	private final HashMap<String, double[]> allCatches;

    public FishingContest(HashMap<String, double[]> allC) {
        allCatches = allC;
    }

    public double findBiggestFish(String participant) {
        
    	double maxWeight = 0;
    	double[] catches = allCatches.get(participant);
    	for(int i=0;i<catches.length; i++) {
    		if (catches[i]>maxWeight) {
    			maxWeight = catches[i];
    	}
    	}
    		return maxWeight;
    			
    }

    public String findWinner() {
    	 double maxTotalWeight = 0;
         String currentWinner = null;
         for (String participant : allCatches.keySet()) {
             double[] catches = allCatches.get(participant);
             double totalWeight = 0;
             for (double fishWeight : catches) {
                 if (fishWeight >= 3) {
                     totalWeight += fishWeight;
                 }
             }

             if (totalWeight > maxTotalWeight) {
                 maxTotalWeight = totalWeight;
                 currentWinner = participant;
             }
         }

         return currentWinner;
     
		
    	
        
    }
}

