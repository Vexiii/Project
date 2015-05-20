package pkg2dz;

public class Player {
    private int score;
    private int health;
    private int x;
    private int y;
    
    
    public Player(){
        x = 600;
        y = 400;
        Gun start = new Gun(0);
    }
    
    public void move(){
        
    }
    
    public int getHealth(){
        return health;
    }

    int     getxPos()          {return x;}
    void    setxPos(int n)     {x = n;}
    int     getyPos()          {return y;}
    void    setyPos(int n)     {y = n;}
}