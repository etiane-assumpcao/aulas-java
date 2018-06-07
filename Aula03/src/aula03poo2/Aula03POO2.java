/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03poo2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Professor
 */
public class Aula03POO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String x, y, d;
        x = new String("Bruno");
        y = new String("Etiane");
        d = new String("Douglas");
        String h = new String("HÉLIO");
        String m = new String("Maycon");
        int n = m.indexOf('y');
        d = d.replace("glas","gras");
        System.out.println(d);
        if (d.contains("glas")) {
            System.out.println("Tem glas no Douglas");
        }
        else{
            System.out.println("Não tem!!!");
        }

        System.out.println("O y aparece na posição do indice  " + n);
        int z = x.length();
        System.out.println(y.substring(1, 3));
        System.out.println(y.toUpperCase());
        System.out.println(h.toLowerCase());

        String[] a = new String[2];
        a[0] = y;
        a[1] = x;
        System.out.println(a[0] + "  " + a[1]);

        System.out.println(x.compareTo(y));
        if (x == y) {
            System.out.println("é verdade");
        } else {
            System.out.println("Não é!");
        }
        if (x.equals(y)) {
            System.out.println("Usando equals : é verdade");
        } else {
            System.out.println("Não é!");
        }

        if (0 == x.compareTo(y)) {
            System.out.println("É igual é 0");
        } else if (x.compareTo(y) < 0) {

            System.out.println("Bruno vem antes de Etiane");
        } else {
            System.out.println("Etiane vem antes de Bruno");
        }

        /* Pessoa p = new Pessoa("Josiel",22);
        System.out.println(p.getNome());
        System.out.println(p.getIdade());*/
    }

}
