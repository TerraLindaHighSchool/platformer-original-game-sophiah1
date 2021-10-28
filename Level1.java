import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.0467f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level2.class;  
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
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, 
                MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player,32,742);
        door.setLocation(1163,44);
        addObject(new Floor(), 600, 800);
        addObject(new BrickWall(), 50, 575);
        addObject(new SmBrickWall(), 500, 575);
        addObject(new BrickWall(), 1000, 575);
        addObject(new BrickWall(),500, 390);
        addObject(new SmBrickWall(), 1000,390 );
        addObject(new Bomb2(GRAVITY), 1039,352);
        addObject(new BrickWall(),1220,105);
        addObject(new Bomb2(GRAVITY),550, 770);
        addObject(new BrickWall(),50, 250);
        addObject(new BrickWall(), 600, 150);
        addObject(new Bomb2(GRAVITY), 200, 533);
        addObject(new Bomb2(GRAVITY), 650,110);
        addObject(new TrapDoor(GRAVITY), 50, 250);
        addObject(new TrapDoor(GRAVITY), 500,390);
        addObject(new TrapDoor(GRAVITY), 500,575);
        addObject(new Gem(), 600,780);
        addObject(new Gem(), 602,355);
        addObject(new Gem(), 152,218);
        addObject(new Gem(), 1030,72);
        addObject(new Gem(), 85,538);
        addObject(new Gem(), 900,540);
    }
     
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        } 
  
    }
    
}   
