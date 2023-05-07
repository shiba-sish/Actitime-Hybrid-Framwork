package threadProgram;

public class SynchronzedBlock {

	public static void main(String[] args) {
		Document d=new Document();
		Jhon j= new Jhon(d);
		Smith s= new Smith(d);
		j.start();
		s.start();
	}
}
	class Document{
		 void printDocuments(int noOfCopies, String documents) {
			for(int i=1;i<=noOfCopies;i++) {
				System.out.println(i+" "+documents);
			}
		}
	}
	class Jhon extends Thread{
		Document d;
		Jhon(Document d){
			this.d=d;
		}
		public void run() {
			synchronized (d)//synchronized block(synchronized is a keyword) 
			{
			d.printDocuments(50, "jhon pdf");
			}
		}
	}
	class Smith extends Thread{
		Document d;
		Smith(Document d){
			this.d=d;
		}
		public void run() {
			synchronized (d)//synchronized block(synchronized is a keyword)
			{
			d.printDocuments(10, "Smith pdf");
		}}
	}

