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
public class Receta {

    
    private String Nombre;
        
    private Ingrediente[] Ingrediente;
    
    public Ingrediente[] getIngrediente() {
        return Ingrediente;
    }

    public void setIngrediente(Ingrediente[] Ingrediente) {
        this.Ingrediente = Ingrediente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    @Override
    public String toString() {
        String result = "Ingredientes: " ;
               
        for (Ingrediente ingrediente: Ingrediente) {
            result += Ingrediente;
        }
        
        return result;
    }
}
