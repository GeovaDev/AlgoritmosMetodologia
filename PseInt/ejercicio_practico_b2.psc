//Nombre del algoritmo: Descuento para ver a Julión Álvarez
//Autor: José Geovanni Rubio Rincón
//Fecha: 04/11/2022
Proceso ejercicio_practico_b2
	Definir pago, descuento Como Real;
	Escribir "************************************************";
	Escribir "*Algoritmo: Descuento para ver a Julión Álvarez*";
	Escribir "*       Autor: José Geovanni Rubio Rincón      *";
	Escribir "*               Fecha: 04/11/2022              *";
	Escribir "************************************************";
	Escribir "";
	Escribir "************************************************";
	Escribir "* Algoritmo para calcular un descuento del 30% *";
	Escribir "*     en el pago para ver a Julión Álvarez     *";
	Escribir "************************************************";
	Escribir "";
	Esperar 5 segundos;
	Limpiar Pantalla;
	Escribir "*******************************************";
	Escribir "*** Promoción para ver a Julión Álvarez ***";
	Escribir "*** Por única ocasión se hará un ligero ***";
	Escribir "*** descuento del 30% aplicado al total.***";
	Escribir "*******************************************";
	Escribir "";
	Escribir Sin Saltar "Ingrese la cantidad a pagar:";
	Leer pago;
	descuento<-(pago*0.30);
	Escribir "El descuento a realizar de $",pago, " es de $",descuento;
	Escribir "El pago final con descuento aplicado es de $", (pago-descuento);
FinProceso