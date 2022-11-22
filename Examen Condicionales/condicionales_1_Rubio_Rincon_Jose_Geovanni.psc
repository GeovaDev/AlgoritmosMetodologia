//Descripción: El algoritmo dice que nivel de escolaridad le corresponde a la persona basándose en la edad ingresada.
//Nombre del programador: José Geovanni Rubio Rincón
//Fecha de creación: 22 de Noviembre de 2022
Algoritmo condicionales_1_Rubio_Rincon_Jose_Geovanni
	Definir edad como Entero;
	Definir nombre Como Caracter;
	Escribir "*********************************************";
	Escribir "*        Algoritmo: Nivel educativo         *";
	Escribir "*********************************************";
	Esperar 5 Segundos;
	Limpiar Pantalla;
	Escribir Sin Saltar "Ingrese el nombre de la persona: ";
	Leer nombre;
	Escribir Sin Saltar "Ingrese la edad de la persona: ";
	Leer edad;
	Si Longitud(nombre)=0 o edad<=0 Entonces
		Escribir "Los datos ingresados son inválidos";
	SiNo
		Si edad>=4 y edad<=6 Entonces
			Escribir "Hola ", nombre," perteneces al nivel educativo Early Childhood";
		SiNo
			Si edad>6 y edad<=10 Entonces
				Escribir "Hola ", nombre," perteneces al nivel educativo Elementary School";
			SiNo
				Si edad>=11 y edad<=13 Entonces
					Escribir "Hola ", nombre," perteneces al nivel educativo Middle School";
				SiNo
					Si edad>=14 y edad<=18 Entonces
						Escribir "Hola ", nombre," perteneces al nivel educativo High School";
					SiNo
						Escribir "Edad fuera de rango para asignarle algún nivel educativo";
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo