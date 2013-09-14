package banana.lighter.gridpath;

public class GridPath {
	
	public int next(int row, int column, int degree) {
		int pathCount = 0;
		while (column <= degree && row <= degree) {
			if (column == degree && row == degree) {
				return 1;
			} 
			pathCount += next(row + 1, column, degree);
			pathCount += next(row, column + 1, degree);
			break;
		}
		if (column > degree || row > degree) {
			return 0;
		}
		return pathCount;
	}

	public static void main(String[] args) {
		GridPath gp = new GridPath();
		System.out.print(gp.next(0, 0, 2));
	}
}
