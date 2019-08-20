package basic_practice_package;

public class loop1 {

	public static void main(String args[]) {

		/********************************************************************/
//		for (int x = 0; x < 5; x++) {
//			for (int y = 0; y < x; y++) {
//				System.out.print(x);
//			}
//		}
		//Output => 1223334444
		
		/********************************************************************/
//		for (int x = 0; x < 5; x++) {
//			for (int y = 0; y < x; y++) {
//				System.out.print(y);
//			}
//		}
//		//Output => 0010120123
		
		/********************************************************************/
//		for (int x = 0; x < 5; x++) {
//			for (int y = 0; y < x; y++) {
//				System.out.print(y);
//			}
//			System.out.println();
//		}
		/*Output =>
					01
					012
					0123
		*/
		
		/********************************************************************/
//		for (int x = 0; x <= 5; x++) {
//			for (int y = 0; y <= x; y++) {
//				System.out.print(y+" ");
//			}
//			System.out.println("");
//		}
		/*Output => 0
					01
					012
					0123
					01234
					012345
		*/
		
		/********************************************************************/
//		for (int x = 0; x <= 5; x++) {
//			for (int y = 0; y <= x; y++) {
//				System.out.print(x+" ");
//			}
//			System.out.println("");
//		}
		/*Output =>	0 
					1 1 
					2 2 2 
					3 3 3 3 
					4 4 4 4 4 
					5 5 5 5 5 5 
		 */
		
		/********************************************************************/
//		for (int x = 5; x >= 0; x--) {
//			for (int y = 0; y <= x; y++) {
//				System.out.print(x+" ");
//			}
//			
//			System.out.println("");
//		}
		/*Output =>	 
					5 5 5 5 5 5 
					4 4 4 4 4 
					3 3 3 3 
					2 2 2 
					1 1 
					0 
		 */
		
		/********************************************************************/
//		for (int x = 0; x <= 5; x++) {
//			for (int y = 0; y <= x; y++) {
//				System.out.print(x+" ");
//			}
//			System.out.println("");
//		}
//		for (int x = 5; x >= 0; x--) {
//			for (int y = 0; y <= x; y++) {
//				System.out.print(x+" ");
//			}
//			
//			System.out.println("");
//		}
		/*Output =>
					0 
					1 1 
					2 2 2 
					3 3 3 3 
					4 4 4 4 4 
					5 5 5 5 5 5 
					5 5 5 5 5 5 
					4 4 4 4 4 
					3 3 3 3 
					2 2 2 
					1 1 
					0 
		*/
		
		/********************************************************************/
//		for (int x = 0; x <= 5; x++) {
//			for (int y = 0; y <= x; y++) {
//				System.out.print(y+" ");
//			}
//			System.out.println("");
//		}
//		for (int x = 4; x >= 0; x--) {
//			for (int y = 0; y <= x; y++) {
//				System.out.print(y+" ");
//			}
//			
//			System.out.println("");
//		}
		/*Output =>
					0 
					0 1 
					0 1 2 
					0 1 2 3 
					0 1 2 3 4 
					0 1 2 3 4 5 
					0 1 2 3 4 
					0 1 2 3 
					0 1 2 
					0 1 
					0 
		 */
		
		/********************************************************************/
		int y;
		for (int x = 1; x <= 5; x++) {
			for (y = 5; y >= x; y--) {
				System.out.print(y);
			}
			
			System.out.print("");
		}
//		for (int x = 1; x <= 5; x++) {
//			for (int y = 1; y <= x; y++) {
//				System.out.print(y+" ");
//			}
//			System.out.println("");
//		}
		
	}

}
