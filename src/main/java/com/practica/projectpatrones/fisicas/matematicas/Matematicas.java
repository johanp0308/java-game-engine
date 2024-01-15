package com.practica.projectpatrones.fisicas.matematicas;

public interface Matematicas<T> {
    
    /*
     * La idea es que el metodo se usa para sumar mas de dos parametros.
     */
    Object suma(T[] ts);

    /*
     * La idea es que el metodo se usa para reste mas de dos parametros.
     */
    Object resta(T[] ts);

    Object multiplicacion(T[] ts);

    Object division(T tdivd, T tdivs); 
    
}
