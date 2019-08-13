package rx.practice.ocakasi.javacompiler;

public class DemoNormalForStatementWithArray {
	public int instanceVar;
	public static void main(String[] args) {
		String[] names = new String[]{"Lisa", "Kevin"};
		for (int i = 0; i< names.length; i++) {
			String name = names[i];
			//System.out.print(name + ", ");
		}
	}

}
