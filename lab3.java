import java.util.Scanner;

class lab3{
	public static void main(String[] args){
        // task1();
        // task2();
		// task3();
		// task4();
		// task5();
		// task6();
		task13();
    }
	static void task1(){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		System.out.println(a + b);
	}
	static void task2(){
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		if (a == b) {
			System.out.println("Равны");
		} else {
			System.out.println("Не равны");
		}
	}
	static void task3(){
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		if (a <= b) {
			a = 0;
		}
		System.out.println(a);
		System.out.println(b);
	}
	static void task4(){
		Scanner scan = new Scanner(System.in);
		double[] nums = new double[3];
		for (int i = 0; i <= 2; i++) {
			nums[i] = scan.nextDouble();
			if (nums[i] > 0){
				nums[i] *= nums[i];
				System.out.println(nums[i]);
			}
		}
		scan.close();
	}
	static void task5(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int sum = 0;
		while (n / 10 != 0){
			sum += n % 10;
			n /= 10;
		}
		sum += n;
		System.out.println(sum);
	}
	static void task6(){
		Scanner scan = new Scanner(System.in);
		double a;
		for (int i = 0; i <= 2; i++) {
			a = scan.nextDouble();
			if (a > 1 && a < 3){
				System.out.println(a);
			}
		}
		scan.close();
	}
	static void task7(){
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		scan.close();
		for (int i = 2; i < 11; i++){
			System.out.println(String.format("%d * %d = %d", i, k, i * k));
		}
	}
	static void task8(){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		scan.close();
		if (a <= b && b <= c && c <= d){
			a = d;
			b = d;
			c = d;
		}
		else {
			if (!(a > b && b > c && c > d)) {
				a *= a;
				b *= b;
				c *= c;
				d *= d;
			}
		}
		System.out.println(String.format("%d %d %d %d", a, b, c, d));
	}
	static void task9(){
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		scan.close();
		if (a < b + c && b < a + c && c < a + b){
			a *= a;
			b *= b;
			c *= c;
			if (a < b + c && b < a + c && c < a + b){
				System.out.println("Остроугольный");
			}else {
				System.out.println("Не остроугольный");
			}
		} else {
			System.out.println("Не треугольный");
		}
	}
	static void task10(){
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double z = scan.nextDouble();
		scan.close();
		if (x + y + z < 1){
			if (x < y && x < z) {
				x = (y + z) / 2;
			} else {
				if (y < x && y < z){
					y = (x + z) / 2;
				} else {
					z = (x + y) / 2;
				}
			}
			} else {
				if (x < y) {
					x = (y + z) / 2;
				} else {
					y = (x + z) / 2;
				}
			}
		System.out.print(x + " " + y + " " + z);
	}
	static void task11(){
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		scan.close();
		double d = b * b - 4 * a * c;
		if (d == 0) {
			System.out.println((Math.sqrt(d) - b) / (2 * a));
		} else {
			if (d > 0) {
				System.out.println((Math.sqrt(d) - b) / (2 * a) + " " + (Math.sqrt(d) + b) / (2 * a));
			} else {
				System.out.println("Действительных корней нет");
			}
		}
	}
	static void task12(){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
		String res = "";
		while (x > 0) {
			res += x % 2;
			x /= 2;
		}
		System.out.println(new StringBuilder(res).reverse().toString());
	}
	static void task13(){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y;
		do {
			y = x;
			x = scan.nextInt();
		}
		while (x >= y);
	}
}