package Exe3_2;

public class Dinghy extends Boat {
	private int rental; 
	
	 public Dinghy(String T, int P, int Q, String B, int R){
		 super(T,P,Q,B); //super=parent(Boat)
		 rental = R;
	 	}
	 
	    public int getTotal() {
	    	return super.getTotal();
	    } 
	    
	    public int getRental() {
	    	return rental * super.getQuantity();
	    } 
	    
	    public String toString() {
	    	return super.toString() + "\nRental\t = RM" + getRental() + " for " + super.getQuantity() + " boat(s).";
	    }
}