//Answer to problem 16 of project Euler: https://projecteuler.net/problem=16

public class Problem16{
	int[] pow_of_two;
	public static void main(String[] args){
		Problem16 a = new Problem16();
		int j = 499;
		int answer = 0;
		
		for(int i = 1; i<=1000; i++){
			while(j>0){
				a.pow_of_two[j] = a.pow_of_two[j]*2;
				j--;
			}
			j = 499;
			a.carry(499);
		}
		
		for(int i = 0; i<a.pow_of_two.length; i++){
			answer = answer + a.pow_of_two[i];
		}
		System.out.println(answer);
	}
	
	public Problem16(){
		pow_of_two = new int[500];
		pow_of_two[499] = 1;
	}
	
	public void carry(int index){
		if(pow_of_two[index] >= 10){
			pow_of_two[index-1] = pow_of_two[index-1] + 1;
			pow_of_two[index] = pow_of_two[index]%10;
		}
		if(index-1 >= 10){
			carry(index-1);
		}
	}
}
