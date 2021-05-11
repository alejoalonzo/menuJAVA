
package menubucle;

import java.util.Scanner;

public class MenuBucle {

    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int option; //guardamos la ocion del usuario
        
        while(!salir){
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            
            System.out.println("Escribe una de las opciones");
            option = sn.nextInt();
            
            if (option==1){
                System.out.println("Has escogido la opcion 1");
                //aqui iria todo el codigo de la opcion 1
            }
    
             if (option==2){
                System.out.println("Has escogido la opcion 2");
            }

            if (option==3){
                System.out.println("Has escogido la opcion 3");
            }

            if (option==4){
                System.out.println("Adios");
                
                salir = true;
        }
            
        }
    }
    
}
