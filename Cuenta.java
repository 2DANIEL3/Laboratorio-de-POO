/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;

/**
 *
 * @author DANIE
 */


public class Cuenta {
    private String NomCliente;
    private String NumCuenta;
    private double Interes;
    private double Saldo;
    

    
    public Cuenta (){
        
    }
    
    //Constructor con sus parámetros
    public Cuenta (String NomCliente, String NumCuenta, double Interas, double Saldo ){
       this.NomCliente = NomCliente;
       this.NomCliente = NumCuenta;
       this.Interes = Interes;
       this.Saldo = Saldo;
    }
    
    //Copia de cuenta
    public Cuenta(final Cuenta ObjCuenta){
        this.NomCliente = ObjCuenta.NomCliente;
        this.NumCuenta = ObjCuenta.NumCuenta;
        this.Interes = ObjCuenta.Interes;
        this.Saldo = ObjCuenta.Saldo;        
    }
    
    
    //Getters y setters
    
        /**
     * @return the Interes
     */
    public double getInteres() {
        return Interes;
    }

    /**
     * @param Interes the Interas to set
     */
    public void setInteres(double Interes) {
        this.Interes = Interes;
    }
   
        /**
     * @return the Saldo
     */
    public double getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    
    /**
     * @return the NomCliente
     */
    public String getNomCliente() {
        return NomCliente;
    }

    /**
     * @param NomCliente the NomCliente to set
     */
    public void setNomCliente(String NomCliente) {
        this.NomCliente = NomCliente;
    }

    /**
     * @return the NumCuenta
     */
    public String getNumCuenta() {
        return NumCuenta;
    }

    /**
     * @param NumCuenta the NumCuenta to set
     */
    public void setNumCuenta(String NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    
    //Verificacion de Deposito
 public boolean Deposito(double Cantidad){
    boolean DepositoV = true;
     if (Cantidad < 0){
         DepositoV = false;
     }else{
       this.Saldo = this.Saldo + Cantidad;  
     }
     return DepositoV;
 }   
 
 
 //Verificacion de Retiro
  public boolean Retiro(double Cantidad){
    boolean RetiroV = true;
     if (Cantidad < 0){
         RetiroV = false;
     }else{
       this.Saldo = this.Saldo - Cantidad;  
     }
     return RetiroV;
 } 
    
    
 //Verificacion de Transferencia
  public Boolean Transferencia (Cuenta Cuenta1, double n){
      boolean TF = true;
      if(n<0){
          TF = false;
          System.out.print("Saldo insuficiente.");
      }else if (Saldo >= n){
          Retiro(n);
          Cuenta1.Deposito(n);
       }else{
          TF = false;
       }
      return TF;
    }
}
