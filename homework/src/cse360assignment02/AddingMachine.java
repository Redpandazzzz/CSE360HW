package cse360assignment02;

public class AddingMachine {
  private int total;
  private String stringTotal;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    stringTotal = "0";
    
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total += value;
	  stringTotal = stringTotal + " + " + value;
  }

  public void subtract (int value) {
	  total -= value;
	  stringTotal = stringTotal + " - " + value;
  }

  public String toString () {
    return stringTotal;
  }

  public void clear() {
	  System.gc();
  }
}