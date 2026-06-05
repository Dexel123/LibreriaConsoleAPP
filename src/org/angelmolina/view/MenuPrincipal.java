/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.angelmolina.view;
import java.util.Scanner;
/**
 *
 * @author Herberth Cuyuch
 */
public class MenuPrincipal {
    private final Scanner leer = new Scanner (System.in);
    
    public void iniciarSistema(){
        System.out.println("");
        int opcion = 0;
        // Ciclo para el menu: While
        
        do {            
            System.out.println("----------------------------------------");
            System.out.println("             Sistema central            ");
            System.out.println("----------------------------------------");
            System.out.println("1. Opcion 1.");
            System.out.println("2. Opcion 2.");
            System.out.println("3. Opcion 3.");
            System.out.println("0. Salir del sistema.");
            System.out.println("----------------------------------------");
            
            opcion = Integer.parseInt(leer.nextLine());
            
            switch (opcion) {
                case 1:
                    System.out.println("Opcion 1");
                    break;
                case 2:
                    // Instanciar la vista CATEGORIA
                    System.out.println("Opcion 2");
                    break;
                case 3  :
                    // Instanciar la vista LIBRO
                    System.out.println("Opcion 3");
                    break;
                case 4  :
                    // Instanciar la vista LIBRO
                    System.out.println("Opcion 3");
                    break;
                default:
                    System.out.println("NO EXISTE LA OPCION");
            }
        } while (opcion != 5);
        System.out.println("\n Hasta la proxima.");
    }
}
