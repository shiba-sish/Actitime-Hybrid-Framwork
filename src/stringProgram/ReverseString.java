package stringProgram;

public class ReverseString {
public static void main(String[] args) {
	String s1= "hi good morning";
	String s[]=s1.split(" ");
	for(int i=s.length-1;i>=0;i--) {
		System.out.print(s[i]+" ");
	}
}
}
