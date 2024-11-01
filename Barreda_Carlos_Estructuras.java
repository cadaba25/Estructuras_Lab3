/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3_estructuras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Barreda_Carlos_Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lea = new Scanner(System.in);
        
        int opcion =0;
        System.out.println("--MENU--");
        System.out.println("(1)Palabra Alrevez");
        System.out.println("(2)Numero Perfecto");
        System.out.println("(3)Primos");
        System.out.println("(4)Votaciones");
        System.out.println("(5)Salir");
        opcion = lea.nextInt();
        
        
        switch(opcion){
            
            case 1:
                
                String palabra;
                String palabraInvertida = "";
                System.out.println("Palabra Alrevez");
                System.out.print("Ingrese una palabra: ");
                palabra = lea.next();
                
                for (int i = palabra.length() -1; i >= 0 ; i--) {
                    palabraInvertida += palabra.charAt(i);
                    
                }
                System.out.println("La palabra invertida es: " + palabraInvertida);
        
            case 2:
                
                int numero = 0;
                int Divisores = 0;
                
                
                System.out.println("Numero Perfecto");
                System.out.print("Ingrese un numero: ");
                numero = lea.nextInt();
                
                for (int i = 1; i <= numero/2 ; i++) {
                    if (numero % i == 0){
                        Divisores+= i;
                    }
                }
                
                if(Divisores == numero){
                    System.out.println("El numero " + numero + " es perfecto");
                
                }else{
                    System.out.println(numero + ",No es un numero perfecto");
                }
                
            case 3:
                
                
                System.out.println("Primos");
                Random random = new Random();
                int numeroAleatorio = random.nextInt(1000);
                
                boolean estado = true;
                
                for (int i = 2; i <= 10; i++) {
                    if(numeroAleatorio %i ==0 && numeroAleatorio != i){
                        estado = false;
                        break;
                    }
                    
                }
                if(estado && numeroAleatorio >1 ){
                    System.out.println("El numero: " + numeroAleatorio + " es primo");
                
                }else {
                    System.out.println("El numero: " + numeroAleatorio + " no es primo");
                }
                
        
            case 4:
                int votantes = 0 ;
                int votosAzul = 0;
                int votosRojo = 0;
                int votosNegro = 0;
                int votosAmarillo = 0;
                int votosNulos = 0;
                
                System.out.println("Votaciones");
                
                System.out.println("Ingrese la cantidad de votantes en el pais: ");
                votantes = lea.nextInt();
                
                for (int i = 0; i < votantes; i++) {
                    System.out.println("Ingrese su voto( AZUL,AMARILLO,NEGRO,ROJO): ");
                    String voto = lea.nextLine().toUpperCase();
                    
                    switch(voto){
                        case "AZUL":
                            votosAzul++;
                            
                        case "ROJO":
                            votosRojo++;
                            break;
                        case "NEGRO":
                            votosNegro++;
                            break;
                        case "AMARILLO":
                            votosAmarillo++;
                            break;
                            
                        default:
                            votosNulos++;
                            break;
                            
                    }
                    
                }
                
                int totalVotos = votantes;
                int votosValidos = totalVotos - votosNulos;
                
                if (votosValidos >= 0.6 * totalVotos) {
                        String ganador;
                        if (votosAzul > votosRojo && votosAzul > votosNegro && votosAzul > votosAmarillo) {
                            ganador = "AZUL";
                        } else if (votosRojo > votosAzul && votosRojo > votosNegro && votosRojo > votosAmarillo) {
                            ganador = "ROJO";
                        } else if (votosNegro > votosAzul && votosNegro > votosRojo && votosNegro > votosAmarillo) {
                            ganador = "NEGRO";
                        } else {
                            ganador = "AMARILLO";
                        }
                            System.out.println("La planilla ganadora es: " + ganador);
                } else {
                    System.out.println("VOTACIÓN FALLIDA");
                    }
                
                
                
                
                
        }
    }
    
}
