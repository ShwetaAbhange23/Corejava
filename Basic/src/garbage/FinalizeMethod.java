package garbage;

public class FinalizeMethod {
		String s;
		
	public FinalizeMethod(String s) {
		this.s = s;
	}

	public static void main(String[] args) {
		FinalizeMethod f1 = new FinalizeMethod("f1");
		FinalizeMethod f2 = new FinalizeMethod("f2");
		f1 = f2;
		f1 = null;
		f2 = null;
		System.gc();
	}
	@Override

	protected void finalize() throws Throwable {
		System.out.println("Object previously referenced by " + this.s + " is successfully garbage collected.");
	}
}
