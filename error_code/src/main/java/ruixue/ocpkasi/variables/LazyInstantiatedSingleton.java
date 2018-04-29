package rxue.error.ocpkasi.variables;

public class LazyInstantiatedSingleton {
	private static final LazyInstantiatedSingleton instance;
	private LazyInstantiatedSingleton() {
		
	}
	
	public static LazyInstantiatedSingleton getInstance() {
		if (instance == null)
			instance = new LazyInstantiatedSingleton();
		return instance;
	}

}
