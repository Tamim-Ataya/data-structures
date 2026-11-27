package apq;

//main ADT i suppose still to be decided if i use one heap amd toggle it whenever necessary or have 2 heaps a min and max.
//I think 1 heap only because having 2 heaps and preforming every operation on both is too much
//2 heaps only better when actually using toggle operation dont know how many times though.
//To access my entries data i need to first get them 

public class APQ {
	
	public static void main(String args[]) {
		APQ test = new APQ();
		test.insert(2, "one");
		test.insert(5, "two");
		test.insert(3, "two");
		test.insert(4, "two");
		test.insert(0, "two");

		System.out.println(test.heap.heap[1].getKey());
	}
	
	Heap heap;

	public APQ() {
		this.heap = new Heap();
	}
	
	
	public void toggle() {
		//toggle heap min/max
	}

	public void removeTop() {
		heap.removeTop();
	}
	
	public Entry insert(int k, String v){
		Entry e = new Entry(k, v);
		heap.insert(e);
		return e;
	}
	
	public Entry top() {
		System.out.println(heap.heap[0].getKey());
		return heap.heap[0];
	}
	
	public void remove(Entry e) {
		heap.remove(e);
		
	}

	public int replaceKey(Entry e, int k) {
		int oldKey = e.getKey();
		e.setKey(k);
		
		return oldKey;
	}
	
	public String replaceValue(Entry e, String v) {
		String oldValue = e.getValue();
		e.setValue(v);
		
		return oldValue;
	}
	
	public String state() {
		if(heap.isMin)
			return "Min";
		else
				return "Max";		
	}
	
	public boolean isEmpty() {
		if(heap.isEmpty)
			return true;
		else 
			return false;
	}
	
	public int size() {
		return heap.indexLast-1;
	}
	
	public Entry peekAt(int n) {
		if(n<heap.heap.length && n>=0)
			return heap.heap[n];
		else {
			System.out.println("Error n out of bounds");
			return null;
		}
	}
	
	/*
	 * public Heap mergeHeap(Heap currentHeap, Heap newHeap) {
	 * 
	 * Heap mergedHeap = heap.mergeHeap(currentHeap, newHeap);
	 * 
	 * return mergedHeap; }
	 */
}
