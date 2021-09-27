import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrapDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrapDoor extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;


    public TrapDoor(float gravity)
    {
        GRAVITY = gravity;
    }
    
    public void act()
    {

    }
    //causes an object to fall in the foreground and out the bottom

    protected void fall()
    { 
        yVelocity+=GRAVITY;
        setLocation(getX(), getY() +(int) yVelocity);
        removeOutOfBounds(this);
    }
        
    
     




}





