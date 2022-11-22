//Descripci�n: El algoritmo imprime en pantalla los pa�ses que forman cierto grupo bas�ndose en la letra ingresada por el usuario. Si no ingresa una letra
//que se encuentre entre la "A y la H" le dar� un error.
//Nombre del programador: Jos� Geovanni Rubio Rinc�n
//Fecha de creaci�n: 22 de Noviembre de 2022
Algoritmo condicionales_3_Rubio_Rincon_Jose_Geovanni
	Definir letra Como Caracter;
	Escribir "*********************************************";
	Escribir "*       Algoritmo: Grupos del mundial       *";
	Escribir "*********************************************";
	Esperar 5 Segundos;
	Limpiar Pantalla;
	Escribir Sin Saltar "Ingrese la letra del grupo al que pertenece: ";
	Leer letra;
	Si Longitud(letra)=0 Entonces
		Escribir "El valor ingresado no puede quedar vac�o";
	SiNo
		Si Mayusculas(letra)="A" Entonces
			Escribir "Los pa�ses que pertenecen al grupo ",Mayusculas(letra)," son: Qatar (anfitri�n), Ecuador, Senegal y Pa�ses Bajos";
		SiNo
			Si Mayusculas(letra)="B" Entonces
				Escribir "Los pa�ses que pertenecen al grupo ",Mayusculas(letra)," son: Inglaterra, Ir�n, Estados Unidos y Gales";
			SiNo
				Si Mayusculas(letra)="C" Entonces
					Escribir "Los pa�ses que pertenecen al grupo ",Mayusculas(letra)," son: Argentina, Arabia Saud�, M�xico y Polonia";
				SiNo
					Si Mayusculas(letra)="D" Entonces
						Escribir "Los pa�ses que pertenecen al grupo ",Mayusculas(letra)," son: Francia, Australia, Dinamarca y T�nez";
					SiNo
						Si Mayusculas(letra)="E" Entonces
							Escribir "Los pa�ses que pertenecen al grupo ",Mayusculas(letra)," son: Espa�a, Costa Rica, Alemania y Jap�n";
						Sino
							Si Mayusculas(letra)="F" Entonces
								Escribir "Los pa�ses que pertenecen al grupo ",Mayusculas(letra)," son: B�lgica, Canad�, Marruecos y Croacia";
							SiNo
								Si Mayusculas(letra)="G" Entonces
									Escribir "Los pa�ses que pertenecen al grupo ",Mayusculas(letra)," son: Brasil, Serbia, Suiza y Camer�n";
								SiNo
									Si Mayusculas(letra)="H" Entonces
										Escribir "Los pa�ses que pertenecen al grupo ",Mayusculas(letra)," son: Portugal, Ghana, Uruguay y Corea del Sur";
									SiNo
										Escribir "La letra ingresada no corresponde a ning�n grupo";
									FinSi
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo