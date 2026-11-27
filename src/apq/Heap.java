package apq;

//Creation of a heap would mean initialising an array to utilise start at size 2 double as needed
//Toggle which switches the heap from a min to a max heap
//initial creatio nwould require a specific declaration of the mode
//This class handles heap methods insertions deletions of entries
//Basically my heap only stores pointers to locations in memory which hold my entry objects
public class Heap{
	Entry heap [];
	boolean isMin = true;
	int indexLast;
	boolean lastEmpty = true; 
	boolean isEmpty = true;
	
	public Heap() {
		heap = new Entry [2];
		indexLast = 0;
	}
	public Heap(int n) {
		heap = new Entry [n];
		indexLast = 0;
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
	public void insert(Entry e){
		
		if(lastEmpty) {
			heap[indexLast] = e;
			e.setIndexMin(indexLast);
			if(indexLast == heap.length-1)
				lastEmpty = false;
		}
		else {
			System.out.println("Heap is full. Doubling size now");
			resize();
			heap[indexLast] = e;
			e.setIndexMin(indexLast);
			lastEmpty = true;
		
		}
		
		upHeap(e);
		indexLast ++;
		
		for(int i=0; i<heap.length;i++) {
			if(heap[i] != null)
			System.out.println(heap[i].getKey()+" key  " +heap[i].getIndexMin()+" index");
		}
	}
	
	public Entry Top() {
		return heap[0];
	}
	
	public Entry remove(Entry e) {
		Entry temp;
		//decide if min or max
		if(isMin) {
		temp = heap[e.getIndexMin()];
		//delete 
		}
		else {
		temp = heap[e.getIndexMax()];
		//delete
		}
		//rebalance
		//access temps index from e.indexMin/Max
		//remove it from heap
		//rebalance
		
		return temp;
	}
	
	public void resize() {
		Entry [] bigger = new Entry[heap.length * 2];
        for (int i = 0; i < heap.length; i++) {
            bigger [i] = heap[i];
        }
        heap = bigger;	
	}
	
	public void upHeap(Entry child) {
		
		do{if(child.getKey() < heap[(child.getIndexMin()-1)/2].getKey()){
			System.out.println("iin");
			swap(child, heap[(child.getIndexMin()-1)/2]);
		}

		}while (child.getKey() < heap[(child.getIndexMin()-1)/2].getKey());
	}
	
	public void swap(Entry child, Entry parent) {
		int indexChild = child.getIndexMin();
		int indexParent = parent.getIndexMin();
		heap[parent.getIndexMin()] = child;
		heap[child.getIndexMin()] = parent;
		child.setIndexMin(indexParent);
		parent.setIndexMin(indexChild);
	}
	/*
	 * public Heap mergeHeap(Heap currentHeap, Heap newHeap) { int sizeNewHeap =
	 * currentHeap.size + newHeap.size; Heap mergedHeap = new Heap(sizeNewHeap);
	 * 
	 * 
	 * 
	 * //return newHeap; }
	 */
	
	
}
