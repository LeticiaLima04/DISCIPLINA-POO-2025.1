package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o peso da pessoa em quilos (kg): ");
        double pesoKg = scanner.nextDouble();

        
        double pesoGramas = pesoKg * 1000;

        
        System.out.println("O peso em gramas é: " + pesoGramas);

        
    }
}
