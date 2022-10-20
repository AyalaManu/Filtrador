
package asesorias;

import javax.swing.JOptionPane;
//holaaaaaaaaaaaaaaa
//siiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii
//WILBERTHOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO

public class Asesorias {

    
    public static void main(String[] args) {
        
        
        int contador = 0;
        int contador2 = 0;
        int contador3= 0;
        
            for (int i = 0; i < 20; i++) {
                
           int   num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los numeros") );
          
           if(num <0){
               contador++;
               
           }else if(num>0){
               contador2++;
               
           }else{
               contador3++;
           }
        }
           
           
            JOptionPane.showMessageDialog(null,"Los numeros negativos son: " + contador );
            JOptionPane.showMessageDialog(null,"Los numeros positivos son: " + contador2 );
            JOptionPane.showMessageDialog(null,"Los numeros neutros son: " + contador3 );
        
        
        }
    
}
