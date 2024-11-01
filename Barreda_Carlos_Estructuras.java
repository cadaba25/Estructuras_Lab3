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
        
        // Contadores para cada opción
        int contadorPalabraAlrevez = 0;
        int contadorNumeroPerfecto = 0;
        int contadorPrimos = 0;
        int contadorVotaciones = 0;

        int opcion = 0;

        // Menú de opciones
        do {
            System.out.println("--MENU--");
            System.out.println("(1) Palabra Alrevez");
            System.out.println("(2) Numero Perfecto");
            System.out.println("(3) Primos");
            System.out.println("(4) Votaciones");
            System.out.println("(5) Salir");
            opcion = lea.nextInt();

            switch (opcion) {
                case 1:
                    // Invertir una palabra
                    String palabra;
                    String palabraInvertida = "";
                    System.out.println("Palabra Alrevez");
                    System.out.print("Ingrese una palabra: ");
                    palabra = lea.next();
                    
                    // Invertir la palabra
                    for (int i = palabra.length() - 1; i >= 0; i--) {
                        palabraInvertida += palabra.charAt(i);
                    }
                    System.out.println("La palabra invertida es: " + palabraInvertida);
                    contadorPalabraAlrevez++; // Incrementar contador
                    break; // Terminar caso

                case 2:
                    // Verificar si un número es perfecto
                    int numero;
                    int divisores = 0;

                    System.out.println("Numero Perfecto");
                    System.out.print("Ingrese un numero: ");
                    numero = lea.nextInt();
                    
                    // Calcular divisores
                    for (int i = 1; i <= numero / 2; i++) {
                        if (numero % i == 0) {
                            divisores += i;
                        }
                    }

                    // Comprobar si el número es perfecto
                    if (divisores == numero) {
                        System.out.println("El numero " + numero + " es perfecto");
                    } else {
                        System.out.println(numero + ", No es un numero perfecto");
                    }
                    contadorNumeroPerfecto++; // Incrementar contador
                    break; // Terminar caso

                case 3:
                    // Verificar si un número aleatorio es primo
                    System.out.println("Primos");
                    Random random = new Random();
                    int numeroAleatorio = random.nextInt(1000);
                    
                    boolean esPrimo = true;

                    // Comprobar si el número es primo
                    for (int i = 2; i <= Math.sqrt(numeroAleatorio); i++) {
                        if (numeroAleatorio % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    if (esPrimo && numeroAleatorio > 1) {
                        System.out.println("El numero: " + numeroAleatorio + " es primo");
                    } else {
                        System.out.println("El numero: " + numeroAleatorio + " no es primo");
                    }
                    contadorPrimos++; // Incrementar contador
                    break; // Terminar caso

                case 4:
                    // Realizar votaciones
                    int votantes;
                    int votosAzul = 0;
                    int votosRojo = 0;
                    int votosNegro = 0;
                    int votosAmarillo = 0;
                    int votosNulos = 0;

                    System.out.println("Votaciones");
                    System.out.print("Ingrese la cantidad de votantes en el pais: ");
                    votantes = lea.nextInt();
                    lea.nextLine(); // Limpiar buffer

                    // Recoger votos
                    for (int i = 0; i < votantes; i++) {
                        System.out.print("Ingrese su voto (AZUL, AMARILLO, NEGRO, ROJO): ");
                        String voto = lea.nextLine().toUpperCase();

                        switch (voto) {
                            case "AZUL":
                                votosAzul++;
                                break; // Terminar caso
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

                    // Calcular resultados de la votación
                    int totalVotos = votantes;
                    int votosValidos = totalVotos - votosNulos;

                    // Determinar el ganador
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
                        System.out.println("VOTACION FALLIDA");
                    }
                    contadorVotaciones++; // Incrementar contador
                    break; // Terminar caso

                case 5:
                    // Salir del programa
                    break; // Terminar caso

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5); // Repetir hasta seleccionar 'Salir'

        // Imprimir resultados
        System.out.println("Cantidad de veces seleccionada cada opcion:");
        System.out.println("1. Palabra Alrevez: " + contadorPalabraAlrevez);
        System.out.println("2. Numero Perfecto: " + contadorNumeroPerfecto);
        System.out.println("3. Primos: " + contadorPrimos);
        System.out.println("4. Votaciones: " + contadorVotaciones);
    }
}