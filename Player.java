/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author kornelia
 */
public enum Player {

    /**
     * Znaczniki Ludzi
     */
    PLAYER1("X"),
    PLAYER2("O");
    
    private final String mark;
    private Player(String mark){
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }
    
}
