package cse360assign2;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] terp = new int[0];
		
		System.out.println("terp"+terp.length);
		
		OrderedIntList oList = new OrderedIntList();
		
		for (int index = 0; index < 5; index++){
			oList.insert(index);
		}
		
		
		
		
		System.out.println("100? : "+oList.search(100, 0, oList.length()-1));
		
		System.out.println("**"+oList.toString()+"**");
		System.out.println("size: "+oList.size()+"**");
		
		
		System.out.println("END");
		

	}

}
