/* 5. Декларирайте две променливи от тип String със стойности "Hello" и "World".
Декларирайте променлива от тип Object. Присвоете на тази променлива стойността, която се получава
от конкатенацията на двете стрингови променливи (добавете интервал, ако е необходимо). Отпе-чатайте променливата от тип Object.
Декларирайте променлива от тип String и присвоете на последната променливата от тип Object.*/
public class Exercise_05 {
	public static void main(String[] args) {
		String hello = "Hello";
		String world = "World";
		Object helloWorld = hello + " " + world;
		System.out.println(helloWorld);
		
		String hWorld = (String) helloWorld;
	}
}
