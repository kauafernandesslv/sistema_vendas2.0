/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;
import java.util.Scanner;
import com.mycompany.modelo.Videogame;

/**
 *
 * @author kaua.1880
 */
public class VisaoVideogame {
    public static Videogame menuCadrastroVideogame(){
        Videogame videogame = new Videogame();
    System.out.println("Nome:");
    videogame.setNome( new Scanner(System.in) .nextLine());
    System.out.println("Preço:");
    videogame.setPreco( new Scanner(System.in) .nextDouble());
    videogame.setPlataforma(new Scanner(System.in).nextLine());
    System.out.println("===========================================");
    
    return videogame;
    
    }
}