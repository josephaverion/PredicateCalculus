package lojban;

public class Predicate {
	private final String functor;
	private final int arity;

	public Predicate(String functor,int arity) {
		this.functor = functor;
		this.arity = arity;
	}

	public Object getFunctor() {
		return functor;
	}

	public int getArity() {
		return arity;
	}

	@Override
	public String toString() {
		return "predicate name: " + functor + ", number of arguments: " + arity;
	}
}