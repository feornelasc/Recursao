package recursivefactorial;

public class SomaNumerosNaturais {
    public static int soma(int n) {
        if (n == 0) {
            return 0;
        }
        return n + soma(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; //
        int resultado = soma(n);
        System.out.println("A soma dos primeiros " + n + " números naturais é: " + resultado);
    }
}

