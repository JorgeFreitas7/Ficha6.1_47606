package org.example;
public class Numero {

    public double mediaDosDigitos(int numero) {
        int soma = 0;
        int count = 0;
        int n = Math.abs(numero);

        while (n > 0) {
            int digito = n % 10;
            soma += digito;
            count++;
            n /= 10;
        }


        if (count == 0) {
            count = 1;
            soma = 0;
        }


        return (double) soma / count;
    }
}
