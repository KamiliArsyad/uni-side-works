class IntPair {
  private final int nodeA;
  private final int nodeB;

  public IntPair(int nodeA, int nodeB) {
    this.nodeA = nodeA;
    this.nodeB = nodeB;
  }

  public int getNodeA() {
    return this.nodeA;
  }

  public int getNodeB() {
    return this.nodeB;
  }

  @Override
    public String toString() {
      return String.format("[%s, %d]", getNodeA(), getNodeB());
    }

  @Override
    public int hashCode() {
      int hash = nodeA;
      hash = 31 * hash + nodeB;

      return hash;
    }

  @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }

      if (obj instanceof IntPair) {
        IntPair temp = (IntPair) obj;
        if (this.nodeB == temp.nodeB && this.nodeA == temp.nodeA) {
          return true;
        }
      } else return false;

      return false;
    }
}
