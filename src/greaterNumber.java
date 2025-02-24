import java.util.Scanner;
public class Main
{
	public void ifElseLadder(int num1,int num2,int num3) {
		if ((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " is Greater");
		}

		else if((num2 > num1)&& (num2 > num3)) {
			System.out.println(num1 + " is greater");
		}
		else
			System.out.println(num3 + " is greater");

	}
	public static void main(String[] args) {
		Main n = new Main();

		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();

		n.ifElseLadder(x,y,z);
	}
}
