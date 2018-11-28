package ruixue.ocpkasi.error.functional_programming;
import java.util.function.Predicate;

public class StandardFunctionalInterfaceWithoutGenericType {
	static Predicate predicate = t -> "x".equals(t); 
	static Predicate wrongPredicate = t -> "x".equalsIgnoreCase(t); 
}
