package notas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		/*
		 * Scanner entrada = new Scanner(System.in); int numero;
		 * System.out.print("Elija su numero preferido: "); numero = entrada.nextInt();
		 * System.out.println("El numero elegido es: "+numero);
		 */
		/*
		 * Scanner entrada = new Scanner(System.in); String cadena;
		 * System.out.print("Digite una cadena: "); //cadena = entrada.nextLine();
		 * System.out.println("La cadena es: "+cadena);
		 */

		// EJERCICIOS

		// SIN JOPTIONPANE
		/*
		 * Scanner entrada = new Scanner(System.in); Integer numero;
		 * System.out.print("Digite un numero: "); numero = entrada.nextInt(); if
		 * (numero > 0 && numero % 10 == 0) {
		 * System.out.println("El numero es multiplo de 10."); }else {
		 * System.out.println("El numero NO es multiplo de 10."); }
		 */

		// CON JOPTIONPANE
		/*
		 * Integer numeroJ; numeroJ =
		 * Integer.parseInt(JOptionPane.showInputDialog("Digite un número: ")); if
		 * (numeroJ > 0 && numeroJ % 10 == 0) { JOptionPane.showMessageDialog(null,
		 * "El número es multiplo de 10."); }else { JOptionPane.showMessageDialog(null,
		 * "El numero NO es multiplo de 10."); }
		 */

		// Ejercicio 2. pedir dos numeros y decir cual es mayor o si son iguales.
		/*
		 * Integer numero1, numero2;
		 * 
		 * numero1 =
		 * Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
		 * numero2 =
		 * Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
		 * 
		 * if(numero1 == numero2) { JOptionPane.showMessageDialog(null,
		 * "Los números son iguales."); }else { if(numero1 >= numero2) {
		 * JOptionPane.showMessageDialog(null,
		 * "El número "+numero1+" es mayor o igual que el número "+numero2+"."); }else {
		 * JOptionPane.showMessageDialog(null,
		 * "El número "+numero2+" es mayor o igual que el número "+numero1+"."); }
		 * 
		 * }
		 */

		// Verificar si una letra es mayuscula o minuscula
		/*
		 * char caracter; caracter =
		 * JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
		 * if(Character.isUpperCase(caracter)) { JOptionPane.showMessageDialog(null,
		 * "Es una letra mayuscula."); }else { JOptionPane.showMessageDialog(null,
		 * "Es una letra minuscula."); }
		 */

		// Hacer 20% de descuento si la compra supera los 300
		/*
		 * Integer montoTotal; Integer compraMinima = 300; Integer montoFinal; Integer
		 * descuento = 20;
		 * 
		 * montoTotal =
		 * Integer.parseInt(JOptionPane.showInputDialog("Digite el monto de la compra: "
		 * )); if(montoTotal > compraMinima) { JOptionPane.showMessageDialog(null,
		 * "Su compra supera los $300, ha obtenido un descuento del 20%."); montoFinal =
		 * montoTotal-descuento*montoTotal/100; JOptionPane.showMessageDialog(null,
		 * "El monto final que debe abonar es: $"+montoFinal); }else {
		 * JOptionPane.showMessageDialog(null,
		 * "El monto final que debe abonar es: $"+montoTotal); }
		 */

		// Calcular sueldo segun las horas trabajadas
		/*
		 * int horasTrabajadas; Float sueldoFinal; horasTrabajadas =
		 * Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas: ")
		 * );
		 * 
		 * if(horasTrabajadas <= 40) { sueldoFinal = (float) (horasTrabajadas * 16);
		 * }else { sueldoFinal = (float) ((40*16) + ((horasTrabajadas-40)*20)); }
		 * JOptionPane.showMessageDialog(null, "El sueldo final es: $"+sueldoFinal);
		 */

		// Ver si dos numeros son pares o impares
		/*
		 * int numero1, numero2; numero1 =
		 * Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
		 * numero2 =
		 * Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
		 * if(numero1%2==0) { JOptionPane.showMessageDialog(null,
		 * "El numero "+numero1+" es par."); }else { JOptionPane.showMessageDialog(null,
		 * "El numero "+numero1+" es impar."); } if(numero2%2==0) {
		 * JOptionPane.showMessageDialog(null, "El numero "+numero2+" es par."); }else {
		 * JOptionPane.showMessageDialog(null, "El numero "+numero2+" es impar."); }
		 */

		// Pedir el dia mes y año de una fecha y verificar si la fecha es correcta,
		// suponiendo que todos los meses son de 30 dias.
		/*
		 * int dia, mes, año; dia =
		 * Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: ")); mes =
		 * Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: ")); año =
		 * Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
		 * 
		 * if ((dia >=1) && (dia<=30) ) { //si el dia es correcto if((mes >=1) &&
		 * (mes<=12)) {//si el mes es correcto if (año != 0){ //si el año es correcto
		 * JOptionPane.showMessageDialog(null, "La fecha es correcta."); }else {
		 * JOptionPane.showMessageDialog(null, "El año ingresado es incorrecto."); }
		 * }else { JOptionPane.showMessageDialog(null,
		 * "El mes ingresado es incorrecto."); } }else {
		 * JOptionPane.showMessageDialog(null, "El dia ingresado es incorrecto."); }
		 */

		// Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se
		// han introducido
		/*
		 * int contador= 0; int numero;
		 * 
		 * numero = Integer.parseInt(JOptionPane.
		 * showInputDialog("Digite un numero: \nSi desea salir, ingrese un numero negativo."
		 * )); while(numero>=0) { contador++; numero = Integer.parseInt(JOptionPane.
		 * showInputDialog("Digite un numero: \nSi desea salir, ingrese un numero negativo."
		 * )); } JOptionPane.showMessageDialog(null,
		 * "Cantidad de numeros ingresados: "+contador);
		 */

		// ejercicio de adivinar numero. generar un numero aleatorio entre 0 y 100, ir
		// pidiendo numeros indicando si es mayor o menor y mostrar el nro de intentos
		/*
		 * int numero, aleatorio, contador =0; aleatorio = (int) (Math.random()*100);
		 * //generar numero aleatorio System.out.println(aleatorio); do{ numero =
		 * Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		 * if(aleatorio > numero ) { System.out.println("Digite un numero mayor.");
		 * }else { System.out.println("Digite un numero menor."); } contador++;
		 * }while(numero!=aleatorio);
		 * System.out.println("Adivinaste, numero de intentos: "+contador);
		 */

		// Ejercicio 6, pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos
		/*
		int numero, sumador = 0, contador = 0;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		while (numero != 0) {
			sumador += numero;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
			contador++;
		}
		JOptionPane.showMessageDialog(null,
				"Suma de los numeros ingresados: " + sumador + "\nCantidad de ingresos: " + contador);
		*/
		
		//pedir numeros hasta que se ingrese uno negativo, calcular la media
		int numero, sumador = 0, contador = 0, media;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: \nSi desea salir, digite un numero negativo."));
		while (numero > 0) {
			sumador += numero;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
			contador++;
		}
		media = sumador / contador;
		JOptionPane.showMessageDialog(null,
				"Suma de los numeros ingresados: " + sumador + "\nCantidad de ingresos: " + contador+".\nMedia: "+media);
		
		
		
		
		
		
	}

}
