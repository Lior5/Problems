import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		HashSet<Integer> primes = new HashSet<>();
		int max = 100_001;
		boolean[] isPrime = new boolean[max];
		
		Arrays.fill(isPrime, true);
		
		for(int i = 2; i < Math.sqrt(max) + 1; i++){
			if(isPrime[i]){
				for(int j = i * 2; j < max; j += i){
					isPrime[j] = false;
				}
			}
        	}
        	for(int i = 2;i<max;i++){
           		if(isPrime[i]){
                		primes.add(i);
           	 	}
        	}
	   	loop:while(t-->0){
		    int n = scan.nextInt();
		    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		    for(Integer curr:primes){
		        map.put(curr,0);
		    }
		    while(n-->0){
		        boolean[] visited = new boolean[100001];
		        int m = scan.nextInt();
		        int[] arr =new int[m];
		        for(int i = 0;i<m;i++){
		            arr[i] = scan.nextInt();
		            for(Integer curr:primes){
		                if(arr[i]%curr==0 && !visited[curr]){
		                    visited[curr] = true;
		                    map.put(curr,map.get(curr)+1);
		                }
		            }
		        }
		    }
		    ArrayList<Integer> biggest = new ArrayList<>();
		    int maximum = -1;
		    for(Integer curr:primes){
		        maximum = Math.max(map.get(curr),maximum);
		    }
		    if(maximum==0){
		        System.out.println(-1);
		        continue loop;
		    }
		    for(Integer curr:primes){
		        if(map.get(curr)==maximum){
		            System.out.println(curr);
		            break;
		        }
		    }
		}
	}
}
