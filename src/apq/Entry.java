package apq;

//Entry class will handle Entry objects. Each object has vars Key, Value, indexMin, indexMax
//Accessor methods.


public class Entry {

	private int key;
	private String value;
	private int indexMin, indexMax;
	
	
	
	public Entry(int Key, String value) {
		this.key = key;
		this.value = value;
	}
	
	
	private void setValue(Entry e, String value) {
		e.value = value;
	}
	
	private void setKey(Entry e, int key) {
		e.key = key;
	}
	
	private int getKey(Entry e) {
		return e.key;
	}

}
