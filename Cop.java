import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cop extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;
    
     public Cop(float gravity)
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
