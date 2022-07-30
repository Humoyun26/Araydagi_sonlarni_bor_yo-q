package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(in);
        System.out.println("sonni kiritiing:  ");
int n= scanner.nextInt();
int[]ar ={6,4,7,8,32,6,7,9,12,45,31,16,49,50};
String f;
f="yo'q";
        for (int i = 0; i < 8; i++) {
            if (ar[i]==n){
                f ="bor";
                break;

            }}
            System.out.println(f);
        }
    }

