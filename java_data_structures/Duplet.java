/**
 * Duplet class for dijkstra that stores a node of type T
 * and the distance needed to get to that node from the source; 
 * This class can also be used for other purposes, please use it liberally.
 * 
 * @Author Arsyad Kamili
 * @param T The type of node
 */
class Duplet<T> implements Comparable<Duplet<T>> {
	private final T node;
	private final int distance;

	public Duplet(T node, int distance) {
		this.node = node;
		this.distance = distance;
	}

	public T getNode() {
		return this.node;
	}

	public int getDist() {
		return this.distance;
	}

	@Override
	public String toString() {
		return String.format("[%s, %d]", getNode(), getDist());
	}

	@Override
	public int hashCode() {
		int hash = node.hashCode();
		hash = 31 * hash + distance;
		
		return hash;
	}	

	@Override
	public int compareTo(Duplet<T> duplet) {
		if (duplet == null) {
			return this == null ? 0 : 1;
		} else if (this == null) {
			return -1;
		}

		return this.distance - duplet.distance;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj instanceof Duplet<?>) {
			Duplet<?> temp = (Duplet<?>) obj;
			if (this.distance == temp.distance && this.node == temp.node) {
				return true;
			}

			if (this.node == null || temp.node == null) {
				return false;	
			} else {
				return this.node.equals(temp.node) && this.distance == temp.distance;
			}
		} else return false;
	}
}
