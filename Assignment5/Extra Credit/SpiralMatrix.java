import java.util.*;

public class SpiralMatrix{
	public List<Integer> spiralMatrix(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();

        if (matrix.length == 0) 
            return ans;

        int row = matrix.length;
        int column = matrix[0].length;
        boolean[][] seen = new boolean[row][column];

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        
        int r = 0, c = 0, di = 0;

        for (int i = 0; i < row * column; i++) {
            ans.add(matrix[r][c]);
            seen[r][c] = true;
            int cr = r + dr[di];
            int cc = c + dc[di];
            if (0 <= cr && cr < row && 0 <= cc && cc < column && !seen[cr][cc]){
                r = cr;
                c = cc;
            } else {
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        return ans;
	}

	public static void main(String[] args) {
		int[][] matrix = { 
							{1,2,3},
						    {4,5,6},
						    {7,8,9} 
						};
		SpiralMatrix s = new SpiralMatrix();
		List<Integer> list = s.spiralMatrix(matrix);
		for(Integer i : list){
			System.out.print(i + " ");
		}
	}
}