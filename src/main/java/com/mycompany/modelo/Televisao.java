/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;



/**
 *
 * @author kaua.1880
 */
public class Televisao extends Produto {
    private String Marca;
    private String Polegada;

    public Televisao() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getPolegada() {
        return Polegada;
    }

    public void setPolegada(String Polegada) {
        this.Polegada = Polegada;
    }
   
    @Override
    public String toString() {
        return "Nome: " + super.getNome() +
               " | preço: " + super.getPreco() +
               " | marca: " + this.Marca +
               " | polegada:" +this.Polegada ;
    }
    }



