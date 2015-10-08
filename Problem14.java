//Answer to problem 14 of project Euler: https://projecteuler.net/problem=14

public class Problem14{
	public static void main(String[] agrs){
		int max = 0;
		long index = 0l;
		int max_index = 0;
		int temp = 1;
		
		for(int i = 999999; i>1; i--){
			index = i;
			while(index > 1){
				if(index%2 == 0){
					index = index/2;
				} else{
					index = (index*3)+1;
				}
				temp++;
			}
			temp++;
			if(temp>max){
				max = temp;
				max_index = i;
			}
			temp = 1;
		}
		
		System.out.println(max);
		System.out.println(max_index);
	}
}
