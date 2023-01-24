
public class ClassB {

	private static int counter = 0;

	public ClassB() {
		counter = 1;
	}

	public static void incCounter() {
		++counter;
	}

	public int getCounter() {
		return counter;
	}

	public static void main(String[] args) {
	    int i;
	    ClassB obj = new ClassB();
	    i = obj.getCounter();
	    obj.incCounter();
	    System.out.println("i = " + i + " counter = " + obj.getCounter());
	}

}
