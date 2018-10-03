package class_03;

public class Code_05_RotateMatrix {

	public static void rotate(int[][] matrix) {
		int tR = 0;
		int tC = 0;
		int dR = matrix.length - 1;
		int dC = matrix[0].length - 1;
		while (tR < dR) {
			rotateEdge(matrix, tR++, tC++, dR--, dC--);
		}
	}

	public static void rotateEdge(int[][] m, int a, int b, int c, int d) {
		int times = d - b; 		//比如说4*4 第一行为1234  times就是找到 以123，不包括4为基准的四个点，就是如果一行只有3个数，那么只用找两个出发点
		int tmp = 0;
		for (int i = 0; i != times; i++) {  //i就是为了找出发点
			tmp = m[a][b + i];	//第一个出发点
			m[a][b + i] = m[c - i][b];   //m[c - i][b]; 是第一个出发点下面那个  第四个点位置
			m[c - i][b] = m[c][d - i];	//m[c][d - i]	第三个点位置
			m[c][d - i] = m[a + i][d];	//m[a + i][d]   第二个位置
			m[a + i][d] = tmp;
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i != matrix.length; i++) {
			for (int j = 0; j != matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		printMatrix(matrix);
		rotate(matrix);
		System.out.println("=========");
		printMatrix(matrix);

	}

}
