/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.threadapp;

/**
 *
 * @author abdelghani
 */
class threadtwo extends Thread {
    @Override
    public void run(){
        for(int i = 1; i < 6; i++){
            int caree = i * i;
            System.out.println("le caree de " + i + " est : " + caree);
        }  
   
}
    
class threadone extends Thread{
    @Override
    public void run(){
        for(int i = 6; i < 11; i++){
            int caree = i * i;
            System.out.println("le caree de " + i + " est : " + caree);
        }  
   
}    

public class ThreadApp {

    public static void main(String[] args)throws InterruptedException{
        
        threadone myThreaduno = new threadone();
        threadtwo myThreaddos = new threadtwo();

                
        myThreaduno.start();
        
        myThreaddos.start();
        
      
    }
        
}

