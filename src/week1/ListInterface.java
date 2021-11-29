package week1;

// ********************************************************
// Interface week1.ListInterface for the ADT list.
// *********************************************************
public interface ListInterface {
  public boolean isEmpty();
  public int size();
  public void add(int index, Object item) 
                  throws ListIndexOutOfBoundsException,
                         ListException;
  public Object get(int index) 
                    throws ListIndexOutOfBoundsException;
  public void remove(int index) 
                     throws ListIndexOutOfBoundsException;
  public void removeAll();
}  // end week1.ListInterface
