Proceso cambio_de_divisas
	//Se definen las variables
	Definir dolar, dolar_euro, pesos Como Real;
	//Se le asigna el valor que tiene un euro por cada dólar
	dolar_euro<-0.887;
	Escribir "************************************************";
	Escribir "*             Algoritmo de divisas             *";
	Escribir "*                Autor: Geovanni               *";
	Escribir "************************************************";
	Escribir "Ingrese la cantidad en pesos mexicanos";
	//Pide la cantidad en pesos mexicanos
	Leer pesos;
	//Se realiza la operación en la cúal se calcularán cuantos dólares es la mitad de la cantidad ingresada en pesos mexicanos.
	dolar<-(pesos/2)/19.75;
	//Se muestran en pantalla las equivalencias de la mitad de pesos mexicanos ingresados en las divisas correspondientes.
	Escribir pesos, " pesos equivalen a:";
	Escribir dolar," dólares.";
	Escribir dolar_euro*dolar," euros.";
FinProceso
