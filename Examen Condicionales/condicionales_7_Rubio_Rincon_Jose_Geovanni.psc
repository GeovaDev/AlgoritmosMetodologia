//Descripción: El algoritmo muestra un menú, del cual se puede seleccionar una opción para así convertir el valor de una temperatura al de otra. Si se ingresa un valor no contemplado
//en el menú, mandará un mensaje de error.
//Nombre del programador: José Geovanni Rubio Rincón
//Fecha de creación: 22 de Noviembre de 2022
Algoritmo condicionales_7_Rubio_Rincon_Jose_Geovanni
	Definir opc Como Entero;
	Definir temp como real;
	Escribir "*********************************************";
	Escribir "*    Algoritmo: Conversor de temperatura    *";
	Escribir "*********************************************";
	Esperar 5 Segundos;
	Limpiar Pantalla;
	Escribir "*************** Menú ***************";
	Escribir "*     [1] Convertir de °C a °F     *";
	Escribir "*     [2] Convertir de °F a °C     *";
	Escribir "*     [3] Convertir de °C a °K     *";
	Escribir "*     [4] Convertir de °K a °C     *";
	Escribir "*     [5] Convertir de °K a °F     *";
	Escribir "*     [6] Convertir de °F a °K     *";
	Escribir "************************************";
	Escribir "¿Qué opción desea seleccionar?";
	Leer opc;
	Segun opc Hacer
		1:
			Escribir "Ingrese la cantidad en °C";
			Leer temp;
			Escribir temp, "°C equivalen a: ", (temp*1.8+32), " °F";
		2:
			Escribir "Ingrese la cantidad en °F";
			Leer temp;
			Escribir temp, "°F equivalen a: ", (temp-32)/1.8, " °C";
		3:
			Escribir "Ingrese la cantidad en °C";
			Leer temp;
			Escribir temp, "°C equivalen a: ", (temp+273.15), " °K";
		4:
			Escribir "Ingrese la cantidad en °K";
			Leer temp;
			Escribir temp, "°C equivalen a: ", (temp-273.15), " °K";
		5:
			Escribir "Ingrese la cantidad en °K";
			Leer temp;
			Escribir temp, "°K equivalen a: ", 1.8*(temp-273.15)+32, " °F";
		6:
			Escribir "Ingrese la cantidad en °F";
			Leer temp;
			Escribir temp, "°F equivalen a: ", (5/9)*(temp-32)+273.15, " °K";
		De Otro Modo:
			Escribir "El valor ingresado no es válido";
	FinSegun

FinAlgoritmo