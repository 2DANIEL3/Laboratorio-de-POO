
package practica_1;

import java.util.Scanner;

public class Practica_1 {

    
    public static void main(String[] args) {
        
        //Scann Global
         Scanner scn = new Scanner(System.in);
        
        //Declaracion de Variables
        String Nom, Num;
        double TInteres, importe;
        
        /*Hacemos la cuenta y ejecutamos 
        el constructor ya realizado*/
        Cuenta Cuenta1 = new Cuenta();
        
       //Lectura de Datos que se requieren
        System.out.print("Ingrese su nombre : ");
        Nom = scn.nextLine();
        System.out.print("Ingrese el número de cuenta : ");
        Num = scn.nextLine();
        System.out.print("Interes : ");
        TInteres = scn.nextDouble();
        System.out.print("Saldo: ");
        importe = scn.nextDouble();
        
        //SAlto de linea
        System.out.println();
        System.out.println();
        
         Cuenta1.setNomCliente(Nom);
         Cuenta1.setNumCuenta(Num);
         Cuenta1.setInteres(TInteres);
         Cuenta1.setSaldo(importe);
        
        /*Realizamos cuenta 2 para realizar las operaciones
         correspondientes*/
         Cuenta Cuenta2 = new Cuenta("Angel Javier Cruz Hernandez", "2113691", 1.75, 40000);
         
         // El ejrciocio indica tener una funcion e copia de cuenta
         // y se realiza lo siguiente 
         Cuenta Cuenta3 = new Cuenta(Cuenta1);
        



 
         
         //Impresion de los datos de la cuenta 1
          System.out.println("Datos de la cuenta 1");
          System.out.println("Nombre del titular: " + Cuenta1.getNomCliente());
          System.out.println("Número de cuenta: " + Cuenta1.getNumCuenta());
          System.out.println("Interés: " + Cuenta1.getInteres());
          System.out.println("Saldo: " + Cuenta1.getSaldo());
          System.out.println();
          System.out.println();
         
         //Impresion de los datos de la Cuenta 2
          System.out.println("Datos de la cuenta 2");
          System.out.println("Nombre del titular: " + Cuenta2.getNomCliente());
          System.out.println("Número de cuenta: " + Cuenta2.getNumCuenta());
          System.out.println("Interés: " + Cuenta2.getInteres());
          System.out.println("Saldo: " + Cuenta2.getSaldo());
          System.out.println();
          System.out.println();
          
         //Impresion de los datos de la Cuenta 3 que es una copia de la cuenta 1
          System.out.println("Datos de la cuenta 3");
          System.out.println("Nombre del titular: " + Cuenta3.getNomCliente());
          System.out.println("Número de cuenta: " + Cuenta3.getNumCuenta());
          System.out.println("Interés: " + Cuenta3.getInteres());
          System.out.println("Saldo: " + Cuenta3.getSaldo());
          System.out.println();
          System.out.println();
          
        
        
        
          
        //Deposito a la Cuenta
        Cuenta1.Deposito(1000);
        System.out.print("Se realizo exitosamente el deposito");
        System.out.println();
        System.out.println();
        
        //Se refleja el saldo que tenemos en la cuenta 1
        System.out.print("Saldo en la cuenta 1");
        System.out.println();
        System.out.print("Su Saldo en la cuenta es de:" + Cuenta1.getSaldo());
        System.out.println();
        System.out.println();
        
        //Retiro de la cuenta
        Cuenta1.Retiro(500);
        System.out.print("Se realizo exitosamente el retiro");
        System.out.println();
        System.out.println();
        
        //Se refleja el saldo que tenemos en la cuenta 1
        System.out.print("Saldo en la cuenta 1");
        System.out.println();
        System.out.print("Su Saldo en la cuenta es de:" + Cuenta1.getSaldo());
        System.out.println();
        System.out.println();
                     
        
       //Transeferencia mayor al saldo de Dinero de la cuenta 1 a la cuenta 2
       Cuenta1.Transferencia(Cuenta2, 40000);
       
       //Se refleja el saldo que tenemos en la cuenta 1
        System.out.print("Saldo en la cuenta 1");
        System.out.println();
        System.out.print("Su Saldo en la cuenta es de:" + Cuenta1.getSaldo());
        System.out.println();
        System.out.println();
        
       //Se refleja el saldo que tenemos en la cuenta 2
        System.out.print("Saldo en la cuenta 2");
        System.out.println();
        System.out.print("Su Saldo en la cuenta es de:" + Cuenta2.getSaldo());
        System.out.println();
        System.out.println();
       
       //Transeferencia mayor al saldo de Dinero de la cuenta 1 a la cuenta 2
       Cuenta1.Transferencia(Cuenta2, 15);
       
       //Se refleja el saldo que tenemos en la cuenta 1
        System.out.print("Saldo en la cuenta 1");
        System.out.println();
        System.out.print("Su Saldo en la cuenta es de:" + Cuenta1.getSaldo());
        System.out.println();
        System.out.println();
        
       //Se refleja el saldo que tenemos en la cuenta 2
        System.out.print("Saldo en la cuenta 2");
        System.out.println();
        System.out.print("Su Saldo en la cuenta es de:" + Cuenta2.getSaldo());
        System.out.println();
        System.out.println();
                   
       //Se refleja el saldo que tenemos en la cuenta 1
        System.out.print("Saldo en la cuenta 1");
        System.out.println();
        System.out.print("Su Saldo en la cuenta es de:" + Cuenta1.getSaldo());
    }
    
}
