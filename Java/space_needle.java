public class SpaceNeedle {
	public static final int SIZE = 4;

	public static void main(String [] args){
		needle();
		dots();
		topmiddle();
		topbottom();
		needle();
		middlestem();
		dots(); 
		topmiddle(); 
	}
	public static void needle() { //prints the needle 
		for (int x = 1; x <= SIZE; x++) { 
			for (int blank = 1; blank <= SIZE + SIZE + SIZE; blank++) { //prints empty spaces
				System.out.print(" ");
		}	
				System.out.print("||");
				System.out.println();
		}
	}
	public static void dots() { //prints the top half 
		for(int x = 1; x <= SIZE; x++){ 
			for (int blank = 1; blank <= -3 * x + SIZE * 3; blank++ ){
				System.out.print(" ");
		}
				System.out.print("__/"); //prints underscores 
		for (int colon = 1; colon <= (x * 3) - 3; colon++){
				System.out.print(":");
		}
				System.out.print("||");
		for (int colon = 1; colon <= (x * 3) - 3; colon++){ //prints dots inside the space needle
				System.out.print(":");
		}
				System.out.print("\\__"); //other sides underscores
				System.out.println();
		}
				System.out.print("|");
	}
	public static void topmiddle() { //prints the quotation marks in the middle of the top part
		for(int x = 1; x <= SIZE; x++);{
			for( int quotes = 1; quotes <= 6 * SIZE; quotes++){ //6 * SIZE = 24 if size is 4
				System.out.print("\"");
		}
				System.out.println("|");
		}	
	}
	public static void topbottom(){ //prints the bottom half of the top
		for(int x = 1; x <= SIZE; x++){
			for(int blank = 1; blank <= x * 2 - 2; blank++){
				System.out.print(" ");
		}
				System.out.print("\\_");
		for( int mountain = 1; mountain <= -2 * x + (1 + SIZE * 3) ; mountain++){
				System.out.print("/\\");
		}
				System.out.print("_/");
				System.out.println();
		}
	}
	public static void middlestem(){ //prints the middle of the space needle
		for(int x = 1; x <= SIZE * SIZE; x++){
			for(int blank = 1; blank <= SIZE + SIZE + 1; blank++){

				System.out.print(" ");
		}
				System.out.print("|");
		for(int percent = 1; percent <= SIZE - 2; percent++){
				System.out.print("%");
		}
				System.out.print("||");
		for( int percent = 1; percent <= SIZE - 2; percent++){
				System.out.print("%");
		}
				System.out.print("|");
				System.out.println();
		}
	}
}
