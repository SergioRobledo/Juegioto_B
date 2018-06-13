package Pet_Fight;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {

    public static String nombreP2;
    public static String nombreP1;

    public static void menu() {

        int exit = 0;
        do {
            System.out.println("BIENVENIDO A BATALLA DE MASCOTAS \n");
            System.out.println("Presione la opción deseada");
            System.out.println("1. Selección de personajes");
            System.out.println("2. Selección modos de juego");
            System.out.println("3. Empezar Batalla");
            System.out.println("0. Salir");

            Scanner sc1 = new Scanner(System.in);
            int response = 0;
            try {
                response = Integer.valueOf(sc1.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                menu();
            }

            switch (response) {
                case 0:	//salir	
                    exit = 0;
                    break;
                case 1:
                    seleccionDePersonaje();	//menu para seleccionar los personajes
                    break;
                case 2:
                    seleccionDeModo();
                    break;
                case 3:
                    Batalla.batalla();	//Empieza la pelea
                default:
                    System.out.println("\n \n ....¡¡Selecciona una opción valida !!....\n \n");
                    menu();
                    break;
            }
        } while (exit != 0);
    }
    //Selección modo de juego

    public static void seleccionDeModo() {
        int exit = 0;
        do {
            System.out.println("\nSeleccione la opción deseada:\n");
            System.out.println("1. Todas las operaciones");
            System.out.println("2. Suma");
            System.out.println("3. Resta");
            System.out.println("4. Multiplicación");
            System.out.println("5. División");
            System.out.println("6. Atras");

            Scanner sc3 = new Scanner(System.in);
            int response3 = 0;
            try {
                response3 = Integer.valueOf(sc3.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                seleccionDeModo();
            }

            switch (response3) {
                case 1:
                    Personaje.player1.setModo(1);
                    Personaje.player2.setModo(1);
                    menu();
                    break;
                case 2:
                    Personaje.player1.setModo(2);
                    Personaje.player2.setModo(2);
                    menu();
                    break;
                case 3:
                    Personaje.player1.setModo(3);
                    Personaje.player2.setModo(3);
                    menu();
                    break;
                case 4:
                    Personaje.player1.setModo(4);
                    Personaje.player2.setModo(4);
                    menu();
                    break;
                case 5:
                    Personaje.player1.setModo(5);
                    Personaje.player2.setModo(5);
                    menu();
                    break;
                case 6:
                    menu();	//Regresa atras
                    break;
                default:
                    System.out.println("\n \n ....¡¡Selecciona una opción valida POR FAVOR!!....\n \n");
                    menu();
                    break;
            }
        } while (exit != 0);
    }

    //Seleccion de personaje
    public static void seleccionDePersonaje() {
        int exit = 0;
        do {
            System.out.println("1. Player 1 \n");
            System.out.println("2. Player 2 \n");
            System.out.println("3. Atras \n");
            System.out.println("0. Salir");

            Scanner sc2 = new Scanner(System.in);
            int response2 = 0;
            try {
                response2 = Integer.valueOf(sc2.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                seleccionDePersonaje();
            }

            switch (response2) {
                case 0:	//salir						
                    break;
                case 1:
                    seleccionPl1();	//Menu para establecer el personaje del player 1
                    break;
                case 2:
                    seleccionPl2(); //Menu para establecer el personaje del player 2
                    break;
                case 3:
                    menu();	//Regresa atras
                    break;
                default:
                    System.out.println("\n \n ....¡¡Selecciona una opción valida!!....\n \n");
                    break;
            }
        } while (exit != 0);
    }

    public static void seleccionPl1() {	//Menu del player 1

        nombreP1 = JOptionPane.showInputDialog("NOMBRE DEL PLAYER 1");
        Personaje.player1.setNombre(nombreP1);
        Personaje.player1.setVida(150);
        seleccionDePersonaje();
    }

    public static void seleccionPl2() {	//Menu del player 2

        nombreP2 = JOptionPane.showInputDialog("NOMBRE DEL PLAYER 2");
        Personaje.player2.setNombre(nombreP2);
        Personaje.player2.setVida(150);
        seleccionDePersonaje();
    }
}
