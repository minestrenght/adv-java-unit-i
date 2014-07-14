class Human {
	public String toString() {
		return "I am human";
	}
}

public class Launch {

    public static void main(String[] args) {
		Human h1 = new Human();
		System.out.printf("Who r u? %s\n", h1);
		Human h2 = new Human(){//<-- ananymous class starts
			public String toString() {
				return "I m being human";//<-- modify as per ur need
			}
		};//<-- mind this
		System.out.printf("Who r u? %s\n", h2);
		System.out.printf("Who r u? %s\n", new Human());//<-- just an object
    }
}
