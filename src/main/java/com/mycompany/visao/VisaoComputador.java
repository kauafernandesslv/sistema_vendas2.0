/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.modelo.Computador;
import java.util.Scanner;

/**
 *
 * @author kaua.1880
 */
public class VisaoComputador {
    public static Computador menuCadastroComputador(){
       Computador computador = new Computador();
       
       System.out.println("Nome: ");
        System.out.println("Nome:");
    computador.setNome( new Scanner(System.in) .nextLine());
    System.out.println("Preço:");
    computador.setPreco( new Scanner(System.in) .nextDouble());
    computador.setMemoriaRam(new Scanner(System.in).nextDouble());
    computador.setProcessador(new Scanner(System.in).nextLine());
    System.out.println("===========================================");
 
    return computador;
    }
}
