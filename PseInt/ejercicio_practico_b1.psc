//Nombre del algoritmo: Descuento al pago del predial.
//Autor: Jos� Geovanni Rubio Rinc�n
//Fecha: 04/11/2022
Proceso ejercicio_practico_b1
	Definir pago, descuento Como Real;
	Escribir "************************************************";
	Escribir "* Algoritmo: Descuento para el pago de predial ";
	Escribir "*       Autor: Jos� Geovanni Rubio Rinc�n      *";
	Escribir "*               Fecha: 04/11/2022              *";
	Escribir "************************************************";
	Escribir "";
	Escribir "************************************************";
	Escribir "* Algoritmo para calcular un descuento del 30% *";
	Escribir "*             en el pago del predial           *";
	Escribir "************************************************";
	Escribir "";
	Escribir "*******************************************";
	Escribir "**** Por promoci�n del pago de predial ****";
	Escribir "***** este mes de Noviembre habr� un ******";
	Escribir "*** descuento del 30% aplicado al total.***";
	Escribir "*******************************************";
	Escribir "";
	Escribir "Favor de ingresar la cantidad a pagar:";
	Leer pago;
	descuento<-(pago*0.30);
	Escribir "El descuento a realizar de $",pago, " es de $",descuento;
	Escribir "El pago final con descuento aplicado es de $", (pago-descuento);
FinProceso
