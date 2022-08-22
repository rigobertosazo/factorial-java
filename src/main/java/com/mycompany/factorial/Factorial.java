package com.mycompany.factorial;
import java.util.Scanner;
/**
 * @author Rigoberto Sazo
 */
public class Factorial 
{
    public static void main(String[] args) 
    {
        int num,fact;
        fact=1;
        Scanner s = new Scanner(System.in);
        System.out.println("**Programa que calcula el factorial de un numero Entero**\n");
        System.out.println("Ingrese el primer número: ");
        num=s.nextInt();
            for(int i = 1;i<=num; i++)
            {fact=fact*i;}
        System.out.println("El factorial del numero ingresado es: " +fact);   
    }
}
