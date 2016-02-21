/**
 * CSE360 Assignment 1
 * Fixing Bad  code
 *
 * @author Larry Standage 816
 * @version Jan 26, 2015
 */

package cse360assign2;



public class OrderedIntListSta {
	
	/** Holds the ordered list structure*/
	private int[] array;  // array
	
	/** Number of Ints in the list*/
	private int count; // counter	
	
	OrderedIntListSta (){
		
		array = new int[10];		
		count = 0; 
	}
	
	/**
	 *  Number of Ints in the list
	 *  @param Int to be inserted
	 *  
	 */
	public void insert (int newInt) {
		
		int jdex = 0;
		
		/*boolean flStop = false;
				
		for (int i= 0; i<count & !flStop;i++){    //start at zero, go up to the number of things in the list
	    	j++;
			if(newInt < array[i])      			 //if what we're inserting is less than current entry stop
	    		flStop = true; //break;//
		}*/
		 
		
		boolean flDup = false; // flag for duplicates
		
		int index1 = 0;
		while ((index1 < count) & (newInt > array[index1])){	 //start at zero, go up to the number of things in the list
			jdex++;										 //if what we're inserting is less than current entry stop
			
			if (index1 < 9)		//don't go out of bounds							
			index1++;
		}
		
		//if (newInt == array[ii+1])				//try to find the duplicate where you would expect it
		//	flDup = true;
		for (int index2 = 0;  index2 < 10; index2++) 				//expensive linear search for duplicates
			if (array[index2] == newInt)
				flDup = true;
				
		
		
		
	if (!flDup){  //only do this procedure only if not inserting a duplicate
		for (int index3 = count-1; index3 > jdex; index3-- ) 	//start at the index of the biggest thing, go (down)(left) to the index of an equal value
			
			if (index3 <=9)						
				array[index3] = array[index3-1];      // shift everything right as you go
			else 
				count --; 					//if something gets "shifted off" decrement count
		
			//System.out.println(array[j] + " is being overwritten by " + newInt); //Debug
		
			array[jdex]= newInt;                //place the new entry at J (either over write a copy, or a value bigger than it)
		
			count++;						
		}
	}
	
	
	
	/**
	 *  Sends List to console  
	 */
	public void print () {
		//System.out.println("Printing:");
		for (int index = 0; index < 10; index++) {
			if ((index % 5) == 0)
				System.out.println();
			System.out.print(array[index] + "\t");	
		}
		
		System.out.println();
		
	}
}
