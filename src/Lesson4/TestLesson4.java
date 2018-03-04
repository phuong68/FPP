package Lesson4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestLesson4{

	public TestLesson4(){
		
	}
	
	@Test
	public void checkPalindrome_True() {
		String input = "madam";
		boolean output = Lesson4.checkPalindrome(input);
		assertEquals(output,true);
	}
	
	@Test
	public void checkPalindrome_False() {
		String input = "madaam";
		boolean output = Lesson4.checkPalindrome(input);
		assertEquals(output,false);
	}
	
	@Test
	public void mergeString_True() {
		String input1 = "ace";
		String input2 = "bdf";
		String output = Lesson4.mergeStrings(input1, input2);
		assertEquals(output,"abcdef");
	}
	
	@Test
	public void findStringMinimum_True() {
		String input = "akel";
		char output = Lesson4.findStringMinimum(input);
		assertEquals(output,'a');
	}
	
	@Test
	public void binarySearch_True() {
		String input1 = "abcdefgh";
		char input2 = 'e';
		int output = Lesson4.binarySearch(input1,input2);
		assertEquals(output,4);
	}

	

}
