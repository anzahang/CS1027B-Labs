public class ClassA {
	private final int SIZE_ARRAY = 5;
	public int numItems;
	public int[] arrItems;

	public ClassA(int n, int[] arr) {
		numItems = n;
		arrItems = arr;
	}

	public ClassA() {
		numItems = 0;
		arrItems = new int[SIZE_ARRAY];
		
	}
	public boolean equals(ClassA otherObject) {
        if (this.numItems != otherObject.numItems) {
            return false;
        }
        if (this.arrItems == null && otherObject.arrItems != null || this.arrItems != null && otherObject.arrItems == null) {
            return false;
        }
        if (this.arrItems != null && otherObject.arrItems != null) {
            for (int i = 0; i < this.numItems; i++) {
                if (this.arrItems[i] != otherObject.arrItems[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
