package org.example;

public class Perimetro {
    public int area(int base, int altura){
        return base*altura;
    }
    public int perimetro(int base, int altura){
        return (base+altura)*2;
    }
    public boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
