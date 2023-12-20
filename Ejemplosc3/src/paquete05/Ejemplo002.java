/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {

    public static void main(String[] args) {
        int[][] arreglo = {{10, 41, 40}, {1, 2, 3}, {1, 12, 4}};
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (i == j) {
                    suma += arreglo[i][j];
                }
            }
        }
        System.out.println(suma);
        
        // Analizamos y concluimos que las posiciones del arreglo que tenemos 
        // que sumar son iguales [0,0] [1,1] [2,2] asi que creamos una condicion 
        //que analize las filas y columnas y que si son equivalentes se sumen
    }

}
