package Practice;

public class Pattern26 {

	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=5;i++) {
			int k=num;
			for(int j=1;j<=9;j++) {
					if(j>=6-i&&j<=4+i) {
						System.out.print(k+" ");
						k--;
					}
						else {
							System.out.print("  ");
						}
					}
			System.out.println();
			num=num+2;	
	}

}
}