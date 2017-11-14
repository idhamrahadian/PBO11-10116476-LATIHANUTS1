/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan1.model;

/**
 *
 * @author Idham Rahadian
 */
public class ModelMahasiswa {
    
    private String  nim;
    private String nama;
    
    public ModelMahasiswa(String nim, String nama){
        
        this.nim = nim;
        this.nama = nama;
        
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
    
}
