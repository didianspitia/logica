/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logica_representacion_parcial02;

/**Segundo parcial de Lógica y representación I
Colegio Grandes genios - Uso de Chat GPT

Las consultas realizadas diariamente al Chat GPT por los estudiantes del Colegio “Grandes genios”
han aumentado en las últimas semanas. Las directivas del Colegio desean conocer qué están
consultando sus estudiantes, en dicha herramienta, sobre temas relacionados con Tecnologías
emergentes. Por tanto, lo contrata a usted para que haga un algoritmo que permita hacer lo siguiente:

• El algoritmo se hará con una prueba piloto de 50 estudiantes, la información que se debe
almacenar de cada consulta hecha por los estudiantes la siguiente información: código del
estudiante, categoría (1. Inteligencia Artificial, 2. Blockchain, 3. Minería de Datos, 4.
Machine Learning), edad del estudiante, calificación (en un rango de 1 a 5) dada a los
resultados de la consulta(siendo 1 la menor valoración y 5 la mayor). (30 puntos)

• Una vez ingresada la información (NO puede hacerse durante el ingreso) se debe dar la
posibilidad al usuario de:
o Ingresar un rango de edades y hallar el promedio de calificación dado a las consultas
por los estudiantes que se encuentran en dicho rango de edad. Es decir, si el usuario
ingresa 11 y 13, hallar el promedio de calificación dada por los estudiantes cuyas
edades se encuentran dentro de ese rango. (30 puntos)
o Al ingresar una categoría, mostrarle por pantalla el número de consultas realizadas en
dicha categoría. (20 puntos)

• El video de explicación sobre la solución dada al ejercicio tiene un valor de 20 puntos y es
obligatoria, no enviarla es no haber realizado el examen.
Nota. Estas opciones, SOLO podrá realizarse una vez se ha ingresado la información al arreglo, NO
SE PUEDE durante el ingreso de la información, dado que estamos evaluando manejo de arreglos.
* 
*
* 
 */

import java.util.Scanner;
public class Logica_Representacion_Parcial02 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int [][] Estudiantes = new int [2][4];
        int opcion, categoria; 
        int edadMin, edadMax, promedio;
        double totalPromedio;
        
        for(int estudiante = 0;estudiante < 2;estudiante++){
            for(int columna = 0;columna < 4; columna ++){
                if(columna == 0){
                    System.out.println("\ningrese codigo del estudiante " +(estudiante+1));
                    Estudiantes [estudiante][columna] = t.nextInt();
                }else if(columna == 1){
                    System.out.println("ingrese = 1. Inteligencia Artificial, 2. Blockchain, 3. Minería de Datos, 4.Machine Learning");
                    Estudiantes [estudiante][columna] = t.nextInt();
                }else if(columna == 2){
                    System.out.println("ingrese edad del estudiante "+(estudiante+1));
                    Estudiantes [estudiante][columna] = t.nextInt();
                }else if(columna == 3){
                    System.out.println("calificación (siendo 1 la menor valoración y 5 la mayor) a los resultados de la consulta." +(estudiante+1));
                    Estudiantes [estudiante][columna] = t.nextInt();
                }
            }
        }do{
            System.out.println("\ningrese opcion deseada: \n1. rango de edades.  \n2. cantidad de resultado en cantegoria");
            int caso = t.nextInt();
            switch(caso){
                case 1:
                    System.out.println("ingrese edad maxima ");
                    edadMin = t.nextInt();
                    System.out.println("ingrese edad minima");
                    edadMax = t.nextInt();
                    
                    for(int estudiante=0;estudiante<2;estudiante++){
                        for(int columna=0 ; columna<2 ; columna++){
                            if(Estudiantes[estudiante][2]<=edadMax && Estudiantes[estudiante][2]>=edadMin){
                                promedio = promedio + Estudiantes[estudiante][3];
                                totalPromedio = promedio/estudiante;
                                System.out.println("el promedio es = " +(totalPromedio));  
                        }
                        }
                        }
                break;
                case 2:
                    System.out.println("ingrese categoria");
                    categoria = t.nextInt();
                    for(int estudiante=0 ; estudiante<2 ; estudiante++){
                        if(Estudiantes[estudiante][1]==categoria){
                            int cantCategoria = 0;
                            cantCategoria = cantCategoria+1;
                            System.out.println("la cantidad de cantegoria hay " +cantCategoria);
                        } 
                    }
                break;
        }
            System.out.println("\ningrese 0 seguir y 1 salir");
            opcion = t.nextInt();
        }while(opcion==0);
    }
}
