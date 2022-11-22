/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.phoneuser;

/**
 *
 * @author LENOVO YOGA
 * Putri Aulia Hamzah
 * 21103074
 * S1SI-05-C
 */
public interface Phone {
   int max_vol = 100;
   int min_vol = 0;
   
   void powerOn();
   void powerOff();
   void volumeUp();
   void volumeDown();
}
