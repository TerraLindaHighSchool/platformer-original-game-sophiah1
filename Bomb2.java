import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 public class Bomb2 extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;
    
     public Bomb2(float gravity)
    {
        GRAVITY = gravity;
    }
    public void act()
    {

    }
    //Causes the object to fall unto a platform below
    protected void fall()
    { 
    if(!isOnGround())
    {
    yVelocity+= GRAVITY;
    setLocation(getX(), getY()+ (int) yVelocity);
    }
    }
}
