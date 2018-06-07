package juegioto_b;

import java.util.Scanner;
import static juegioto_b.Batalla.turno;
import javax.swing.JOptionPane;


/**
 *
 * @author Cristian
 */
public class RecVida extends Personaje{ 

    public RecVida(String nombre, int modo, int vida, int rVida, int atq1, int atq2, int atq3) {
        super(nombre, modo, vida, rVida, atq1, atq2, atq3);
    }   
           public static int a;
           public static int b;
           public static int c;
           public static int t;
           public static int recuperacion;
           public static String resp;
           
           // public static int operacion = (int)Math.floor(Math.random()*(4 - 1 + 1) + 1 );//random entre 1 y 4
            /*
            operaciones:
             operacion = 1 / SUMA
             operacion = 2 / RESTA
             operacion = 3 / MULTIPLICACION
             operacion = 4 / DIVICION
            */               
    
    public static void recVida1() {
            
            //recupera vida el player 1           
		
		int exit = 0;
		do {		
			
			System.out.println("RECUPERACION DE VIDA: ");
			System.out.println("1. [FACIL] Recuperacion de vida entre 20hp y 40hp");		
			System.out.println("2. [MEDIO] Recuperacion de vida entre 40hp y 60hp");
			System.out.println("3. [DIFICIL] Recuperacion de vida entre 60hp y 100hp");
			System.out.println("0. Atras");						
			
			Scanner sc3 = new Scanner(System.in);
			int response = Integer.valueOf(sc3.nextLine());	
			int operacion = 0;
                        
                        switch(player2.getModo()) {
                            case 1:
                                operacion = (int)Math.floor(Math.random()*(4 - 1 + 1) + 1 );//random entre 1 y 4   PRUEBA SERGIO
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
                            case 1:
                                {
                                    //Suma
                                    recuperacion = (int)Math.floor(Math.random()*(40 - 20 + 1) + 20 );
                                    a = (int)Math.floor(Math.random()*(25 - 5 + 1) + 5 );
                                    b = (int)Math.floor(Math.random()*(25 - 5 + 1) + 5 );
                                    c = a + b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " + " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player1.setVida(Personaje.player1.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player1.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player1.getNombre() + " :: Tiene :: " + Personaje.player1.getVida() + " :: vida");
                                    turno=0;
                                    break;
                                }
                            case 2:
                                {
                                    //Resta
                                    recuperacion = (int)Math.floor(Math.random()*(40 - 20 + 1) + 20 );
                                    a = (int)Math.floor(Math.random()*(25 - 5 + 1) + 5 );
                                    b = (int)Math.floor(Math.random()*(25 - 5 + 1) + 5 );
                                    c = a - b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " - " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player1.setVida(Personaje.player1.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player1.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player1.getNombre() + " :: Tiene :: " + Personaje.player1.getVida() + " :: vida");
                                    turno=0;
                                    break;
                                }
                            case 3:
                                {
                                    //Multiplicacion
                                    recuperacion = (int)Math.floor(Math.random()*(40 - 20 + 1) + 20 );
                                    a = (int)Math.floor(Math.random()*(5 - 2 + 1) + 2 );
                                    b = (int)Math.floor(Math.random()*(5 - 2 + 1) + 2 );
                                    c = a * b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " * " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player1.setVida(Personaje.player1.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player1.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player1.getNombre() + " :: Tiene :: " + Personaje.player1.getVida() + " :: vida");
                                    turno=0;
                                    break;
                                }
                            case 4:
                                {
                                    //Division
                                    recuperacion = (int)Math.floor(Math.random()*(40 - 20 + 1) + 20 );
                                    a = 1;
                                    b = 1;
                                    while (a % b != 0 || a == b) {
                                        a = (int) Math.floor(Math.random() * (20 - 2 + 1) + 2);
                                        b = (int) Math.floor(Math.random() * (9 - 2 + 1) + 2);
                                    }
                                    c = a / b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " / " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player1.setVida(Personaje.player1.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player1.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player1.getNombre() + " :: Tiene :: " + Personaje.player1.getVida() + " :: vida");
                                    turno=0;
                                    break;                                
                                }
                            default:
                                break;
                        }
					break;
    //-----------------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------------
                                case 2:
                        switch (operacion) {
                            case 1:
                                {
                                    //Suma
                                    recuperacion = (int)Math.floor(Math.random()*(60 - 40 + 1) + 40 );
                                    a = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    b = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    c = a + b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n" + a + " + " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player1.setVida(Personaje.player1.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player1.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player1.getNombre() + " :: Tiene :: " + Personaje.player1.getVida() + " :: vida");
                                    turno=0;
                                    break;
                                }
                            case 2:
                                {
                                    //Resta
                                    recuperacion = (int)Math.floor(Math.random()*(60 - 40 + 1) + 40 );
                                    a = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    b = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    c = a - b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n" + a + " - " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player1.setVida(Personaje.player1.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player1.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player1.getNombre() + " :: Tiene :: " + Personaje.player1.getVida() + " :: vida");
                                    turno=0;
                                    break;
                                }
                            case 3:
                                {
                                    //Multiplicacion
                                    recuperacion = (int)Math.floor(Math.random()*(60 - 40 + 1) + 40 );
                                    a = (int)Math.floor(Math.random()*(9 - 3 + 1) + 3 );
                                    b = (int)Math.floor(Math.random()*(9 - 3 + 1) + 3 );
                                    c = a * b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n" + a + " * " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player1.setVida(Personaje.player1.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player1.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player1.getNombre() + " :: Tiene :: " + Personaje.player1.getVida() + " :: vida");
                                    turno=0;
                                    break;
                                }
                            case 4:
                                {
                                    //Division
                                    recuperacion = (int)Math.floor(Math.random()*(60 - 40 + 1) + 40 );
                                    a = 1;
                                    b = 1;
                                    while (a % b != 0 || a == b) {
                                        a = (int) Math.floor(Math.random() * (50 - 20 + 1) + 20);
                                        b = (int) Math.floor(Math.random() * (9 - 2 + 1) + 2);
                                    }
                                    c = a / b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " / " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player1.setVida(Personaje.player1.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player1.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player1.getNombre() + " :: Tiene :: " + Personaje.player1.getVida() + " :: vida");
                                    turno=0;
                                    break;
                                }
                            default:
                                break;
                        }
					break;		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------------------------                                        
				case 3:
                        switch (operacion) {
                            case 1:
                                {
                                    //Suma
                                    recuperacion = (int)Math.floor(Math.random()*(100 - 60 + 1) + 60 );
                                    a = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    b = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    t = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    c = a + b + t;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " + " + b + " + " + t);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player1.setVida(Personaje.player1.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player1.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player1.getNombre() + " :: Tiene :: " + Personaje.player1.getVida() + " :: vida");
                                    turno=0;
                                    break;
                                }
                            case 2:
                                {
                                    //Resta
                                    recuperacion = (int)Math.floor(Math.random()*(100 - 60 + 1) + 60 );
                                    a = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    b = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    t = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    c = a - b - t;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " - " + b + " - " + t);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player1.setVida(Personaje.player1.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player1.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player1.getNombre() + " :: Tiene :: " + Personaje.player1.getVida() + " :: vida");
                                    turno=0;
                                    break;
                                }
                            case 3:
                                {
                                    //Multiplicacion
                                    recuperacion = (int)Math.floor(Math.random()*(100 - 60 + 1) + 60 );
                                    a = (int)Math.floor(Math.random()*(9 - 5 + 1) + 5 );
                                    b = (int)Math.floor(Math.random()*(12 - 5 + 1) + 5 );
                                    c = a * b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " * " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player1.setVida(Personaje.player1.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player1.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player1.getNombre() + " :: Tiene :: " + Personaje.player1.getVida() + " :: vida");
                                    turno=0;
                                    break;
                                }
                            case 4:
                                {
                                    //Division
                                    recuperacion = (int)Math.floor(Math.random()*(100 - 60 + 1) + 60 );
                                    a = 1;
                                    b = 1;
                                    while (a % b != 0 || a == b) {
                                        a = (int) Math.floor(Math.random() * (100 - 30 + 1) + 30);
                                        b = (int) Math.floor(Math.random() * (9 - 3 + 1) + 3);
                                    }
                                    c = a / b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " / " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player1.setVida(Personaje.player1.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player1.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player1.getNombre() + " :: Tiene :: " + Personaje.player1.getVida() + " :: vida");
                                    turno=0;
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
		}while(exit != 0); 
		
	}
    public static void recVida2(){
        //RECUPERACION DE VIDA DEL PLAYER 2
        int exit = 0;
		do {		
			
			System.out.println("RECUPERACION DE VIDA: ");
			System.out.println("1. [FACIL] Recuperacion de vida entre 20hp y 40hp");		
			System.out.println("2. [MEDIO] Recuperacion de vida entre 40hp y 60hp");
			System.out.println("3. [DIFICIL] Recuperacion de vida entre 60hp y 100hp");
			System.out.println("0. Atras");						
			
			Scanner sc3 = new Scanner(System.in);
			int response = Integer.valueOf(sc3.nextLine());	
			int operacion = 0;
                        
                        switch(player2.getModo()) {
                            case 1:
                                operacion = (int)Math.floor(Math.random()*(4 - 1 + 1) + 1 );//random entre 1 y 4   PRUEBA SERGIO
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
                            case 1:
                                {
                                    //Suma
                                    recuperacion = (int)Math.floor(Math.random()*(40 - 20 + 1) + 20 );
                                    a = (int)Math.floor(Math.random()*(25 - 5 + 1) + 5 );
                                    b = (int)Math.floor(Math.random()*(25 - 5 + 1) + 5 );
                                    c = a + b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " + " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player2.setVida(Personaje.player2.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player2.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player2.getNombre() + " :: Tiene :: " + Personaje.player2.getVida() + " :: vida");
                                    turno=1;
                                    break;
                                }
                            case 2:
                                {
                                    //Resta
                                    recuperacion = (int)Math.floor(Math.random()*(40 - 20 + 1) + 20 );
                                    a = (int)Math.floor(Math.random()*(25 - 5 + 1) + 5 );
                                    b = (int)Math.floor(Math.random()*(25 - 5 + 1) + 5 );
                                    c = a - b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " - " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player2.setVida(Personaje.player2.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player2.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player2.getNombre() + " :: Tiene :: " + Personaje.player2.getVida() + " :: vida");
                                    turno=1;
                                    break;
                                }
                            case 3:
                                {
                                    //Multiplicacion
                                    recuperacion = (int)Math.floor(Math.random()*(40 - 20 + 1) + 20 );
                                    a = (int)Math.floor(Math.random()*(5 - 2 + 1) + 2 );
                                    b = (int)Math.floor(Math.random()*(5 - 2 + 1) + 2 );
                                    c = a * b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " * " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player2.setVida(Personaje.player2.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player2.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player2.getNombre() + " :: Tiene :: " + Personaje.player2.getVida() + " :: vida");
                                    turno=1;
                                    break;
                                }
                            case 4:
                                {
                                    //Division
                                    recuperacion = (int)Math.floor(Math.random()*(40 - 20 + 1) + 20 );
                                    a = 1;
                                    b = 1;
                                    while (a % b != 0 || a == b) {
                                        a = (int) Math.floor(Math.random() * (20 - 2 + 1) + 2);
                                        b = (int) Math.floor(Math.random() * (9 - 2 + 1) + 2);
                                    }
                                    c = a / b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " / " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player2.setVida(Personaje.player2.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player2.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player2.getNombre() + " :: Tiene :: " + Personaje.player2.getVida() + " :: vida");
                                    turno=1;
                                    break;                                
                                }
                            default:
                                break;
                        }
					break;
    //-----------------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------------
                                case 2:
                        switch (operacion) {
                            case 1:
                                {
                                    //Suma
                                    recuperacion = (int)Math.floor(Math.random()*(60 - 40 + 1) + 40 );
                                    a = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    b = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    c = a + b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " + " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player2.setVida(Personaje.player2.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player2.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player2.getNombre() + " :: Tiene :: " + Personaje.player2.getVida() + " :: vida");
                                    turno=1;
                                    break;
                                }
                            case 2:
                                {
                                    //Resta
                                    recuperacion = (int)Math.floor(Math.random()*(60 - 40 + 1) + 40 );
                                    a = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    b = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    c = a - b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " - " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player2.setVida(Personaje.player2.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player2.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player2.getNombre() + " :: Tiene :: " + Personaje.player2.getVida() + " :: vida");
                                    turno=1;
                                    break;
                                }
                            case 3:
                                {
                                    //Multiplicacion
                                    recuperacion = (int)Math.floor(Math.random()*(60 - 40 + 1) + 40 );
                                    a = (int)Math.floor(Math.random()*(9 - 3 + 1) + 3 );
                                    b = (int)Math.floor(Math.random()*(9 - 3 + 1) + 3 );
                                    c = a * b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " * " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player2.setVida(Personaje.player2.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player2.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player2.getNombre() + " :: Tiene :: " + Personaje.player2.getVida() + " :: vida");
                                    turno=1;
                                    break;
                                }
                            case 4:
                                {
                                    //Division
                                    recuperacion = (int)Math.floor(Math.random()*(60 - 40 + 1) + 40 );
                                    a = 1;
                                    b = 1;
                                    while (a % b != 0 || a == b) {
                                        a = (int) Math.floor(Math.random() * (50 - 20 + 1) + 20);
                                        b = (int) Math.floor(Math.random() * (9 - 3 + 1) + 3);
                                    }
                                    c = a / b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " / " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player2.setVida(Personaje.player2.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player2.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player2.getNombre() + " :: Tiene :: " + Personaje.player2.getVida() + " :: vida");
                                    turno=1;
                                    break;
                                }
                            default:
                                break;
                        }
					break;		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------------------------                                        
				case 3:
                        switch (operacion) {
                            case 1:
                                {
                                    //Suma
                                    recuperacion = (int)Math.floor(Math.random()*(100 - 60 + 1) + 60 );
                                    a = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    b = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    t = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    c = a + b + t;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n" + a + " + " + b + " + " + t);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player2.setVida(Personaje.player2.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player2.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player2.getNombre() + " :: Tiene :: " + Personaje.player2.getVida() + " :: vida");
                                    turno=1;
                                    break;
                                }
                            case 2:
                                {
                                    //Resta
                                    recuperacion = (int)Math.floor(Math.random()*(100 - 60 + 1) + 60 );
                                    a = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    b = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    t = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10 );
                                    c = a - b - t;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n" + a + " - " + b + " - " + t);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player2.setVida(Personaje.player2.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player2.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player2.getNombre() + " :: Tiene :: " + Personaje.player2.getVida() + " :: vida");
                                    turno=1;
                                    break;
                                }
                            case 3:
                                {
                                    //Multiplicacion
                                    recuperacion = (int)Math.floor(Math.random()*(100 - 60 + 1) + 60 );
                                    a = (int)Math.floor(Math.random()*(9 - 5 + 1) + 5 );
                                    b = (int)Math.floor(Math.random()*(12 - 5 + 1) + 5 );
                                    c = a * b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " * " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player2.setVida(Personaje.player2.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player2.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player2.getNombre() + " :: Tiene :: " + Personaje.player2.getVida() + " :: vida");
                                    turno=1;
                                    break;
                                }
                            case 4:
                                {
                                    //Division
                                    recuperacion = (int)Math.floor(Math.random()*(100 - 60 + 1) + 60 );
                                    a = 1;
                                    b = 1;
                                    while (a % b != 0 || a == b) {
                                        a = (int) Math.floor(Math.random() * (100 - 30 + 1) + 30);
                                        b = (int) Math.floor(Math.random() * (9 - 2 + 1) + 2);
                                    }
                                    c = a / b;
                                    resp = JOptionPane.showInputDialog ("RESPONDA \n"+ a + " / " + b);
                                    int res = Integer.parseInt (resp.trim());
                                    if (res == c){
                                        Personaje.player2.setVida(Personaje.player2.getVida() + recuperacion); //Recipera vida entre 20 y 40 hp.
                                        System.out.println( Personaje.player2.getNombre() + " :: RECUPERO :: " + recuperacion + " ::");
                                    }else    
                                        System.out.println("Respuesta incorrecta");
                                    System.out.println(Personaje.player2.getNombre() + " :: Tiene :: " + Personaje.player2.getVida() + " :: vida");
                                    turno=1;
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
		}while(exit != 0); 
		
        
    }
    
}