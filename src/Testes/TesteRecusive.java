package Testes;

import recursivefactorial.RecursiveFactorial;

public class TesteRecusive {
    public static void main(String[] args) {
        testarFatorial(0, 1);  
        testarFatorial(1, 1); 
        testarFatorial(2, 2);  
        testarFatorial(3, 6);  
        testarFatorial(4, 24); 
        testarFatorial(5, 120); 
        testarFatorial(6, 720); 
        testarFatorial(10, 3628800);
    }

    private static void testarFatorial(int n, int esperado) {
        int resultado = RecursiveFactorial.recursiveFactorial(n);
        if (resultado == esperado) {
            System.out.println( n + "! = " + esperado);
        } else {
            System.out.println("Teste falhou para " + n + "! Esperado " + esperado + " mas obteve " + resultado);
        }
    }
}


