package practice.ocpkasi.generics;

public class Crate<T> {
	private T contents;
	public T emptyCrate() {
		return contents;
	}
	
	public void packCrate(T conents) {
		this.contents = contents;
	}
	
	/**
	 * Generic Method
	 * 
	 * @param t
	 * @return
	 */
	public static <T> Crate<T> ship(T t) {
		System.out.println("Preparing " + t);
		return new Crate<T>();
	}
	
	public static <T> void sink(T t) {}
	public static <T> T identity(T t) {return t;}
}
