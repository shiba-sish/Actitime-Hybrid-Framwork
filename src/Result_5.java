
public class Result_5 {

	public static void main(String[] args) {
		int a,b;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i+j==5) {
					System.out.println(i+" + "+j+" = "+" 5");
				}
				else if(i-j==5){
					System.out.println(i+" - "+j+" = "+" 5");
				}
			}
		}
		
	}

}
