/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.modelo.Televisao;
import java.util.Scanner;

/**
 *
 * @author kaua.1880
 */
public class VisaoTelevisao {

    public static Televisao menuCadrastoTelevisao() {
        Televisao televisao = new Televisao();

        System.out.println("Nome: ");
        televisao.setNome(new Scanner(System.in).nextLine());
        System.out.println("Preço: ");
        televisao.setPreco(new Scanner(System.in).nextDouble());
        System.out.println("marca: ");
        televisao.setMarca(new Scanner(System.in).nextLine());
        System.out.println("polegadas: ");
        televisao.setPolegada(new Scanner(System.in).nextLine());
        System.out.println("===============================================");
        return televisao;

    }
}
