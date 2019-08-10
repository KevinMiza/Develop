/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author KEVIN MIZA
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    
        
    public static int feature1(int numero1, int numero2){
    return numero1+numero2;
    }
    

    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1 = 6;
        int num2 =5;
        
        int resultado = feature1(num1,num2);
        System.out.println(resultado);
 
    }

}
