package Practice;

public class Pattern25 {

	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
					if(j>=6-i&&j<=4+i) {
						System.out.print(num);
					}
					
		}
			System.out.println();
			num++;	
	}

}
}