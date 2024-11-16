import java.util.Scanner;

class classwork16_11{
	public static void main(String[] args){
		//task1();
		//task2();
		//task3();
		//task4();
		//task5();
		//task6();
		//task7();
		
		/*int[] arr = {1, 3, 4, 6, 4, 2};
		task8(arr);
		
		int[] arr2 = {1, 2, 3, 4};
		task8(arr2);*/
		
		//task9();
		//task10();
		//task11();
		//task12a();
		//task12b();
		//task13();
		task14();
		
	}
	static void task1(){
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		scan.close();
		switch (k){
			case 1:
				System.out.println("плохо");
				break;
			case 2:
				System.out.println("неудовлетворительно");
				break;
			case 3:
				System.out.println("удовлетворительно");
				break;
			case 4:
				System.out.println("хорошо");
				break;
			case 5:
				System.out.println("отлично");
				break;
			default:
				System.out.println("ошибка");
		}
	}
	static void task2(){
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		scan.close();
		if (h >= 0 && h < 6){
			System.out.println("Доброй ночи");
		}else{
			if (h >= 6 && h < 12){
				System.out.println("Доброе утро");
			}else{
				if (h >= 12 && h < 18){
					System.out.println("Добрый день");
				}else{
					System.out.println("Добрый вечер");
				}
			}
		}
	}
	static void task3(){
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		System.out.println("введите номер действия:\n 1 - возвести число в квадрат;\n 2 - извлечь корень квадратный;\n 3 - вычислить синус;\n 4 - косинус");
		int command = scan.nextInt();
		switch (command){
			case 1:
				x *= x;
				break;
			case 2:
				x = Math.sqrt(x);
				break;
			case 3:
				x = Math.sin(Math.toRadians(x));
				break;
			case 4:
				x = Math.cos(Math.toRadians(x));
				break;
		}
		System.out.println(x);
		scan.close();
	}
	static void task4(){
		Scanner scan = new Scanner(System.in);
		char x = scan.next().charAt(0);
		scan.close();
		System.out.println((char)((int)x - 32));
	}
	static void task5(){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
		System.out.println((12 - x) + "");
	}
	static void task6(){
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		scan.close();
		for (int i = 0; i < m; i++){
			System.out.println("1 ".repeat(n));
		}
	}
	static void task7(){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		double z = scan.nextDouble();
		scan.close();
		if (a % b == 0) {
			z *= a % b;
		} else {
			z /= a % b;
		}
		System.out.println(z);
	}
	static void task8(int[] nums){
		for (int i = 1; i < nums.length - 1; i++){
			if (nums[i] % 2 == 0 && nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
				System.out.println("yes");
				return;
			}
		}
		System.out.println("no");
	}
	static void task9(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < n; i++){
			a = scan.nextInt();
			if (a % 5 == 0 && a % 7 != 0){
				count++;
				sum += a;
			}
		}
		System.out.println(count + " " + sum);
		scan.close();
	}
	static void task10(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double a;
		double sum = 0;
		for (int i = 0; i < n; i++){
			a = scan.nextDouble();
			if (a > 0){
				sum += a;
			}
		}
		System.out.println(sum * 2);
		scan.close();
	}
	static void task11(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a;
		int res = 1;
		for (int i = 0; i < n; i++){
			a = scan.nextInt();
			if (a % 7 == 0){
				res *= a;
			}
		}
		System.out.println(res);
		scan.close();
	}
	static void task12a(){
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		scan.close();
		if (a >= -2 && a < 2){
			System.out.println(a * a);
		}else{
			System.out.println("4");
		}
	}
	static void task12b(){
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		scan.close();
		double res = a * a + 4 * a + 5;
		if (a <= 2){
			System.out.println(res);
		}else{
			System.out.println(1 / res);
		}
	}
	static void task13(){
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		int n = scan.nextInt();
		scan.close();
		System.out.println(Math.pow(a, n));
		
		double b = a;
		for (int i = 1; i < n; i++){
			b *= a + i;
		}
		System.out.println(b);
		double c = 1 / a;
		for (int i = 1; i <= n; i++){
			double c0 = a;
			for (int j = 1; j <= i; j++){
				c0 *= (a + j);
			}
			c += 1 / c0;
		}
		System.out.println(c);
	}
	static void task14(){
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int n = scan.nextInt();
		double res = 0;
		double a;
		for (int j = 1; j <= n; j++){
			a = scan.nextDouble();
			if (i != j){
				res += a;
			}
		}
		System.out.println(res / (n - 1));
	}
}