/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.autochess;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jimmy
 */
public class Game {
    
    ArrayList<Character> c;
    ArrayList<Character> startingChoice;
    ArrayList<Character> owncharacters;
    
    Random rand;
    Scanner scan;
    
    public Game(){}
    
    public void startGame(){
        System.out.println("Game Start");
        
        c=new ArrayList<Character>();
        owncharacters = new ArrayList<Character>();
        
        rand = new Random();
        scan = new Scanner(System.in);
       
        
        generateCharacters();
        pickCharacters();
    }
     
    public void generateCharacters(){
       System.out.println("this method will generate characters");
      
       c.add(new Character("ThunderCracker",1,1,"Plane"));
       c.add(new Character("StarScream",1,1,"Plane"));
       c.add(new Character("Thrust",1,1,"Plane"));
       c.add(new Character("Cyclonus",1,1,"Plane"));
       c.add(new Character("Skywarp",1,1,"Plane"));
       c.add(new Character("Blackout",1,1,"Plane"));
       c.add(new Character("SlipStream",1,1,"Plane"));
       
    }
     
    public void pickCharacters(){
        System.out.println("this method will pick characters");
        
        int a_size = c.size();
        
        ArrayList<Character> choices = new ArrayList();
        
        for(int e = 0; e< 3;e++){
        
            for(int i = 0; i< 3;i++){
                int randomNumber = rand.nextInt(a_size);
                choices.add(c.get(randomNumber));
                c.remove(randomNumber);
             }
        
            System.out.println(choices.toString());
        
            System.out.println("Who would you like to choose?");
            System.out.println("Character: 1 , 2 or 3: ");
            int decision = scan.nextInt();
        
            owncharacters.add(choices.get(decision-1));
            printCharacters();
        }
    }
      
    public void printCharacters(){
        System.out.println("this method will generate characters");
        System.out.println(owncharacters.toString());
    }
    
     
    
}
