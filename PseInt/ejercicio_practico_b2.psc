//Nombre del algoritmo: Descuento para ver a Juli�n �lvarez
//Autor: Jos� Geovanni Rubio Rinc�n
//Fecha: 04/11/2022
Proceso ejercicio_practico_b2
	Definir pago, descuento Como Real;
	Escribir "************************************************";
	Escribir "*Algoritmo: Descuento para ver a Juli�n �lvarez*";
	Escribir "*       Autor: Jos� Geovanni Rubio Rinc�n      *";
	Escribir "*               Fecha: 04/11/2022              *";
	Escribir "************************************************";
	Escribir "";
	Escribir "************************************************";
	Escribir "* Algoritmo para calcular un descuento del 30% *";
	Escribir "*     en el pago para ver a Juli�n �lvarez     *";
	Escribir "************************************************";
	Escribir "";
	Esperar 5 segundos;
	Limpiar Pantalla;
	Escribir "*******************************************";
	Escribir "*** Promoci�n para ver a Juli�n �lvarez ***";
	Escribir "*** Por �nica ocasi�n se har� un ligero ***";
	Escribir "*** descuento del 30% aplicado al total.***";
	Escribir "*******************************************";
	Escribir "";
	Escribir Sin Saltar "Ingrese la cantidad a pagar:";
	Leer pago;
	descuento<-(pago*0.30);
	Escribir "El descuento a realizar de $",pago, " es de $",descuento;
	Escribir "El pago final con descuento aplicado es de $", (pago-descuento);
FinProceso