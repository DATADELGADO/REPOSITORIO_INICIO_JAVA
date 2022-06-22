package coleccion_treeset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Principal1 {

    public static void main(String[] args) {
//Creating and adding elements  
        TreeSet<String> nombre_ts = new TreeSet<String>();
        nombre_ts.add("Ravi");
        nombre_ts.add("Vijay");
        nombre_ts.add("Ravi");
        nombre_ts.add("Ajay");
        
        //cambiar de treeset a ArrayList
        List<String> nombre_a1 = new ArrayList<String>();
        nombre_a1.addAll(nombre_ts);
        
        //forma rapida de imprimir
        for(String nombre: nombre_a1){
            System.out.println(nombre);
        }
        
        
        //forma tradicional de imprimir
        for(int i=0;i<nombre_a1.size();i++){
            String nombre = nombre_a1.get(i);
            System.out.println(nombre);
        }
        
        
        
        /*//Traversing elements  
        Iterator<String> itr = nombre_ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/

    }
}
