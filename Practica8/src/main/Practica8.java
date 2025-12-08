package main;

import java.util.Scanner;

public class Practica8 {
	Scanner keyboard = new Scanner(System.in);
	public void show() {
		int menu,numero,numa,numb;
		int[]numbers;
		System.out.printf("-----Bienvenid@s al intento numero uno de la calculadora----");
		do {
			System.out.printf("\n Menu: \n 1.Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir dos numeros \n 5. Potencia de dos numeros\n 6. Salir del programa \n Por favor escribe el numero de la operacion que desea realizar: ");
			menu = keyboard.nextInt();
			if(menu==1) {
				System.out.println("Por favor escriba la cantidad de numeros que desea operar");
				numero=keyboard.nextInt();
				numbers= datosUsuario(numero);
				System.out.printf("La suma de los numeros es %d\n",sumar(numbers));
			
			}
			if(menu==2) {
				System.out.println("Por favor escriba la cantidad de numeros que desea operar");
				numero=keyboard.nextInt();
				numbers= datosUsuario(numero);
				System.out.printf("\nLa resta de los numeros es %d\n",restar(numbers));
			}
			if(menu==3) {
				System.out.println("Por favor escriba la cantidad de numeros que desea operar");
				numero=keyboard.nextInt();
				numbers= datosUsuario(numero);
				System.out.printf("\nLa multiplicación de los numeros es %d\n",multiplicar(numbers));
			}
			if(menu==4) {
				System.out.println("Por favor escriba los dos numeros que desea operar");
				numa=keyboard.nextInt();numb=keyboard.nextInt();	
				System.out.printf("\nLa división de %d y de %d es %d",numa,numb,dividir(numa,numb));
			}
			if(menu==5) {
				System.out.println("Por favor escriba los dos numeros que desea operar");
				numa=keyboard.nextInt();numb=keyboard.nextInt();	
				System.out.printf("\nLa potencia de %d y de %d es %d",numa,numb,potencia(numa,numb));
			}

		}while(menu!=6); 
		System.out.println(" Saliendo del programa");
		System.out.println("Gracias por usar nuestro intento de calculadora");
		
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
	public int restar(int...numbers) {
		int result=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			result-=numbers[i];
		}
		return result;
	}
	public int multiplicar(int...numbers) {
		int result=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			result *= numbers[i];
		}
		return result;
	}
	public int dividir(int numa, int numb) {
		int result;
		result=(numa/numb);
		return result;
	}
	public int potencia(int numa, int numb) {
		int result;
		result=(int) Math.pow(numa, numb);
		return result;
	}
	public static void main(String[] args) {
		new Practica8().show();

	}

}
