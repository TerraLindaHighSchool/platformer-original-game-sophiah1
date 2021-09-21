import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collecteble.class,
            Door.class, HUD.class);
        Door door = new Door();
        addObject(door,815,43);
        Player player = new Player();
        addObject(player,32,742);
        door.setLocation(1163,44);
        addObject(new Floor(), 600, 800);
        addObject(new BrickWall(), 50, 575);
        addObject(new SmBrickWall(), 500, 575);
        addObject(new BrickWall(), 1000, 575);
        addObject(new BrickWall(),500, 390);
        addObject(new SmBrickWall(), 1000,390 );
        addObject(new Bomb(), 1039,352);
        addObject(new BrickWall(),1220,105);
        addObject(new Bomb(),550, 770);
        addObject(new BrickWall(),50, 250);
        addObject(new BrickWall(), 600, 150);
        addObject(new Bomb(), 200, 533);
        addObject(new Bomb(), 650,110);
    }
}
