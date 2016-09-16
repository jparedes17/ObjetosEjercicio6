/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author pared
 */
public class Cafetera 
{
    private int capacidad_maxima;
    private int cantidad_actual;
    
    public Cafetera ()
    {
      this.capacidad_maxima= 1000;
      this.cantidad_actual= 0;
    }
    
    public Cafetera (int capacidad_maxima, int cantidad_actual)
    {
        this.capacidad_maxima= capacidad_maxima;
        this.cantidad_actual = cantidad_actual;
        
        if (this.cantidad_actual>this.capacidad_maxima)
        {
            this.cantidad_actual = this.capacidad_maxima;
        }
    }


    public int getCapacidad_Maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_Maxima(int capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public int getCantidad_Actual() {
        return cantidad_actual;
    }

    public void setCantidad_Actual(int cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }
    
    public void LlenarCafetera (int ingresar)
    {
        int aux;
        aux= this.getCapacidad_Maxima();
        this.setCantidad_Actual(aux);
        
    }
    
    public void ServirTaza (int tazas)
    {
        int aux;
           if (this.getCantidad_Actual()>tazas)
           {
            aux= this.getCantidad_Actual() - tazas;
            this.setCantidad_Actual(aux);
           }
           else 
           {
               aux= this.getCantidad_Actual() - this.getCantidad_Actual();
               this.setCantidad_Actual(aux);
           }
        
    }   
    
    public int VaciarCafe ()
    {
        int aux;
        aux= cantidad_actual;
         this.setCantidad_Actual(aux);
        
        return aux;
    }
    
    public void AgregarCafe (int agregar)
    {
        int aux;
        aux = this.getCantidad_Actual() + agregar;
        this.setCantidad_Actual(aux);
        
    }
    
}
