package linstasenlazadas;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        ListasEnlazadas listita=new ListasEnlazadas();
        Scanner leer=new Scanner (System.in);
        int opcion=0,elemento;
        do{
            
                System.out.println("          *************MENÚ**********");
                System.out.println("   1.-Agregar un elemento al inicio de la lista");
                System.out.println("   2.-Agregar un elemento al final de la lista");
                System.out.println("   3.-Mostrar los datos de la lista");
                System.out.println("   4.-Eliminar un elemento del incio de la lista");
                System.out.println("   5.-Eliminar un elemento del final de la lista");
                System.out.println("   6.-Eliminar un elemento en especifico de la lista");
                System.out.println("   7.-Salir");
                System.out.println("Elige algunas de las siguientes opciones");
                opcion=leer.nextInt();
                switch(opcion){
                    case 1:
                         System.out.println("Ingresa el Elemento al inicio");
                         elemento=leer.nextInt();
                         listita.agregarAlinicio(elemento);
                        break;
                    case 2:
                         System.out.println("Ingresa el Elemento al inicio");
                         elemento=leer.nextInt();
                         listita.agregarAlfinal(elemento);
                        break;
                    
                    case 3:
                        listita.MostrarLista();
                        System.out.println();
                   
                        break;
                    
                    case 4:
                        elemento=listita.borrarDelInicio();
                        System.out.println("El elemento eliminado al inicio es:"+elemento);
                      break;
                    case 5:
                        elemento=listita.borrarDelFinal();
                        System.out.println("El elemento eliminado al final es:"+elemento); 
                        break;
                    case 6:
                       
                        System.out.println("Ingresa el elemento a eliinar"); 
                        elemento=leer.nextInt();
                        listita.eliminar(elemento);
                         System.out.println("El elemento eliminado en especifico es:"+elemento); 
                        break;
                                
                    case 7:
                        System.out.println("El programa ha finalizado");
                        break;
                    default:
                        System.out.println("La opción que elegiste es incorrecta");
                 
                }   
                }while(opcion!=7);
                        
                   }
}         
                        
