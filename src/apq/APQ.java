package apq;

//main ADT i suppose still to be decided if i use one heap amd toggle it whenever necessary or have 2 heaps a min and max.
//I think 1 heap only because having 2 heaps and preforming every operation on both is too much
//2 heaps only better when actually using toggle operation dont know how many times though.

public class APQ {
	
	Heap heap;
	
	public APQ() {
		this.heap = new Heap();
	}
	
	
	public void toggle() {
		//toggle heap min/max
	}

	public void removeTop() {
		heap.Top();
	}
	
	public void remove(Entry e) {
		heap.delete(e);
	}

}
