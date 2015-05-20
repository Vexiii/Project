
package pkg2dz;

import math.geom2d.*;

public class Zombie {
    
private int health;
private int x;
private int y;
private Player n;

    public Zombie(Player k){
        n = k;
        //set spawn
        int r = (int) (Math.random() * 4);
        //determine spawn location
        if(r == 0){x = 0; y = 0;}
        else if(r == 1){x = 0; y = 800;}
        else if(r == 2){x = 1200; y = 0;}
        else if(r == 3){x = 1200; y = 800;}
    }
    
    public void damage(int n){
        health -= n;
    }
    
    public void move(){
        int px = n.getxPos();
        int py = n.getyPos();
        //move in this direction
        int slope = (int)((py - y)/(px - x));
        
    }
    
    public int getHealth(){
        return health;
    }
    
    public void checkBullet(){
        //traverse bullet list
    }
}

