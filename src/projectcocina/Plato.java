/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcocina;

/**
 *
 * @author Alejandro
 */
public class Plato {
    private String Tipo;
    private String Nombre;
    private Double Precio;

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return " Tipo="+ Tipo + ", Nombre=" + Nombre + ", Precio=" + Precio;
    }
    
    
}
