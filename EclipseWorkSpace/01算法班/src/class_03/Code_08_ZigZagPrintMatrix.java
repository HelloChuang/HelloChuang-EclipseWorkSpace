package class_03;

/**
 * @author XX
 *A一直往右走 走到头往下
B一直往下走 走到头往右
A B 轮流走

这样问题就变成了：知道一条对角线的右上和左下点  怎么打印这条对角线

右上到左下打印，然后左下到右上打印
设置一个boolean
 */
public class Code_08_ZigZagPrintMatrix {

	public static void printMatrixZigZag(int[][] matrix) {
		int aR = 0;	//A的行列号
		int aC = 0;
		int bR = 0;	//B的行列号
		int bC = 0;
		int endR = matrix.length - 1;		//终止的位置
		int endC = matrix[0].length - 1;
		boolean fromUp = false;
		while (aR != endR + 1) {		//如果A的行号来到了最后一行，说明A已经走完了（A右边走完了，往下也走完了）
			printLevel(matrix, aR, aC, bR, bC, fromUp); //当有了A 和 B 点  怎么打印对角线
			aR = aC == endC ? aR + 1 : aR; //a的行号：如果A来到最后一列，才往下走，否则A的行号不变，
			aC = aC == endC ? aC : aC + 1;	//a的列： 如果来到最后一列，列号不变，否则列号+1
			bC = bR == endR ? bC + 1 : bC;	//b的列： 只有b的行数来到最后一行，b的列才增加，否则不变
			bR = bR == endR ? bR : bR + 1;	//b的行： 只要没到最后一行，就增加，否则不变
			fromUp = !fromUp;
		}
		System.out.println();
	}

	public static void printLevel(int[][] m, int tR, int tC, int dR, int dC,
			boolean f) {
		if (f) {
			while (tR != dR + 1) {
				System.out.print(m[tR++][tC--] + " ");
			}
		} else {
			while (dR != tR - 1) {
				System.out.print(m[dR--][dC++] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		printMatrixZigZag(matrix);

	}

}
