import java.lang.Math;
import java.util.Scanner;

public class Assignment_3_9_1601CS41 {
    public static void main(String args[]){
        int n;
        int mxln = 0;
        int cln;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number of strings: ");
        n = sc.nextInt();
        sc.nextLine();
        String s [] = new String[n];
        System.out.print("Enter the strings\n");
        for(int i = 0;i<n;i++){
            // System.out.println(i);
            s[i] = sc.nextLine();
            cln = s[i].length();
            if(cln>mxln) mxln = cln;
        }

        for(int i=0; i < n; i++) {
            if(s[i].length() < mxln) {
                int xj = mxln - s[i].length();
                s[i] = s[i] + new String(new char[xj]).replace("\0","J");
            }
        }

        int m = n;
        n = mxln;
        int l = 0, r = n-1, t = 0, b = m-1, dir = 1;

        while(l <= r && t <= b) {
            if(dir == 1) {
                for(int i = l; i <= r; i++) {
                    System.out.print(s[t].charAt(i));
                }
                t++;
                dir = 2;
            } else if(dir == 2) {
                for(int i = t; i <= b; i++) {
                    System.out.print(s[i].charAt(r));
                }
                r--;
                dir = 3;
            } else if(dir == 3) {
                for(int i = r; i >= l; i--) {
                    System.out.print(s[b].charAt(i));
                }
                b--;
                dir = 4;
            } else {
                for(int i = b; i >= t; i--) {
                    System.out.print(s[i].charAt(l));
                }
                l++;
                dir = 1;
            }
        }
    }
}
