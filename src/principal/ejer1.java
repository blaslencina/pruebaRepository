
package principal;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;


public class ejer1 {

    
    public static void main(String[] args) {
        Animal perro=new Perro("Maqui", "Alimento balanceado", 4, "Mestizo");
        System.out.println(perro.toString());
        perro.Alimentarse();
        
        Animal perro1=new Perro("Lasha", "Sobras", 4, "Pitbull");
        System.out.println(perro1.toString());
        perro1.Alimentarse();
        
        Animal gato=new Gato("Minini", "Atun", 3, "Tricolor");
        System.out.println(gato.toString());
        gato.Alimentarse();
        
        Animal caballo=new Caballo("Nardo", "Pasto", 14, "Semental");
        System.out.println(caballo.toString());
        caballo.Alimentarse();
    }
    
}
