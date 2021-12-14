/*
 * ENUNCIADO: crear una calculadora /Modificar para que tengs dos menus con switch
 * FECHA: 10/11/2021
 * AUTOR:Jose...
 *
 */

package codigo;

import java.util.Scanner;

public class calculadora {

	private static int numero1;
	private static int numero2; 
	private static int menuAritmetico;
	private static boolean salir = false;
	private static int menuPrincipal;
	private static int menuLogico;
	private static boolean datoA;
	private static boolean datoB;
	private static boolean operacionLogica;

	public static void main(String[] args) {
		
			do {
				
			MenuPrincipal();
			switchPrincipal();
			
			}
			while(salir==false);
			}
			
		public static void MonstrarMenuAritmetico() {
			@SuppressWarnings("resource")

		Scanner teclado = new Scanner(System.in);
			System.out.println("elija la opción que deseas realizar");
			System.out.println("1:suma");
			System.out.println("2:resta");
			System.out.println("3:division");
			System.out.println("4:multiplicacion");
			System.out.println("5:salir");
			menuAritmetico = teclado.nextInt();}
		
			private static int suma(int numero1, int numero2) {
				
				int resultadosum;
				resultadosum = numero1 + numero2;
				return resultadosum;
			}
			
			private static int resta (int numero1, int numero2) {
				
				int resultadorest;
				resultadorest = numero1 - numero2;
				return resultadorest;
			}
			
			
			private static double div(int numero1, int numero2) {
			
				double resultadodiv=0;
				
			
				try {
					
					resultadodiv = numero1 / numero2;
				
				}catch (ArithmeticException e)
				{
					System.out.println("Division por cero  !!");
				}
				return (double) resultadodiv;
			}
				
			private static int mul(int numero1, int numero2) {
				
				int resultadomul;
				resultadomul = numero1 * numero2;
				return resultadomul;
			}
		

			// AQUI REALIZAMOS EL METODO AND 
			public static boolean AND (boolean datoA, boolean datoB) {
			
				return (datoA & datoB);
			}
			// AQUI RELAIZAMOS EL METODO NOT
			
			public static boolean NOT(boolean datoA, boolean datoB) {
				return (datoA != datoB);
				
			}
			//AQUI REALIZAMOS EL METODO OR 
			public static boolean OR(boolean datoA, boolean datoB) {
				return (datoA | datoB);
			}
			
			//AQUI REALIZAMOS EL METODO XOR 
			public static boolean XOR (boolean datoA, boolean datoB) {
				return (datoA ^ datoB);
			
		}	
			//Aqui pedimos los datos logicos 
			public static void pedirDatosLogicos() {
				@SuppressWarnings("resource")
				Scanner tecladoLetra = new Scanner (System.in);
				System.out.println("introduzca primer operador");
				datoA= tecladoLetra.nextBoolean();
				System.out.println("introduzca segundo operador");
				datoB= tecladoLetra.nextBoolean();
			}
			
				public static void MenuPrincipal() {
					@SuppressWarnings("resource")
					Scanner opcion = new Scanner (System.in);
					System.out.println("pulse 1 para operaciones aritmetica");
					System.out.println("pulse 2 para las operaciones logicas");
				
					
					menuPrincipal = opcion.nextInt();
				}
			
				private static void switchPrincipal() {
					
					switch(menuPrincipal) {
					
					case 1: 
						MonstrarMenuAritmetico();
						switchMenuAritmetico();
						break;
					
					case 2: 
						monstarMenuLogico();
						switchMenuLogico();
					
				
					}
				}
				
				private static void monstarMenuLogico() {
					@SuppressWarnings("resource")
					Scanner teclado1= new Scanner (System.in);
					System.out.println("pulse 1 para AND");
					System.out.println("pulse 2 para NOT");
					System.out.println("pulse 3 para OR ");
					System.out.println("pulse 4 para XOR");
					System.out.println("pulse 5 para salir");
					menuLogico= teclado1.nextInt();
					
				}
				
				private static void switchMenuLogico() {
					switch(menuLogico) {
					case 1: 
						pedirDatosLogicos();
						AND(datoA,datoB);
						System.out.println(operacionLogica);
					break;
					case 2: 
						pedirDatosLogicos();
						NOT(datoA,datoB);
						System.out.println(operacionLogica);
					break;
					case 3: 
						pedirDatosLogicos();
						OR(datoA,datoB);
						System.out.println(operacionLogica);
					break;
					case 4: 
						pedirDatosLogicos();
						XOR(datoA,datoB);
						System.out.println(operacionLogica);
					
					break;
					
					case 5: 
						
						System.out.println("Fin de la calculadora");
						salir=true;
					break;
					default: System.out.println("No has introducido ninguna opcion correcta ");
					
					}
				}
				
				//metodo de leer numero por scanner 
				
				private static void lectorNumeros() {
					@SuppressWarnings("resource")
					Scanner numero= new Scanner (System.in);
					System.out.println("Introduzca un numero");
					numero1= numero.nextInt();
					@SuppressWarnings("resource")
					Scanner numero12= new Scanner (System.in);
					System.out.println("Introduzca un segundo numero");
					numero2=numero12.nextInt();
				}
				
				private static void switchMenuAritmetico() {

					switch (menuAritmetico) {// aqui pedimos que introduzca la operacion que quiere realizar 
					
					case 1:
						lectorNumeros();
						
						System.out.println("el resultado de la suma es = " + suma(numero1,numero2));
						break;
						
					case 2:
						lectorNumeros();
						
						System.out.println("el resultado de la resta es = " + resta(numero1,numero2));
						
						break;
					case 3:
						lectorNumeros();
						
						System.out.println("el resultado de la division es = " + div(numero1,numero2));
						break;	
						
					case 4:
						lectorNumeros();
							
							System.out.println("el resultado de la multiplicacion es = " + mul(numero1,numero2));
							break;
					case 5:
						
						System.out.println("Fin de la calculadora");
						salir=true ;
					

					}
				
		}
	
}

