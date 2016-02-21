package cse360assign1;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		OrderedIntList myList = new OrderedIntList();
		
		for (int ii = 15; ii > 0; ii--){  //reverse sorted order
		//for (int ii = 1; ii <=15;  ii++){ 	//sorted order
				myList.insert(ii);
			    myList.insert(ii);        //duplicates
				
			//	myList.insert(2);           //single 
				
				myList.print();
				System.out.println();
		}
		
		System.out.println("END");
		

	}

}
