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


public class ProjectCocina {
    
    private Cocina cocina;
    //private Receta recetas;
    private Receta[] receta;
    private Ingrediente[] ingredientes;
    private Pedido pedido;
    private Cliente cliente;
    private Plato[] platos;

    private static final int NUMERO_INGREDIENTES = 5;
    private static final int NUMERO_PLATOS = 2;
    private static final int NUMERO_RECETAS = 1;
    
    public ProjectCocina() {
        ingredientes = new Ingrediente[NUMERO_INGREDIENTES];
        platos = new Plato[NUMERO_PLATOS];
        receta = new Receta[NUMERO_RECETAS];
    }

    
        public void ingredientesDisponibles()
        {
            Ingrediente i1 = new Ingrediente();
            Ingrediente i2 = new Ingrediente();
            Ingrediente i3 = new Ingrediente();
            Ingrediente i4 = new Ingrediente();
            Ingrediente i5 = new Ingrediente();
            
            i1.setNombre("agua");
            i1.setCantidad(2);
            ingredientes[0]=i1;
            
            i2.setNombre("papa");
            i2.setCantidad(3);
            ingredientes[1]=i2;
            
            i3.setNombre("yuca");
            i3.setCantidad(2);
            ingredientes[2]=i3;
            
            i4.setNombre("carne");
            i4.setCantidad(3);
            ingredientes[3]=i4;
            
            i5.setNombre("cilantro");
            i5.setCantidad(1);
            ingredientes[4]=i5;
            
            System.out.print("----Los ingredientes disponbles:---- "+"\n");
            for(Ingrediente ingredientes: ingredientes)
            {
                System.out.println(ingredientes);
            }
        }

        public void consultarReceta(Plato plato){
            Receta r1 = new Receta();
            Receta r2 = new Receta();
            
            Ingrediente i1r1 = new Ingrediente();
            Ingrediente i2r1 = new Ingrediente();
            Ingrediente i3r1 = new Ingrediente();
            Ingrediente i4r1 = new Ingrediente();
            Ingrediente i5r1 = new Ingrediente();
            
            Ingrediente i1r2 = new Ingrediente();
            
            switch (plato.getNombre())
            {
                case "Sancocho":
                    i1r1.setNombre("sal");
                    i1r1.setCantidad(1);
                    ingredientes[0] = i1r1;

                    i2r1.setNombre("cilantro");
                    i2r1.setCantidad(2);
                    ingredientes[1] = i2r1;

                    i3r1.setNombre("carne");
                    i3r1.setCantidad(1);
                    ingredientes[2] = i3r1;

                    i4r1.setNombre("agua");
                    i4r1.setCantidad(1);
                    ingredientes[3] = i4r1;
                    
                    i5r1.setNombre("platano");
                    i5r1.setCantidad(3);
                    ingredientes[4] = i5r1;
                    
                    r1.setNombre(plato.getNombre());
                    r1.setIngrediente(ingredientes);
                    receta[0] = r1;
                
                break;
            }
            
            System.out.println("-----Receta "+ plato.getNombre() +" -----");
            
            for(Receta recetas: receta )
            {
                System.out.println(recetas);
            }  
        }

        public void solicitarPedido()
        {
            Pedido pedido = new Pedido();
            
            Plato p1 = new Plato();
            p1.setNombre("Sancocho");
            p1.setTipo("liquido");
            p1.setPrecio(2.000);
            platos[0] = p1;
            
            pedido.setPlato(platos);
            
        }
              
        public void crearPlato()
        {
            Plato p1 = new Plato();
            Plato p2 = new Plato();
            
            p1.setNombre("Sancocho");
            p1.setTipo("Liquido");
            p1.setPrecio(2.000);
            platos[0] = p1;

            p2.setNombre("Pollo");
            p2.setTipo("Solido");
            p2.setPrecio(10.000);
            platos[1] = p2;
            
            System.out.println("-----Platos Disponibles-----");
            for(Plato plato1: platos)
            {
                System.out.println(plato1);
            }
        }
        
        public void crearCliente()
        {
            Cliente client = new Cliente();
            client.setNombre("Marta");
            
            System.out.println("-----Cliente "+client.getNombre()+"-----");
        }
        
        public void validarIgredientes()
        {
            for(Receta r: this.receta)
            {
                for(Ingrediente i: this.ingredientes)
                {
                    
                }
            }
        }
        
        
    public static void main(String[] args) {
        Plato p = new Plato();
        p.setNombre("Sancocho");
        
        ProjectCocina project = new ProjectCocina();
        
        project.crearCliente();
        project.crearPlato();
        project.solicitarPedido();
        project.consultarReceta(p);
        project.ingredientesDisponibles();
        
        
    }

    
}
