/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.time.LocalDate;

/**
 *
 * @author marta
 */
public class ControlErrores {
     public static boolean comprobarFecha(LocalDate fecha) {

        if (fecha == null) {
            return false;
        }

        int año = fecha.getYear();

        if (año >= 1900 && año <= 2015) {
            return true;
        }

        return false;
    }
     
     
    public static boolean comprobarPuntos(float puntos){
        
        if (puntos >= 0 && puntos <=1000){
            return true;
        }
        
        return false;
    }
}
