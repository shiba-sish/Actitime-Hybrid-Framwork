package collection;

import java.util.ArrayList;
import java.util.List;

public class Compairingarraylist {
public static void main(String[] args) {
	List<String> list_String=new ArrayList<String>();
	list_String.add("red");
	list_String.add("blue");
	list_String.add("black");
	list_String.add("green");
	list_String.add("pink");
	List<String> list_String1=new ArrayList<String>();
	list_String1.add("a");
	list_String1.add("b");
	list_String1.add("c");
	list_String1.add("d");
	list_String1.add("e");
	
	ArrayList<String> ar= new ArrayList<String>();
	for(String e:list_String1) {
		ar.add(list_String1.contains(e) ? "yes" : "no");
	}
		System.out.println(ar);
}
}
