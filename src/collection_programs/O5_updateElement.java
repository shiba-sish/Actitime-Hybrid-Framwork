package collection_programs;

import java.util.ArrayList;
import java.util.List;

public class O5_updateElement {
	  public static void main(String[] args) {
 // updating element using the set() method and passing the index. and the value. 
		  
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  // Print the list
		  System.out.println(list_Strings);
		  // Update the third element with "Yellow"
		  list_Strings.set(2, "Yellow");
		   // Print the list again
		  System.out.println(list_Strings);
   }
 }