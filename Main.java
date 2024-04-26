/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author albam
 */
public class Main 
{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
    
    }
    
    public static void probarIngresar(CCuenta c, int cantidad, int cantidadEsperada) 
    {
        try 
        {
            
            c.ingresar(cantidad);
            
        } catch (Exception ex) 
        {
            
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    public static void probarRetirar(CCuenta c, int cantidad, int cantidadEsperada) 
    {
        try 
        {
            
            c.retirar(cantidad);
            
        } catch (Exception ex) 
        {
            
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
}
