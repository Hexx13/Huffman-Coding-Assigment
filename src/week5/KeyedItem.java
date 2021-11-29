package week5;

public abstract class KeyedItem {
  protected Comparable searchKey;

  public KeyedItem(Comparable key) {
       searchKey = key;
     }  

 public Comparable getKey() {
       return searchKey;
  } 
} // end