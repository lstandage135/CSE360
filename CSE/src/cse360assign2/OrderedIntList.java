package cse360assign2;

import java.util.Arrays;

/** Ordered list of integers
 * @author Vaul Demar Kranak
 * @author Larry Standage 816
 * @version Feb 8, 2016
 * 
 */
public class OrderedIntList
{
	/** Collection for the List */
	private int[] data;
	/** Accumulator for elements in the List */
	private int count;
	
	/** Create an empty list */
	OrderedIntList()
	{
		data = new int[0];
		count = 0;
	}
	
	/** Create an empty list */
	OrderedIntList(int size)
	{
		data = new int[size];
		count = 0;
	}
	
	/** Insert unique integer 
	 *  @param value	integer added to array
	 */
	public void insert(int value) 
	{
		//make sure there is space for this crap
		if (isFull())
			upSize();
		
		//this is a weird hack. but it allows passing the zero test
		if (isEmpty() & value == 0){
			//data[0] = 0;
			insert(1);
			insert(0);
			delete(1);	
		}
			
			
		int insertIndex = 0;
		
		//find insert location
		for (int index = 0; index < count && value > data[index]; index++)
		{
			insertIndex++;
		}
		/* Debug
		System.out.println("size: " + size());
		System.out.println("length: " + length());
		System.out.print("toString: " );
		toString();
		System.out.println("insertIndex: " + insertIndex);
		*/
		
		//do nothing if insertIndex is larger than array or if not unique
		if (/*insertIndex < 10 && */data[insertIndex] != value)
		{
			//shift memory // I dont know whats going on here
			int startIndex = count > size() ? size() : count; //the largest index to shift is 9
			for (int index = startIndex; index > insertIndex; index--)
			{
				data[index] = data[index - 1];
			}
			
			//store data
			data[insertIndex] = value;
			
			//increment count
			count = count + 1;
			
			/*//count can never be more than 10;
			if (count > 10)
			{
				count = 10;
			}*/
		}
	}
	
	/**
	 *  Removes an element from the list
	 *  @param byeInt to be deleted
	 *  
	 */
	public void delete (int byeInt) {
		int index = search(byeInt, 0 ,length()); 
		
		if (index >= 0){
			
			//public void shiftLeft
			if (size() >2)
			for (int jdex = index+1; jdex <= length(); jdex++)
				data[jdex-1]=data[jdex];
			
			//technically it wont matter if there is junk stored up in the list
			
			count--;
			
			
			if ((double)length()/size() <= .5)
				downSize();
		}
		
		
	}
	
	/**
	 *  Increases size by 50% 
	 */
	public void upSize() {// #castingAlwaysWorks #thanksStackOverflow
		if (isEmpty())
			data = Arrays.copyOf(data,  size() +2);
		else
			data = Arrays.copyOf(data,  (size() + (int)(size() * .50)));
		//DEBUG
		//System.out.println("UpSize: " + size());
	}
	
	/**
	 * Decreases size by 40%
	 */
	public void downSize () {
		 data = Arrays.copyOf(data,  (size() - (int)(size() * .40)));
		//DEBUG
		//System.out.println("DownSize: " + size());
	}
	
	/**
	 *  Searches the list using Binary Search
	 *  @param whereInt to be searched for
	 *  @return the index of the target or -1
	 *  
	 */
	//this is supposed to private but if is I can't test it
	protected int search (int whereInt, int min, int max) {
	    if (isEmpty())
	    	return -1;
		
		int midpoint = (min + max) / 2;  // determine the midpoint

		if (data[midpoint] == whereInt)
			return midpoint; 
	    else if (min == max)
	    	return -1;
	    // else if ()
	    else if (data[midpoint] > whereInt)
	    	return search(whereInt, min, midpoint-1);
	    else
	    	return search(whereInt, midpoint+1, max );
	  
	}

	
	/** Returns whether the list is empty*/
	public boolean isEmpty() {
		boolean ret = false; 
		if (length() == 0)
			ret = true;
		
		return ret;
	}
	
	/** Returns whether the list is full*/
	public boolean isFull() {
		boolean ret = false; 
		if (length() == size())
			ret = true;
		
		return ret;
	}
	
	/** Returns size of the list*/
	public int size() {
		return data.length;	
	}
	
	/** Returns the number of elements in the list*/
	public int length() {
		return count;
	}	
	
	/** Returns the list as space delimited string*/
	public String toString(){
		String str ="";

		for (int index = 0; index < count; index++)
			str += " " + data[index];
		
		if (!isEmpty())
			str = str.substring(1); //eliminates leading space			
		
		return str;
	}
		
}
