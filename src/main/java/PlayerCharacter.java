/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tidal
 */
public class PlayerCharacter {
    private int health;
    private int mana;
    private int stamina;
    private String name;

    public PlayerCharacter() {
        this.health = 100;
        this.mana = 100;
        this.stamina = 100;
        this.name = ("");
    }
    
    public PlayerCharacter(int health, int mana, int stamina, String name) {
        this.health = health;
        this.mana = mana;
        this.stamina = stamina;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void enemyCallMiddle(){
    System.out.println("Enemy is coming down the middle!");
    }
    
     public void enemyCallLeft(){
    System.out.println("Enemy is Flanking Left!");
     } 
     
     public void enemyCallRight(){
     System.out.println("Enemy is Flanking Right!");
     
     }
     
}
