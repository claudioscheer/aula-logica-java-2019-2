
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lettuce
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner lerValores = new Scanner(System.in);

        System.out.print("Número 1: ");
        int numero1 = lerValores.nextInt();

        System.out.print("Número 2: ");
        int numero2 = lerValores.nextInt();

        int resultado = numero1 + numero2;
        System.out.println("Resultado: " + resultado);
    }
}
