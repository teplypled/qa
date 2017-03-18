public class Main {
	
	private static void print() {
		System.out.println("Hello World!");
	}
	
	
	
	
	
	public static void main (String[] args) {
		System.out.println("Hello World!");
		
	
		print (); // запуск метода (функції) print описаного в класі private static void print()
		
		int[] number = {2, 12, 33, 4, 5, -6, 17, 8, 4, 10}; //  або int[] number = new int [10]; якщо немає значень але відомо що їх 10
			for (int i = 0; i < 10; i++) {
			}
		System.out.println(number[6]); // System.out.println(number[i]); - виведе весь масив System.out.println(number[6]);- виведе лише 6-1 елемент
	
		
		int summator = 0;
			for (int i = 0; i < 10; i++) {
				summator = number [i] + summator;
			}
	
		System.out.println(summator); // в рядках 18-21 описано те саме що і в рядках метода в MyNewTheBestClass 
		
		
		//System.out.println(MyNewTheBestClass.array(number)); 
															//	напис System.out.println(MyNewTheBestClass.array(number)) 
															//викликає функцію з класса MyNewTheBestClass бо там записано метод!!! 
															//А якщо він описаний в поточному класі, то пишемо System.out.println(array(number))
															// бо ми назвали массив іменем number в рядку18; 
		
		
		int a = 8;
		//a. // а - змінна, пишеться з малої літери і вона не має класів
		String text = "text";
		//Text. // text - об'єкт, пишеться з великої літери і до нього є класи
		System.out.println(text.length()); //text.length() - функція яка рахує кількість символів в тексті. Функція length належить обєкту text який належить класу String
	
		MyNewTheBestClass object = new MyNewTheBestClass();
		System.out.println(object.array(number));
	}

}