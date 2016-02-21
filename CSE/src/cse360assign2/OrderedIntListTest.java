/** Test Battery for Ordered list of integers
 * @author Assignment 1 solution
 * @author Larry Standage 816
 * @version Feb 8, 2016
 * 
 */

package cse360assign2;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderedIntListTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}

	@Test
	public void emptyList() {
		OrderedIntList oList = new OrderedIntList();
		assertEquals("",  oList.toString());
		assertEquals(0, oList.size());
		assertEquals(0, oList.length());
	}

	@Test
	public void emptyListOfSize() {
		OrderedIntList oList = new OrderedIntList(23);
		assertEquals("",  oList.toString());
		assertEquals(23, oList.size());
		assertEquals(0, oList.length());
	}

	@Test
	public void singleInt() {
		OrderedIntList oList = new OrderedIntList();
		oList.insert(3);
			
		assertEquals("3",  oList.toString());
		assertEquals(2, oList.size());
		assertEquals(1, oList.length());
	}
	
	
	
	@Test
	public void twoInt() {
		OrderedIntList oList = new OrderedIntList();
		oList.insert(3);
		oList.insert(4);
		
		assertEquals("3 4",  oList.toString());
		assertEquals(2, oList.size());
		assertEquals(2, oList.length());
	}
	
	@Test
	public void twoIntOfSize() {
		OrderedIntList oList = new OrderedIntList(27);
		oList.insert(3);
		oList.insert(4);
		
		assertEquals("3 4",  oList.toString());
		assertEquals(27, oList.size());
		assertEquals(2, oList.length());
	}
	
	@Test
	public void threeInt() {
		OrderedIntList oList = new OrderedIntList();
		oList.insert(3);
		oList.insert(4);
		oList.insert(5);
		
		assertEquals("3 4 5",  oList.toString());
		assertEquals(3, oList.size());
		assertEquals(3, oList.length());
	}
	
	@Test
	public void fourInt() {
		OrderedIntList oList = new OrderedIntList();
		oList.insert(3);
		oList.insert(4);
		oList.insert(5);
		oList.insert(6);
		
		assertEquals("3 4 5 6", oList.toString());
		assertEquals(4, oList.size());
		assertEquals(4, oList.length());
	}
	
	@Test
	public void fiveInt() {
		OrderedIntList oList = new OrderedIntList();
		oList.insert(3);
		oList.insert(4);
		oList.insert(5);
		oList.insert(6);
		oList.insert(7);
		
		assertEquals("3 4 5 6 7",  oList.toString());
		assertEquals(6, oList.size());
		assertEquals(5, oList.length());
	}
	
	@Test
	public void inOrder() {
		OrderedIntList oList = new OrderedIntList();
		//int startValue = 4;
		
		oList.insert(7);
		oList.insert(9);
		oList.insert(10);
		oList.insert(11);
		oList.insert(15);
		oList.insert(20);
		
		/*for (int value = 0; value < 11; value++){ //No Loops allowed
			oList.insert(startValue + value);
		}*/		
		assertEquals("7 9 10 11 15 20",  oList.toString());
	}
	
	@Test
	public void reverseOrder() {
		OrderedIntList oList = new OrderedIntList();
		oList.insert(17);
		oList.insert(15);
		oList.insert(14);
		oList.insert(13);
		oList.insert(11);
		oList.insert(10);
		oList.insert(9);
		oList.insert(7);
		oList.insert(3);
		oList.insert(2);
		oList.toString();
		
		assertEquals("2 3 7 9 10 11 13 14 15 17",  oList.toString());
		
	}
	
	@Test
	public void singleRepeat() {
		OrderedIntList oList = new OrderedIntList();
		
		oList.insert(55);
		oList.insert(55);
		oList.insert(55);
		
		assertEquals("55", oList.toString());
		assertEquals(2, oList.size());
		assertEquals(1, oList.length());
	}
	
	@Test
	public void outOfOrder() {
		OrderedIntList oList = new OrderedIntList();
		
		oList.insert(5);
		oList.insert(7);
		oList.insert(4);
		oList.insert(1);
		oList.insert(8);
		oList.insert(9);
		oList.insert(2);
		oList.insert(10);
		oList.insert(6);
		oList.insert(3);
		
		assertEquals("1 2 3 4 5 6 7 8 9 10", oList.toString());
			
	}
	
		
	@Test
	public void threeInserts() {
		OrderedIntList oList = new OrderedIntList();
		
		oList.insert(4);
		oList.insert(9);
		oList.insert(1);
	
		
		assertEquals("1 4 9",  oList.toString());
	}
	
	@Test
	public void sevenInserts() {
		OrderedIntList oList = new OrderedIntList();
		
		oList.insert(10);
		oList.insert(80);				
		oList.insert(90);
		oList.insert(20);
		oList.insert(100);
		oList.insert(60);
		oList.insert(30);
				
	
		assertEquals("10 20 30 60 80 90 100", oList.toString());
	}
	
	@Test
	public void checkSizeOne() {
		OrderedIntList oList = new OrderedIntList();
		
		oList.insert(10);
		oList.insert(80);				
		oList.insert(90);
		oList.insert(20);
		oList.insert(100);
		oList.insert(60);
		oList.insert(30);
		oList.insert(35);
		oList.insert(78);				
		oList.insert(34);
		oList.insert(56);
		oList.insert(102);
		oList.insert(1);
		oList.insert(19);
	
		
		assertEquals("1 10 19 20 30 34 35 56 60 78 80 90 100 102",  oList.toString());
		//ResizePath: 2 3 4 6 9 13 19 
		assertEquals(19, oList.size());
		assertEquals(14, oList.length());
	}
	
	@Test
	public void checkSizeTwo() {
		OrderedIntList oList = new OrderedIntList();
		
		oList.insert(10);
		oList.insert(80);				
		oList.insert(90);
		oList.insert(20);
		oList.insert(100);
		oList.insert(60);
		oList.insert(30);
		oList.insert(35);
		oList.insert(78);				
		oList.insert(34);
		oList.insert(56);
		oList.insert(102);
		oList.insert(1);
		oList.insert(19);
		
		oList.delete(19);
		oList.delete(20);
		oList.delete(34);
		oList.delete(78);
		oList.delete(80);
		oList.delete(90);
		oList.delete(102);
		oList.delete(20);
		oList.delete(10);
		oList.delete(34);
		oList.delete(34);
		oList.delete(56);
		oList.delete(35);
		oList.delete(1);
		
		
		assertEquals("30 60 100",  oList.toString());
		//ResizePath: 2 3 4 6 9 13 19 12 8 5 
		assertEquals(5, oList.size());
		assertEquals(3, oList.length());
	}
	
	@Test
	public void twoDeletes() {
		OrderedIntList oList = new OrderedIntList();
		oList.insert(10);
		oList.insert(80);				
		oList.insert(90);
		oList.insert(20);
		oList.insert(100);
		oList.insert(60);
		oList.insert(30);
		
		oList.delete(80);
		oList.delete(42);
		oList.delete(100);
		
		assertEquals(9, oList.size());
		assertEquals(5, oList.length());	
		assertEquals("10 20 30 60 90", oList.toString());
	}
	
	@Test
	public void deleteBig() {
		OrderedIntList oList = new OrderedIntList(47);
		
		oList.insert(10);
		oList.insert(80);				
		oList.insert(90);
		oList.insert(20);
		oList.insert(100);
		oList.insert(60);
		oList.insert(30);
		
		oList.delete(80);
		oList.delete(42);
		oList.delete(100);
			// 18 is approximately 47 - (.4*47) -(.4*28.2)
			//casting makes up the difference 
			//each delete shaves of 40% as instructed
		
		assertEquals(18, oList.size());
		assertEquals(5, oList.length());	
		assertEquals("10 20 30 60 90", oList.toString());
	}
	
	@Test
	public void deleteAll() {
		OrderedIntList oList = new OrderedIntList();
		
		oList.insert(10);
		oList.insert(80);				
		oList.insert(90);
		oList.insert(20);
		oList.insert(100);
		oList.insert(60);
		oList.insert(30);
		
		oList.delete(80);
		oList.delete(42);
		oList.delete(10);
		oList.delete(60);
		oList.delete(30);
		oList.delete(100);
		oList.delete(20);
		oList.delete(90);
		oList.delete(100);
		
		assertEquals(2, oList.size());
		assertEquals(0, oList.length());	
		assertEquals("", oList.toString());
	}
	
	@Test
	public void negatives() {
		OrderedIntList oList = new OrderedIntList();
		
		oList.insert(-7);
		oList.insert(7);				
		oList.insert(-5);
		oList.insert(5);
		oList.insert(-2);
		oList.insert(2);
		oList.insert(-10);
				
	
		assertEquals("-10 -7 -5 -2 2 5 7", oList.toString());
	}
	
	@Test
	public void oneZeroSert() {
		OrderedIntList oList = new OrderedIntList();
		oList.insert(0);
		
		assertEquals("0", oList.toString());
		assertEquals(1, oList.length());	
		assertEquals(2, oList.size());
	}
	
	@Test
	public void manyZeroSert() {
		OrderedIntList oList = new OrderedIntList();
		oList.insert(0);
		oList.insert(0);
		oList.insert(0);
		oList.insert(0);
		oList.insert(0);
		
		assertEquals("0", oList.toString());
		assertEquals(1, oList.length());	
		assertEquals(2, oList.size());
	}
	
	/*@Test //It works
	public void lewpSert() {
		OrderedIntList oList = new OrderedIntList();
		for (int index = 0; index < 12000; index++){
			oList.insert(index);
		}
		
		for (int index = 12000; index >= 0; index--){
			oList.delete(index);
		}
		
		assertEquals("", oList.toString());
		assertEquals(0, oList.length());	
		assertEquals(2, oList.size());
	}*/
	
	@Test
	public void oddBinarySearch() {
		OrderedIntList oList = new OrderedIntList();
		
		oList.insert(10);
		oList.insert(80);				
		oList.insert(91);
		oList.insert(20);
		oList.insert(131);
		oList.insert(64);
		oList.insert(30);
				
	
		assertEquals(2, oList.search(30, 0, oList.length()));
	}
	
	@Test
	public void oddEndBinarySearch() {
		OrderedIntList oList = new OrderedIntList();
		
		oList.insert(10);
		oList.insert(80);				
		oList.insert(90);
		oList.insert(20);
		oList.insert(100);
		oList.insert(60);
		oList.insert(30);
				
	
		assertEquals(6, oList.search(100, 0, oList.length()));
	}
	
	@Test
	public void evenBinarySearch() {
		OrderedIntList oList = new OrderedIntList();
		
		oList.insert(10);
		oList.insert(80);				
		oList.insert(90);
		oList.insert(20);
		oList.insert(100);
		oList.insert(60);
		oList.insert(30);
		oList.insert(45);
				
	
		assertEquals(4, oList.search(60, 0, oList.size()));
	}
	
	@Test
	public void goneBinarySearch() {
		OrderedIntList oList = new OrderedIntList();
		
		oList.insert(10);
		oList.insert(80);				
		oList.insert(90);
		oList.insert(20);
		oList.insert(100);
		oList.insert(60);
		oList.insert(30);
		oList.insert(45);
				
	
		assertEquals(-1, oList.search(42, 0, oList.size()));
	}
}