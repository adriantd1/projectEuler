import java.util.*;

/* This program answers problem 12 of project Euler: The sequence of triangle numbers is generated by 
 * adding the natural numbers. What is the value of the first triangle number to have over five
 * hundred divisors? */ 

public class Problem12{

	public static void main(String[] args){
		// Use the sieve method to find the prime numbers under 100000
		boolean[] prime = new boolean[100000];
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

		/* Using the prime numbers previously found, calculate the number of divisors of 
		 * each triangle number */
		int n = 10;
		int triangle = 0;		

		while(true)

	}	
	
}