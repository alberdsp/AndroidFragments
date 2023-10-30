package com.example.myappfragments;


/*
  Clase que almacena el número de pulsaciones de forma stática para que se
  pueda acceder desde toda la aplicación
 */

public class ContadorPulsos {

    // declaramos atributo instancia para saber si ya hay instancia o no de
    // de la clase contador
    private static ContadorPulsos instancia;
    private int contador;

    private ContadorPulsos() {
        contador = 0;
    }

    public static ContadorPulsos getInstancia() {
        if (instancia == null) {
            instancia = new ContadorPulsos();
        }
        return instancia;
    }

    public String getContador() {
        return String.valueOf(contador);
    }

    public void sumarContador() {
        contador +=1;
    }




}
