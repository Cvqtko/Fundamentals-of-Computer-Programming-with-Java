import java.util.Scanner;

/* 1. Напишете метод, който при подадено име отпечатва в конзолата "Hello, <name>!" 
(например "Hello, Peter!"). Напишете програма, която тества този метод.*/
public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		input.close();
		printHello(name);
	}

	public static void printHello(String name) {
		System.out.printf("Hello, %s!", name);
	}
}
