
import java.util.Scanner;


public class Puzzel {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Change this if you prefer to enter the puzzel
		Boolean useMan = false;
		
		int[][] puzzel = 
			    	{{ 5, 0, 0, 7, 1, 2, 0, 0, 3}, 
					{ 0, 0, 0, 0, 0, 6, 5, 0, 0}, 
					{ 0, 1, 9, 4, 0, 0, 8, 0, 0},
					{ 7, 4, 0, 2, 0, 9, 3, 0, 5},
					{ 8, 0, 0, 0, 0, 0, 0, 0, 6},
					{ 1, 0, 5, 6, 0, 4, 0, 8, 9},
					{ 0, 0, 1, 0, 0, 7, 2, 6, 0},
					{ 0, 0, 8, 5, 0, 0, 0, 0, 0},
					{ 9, 0, 0, 3, 6, 8, 0, 0, 4}};
		
		//Used to enter the data into the puzzel
		if(useMan){
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter the row, use spaces, use 0s, hit enter");
			String row;
			String[] tokins;
			String delims = "[ ]+";
			for(int i =0; i<9; i++){
				row = keyboard.nextLine();
				tokins = row.split(delims);
				for(int j = 0; j<9; j++){
					puzzel[i][j] = Integer.parseInt(tokins[j].toString());
				}
				System.out.println("recorded");
			}
		}
		
		printPuzzel(puzzel);

	}

	private static void printPuzzel(int[][] puzzel) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------------");
		for(int a = 0; a<9; a++){
			System.out.println("|| " + puzzel[a][0] + " | " + puzzel[a][1] + " | "
					+ puzzel[a][2] + " | " + puzzel[a][3] + " | " + puzzel[a][4]
					+ " | " + puzzel[a][5] + " | " + puzzel[a][6] + " | " + puzzel[a][7]
					+ " | " + puzzel[a][8] + " ||");
			System.out.println("--------------------------------------");
		}
	}
	
	private static int[] getRow(int xPosition, int yPosition, int[][] puzzel){
		int row[];
		for()
		return row;
	}
	
	private static int[] getCollumn(int xPosition, int yPosition, int[][] puzzel){
		
	}
	
	private static int[][] getBox(int xPosition, int yPosition, int[][] puzzel){
		//Find out what box you are in
		if((xPosition<=3)&&(yPosition<=3)){
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					data[]
				}
			}
		}
	}
	
	@SuppressWarnings("null")
	private static int[][] findZeros(int[][] puzzel){
		int[][] data = null;
		int p = 0;
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(puzzel[i][j] == 0){
					data[p][0] = i;
					data[p][1] = j;
					p++;
				}
			}
		}
		return data;
	}

}



/*{{ 5, 0, 0, 7, 1, 2, 0, 0, 3}, 
	{ 0, 0, 0, 0, 0, 6, 5, 0, 0}, 
	{ 0, 1, 9, 4, 0, 0, 8, 0, 0},
	{ 7, 4, 0, 2, 0, 9, 3, 0, 5},
	{ 8, 0, 0, 0, 0, 0, 0, 0, 6},
	{ 1, 0, 5, 6, 0, 4, 0, 8, 9},
	{ 0, 0, 1, 0, 0, 7, 2, 6, 0},
	{ 0, 0, 8, 5, 0, 0, 0, 0, 0},
	{ 9, 0, 0, 3, 6, 8, 0, 0, 4}};*/