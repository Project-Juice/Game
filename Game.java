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
public class Game {
    public static final int SIZE = 10;
    private final Player[][] board = new Player[SIZE][SIZE];
  
    public Player[][] getBoard() {
        return board;
    }
    
    public void set(Player player, Point point) {
        board[point.getX()][point.getY()] = player;
    }
    
    public void set(Player player, int x, int y) {
        board[x][y] = player;
    }
    
    public Player get(Point point){
        return board[point.getX()][point.getY()];
    }
    
    public Player nextPlayer() {
        int player1 = 0;
        int player2 = 0;
        for(int x = 0; x < SIZE; x++) {
            for(int y = 0; y <SIZE; y++) {
                if (board[x][y] == Player.PLAYER1) {
                    player1++;
                }
                if (board[x][y] == Player.PLAYER2) {
                           player2++;
                       }
            }
        }
        return player1 == player2 ? Player.PLAYER1 : Player.PLAYER2;
    }
    public Player getWinner() {
        return null;
    }


}
