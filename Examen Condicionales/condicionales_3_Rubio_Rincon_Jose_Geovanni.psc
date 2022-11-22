//Descripción: El algoritmo imprime en pantalla los países que forman cierto grupo basándose en la letra ingresada por el usuario. Si no ingresa una letra
//que se encuentre entre la "A y la H" le dará un error.
//Nombre del programador: José Geovanni Rubio Rincón
//Fecha de creación: 22 de Noviembre de 2022
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
		Escribir "El valor ingresado no puede quedar vacío";
	SiNo
		Si Mayusculas(letra)="A" Entonces
			Escribir "Los países que pertenecen al grupo ",Mayusculas(letra)," son: Qatar (anfitrión), Ecuador, Senegal y Países Bajos";
		SiNo
			Si Mayusculas(letra)="B" Entonces
				Escribir "Los países que pertenecen al grupo ",Mayusculas(letra)," son: Inglaterra, Irán, Estados Unidos y Gales";
			SiNo
				Si Mayusculas(letra)="C" Entonces
					Escribir "Los países que pertenecen al grupo ",Mayusculas(letra)," son: Argentina, Arabia Saudí, México y Polonia";
				SiNo
					Si Mayusculas(letra)="D" Entonces
						Escribir "Los países que pertenecen al grupo ",Mayusculas(letra)," son: Francia, Australia, Dinamarca y Túnez";
					SiNo
						Si Mayusculas(letra)="E" Entonces
							Escribir "Los países que pertenecen al grupo ",Mayusculas(letra)," son: España, Costa Rica, Alemania y Japón";
						Sino
							Si Mayusculas(letra)="F" Entonces
								Escribir "Los países que pertenecen al grupo ",Mayusculas(letra)," son: Bélgica, Canadá, Marruecos y Croacia";
							SiNo
								Si Mayusculas(letra)="G" Entonces
									Escribir "Los países que pertenecen al grupo ",Mayusculas(letra)," son: Brasil, Serbia, Suiza y Camerún";
								SiNo
									Si Mayusculas(letra)="H" Entonces
										Escribir "Los países que pertenecen al grupo ",Mayusculas(letra)," son: Portugal, Ghana, Uruguay y Corea del Sur";
									SiNo
										Escribir "La letra ingresada no corresponde a ningún grupo";
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