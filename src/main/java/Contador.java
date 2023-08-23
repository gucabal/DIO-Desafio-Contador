import exceptions.ParametrosInvalidosException;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int primeiroNumero = scan.nextInt();

        System.out.println("Insira o segundo número:");
        int segundoNumero = scan.nextInt();

        try {
            int numeroFinal = validaNumeros(primeiroNumero, segundoNumero);
            imprimirNumeros(numeroFinal);
        } catch (InvalidParameterException e) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }


    }

    static int validaNumeros(int numeroUm, int numeroDois) {
        if (numeroUm > numeroDois) throw new InvalidParameterException();

        int numeroFinal = numeroDois - numeroUm;
        return numeroFinal;
    }

    static void imprimirNumeros(int numeroFinal) {
        for (int i = 1; i <= numeroFinal; i++) {
            System.out.println("Imprimindo o número " + i);
        }


    }
}
