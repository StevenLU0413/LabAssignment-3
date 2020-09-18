import java.util.List;
import java.util.ArrayList;
import java.awt.*;

public class DelColToSort{
	//made the method static so it can be tested
	public static List<Integer> minDeletionSize(String[] input){
		// creat the arrayList that we going to return
		List<Integer> result = new ArrayList<Integer>();
		
		//This for loop is to check if each element length in the Array is equal
		for(int i = 0; i < input.length-1; i++){
			if(input[i].length() != input[i+1].length()){
				result.add(-1);
				return result;
			}
		}
		
		
		for(int i = 0; i < input[0].length(); i++){//pointer for the indices
			for(int j = 0; j < input.length-1; j++){//pointer for the elements
				char a = input[j].charAt(i);
				char b = input[j+1].charAt(i);
				if(Character.compare(a, b) > 0){//if it is in decreasing order add that indices
					result.add(i);
					break;//move on to the next element
				}
			}
		}
		return result;
		
	}
	
	public static void main(String[] args){
		String[] inputA = {"cba","daf","ghi"};
		System.out.println(DelColToSort.minDeletionSize(inputA));
		
		String[] inputB = {"a","b"};
		System.out.println(DelColToSort.minDeletionSize(inputB));
		
		String[] inputC = {"zyx","wvu","tsr"};
		System.out.println(DelColToSort.minDeletionSize(inputC));
		
		String[] inputD = {"Captain","Marvel","saved", "the", "Avengers"};
		System.out.println(DelColToSort.minDeletionSize(inputD));
	}
}