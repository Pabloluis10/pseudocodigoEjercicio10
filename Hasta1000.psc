Algoritmo Hasta1000
	
	Escribir "Ingrese n�mero hasta que la suma de los n�meros ingresado sea menor a 1000"
	Escribir "Mientras tanto se hallar"
	Escribir "a. La cantidad de n�mero multiplos del 6"
	Escribir "b. La suma de los n�mero entre el 1 y 10 (incluidos)"
	
	Suma = 0;
	CantMult =0;
	SumaNumeros = 0;
	
	Repetir
		Escribir "Ingrese n�mero";
		Leer Num;
		Suma = Suma+Num;
		mult = Num % 6;
		
		Si mult == 0 Entonces
			CantMult = CantMult+1;
		Fin Si
		Si Num >0 & Num < 11 Entonces
			SumaNumeros = SumaNumeros+Num;
		Fin Si
	Hasta Que Suma >=1000
	
	Escribir "La cantidad de n�meros multiplos del 6 ingresados es: ", CantMult;
	Escribir "La suma de los n�mero ingresados entre 1 y 10 es: ",SumaNumeros;
FinAlgoritmo
