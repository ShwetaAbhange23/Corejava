package encapsulationcode;

public class Encapsulation {
		private int value;

		public Encapsulation(int value) {
		this.value = value;
		}

		public int getValue() {
		return value;
		}

		public void setValue(int value) {
		this.value = value;
		}

		public static void main(String[] args) {
		Encapsulation example = new Encapsulation(42);

		System.out.println("Initial Value: " + example.getValue());

		example.setValue(99);

		System.out.println("Updated Value: " + example.getValue());
		}
		}

