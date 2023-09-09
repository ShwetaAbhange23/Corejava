package oops;

class Parent1 {
	void display() {

	}

	public class FinalKeyword {

		public class FinalEx extends Parent1 {
			final int a = 10;

			void display() {

			}

			public static void main(String args[]) {
				Parent1 f = new Parent1();
				// f.a=15;
			}
		}
	}
}
