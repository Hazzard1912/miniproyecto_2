/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actores;

/**
 *
 * @author Jhonnier Hernandez
 */
public class Player {
    private String name;
    private int score;
    private int lifes;
    
    public Player(){
        name = "None";
        score = 0;
        lifes = 3;
    }
    
    public Player(String name){
        this.name = name;
        score = 0;
        lifes = 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLifes() {
        return lifes;
    }

    public void setLifes(int lifes) {
        this.lifes = lifes;
    }
    
}
