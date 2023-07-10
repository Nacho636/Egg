
package cadena;

import java.util.Scanner;

public class Cadena {
 
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
      
        
        frase f1 = new frase ();
        
        System.out.println("Ingrese la frase");
        f1.setEslogan(leer.next());
        f1.setTamaño(f1.getEslogan().length());
        System.out.println("FRASE: "+ f1.getEslogan());
        System.out.println("Tiene "+f1.getTamaño()+" letras");
        vocales(f1.getEslogan(),f1.getTamaño());
        int i;
        
        for (i=0;i<=f1.getEslogan().length();i++){
            System.out.println();
            
        }


    }
       
    public static void vocales (String eslogan, int i){
      
    /**for (String a: eslogan){
        System.out.println(a);
        
    }
    **/
                
    
    }

}
