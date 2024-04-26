/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadFinanciera;

/**
 *
 * @author albam
 */
public class CCuenta 
{
    /**
     * Nombre de la persona titular
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private String error;
    private final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
    
    /**
     *
     */
    public CCuenta()
    {
    }

    /**
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     *
     * @return
     */
    public double estado(){
        return this.saldo;
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    
    //GETTER 
    
    public String getNombre() 
    {
        return nombre;
    }

    /**
     *
     * @return
     */
    public String getCuenta() 
    {
        return cuenta;
    }

    /**
     *
     * @return
     */
    public double getSaldo() 
    {
        return saldo;
    }

    /**
     *
     * @return
     */
    public double getTipoInterés() 
    {
        return tipoInterés;
    }

    /**
     *
     * @return
     */
    public String getError() 
    {
        return error;
    }


    //SETTER 
    
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public void setCuenta(String cuenta) 
    {
        this.cuenta = cuenta;
    }
     
    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }
     
    /**
     *
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) 
    {
        this.tipoInterés = tipoInterés;
    }
     
    public void setError(String error) 
    {
        this.error = error;
    }
}
