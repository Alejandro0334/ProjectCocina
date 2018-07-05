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
public class Cocina {
    private String Especialidad;
    private String Direccion;
    private int Telefono;
    private String JefeCocina;
    private Receta[] Receta;

    public Receta[] getReceta() {
        return Receta;
    }

    public void setReceta(Receta[] Receta) {
        this.Receta = Receta;
    }
    
    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getJefeCocina() {
        return JefeCocina;
    }

    public void setJefeCocina(String JefeCocina) {
        this.JefeCocina = JefeCocina;
    }

}
