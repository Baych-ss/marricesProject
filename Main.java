import java.util.Scanner;
public class Main
{
    //cleaner
public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush(); 
}

    //main
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//String user_name = scan.nextLine();
		drawFieald();
		
	}
	public static void placeShips(){
	    int [][] array = new int[7][7];
	    
	}
	  
	public static void drawFieald(){
	    
    	System.out.println("  0 1 2 3 4 5 6");
    	for(int i = 0; i< 7; i++){
    	    System.out.print(i + " ");
    	    {
    	        for(int j = 0; j < 7; j++){
    	            System.out.print("* ");
    	        } 
    	    }
    	    System.out.println();
    	} 
}
}