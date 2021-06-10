import java.util.*;

public class Ejercicio10{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		
		int sumaTotal=0;
		int suma=0;
		int cantidadMult=0;

		System.out.println("Ingrese números hasta que la suma de los números ingresado sea meyor o igual 1000");
		System.out.println("Mientras tanto se halla");
		System.out.println("a. La cantidad de números multiplos del 6");
		System.out.println("b. La suma de los números entre 1 y 10");

		do{
			int num;
			System.out.print("Ingrese número: ");
			num = entrada.nextInt();

			sumaTotal += num;

			if(num >0 && num <11){
				suma += num;
				System.out.println("La suma acumulad de los númeor entre 1 y 10 es: "+suma);
			}
			if((num%6)==0){
				cantidadMult++;
				System.out.println("La cantidad de números multiplos del 6 es: "+cantidadMult);
			}
		}while(sumaTotal < 1000);
		
		System.out.println("La suma total de los número ingresados es: "+sumaTotal);
		System.out.println("La suma total de los número entre 1 y 10 es: "+suma);
		System.out.println("La cantidad total de número multiplos del 6 es: "+cantidadMult);		
	}
}