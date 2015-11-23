/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;

/**
 *
 * @author kornelia
 */
public class RandomAlgorithm implements Algorithm{
    private final Random random = new Random();

    @Override
    public Point turn(Game game, Player player) {
       Point point;
       while (true) {
           int x = random.nextInt(Game.SIZE);
           int y = random.nextInt(Game.SIZE);
           if (game.getBoard()[x][y] == null){
            point = new Point(x,y);
            break;
           }
       }
       return point;
    }
    
    
}
