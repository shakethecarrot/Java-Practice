package dkssud;

import java.util.Scanner
public class baekjoon9950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l, w, a;
		int L, W, A;
		Scanner scan = new Scanner(System.in);
		
		l = scan.nextInt();
		w = scan.nextInt();
		a = scan.nextInt();
		
			if(l==0) {
				L = a/w;
				System.out.print("%d %d %d", L, w, a);
			}
			if(w==0) {
				W = a/l;
				System.out.print("%d %d %d", l. W. a);
			}
			if(a==0) {
				A = l*w;
				System.out.print("%d %d %d", l, w, A);
			}
			return 0;
	}

}
