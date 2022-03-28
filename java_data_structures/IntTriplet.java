class IntTriplet {
	private final int a;
	private final int b;
	private final int c;

	private IntTriplet(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public static IntTriplet of(int a, int b, int c) {
		return new IntTriplet(a, b, c);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o instanceof IntTriplet) {
			IntTriplet temp = (IntTriplet) o;
			return this.a == temp.a && this.b == temp.b && this.c == temp.c;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hash = a;
		hash = 31*hash + b;
		hash = 31*hash + c;

		return hash;
	}

	@Override
	public String toString() {
		return String.format("(%s, %s, %s)", this.a, this.b, this.c);
	}
}
