package br.com.jaklyra;

public class Main {


    public static void main(String[] args){

        int i1 = 10;
        int i2 = 20;

        float f1 = 4.5f;
        float f2 = 3.5f;

        double d1 = 59.6d;

        char c1 = 'X';
        char c2 = 'Y';

        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";

        Boolean b1 = true;
        Boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;

        byte by1 = 1;

        short h1 = 25;

        //INT
        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + ( i1 <= i2));

        //FLOAT
        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 >= f2 " + (f1 > f2));
        System.out.println("f1 < f2 " +  (f1 <= f2));

        //CHAR
        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + ( c1 <= c2));

        //STRING
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3" + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 != s2));

        //System.out.println("s1 >= s2 " + (s1 >= s2)); Não é permitido
        //System.out.println("s1 < s2 " + (s1 < s2)); Não é permitido

        //BOOLEANO
        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        //System.out.println(b1 > b2); Não é permitido
        //System.out.println(b1 <= b2); Não é permitido

        //LONG E FLOAT - EMBORA OS TIPO SEJA DIFERENTE, OS DADOS SÃO NÚMEROS E PODEM SER COMPARADOS
        System.out.println("l1 > f1 " + (l1 == f1));
        System.out.println("d1 == h1 " + (d1 != h1));
        //System.out.println("s2 != c1 " + (s2 != c1)); Não é permitido
        //System.out.println("s3 != i1 " + (s3 != i1)); Não é permitido

        //LONG
        System.out.println("l1 == l2 " + (l1 == l2));
        System.out.println("l2 >= l1" + (l1 != l2));

        //BYTE E SHORT
        System.out.println("by1 != h1 " + (by1 <= h1));
    }
}
