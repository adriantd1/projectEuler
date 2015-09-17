import java.util.*;

/*  This program answers problem 10 of projecteuler.com: Find the sum of all the primes 
 *  below two million. */

public class Problem10{
	
	public static void main(String agrs[]){
		boolean[] prime = new boolean[2000001];
		long sum = 0l;

		prime[0] = true;
		prime[1] = true;
		
		int j = 0;
		for(int i = 2; i<prime.length; i++){
			if(!prime[i]){
				j = i + i;
				while(j<prime.length){
					if(!prime[j]){
						prime[j] = true;
					}
					j = j + i;
				}
			}
		}

		for(int i = 0; i<prime.length; i++){
			if(!prime[i]){
				sum = sum + i;
			}
		}

		System.out.println(sum);
	}

}
