package apq;

//Creation of a heap would mean initialising an array to utilise start at size 2 double as needed
//Toggle which switches the heap from a min to a max heap
//initial creatio nwould require a specific declaration of the mode
//This class handles heap methods insertions deletions of entries
public class Heap{
	Entry heap [] = new Entry[2];
	
	public Heap(){
		int heapSize = heap.length;
			
	}
	
	public Entry[] toggle(boolean minHeap) {
		//toggle heap min/max
		return heap;
	}

	public Entry removeTop() {
		Entry temp = heap[0];
		//call remove(e)
		return temp;
	}
	public void insert(int k, String v) {
		Entry entry = new Entry(k, v);
		//add entry to the end of heap
		//rebalance
	}
	
	public Entry Top() {
		return heap[0];
	}
	
	public Entry remove(Entry e) {
		Entry temp = e;
		//access temps index from e.indexMin/Max
		//remove it from heap
		//rebalance
		return temp;
	}
	
	
	
	
	
}
