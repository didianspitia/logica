/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logica_representacion2023_03_27_2;

/**
 * la floristeria "Rosa Cattleya" ofrece el servicio de entrega puerta
 * a puerta de arreglos florares en todo el departamento de antioquia y es 
 * reconocida a nivel departamental por los tipos de arreglo. Actualmente, 
 * los pedidos se asignan a los mensajesros de forma manual, sin embargo, por 
 * la velocidad con la cual ha crecido el negocio, la dueña de la empresa doña
 * azucena ha decidido contratarlo a usted para que desarrolle un algoritmo que 
 * le permita almacenar y organizar la informacion relacionada con la asignacion
 * de los domicilios.
 * 
 * actualmente la mempresa cuenta con 10 empleados, Para la sigancion de los
 * pedidos, se tiene un arreglo con la identidad de los mensajeros, el municipio 
 * al cual atiende (1.medellin, 2.Riomegro, 3.Santa fe de Antiquia), el numero 
 * de domicilos maximos que pueden hacer y el numero de pedidos que ha atendido.
 *
 * - El algoritmo debe:
 * almacenar la informacion relacionada con los mensajeros, para un dia, en un 
 * arreglo. para ello el usuario ingresara para cada mensajero la siguiente     
 * informacion: la identificacion, codigo del municipio (1.medellin, 2.Riomegro,
 * 3.Santa fe de Antiquia), y numero maximo de domicilios que puede atender para 
 * ese dia. la informacion relacionada con el nropedidoatendido por mensajero debe
 * iniciar en cero.
 * 
 * para cada pedido (no se sabe cuantos) el algoritmo debe asignar un mensajero 
 * para el domicilio. para ello el usuario ingresara para cada pedido la siguiente 
 * informacion : municipio destino domicilio (1.medellin, 2.Riomegro, 3.Santa fe 
 * de Antiquia), y tipo de ocasion (1. cumpleaños, 2.dia de la madre, 3.dia del 
 * amor y la amistad).
 * 
 * el algoritmo debe asignar un mensajero teniendo en cuenta que el mensajero 
 * atiende la zona del pedido y no se acceda en numero de pedidos que el
 * mensajero puede hacer. recuerde que cada vez que se asigne un pedido a un 
 * mensajero el campo nropedidoatendido debe ser actualizado.
*/

import java.util.Scanner;
public class Logica_Representacion2023_03_27_2 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int [][] Mensajeros = new int [10][4];
        int pedido, ocacion, municipio, bandera;
        
        for(int mensajero = 0;mensajero < 10; mensajero++){
            for(int columna=0;columna<3;columna++){
                if(columna==0){
                    System.out.println("ingrese el id del mensajero "+(mensajero+1));
                    Mensajeros[mensajero][columna] = t.nextInt();
                }else if(columna ==1){
                    System.out.println("ingrese el codigo del municipio 1. Medellin, 2.Rionegro o 3.Santa fe de Antiquia "+(mensajero+1));
                    Mensajeros[mensajero][columna] = t.nextInt();
                }else if(columna == 2){
                    System.out.println("ingrese el numero de domicilios maximo "+(mensajero+1));
                    Mensajeros[mensajero][columna] = t.nextInt();
                }//la cuarta se inicializa en ceros por defecto por se un tipo de dato int
            }  
        }//despacho de pedidos
        do{
           System.out.println("ingrese = 1. Medellin, 2. Rionegro, 3. Santa fe de Antiquia"); 
           municipio = t.nextInt();
           System.out.println("ingrese = 1. Cumpleaños, 2. Dia de la madre, 3. Amor y amistad"); 
           ocacion = t.nextInt();
           bandera = 0;
           
           for (int mensajero=0;mensajero<0;mensajero++){
                if (Mensajeros[mensajero][1]==municipio && Mensajeros[mensajero][3]< Mensajeros[mensajero][2]){
                    System.out.println("Domicilio entregado por el mensajero "+Mensajeros[mensajero][0]);
                    Mensajeros[mensajero][3] = Mensajeros[mensajero][3]+1;
            	    mensajero = 10; 
                    bandera=7;
           }    
           }if(bandera==0)
                System.out.println("Pedido no se pudo despachar");
                
            System.out.println("Ingrese 1 para seguir despachando pedidos o 0 para terminar");
            pedido = t.nextInt();
           
        }while(pedido==0);
    }
}
