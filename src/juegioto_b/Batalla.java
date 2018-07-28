package Pet_Fight;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static Pet_Fight.Batalla.turno;

// Main Batalla file
public class Batalla extends Personaje {

    public static int a;
    public static int b;
    public static int c;
    public static int t;
    public static String resp;

    public Batalla(String nombre, int modo, int vida, int rVida, int atq1, int atq2, int atq3) {
        super(nombre, modo, vida, rVida, atq1, atq2, atq3);
        // TODO Auto-generated constructor stub

    }

    public static int turno = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);

    public static void batalla() {

        System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");

        if (turno == 0) {
            System.out.println("Empieza Player 2: " + Personaje.player2.getNombre());
        } else {
            System.out.println("Empieza Player 1 " + Personaje.player1.getNombre());
        }

        while (Personaje.player1.getVida() > 0 && Personaje.player2.getVida() > 0) {

            if (turno == 0) {

                turno0();

            } else {

                turno1();

            }

        }

        if (Personaje.player1.getVida() <= 0) {

            System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + ":::::::::::::::EL GANADOR ES[" + Personaje.player2.getNombre() + "]:::CON UNA VIDA DE :[" + Personaje.player2.getVida() + "]::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");

        } else {

            System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "::::::::::::::::EL GANADOR ES[" + Personaje.player1.getNombre() + "]:::CON UNA VIDA DE :[" + Personaje.player1.getVida() + "]::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
        }
    }

    public static void turno0() {

        //Es el turno del player 2
        int exit = 0;
        do {

            System.out.println(Personaje.player2.getNombre() + " Elije entre: \n");

            System.out.println("1. Atacar");
            System.out.println("2. Recuperar Vida");

            Scanner sc3 = new Scanner(System.in);
            int response = 0;
            try {
                response = Integer.valueOf(sc3.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                turno0();
            }

            switch (response) {
                case 1:
                    Atacar0();
                    break;
                case 2:
                    RecVida.recVida2();
                    break;
                default:
                    System.out.println("\n \n ....¡¡Selecciona una opción valida 3!!....\n \n");
                    break;

            }
        } while (exit != 0);

    }

    public static void turno1() {

        //Es el turno del player 1
        int exit = 0;
        do {

            System.out.println(Personaje.player1.getNombre() + " Elije entre: \n");

            System.out.println("1. Atacar");
            System.out.println("2. Recuperar Vida");

            Scanner sc3 = new Scanner(System.in);
            int response = 0;
            try {
                response = Integer.valueOf(sc3.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                turno1();
            }

            switch (response) {
                case 1:
                    Atacar1();
                    break;
                case 2:
                    RecVida.recVida1();
                    break;
                default:
                    System.out.println("\n \n ....¡¡Selecciona una opción valida 3!!....\n \n");
                    break;
            }
        } while (exit != 0);

    }

    public static void Atacar0() {
        int exit = 0;
        do {
            //Ataca el player 2
            //System.out.println(":: " + player2.nombre + ":: \n");

            System.out.println("Selecciona el tipo de ataque: ");
            System.out.println("1. Ataque basico 1");
            System.out.println("2. Ataque basico 2");
            System.out.println("3. Ataque Super ");
            System.out.println("0. Atras");

            Scanner sc3 = new Scanner(System.in);
            int response = 0;

            try {
                response = Integer.valueOf(sc3.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                Atacar0();
            }

            int operacion = 0;

            switch (player2.getModo()) {
                case 1:
                    operacion = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);//random entre 1 y 4   PRUEBA SERGIO
                    break;
                case 2:
                    operacion = 1;
                    break;
                case 3:
                    operacion = 2;
                    break;
                case 4:
                    operacion = 3;
                    break;
                case 5:
                    operacion = 4;
                    break;
            }

            switch (response) {
                case 0:	//salir	
                    exit = 0;
                    break;
                case 1:
                    switch (operacion) {
                        case 1: {
                            //Suma

                            a = (int) Math.floor(Math.random() * (25 - 5 + 1) + 5);
                            b = (int) Math.floor(Math.random() * (25 - 5 + 1) + 5);
                            c = a + b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " + " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player2.setAtq1((int) Math.floor(Math.random() * (45 - 40 + 1) + 40)); //Ataque entre 40 y 45 puntos
                                Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq1());
                                System.out.println(Personaje.player2.getNombre() + " ::¡CERTERO!\n DAÑO DE ATAQUE :: " + Personaje.player2.getAtq1() + " ptos.\n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 1;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 1;
                            break;
                        }
                        case 2: {
                            //Resta

                            a = (int) Math.floor(Math.random() * (25 - 5 + 1) + 5);
                            b = (int) Math.floor(Math.random() * (25 - 5 + 1) + 5);
                            c = a - b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " - " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player2.setAtq1((int) Math.floor(Math.random() * (45 - 40 + 1) + 40)); //Ataque entre 40 y 45 puntos
                                Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq1());
                                System.out.println(Personaje.player2.getNombre() + " ::¡EN EL BLANCO!\n DAÑO DE ATAQUE :: " + Personaje.player2.getAtq1() + " ptos.\n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 1;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 1;
                            break;
                        }
                        case 3: {
                            //Multiplicacion

                            a = (int) Math.floor(Math.random() * (5 - 2 + 1) + 2);
                            b = (int) Math.floor(Math.random() * (5 - 2 + 1) + 2);
                            c = a * b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " * " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player2.setAtq1((int) Math.floor(Math.random() * (45 - 40 + 1) + 40)); //Ataque entre 40 y 45 puntos
                                Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq1());
                                System.out.println(Personaje.player2.getNombre() + " ::¡LE HAS DADO!\n DAÑO DE ATAQUE :: " + Personaje.player2.getAtq1() + " ptos.\n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 1;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 1;
                            break;
                        }
                        case 4: {
                            //Division
                            a = 1;
                            b = 1;
                            while (a % b != 0 || a == b) {
                                a = (int) Math.floor(Math.random() * (20 - 2 + 1) + 2);
                                b = (int) Math.floor(Math.random() * (9 - 2 + 1) + 2);
                            }
                            c = a / b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " / " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player2.setAtq1((int) Math.floor(Math.random() * (45 - 40 + 1) + 40)); //Ataque entre 40 y 45 puntos
                                Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq1());
                                System.out.println(Personaje.player2.getNombre() + " ::¡BIEN!\n DAÑO DE ATAQUE :: " + Personaje.player2.getAtq1() + " ptos. \n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 1;

                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 1;
                            break;
                        }
                        default:
                            break;
                    }
                    break;

                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                               
                case 2:
                    switch (operacion) {
                        case 1: {
                            //Suma

                            a = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            b = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            c = a + b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " + " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player2.setAtq2((int) Math.floor(Math.random() * (55 - 45 + 1) + 45)); //Ataque entre 40 y 45 puntos
                                Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq2());
                                System.out.println(Personaje.player2.getNombre() + " ::¡SORPRESA!\n DAÑO DE ATAQUE :: " + Personaje.player2.getAtq2() + " ptos.\n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 1;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 1;
                            break;
                        }
                        case 2: {
                            //Resta

                            a = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            b = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            c = a - b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " - " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player2.setAtq2((int) Math.floor(Math.random() * (55 - 45 + 1) + 45)); //Ataque entre 40 y 45 puntos
                                Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq2());
                                System.out.println(Personaje.player2.getNombre() + " ::¡NO LO VIO VENIR!\n DAÑO DE ATAQUE :: " + Personaje.player2.getAtq2() + " ptos. \n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 1;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 1;
                            break;
                        }
                        case 3: {
                            //Multiplicacion

                            a = (int) Math.floor(Math.random() * (9 - 3 + 1) + 3);
                            b = (int) Math.floor(Math.random() * (9 - 3 + 1) + 3);
                            c = a * b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " * " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player2.setAtq2((int) Math.floor(Math.random() * (55 - 45 + 1) + 45)); //Ataque entre 40 y 45 puntos
                                Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq2());
                                System.out.println(Personaje.player2.getNombre() + " ::¡EXCELENTE GOLPE!\n DAÑO DE ATAQUE :: " + Personaje.player2.getAtq2() + " ptos. \n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 1;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 1;
                            break;
                        }
                        case 4: {
                            //Division
                            a = 1;
                            b = 1;
                            while (a % b != 0 || a == b) {
                                a = (int) Math.floor(Math.random() * (50 - 20 + 1) + 20);
                                b = (int) Math.floor(Math.random() * (9 - 2 + 1) + 2);
                            }
                            c = a / b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " / " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player2.setAtq2((int) Math.floor(Math.random() * (55 - 45 + 1) + 45)); //Ataque entre 40 y 45 puntos
                                Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq2());
                                System.out.println(Personaje.player2.getNombre() + " ::¡MUY BIEN!\n DAÑO DE ATAQUE :: " + Personaje.player2.getAtq2() + " ptos.\n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 1;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 1;
                            break;
                        }
                        default:
                            break;
                    }
                    break;

                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 3:
                    switch (operacion) {
                        case 1: {
                            //Suma

                            a = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            b = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            t = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            c = a + b + t;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " + " + b + " + " + t);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player2.setAtq3((int) Math.floor(Math.random() * (75 - 55 + 1) + 55)); //Ataque entre 40 y 45 puntos
                                Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq3());
                                System.out.println(Personaje.player2.getNombre() + " ::ESO VA A DOLER MAÑANA...!\n DAÑO DE ATAQUE :: " + Personaje.player2.getAtq3() + " ptos. \n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 1;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 1;
                            break;
                        }
                        case 2: {
                            //Resta

                            a = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            b = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            t = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            c = a - b - t;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " - " + b + " - " + t);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player2.setAtq3((int) Math.floor(Math.random() * (75 - 55 + 1) + 55)); //Ataque entre 40 y 45 puntos
                                Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq3());
                                System.out.println(Personaje.player2.getNombre() + " ::¡GOLPE DURO!\n DAÑO DE ATAQUE :: " + Personaje.player2.getAtq3() + " ptos.\n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 1;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 1;
                            break;
                        }
                        case 3: {
                            //Multiplicacion

                            a = (int) Math.floor(Math.random() * (9 - 5 + 1) + 5);
                            b = (int) Math.floor(Math.random() * (12 - 5 + 1) + 5);
                            c = a * b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " * " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player2.setAtq3((int) Math.floor(Math.random() * (75 - 55 + 1) + 55)); //Ataque entre 40 y 45 puntos
                                Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq3());
                                System.out.println(Personaje.player2.getNombre() + " ::¡GOLPE CRÍTICO!\n DAÑO DE ATAQUE :: " + Personaje.player2.getAtq3() + " ptos. \n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 1;
                            } else {
                                System.out.println("Respuesta incorrecta. Atque fallido");
                            }

                            turno = 1;
                            break;
                        }
                        case 4: {
                            //Division
                            a = 1;
                            b = 1;
                            while (a % b != 0 || a == b) {
                                a = (int) Math.floor(Math.random() * (100 - 30 + 1) + 30);
                                b = (int) Math.floor(Math.random() * (9 - 3 + 1) + 3);
                            }
                            c = a / b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " / " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player2.setAtq3((int) Math.floor(Math.random() * (75 - 55 + 1) + 55)); //Ataque entre 40 y 45 puntos
                                Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq3());
                                System.out.println(Personaje.player2.getNombre() + " ::¡A DOMIR!\n DAÑO DE ATAQUE :: " + Personaje.player2.getAtq3() + " ptos. \n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 1;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 1;
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                default:
                    System.out.println("\n \n ....¡¡Selecciona una opción valida 3!!....\n \n");
                    break;
            }

        } while (exit != 0);
    }

    public static void Atacar1() {

        //Ataca el player 1
        int exit = 0;
        do {

            System.out.println("Selecciona el tipo de ataque: ");
            System.out.println("1. Ataque basico 1");
            System.out.println("2. Ataque basico 2");
            System.out.println("3. Ataque Super ");
            System.out.println("0. Atras");

            Scanner sc3 = new Scanner(System.in);
            int response = 0;
            try {
                response = Integer.valueOf(sc3.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                Atacar1();
            }
            int operacion = 0;

            switch (player2.getModo()) {
                case 1:
                    operacion = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);//random entre 1 y 4   PRUEBA SERGIO
                    break;
                case 2:
                    operacion = 1;
                    break;
                case 3:
                    operacion = 2;
                    break;
                case 4:
                    operacion = 3;
                    break;
                case 5:
                    operacion = 4;
                    break;
            }

            switch (response) {
                case 0:	//salir	
                    exit = 0;
                    break;
                case 1:
                    switch (operacion) {
                        case 1: {
                            //Suma
                            a = (int) Math.floor(Math.random() * (25 - 5 + 1) + 5);
                            b = (int) Math.floor(Math.random() * (25 - 5 + 1) + 5);
                            c = a + b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " + " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player1.setAtq1((int) Math.floor(Math.random() * (45 - 40 + 1) + 40)); //Ataque entre 40 y 45 puntos
                                Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq1());
                                System.out.println(Personaje.player1.getNombre() + " ::¡MUY BIEN!\n DAÑO DE ATAQUE :: " + Personaje.player1.getAtq1() + " ptos. \n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 0;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 0;
                            break;
                        }
                        case 2: {
                            //Resta
                            a = (int) Math.floor(Math.random() * (25 - 5 + 1) + 5);
                            b = (int) Math.floor(Math.random() * (25 - 5 + 1) + 5);
                            c = a - b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " - " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player1.setAtq1((int) Math.floor(Math.random() * (45 - 40 + 1) + 40)); //Ataque entre 40 y 45 puntos
                                Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq1());
                                System.out.println(Personaje.player1.getNombre() + " ::¡CERTERO!\n DAÑO DE ATAQUE :: " + Personaje.player1.getAtq1() + " ptos. \n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 0;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 0;
                            break;
                        }
                        case 3: {
                            //Multiplicacion
                            a = (int) Math.floor(Math.random() * (5 - 2 + 1) + 2);
                            b = (int) Math.floor(Math.random() * (5 - 2 + 1) + 2);
                            c = a * b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " * " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player1.setAtq1((int) Math.floor(Math.random() * (45 - 40 + 1) + 40)); //Ataque entre 40 y 45 puntos
                                Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq1());
                                System.out.println(Personaje.player1.getNombre() + " ::¡EN EL BLANCO!\n DAÑO DE ATAQUE :: " + Personaje.player1.getAtq1() + " ptos. \n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 0;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 0;
                            break;
                        }
                        case 4: {
                            //Division
                            a = 1;
                            b = 1;
                            while (a % b != 0 || a == b) {
                                a = (int) Math.floor(Math.random() * (20 - 2 + 1) + 2);
                                b = (int) Math.floor(Math.random() * (9 - 2 + 1) + 2);
                            }
                            c = a / b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " / " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player1.setAtq1((int) Math.floor(Math.random() * (45 - 40 + 1) + 40)); //Ataque entre 40 y 45 puntos
                                Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq1());
                                System.out.println(Personaje.player1.getNombre() + " ::¡BUEN GOLPE!\n DAÑO DE ATAQUE :: " + Personaje.player1.getAtq1() + " ptos. \n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 0;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 0;
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                case 2:
                    switch (operacion) {
                        case 1: {
                            //Suma

                            a = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            b = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            c = a + b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " + " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player1.setAtq2((int) Math.floor(Math.random() * (55 - 45 + 1) + 45)); //Ataque entre 40 y 45 puntos
                                Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq2());
                                System.out.println(Personaje.player1.getNombre() + " ::¡CERTERO!\n DAÑO DE ATAQUE :: " + Personaje.player1.getAtq2() + " ptos. \n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 0;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 0;
                            break;
                        }
                        case 2: {
                            //Resta

                            a = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            b = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            c = a - b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " - " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player1.setAtq2((int) Math.floor(Math.random() * (55 - 45 + 1) + 45)); //Ataque entre 40 y 45 puntos
                                Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq2());
                                System.out.println(Personaje.player1.getNombre() + " ::¡GRAN GOLPE!\n DAÑO DE ATAQUE :: " + Personaje.player1.getAtq2() + " ptos. \n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 0;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 0;
                            break;
                        }
                        case 3: {
                            //Multiplicacion

                            a = (int) Math.floor(Math.random() * (9 - 3 + 1) + 3);
                            b = (int) Math.floor(Math.random() * (9 - 3 + 1) + 3);
                            c = a * b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " * " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player1.setAtq2((int) Math.floor(Math.random() * (55 - 45 + 1) + 45)); //Ataque entre 40 y 45 puntos
                                Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq2());
                                System.out.println(Personaje.player1.getNombre() + " ::¡EXCELENTE!\n DAÑO DE ATAQUE :: " + Personaje.player1.getAtq2() + " ptos. \n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 0;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 0;
                            break;
                        }
                        case 4: {
                            //Division

                            a = 1;
                            b = 1;
                            while (a % b != 0 || a == b) {
                                a = (int) Math.floor(Math.random() * (50 - 20 + 1) + 20);
                                b = (int) Math.floor(Math.random() * (9 - 2 + 1) + 2);
                            }
                            c = a / b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " / " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }
                            if (res == c) {
                                Personaje.player1.setAtq2((int) Math.floor(Math.random() * (55 - 45 + 1) + 45)); //Ataque entre 40 y 45 puntos
                                Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq2());
                                System.out.println(Personaje.player1.getNombre() + " ::¡MUY BIEN!\n DAÑO DE ATAQUE :: " + Personaje.player1.getAtq2() + " ptos. \n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 0;
                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 0;
                            break;
                        }
                        default:
                            break;
                    }
                    break;

                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                                
                case 3:
                    switch (operacion) {
                        case 1: {
                            //Suma

                            a = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            b = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            t = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            c = a + b + t;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " + " + b + " + " + t);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player1.setAtq3((int) Math.floor(Math.random() * (75 - 55 + 1) + 55)); //Ataque entre 40 y 45 puntos
                                Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq3());
                                System.out.println(Personaje.player1.getNombre() + " ::¡GOLPE CRÍTICO!\n DAÑO DE ATAQUE :: " + Personaje.player1.getAtq3() + " ptos.\n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 0;

                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 0;
                            break;
                        }
                        case 2: {
                            //Resta

                            a = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            b = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            b = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);
                            c = a - b - t;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " - " + b + " - " + t);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player1.setAtq3((int) Math.floor(Math.random() * (75 - 55 + 1) + 55)); //Ataque entre 40 y 45 puntos
                                Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq3());
                                System.out.println(Personaje.player1.getNombre() + " ::¡SIN ESCAPATORIA!\n DAÑO DE ATAQUE :: " + Personaje.player1.getAtq3() + " ptos.\n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 0;

                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 0;
                            break;
                        }
                        case 3: {
                            //Multiplicacion

                            a = (int) Math.floor(Math.random() * (9 - 3 + 1) + 3);
                            b = (int) Math.floor(Math.random() * (12 - 3 + 1) + 3);
                            c = a * b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " * " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player1.setAtq3((int) Math.floor(Math.random() * (75 - 55 + 1) + 55)); //Ataque entre 40 y 45 puntos
                                Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq3());
                                System.out.println(Personaje.player1.getNombre() + " ::ESO DEBIÓ DOLER...\n DAÑO DE ATAQUE :: " + Personaje.player1.getAtq3() + " ptos. \n");
                                turno = 0;

                            } else {
                                System.out.println("Respuesta incorrecta. Ataque fallido");
                            }

                            turno = 0;
                            break;
                        }
                        case 4: {
                            //Division

                            a = 1;
                            b = 1;
                            while (a % b != 0 || a == b) {
                                a = (int) Math.floor(Math.random() * (100 - 30 + 1) + 30);
                                b = (int) Math.floor(Math.random() * (9 - 3 + 1) + 3);
                            }
                            c = a / b;

                            int i = 1;
                            int res = 0;

                            while (i == 1) {
                                i = 0;
                                resp = JOptionPane.showInputDialog("RESPONDA \n" + a + " / " + b);
                                try {
                                    res = Integer.parseInt(resp.trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("No ha ingresado una opción correcta. Intente nuevamente.");
                                    i = 1;
                                }
                            }

                            if (res == c) {
                                Personaje.player1.setAtq3((int) Math.floor(Math.random() * (75 - 55 + 1) + 55)); //Ataque entre 40 y 45 puntos
                                Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq3());
                                System.out.println(Personaje.player1.getNombre() + " ::¡KNOCKED DOWN!\n DAÑO DE ATAQUE :: " + Personaje.player1.getAtq3() + " ptos.\n");
                                System.out.println("PLAYER 1: [" + Personaje.player1.getNombre() + "] VIDA: [" + Personaje.player1.getVida() + "] ___________PLAYER 2: [" + Personaje.player2.getNombre() + "] VIDA: [" + Personaje.player2.getVida() + "]");
                                turno = 0;

                            } else {
                                System.out.println("Respuesta incorrecta");
                            }

                            turno = 0;
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                default:
                    System.out.println("\n \n ....¡¡Selecciona una opción valida 3!!....\n \n");
                    break;

            }

        } while (exit != 0);
    }
}
	
