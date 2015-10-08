//Answer to problem 15 of project Euler: https://projecteuler.net/problem=15

public class Problem15{
	public long[][] grid =  new long[21][21];
	
	public static void main(String[] args){
		Problem15 answer = new Problem15();
		for(int i = 0; i<21; i++){
			for(int j = 0; j<21; j++){
				answer.path(i,j);
			}
		}
		System.out.println(answer.grid[20][20]);
	}
	
	public void path(int i, int j){
		if(i == 0){
			grid[i][j] = 1;
		} else if(j == 0){
			grid[i][j] = 1;
		} else{
			grid[i][j] = grid[i-1][j] + grid[i][j-1];
		}
	}
}
