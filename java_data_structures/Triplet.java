/**
 * Simplet triplet class to quickly store three-tuple objects.
 * 
 * @author Arsyad Kamili
 * @param <S> Type of first item
 * @param <T> Type of second item
 * @param <U> Type of third item
 */
class Triplet<S, T, U> {
	/** First element. */
	private final S a;
	/** Second element. */
	private final T b;
	/** Third element. */
	private final U c;

	private Triplet(S a, T b, U c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public static <S, T, U> Triplet<S, T, U> of(S a, T b, U c) {
		return new Triplet<>(a, b, c);
	}

	public S getFirst() {
		return this.a;
	}

	public T getSecond() {
		return this.b;
	}

	public U getThird() {
		return this.c;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o instanceof Triplet<?, ?, ?>) {
			Triplet<?, ?, ?> temp = (Triplet<?, ?, ?>) o;
			if (this.a == temp.a && this.b == temp.b && this.c == temp.c) {
				return true;
			}

			if (this.a == null || this.b == null || this.c == null
				|| temp.a == null || temp.b == null || temp.c == null) {
				return false;
			}
			return this.a.equals(temp.a) && this.b.equals(temp.b) && this.c.equals(temp.c);
		} else return false;

	}

	@Override
	public int hashCode() {
		int hash = a.hashCode();
		hash = 31*hash + b.hashCode();
		hash = 31*hash + c.hashCode();

		return hash;
	}

	@Override
	public String toString() {
		return String.format("(%s, %s, %s)", this.a, this.b, this.c);
	}
}
