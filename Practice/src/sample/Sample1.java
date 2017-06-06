package sample;

public class Sample1 {

	public static void main(String args[]){

		Runnable r = () -> System.out.println("Sample1");
		r.run();
	}


}
