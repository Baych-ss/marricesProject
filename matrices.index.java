import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String user_name = scan.nextLine();
		arrangeShips();
		
	}
	public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
}  
	static void arrangeShips(){
	    Scanner scan = new Scanner(System.in);
	    char miss = 'o';
	    char hit = 'x';
        int[][] array = new int[7][7];
		int bigShip1, bigShip2, bigShip3, normShip1, normShip11;
		int normShip2, normShip21, miniShip1, miniShip2, miniShip3, miniShip4;
	    bigShip1 = array[2][3];
		bigShip2 = array[3][3];
		bigShip3 = array[3][4];
		normShip1 = array[3][5];
		normShip11 = array[4][5];
		normShip2 = array[6][0];
		normShip21 = array[6][1];
		miniShip1 = array[0][1];
		miniShip2 = array[0][4];
		miniShip3 = array[3][0];
		miniShip4 = array[6][5];
		int splice;
	    
		for(int i = 0; i < 7; i++){
		    for(int j = 0; j < 7; j++){
		        System.out.print(" " + j + "");
		    }
		    System.out.println("");
		    break;
		}
		for(int i = 0; i < 7; i++){
		    for(int j = 0; j < 7; j++){
		        System.out.print("" + j + "");
		        for(int k = 0; k < 7; k++){
		            System.out.print("* ");
		        }
		        System.out.println("");
		    }
		    break;
		}
	
}
}