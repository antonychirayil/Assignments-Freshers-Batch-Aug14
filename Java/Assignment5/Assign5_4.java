package Assignment5;
class pair<K,V>{
    K key;
    V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
    
}
public class Assign5_4 {
	  public static void main(String[] args) {
	  pair<String,String > obj1=new pair<>();
      pair<String,java.util.Date > obj2=new pair<>();

      obj1.setKey("k1");
      obj1.setValue("v1");

      obj2.setKey("k2");
      obj2.setValue(new java.util.Date());


      System.out.println("obj1 key: "+obj1.getKey()+" value: "+obj1.getValue());
      System.out.println("obj2 key: "+obj2.getKey()+" value: "+obj2.getValue());

}
}
