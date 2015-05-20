
package pkg2dz;

import java.util.List;

public class Gun {
    private int damage;
    List firedBullets;
    
    public Gun(int type){
        if(type == 0){
            damage = 25;
        }
    }
    
    public void fire(){
        Bullet n = new Bullet(damage);
        
    }
    
}
