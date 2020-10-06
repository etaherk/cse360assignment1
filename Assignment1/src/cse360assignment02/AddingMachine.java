package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0"; // also not needed :)
  }
  
  public int getTotal () {
    return total;
    
  }
  
  public void add (int value) {
	  int adding = 0;
	  adding = value;
	  total = total + adding;
	  history += " + " + adding;
  }

  public void subtract (int value) {
	  int subtracting = 0;
	  subtracting = value;
	  total = total - subtracting;
	  history += " - " + subtracting;
	  
  }

  public String toString () {
	
    return "" + history;
  }

  public void clear() {
	  history = "";
  }
  public static void main(String[] args) {
	  AddingMachine myCalculator = new AddingMachine();
	  myCalculator.add(4);
	  myCalculator.subtract(2);
	  myCalculator.add(5);
	  
	  String newHistory = myCalculator.toString();
	  System.out.println(newHistory);
	  System.out.println(myCalculator.getTotal());
	  
  }
}