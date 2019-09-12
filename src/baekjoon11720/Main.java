package baekjoon11720;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int[] c= {b};
		String d = Arrays.toString(c);
		//String e = d.replaceAll("[^0-9]", "");
		String e = d.substring(1,d.length()-1);
		String[] f = e.split("");
		int g=0;
		for(int i=0;i<f.length;i++) {
			g+=Integer.parseInt(f[i]);
		}
		System.out.println(g);
	}

}
