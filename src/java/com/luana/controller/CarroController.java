/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luana.controller;

/**
 *
 * @author laboratoriodm
 */
public class CarroController {
    private String marca;
    private String modelo;
    private int anoDeFabricação;
    private int anoModelo;
    private String observação;
    
    public void salvar(){
        System.out.println("Marca:"+this.marca+" - Modelo: "+this.modelo);
        
        
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo; 
        
    }
    public  int getAnoFabricação(){
        return anoDeFabricação;
        
    }
    public int getAnoModelo(){
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo){
        this.anoModelo = anoModelo;
    }
    public String getObsevação(){
        return observação;
    }
    public void setOservação(String observação){
        this.observação = observação;
    }
    
    
    
            }
