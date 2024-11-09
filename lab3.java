import java.util.Scanner;

class lab3 {
    public static void main(String[] args){
        // switchcase();
        // task1();
        // task2();
		// task3();
		// task4();
		// task5();
		task6();
    }
    static void switchcase(){
        int day = 1;
        switch (day){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println(day);
                break;
        }
    }
    static void task1(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if (n % 2 == 0) {
            System.out.println("Чётное");}
        else {
            System.out.println("Нечётное");
        }
    }
    static void task2(){
        Scanner scan = new Scanner(System.in);
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        System.out.println(Double.max(d2, d1));
    }
	static void task3(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n < 0 || n > 100) {
			System.out.println("Ошибка: вне диапазона");
			n = scan.nextInt();
		}
		scan.close();
		if (n <= 59) {
			System.out.println("Неудовлетворительно");
		}
		else {
			if (n <= 74) {
				System.out.println("Удовлетворительно");
			}
			else {
				if (n <= 89) {
					System.out.println("Хорошо");
				}
				else {System.out.println("Отлично");}
			}
		}
	}
	static void task4(){
		int sum = 0;
		for (int i = 1; i <= 100; i++){
			sum += i;
		}
		System.out.println(sum);
	}
	static void task5(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n < 1) {
			n = scan.nextInt();
		}
		int fact = 1;
		for (int i = 2; i <= n; i++){
			fact *= i;
		}
		System.out.println(fact);
	}
	static void task6(){
		System.out.println("Нечётные:");
		for (int i = 1; i <= 20; i += 2) {
			System.out.println(i);
		}
		System.out.println("Чётные:");
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}
	}
}