package main;

import java.util.Scanner;

public class Practica8 {
	Scanner keyboard = new Scanner(System.in);
	public void show() {
		int menu,numero;
		int[]numbers;
		System.out.printf("-----Bienvenid@s al intento numero uno de la calculadora----");
		do {
			//Ver si esto puede ponerse como funcion aparte 
			System.out.printf("\n Menu: \n 1.Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir dos numeros \n 5. Potencia de dos numeros \n Por favor escribe el numero de la operacion que desea realizar");
			menu = keyboard.nextInt();
			if(menu==1) {
				//Esto seguramente se pueda poner como una funcion
				System.out.println("Por favor escriba la cantidad de numeros que desea operar");
				numero=keyboard.nextInt();
				numbers= datosUsuario(numero);
				System.out.printf("La suma de los numeros es %d\n",sumar(numbers));
				
			}
			//Y Asi sucesivamente 

		}while(menu!=5); 
		System.out.println("Saliendo del programa");
	
	}
	
	public int[] datosUsuario(int numero) {
		int value;
        int[] numbers = new int[numero];
        for (int i = 0; i < numero; i++) {
            System.out.printf("Escriba el valor numerico para el dato %d\n", i + 1);
            value = keyboard.nextInt();
            numbers[i] = value;
        }
        return numbers;
	}
	public int sumar(int...numbers) {
		int result=0;
		for (int i = 0; i < numbers.length; i++) {
			result += numbers[i];
		}
		return result;
	}
	public static void main(String[] args) {
		new Practica8().show();

	}

}
