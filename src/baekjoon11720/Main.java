package baekjoon11720;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		String d=input.nextLine();
		String e = input.nextLine();
		String[] f = e.split("");
		int g=0;
		for(int i=0;i<f.length;i++) {
			g+=Integer.parseInt(f[i]);
		}
		System.out.println(g);
	}

}
