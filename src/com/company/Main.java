package com.company;
import java.util.Scanner;
import java.util.Random;
import static java.lang.StrictMath.*;
public class Main {
    static int polindrom(int n){
        int m=n;
        int p=0;
        while (n != 0) {
            p = p * 10 +n % 10 ;
            n /= 10;}
        if (m == p) {
            System.out.println("Polindrom");}
        else System.out.println("Polindrom emes");
        return m;}
    static int polindrom1(int c){
        int m=c;
        int p=0;
        while (c != 0) {
            p = p * 10 +c % 10 ;
            c /= 10;}
        if (m == p) {
            System.out.println("Polindrom");}
        else System.out.println("Polindrom emes");
        return m;}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("Polindromdyqty anyqtau");
        int x = 0;
        switch (x) {
            case 0:
                polindrom(30503);
            case 1:
                polindrom(90905);
                break;}}}