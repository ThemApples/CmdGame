/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.autochess;

/**
 *
 * @author jimmy
 */
public class Character {
    
    public String name;
    public int atk;
    public int def;
    public String vehicle;
    
    public Character(String n, int a, int d,String v){
        this.name=n;
        this.atk=a;
        this.def=d;
        this.vehicle=v;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAtk(){
        return atk;
    }
    
    public int getDef(){
        return def;
    }
    
    public String getVeh(){
        return vehicle;
    }
    
    @Override
    public String toString(){
        return "Name:" + name+" Attack: " + atk + "Defence: " + def;
    }
}
