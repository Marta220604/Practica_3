/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author alumno
 */
// hereda de una Collection de Java (ArrayList) y añade el indice actual
//que apunta al cliente que se esta mostrando
public class GestionClientes extends ArrayList<Cliente> {

    private int actual;

    public GestionClientes() {
        super();
        this.actual = 0;
    }

    public boolean esVacia() {
        return isEmpty();
    }

    public void avanzar() {
        actual++;
    }

    public void retroceder() {
        actual--;
    }

    public void irAlPrimero() {
        this.actual = 0;
    }

    public void irAlUltimo() {
        this.actual = size() - 1;
    }

    public boolean esPrimero() {
        if (actual == 0) {
            return true;
        }
        return false;
    }

    public boolean esUltimo() {
        if (actual == size() - 1) {
            return true;
        }
        return false;
    }

    public void añadirCliente(Cliente e) {
        add(e);
        System.out.println("Cliente añadido");
    }

    /*
        Borra el cliente que esta en actual
     */
    public void borrarCliente() {
        remove(actual);
        // Si borramos el ultimo cliente el atributo actual se queda apuntando fuera de la lista 
        //en ese caso lo movemos al nuevo ultimo que es size()-1
        // Math.max(0, ...) es para cuando borramos el unico cliente que habia:
        // size()-1 daria -1, y con el max nos quedamos en 0, que es el indice
        //Math.max(a, b) devuelve el mayor de los dos. Con la lista vacía, size() - 1 vale -1, y Math.max(0, -1) devuelve 0
        if (actual >= size()) {
            actual = Math.max(0, size() - 1);
        }
    }

    public Cliente obtenerCLienteActual() {
        return get(actual);
    }

    public void ordenarLista() {
        sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente c1, Cliente c2) {
                return Integer.compare(c1.getNumero(), c2.getNumero());
            }
        });
    }
    
}


