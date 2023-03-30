/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores 
jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo 
jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y 
recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina 
cuando el segundo jugador adivina el número o se queda sin intentos. Registra el número 
de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class Juego {

    private int num;

    public Juego() {
    }

    public Juego(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 1 : Ingrese el numero oculto");
        this.num = leer.nextInt();

        int intentos = 0;
        System.out.println("Jugador 2 : Adivine el numero oculto, recorda que solo tenes 5 intentos");
        int num2;

        do {

            num2 = leer.nextInt();
            if (num == num2) {
                System.out.println("Acertaste, el numero oculto era " + num);
            } else if (num < num2) {
                System.out.println("Es mas bajo, volve a intentar");

            } else if (num > num2) {
                System.out.println("Es mas alto, volve a intentar");

            }

            intentos++;
        } while (num != num2 && intentos < 5);

    }

}
