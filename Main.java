package Exe3_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boat objB = new Boat();
		
	
		System.out.println(objB);
		System.out.println("Total Price : RM" + objB.getTotal());
		System.out.println();
	
		Dinghy objD = new Dinghy("Dinghy",6000,2,"Zodiac",120);
		System.out.println(objD);
		System.out.println("Total Price : RM" + objD.getTotal());
		
		System.out.println();
		System.out.println("Total price need to be paid\t: " + (objB.getTotal()+objD.getTotal()));
	}

}
