package expresion_regular;

public class ER2 {

    public static void main(String[] args) {
        
        {//ejemplo 1
            
        String er = "a+x+"; //todas las "x" y "a" que uno quiera
        String s = "aaaaxx";// cadena
        //comparar la cadena con la expresion regular
        if (s.matches(er)) {
            System.out.print("verdadero");

        } else {
            System.out.print("falso");

        }
        
        }//fin
        
        
        {//ejemplo 2
            
           String er = "[a-z0-9]+@gmail\\.com"; 
        String s = "data111sa@gmail.com";
        //comparar la cadena con la expresion regular
        if (s.matches(er)) {
            System.out.print("verdadero");

        } else {
            System.out.print("falso");

        } 
        }//fin
        
        
        
        
    }

}
