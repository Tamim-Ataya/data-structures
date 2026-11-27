package apq;


//Entry class will handle Entry objects. Each object has vars Key, Value, indexMin, indexMax
//Accessor methods.


public class Entry {

	private int key;
	private String value;
	private int indexMin, indexMax, indexLeftChild, indexRightChild, indexParent;
	
	
	
	public Entry(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public int getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setIndexMin(int i) {
		this.indexMin = i;
	}
	
	public void setIndexMax(int i) {
		this.indexMax = i;
	}
	public int getIndexMin() {
		return indexMin;
	}
	
	public int getIndexMax() {
		return indexMax;
	}
	
}
