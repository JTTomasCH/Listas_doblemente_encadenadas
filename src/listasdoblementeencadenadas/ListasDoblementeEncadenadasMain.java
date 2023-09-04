
package listasdoblementeencadenadas;

import listasdoblementeencadenadas.Persona;


/**
 *
 * @author Tomás Chiriví
 */
public class ListasDoblementeEncadenadasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListasDoblementeEncadenadas<Persona> personas = new ListasDoblementeEncadenadas<Persona>();
        
        System.out.println("La lista esta vacia? "+personas.isEmpty()+"\n");
        Persona per1 = new Persona("Jorge", 15);
        Persona per2 = new Persona("Tomas", 32);
        personas.addLast(per1);
        personas.addLast(per2);
        System.out.println("Lista 1: ");
        for (Persona elem : personas) {
            System.out.println(elem);
        }
        
        
        System.out.println("");
        

        ListasDoblementeEncadenadas<Persona> persona = new ListasDoblementeEncadenadas<Persona>();
        Persona per3 = new Persona("Jorge", 15);
        Persona per4 = new Persona("Tomas", 32);
        persona.addLast(per3);
        persona.addLast(per4);
        
        System.out.println("Lista 2: ");
        
        for (Persona elem : persona) {
            System.out.println(elem);
        }
        System.out.println("");

        System.out.println("La lista 1 y 2 son iguales? "+persona.areEquals(personas)+"\n");
        
        
        Persona per5 = new Persona("Carlos", 15);
        Persona per6 = new Persona("Luisa", 32);
        Persona per7 = new Persona("Santiago", 20);
        persona.addLast(per5);
        persona.addLast(per6);
        persona.addFirst(per7);
        
        System.out.println("Lista 3: ");
        for (Persona elem : persona) {
            System.out.println(elem);
        }
        System.out.println("");
        
        System.out.println("Tamanio de la lista #3: "+persona.size());
        System.out.println("Buscar Tomas,32: "+persona.search(per4));
    }
    
}
