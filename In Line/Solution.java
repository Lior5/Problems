import java.util.Scanner;

public class Line {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i<n;i++) {
				arr[i] = scan.nextInt();
			}
			int val = arr[k-1];
			int iterations = val-k;
			int ans = (iterations*(iterations+1))/2+iterations*(k-1)+k-1;
			System.out.println(ans);
		}
	}

}
