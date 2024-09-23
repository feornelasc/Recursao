package recursivefactorial;

public class RecursiveFactorial {

    public static int recursiveFactorial(int n) {
        if (n == 0) return 1;
        return n * recursiveFactorial(n - 1);
    }

    public static int soma(int n) {
        if (n == 0) return 0;
        return n + soma(n - 1);
    }

    public static void testes() {
        int[] testCases = {0, 1, 5, 10};

        for (int n : testCases) {
            int somaResultado = soma(n);
            int fatorialResultado = recursiveFactorial(n);

            System.out.println("Testando n = " + n + ":");
            System.out.println("Soma dos primeiros " + n + " números naturais: " + somaResultado);
            System.out.println("Fatorial de " + n + ": " + fatorialResultado);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        testes();
    }
}
