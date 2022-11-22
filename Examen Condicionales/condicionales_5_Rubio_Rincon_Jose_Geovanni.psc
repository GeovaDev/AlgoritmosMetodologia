//Descripci�n: El algoritmo imprime en pantalla que letra le corresponde con base en el porcentaje ingresado. Todo ello bas�ndose en las ponderaciones de Estados Unidos.
//Nombre del programador: Jos� Geovanni Rubio Rinc�n
//Fecha de creaci�n: 22 de Noviembre de 2022
Algoritmo condicionales_5_Rubio_Rincon_Jose_Geovanni
	Definir porcentaje Como Real;
	Escribir "*********************************************";
	Escribir "*      Algoritmo: Grados de porcentaje      *";
	Escribir "*********************************************";
	Esperar 5 Segundos;
	Limpiar Pantalla;
	Escribir Sin Saltar "Ingrese el porcentaje de la calificaci�n: ";
	Leer porcentaje;
	Si porcentaje<0 Entonces
		Escribir "El valor ingresado no es correcto";
	SiNo
		Si porcentaje>=90 y porcentaje<=100 Entonces
			Escribir "La letra obtenida es A";
		SiNo
			Si porcentaje>=80 y porcentaje<=89 Entonces
				Escribir "La letra obtenida es B";
			SiNo
				Si porcentaje>=70 y porcentaje<=79 Entonces
					Escribir "La letra obtenida es C";
				SiNo
					Si porcentaje>=60 y porcentaje<=69 Entonces
						Escribir "La letra obtenida es D";
					SiNo
						Si porcentaje>=0 y porcentaje<=59 Entonces
							Escribir "La letra obtenida es E";
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo