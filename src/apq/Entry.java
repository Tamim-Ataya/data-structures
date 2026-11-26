package apq;

//Entry class will handle Entry objects. Each object has vars Key, Value, indexMin, indexMax
//Accessor methods.


public class Entry {

	private int key;
	private String value;
	private int indexMin, indexMax;
	
	
	
	public Entry(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
	
	public void setValue(Entry e, String value) {
		e.value = value;
	}
	
	public void setKey(Entry e, int key) {
		e.key = key;
	}
	
	public int getKey(Entry e) {
		return e.key;
	}
	
	public String getValue(Entry e) {
		return e.value;
	}
	
	public int getIndexMin(Entry e) {
		return e.indexMin;
	}
	
	public int getIndexMax(Entry e) {
		return e.indexMax;
	}
	/*
	 * public void updateKey(int k) {
	 * 
	 * }
	 */
}
