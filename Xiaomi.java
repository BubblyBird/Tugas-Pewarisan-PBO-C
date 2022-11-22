/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phoneuser;

/**
 *
 * @author LENOVO YOGA
 * Putri Aulia Hamzah
 * 21103074
 * S1SI-05-C
 */
public class Xiaomi implements Phone{
    
    private int volume;
    private boolean isPowerOn;
    
    public Xiaomi(){
        this.volume = 25;
        this.isPowerOn=true;
    }
    public void powerOn(){
        isPowerOn=true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat Datang di XIAOMI");
        System.out.println("Android Version 29");
    }
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Handphone Dimatikan");
    }
    public void volumeUp(){
        if(isPowerOn){
            if(this.volume==max_vol){
                System.out.println("Volume Full!!");
                System.out.println("sudah "+this.getVolume()+"%");
                
            }else{
                this.volume += 10;
                System.out.println("Volume Sekarang : "+this.getVolume());
            }
        }else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == min_vol) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    public int getVolume(){
        return this.volume;
    }
    
}
