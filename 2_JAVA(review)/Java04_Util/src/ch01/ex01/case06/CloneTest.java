package ch01.ex01.case06;

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Worker w1 = new Worker(1001, "John");
		Worker w2 = new Worker(1001, "John");
		
		Worker wCopied = (Worker) w1.clone();
		System.out.println(wCopied); 
		System.out.println(w1);
		
		w1.setWorkerName("Arnie");
		Worker wCopied2 = (Worker) w1.clone();
		System.out.println(wCopied2);
		System.out.println(w1);
		
	}
}