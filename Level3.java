import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    private final float GRAVITY = 0.0530f;
    private final GreenfootSound MUSIC = new GreenfootSound("bensound-epic.mp3");
    private final int SPEED = 2;
    private final float JUMP_FORCE = 4.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = WinSplash.class;  
   
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level3()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1, false); 
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
        addObject(player,32,665);
        door.setLocation(1163,44);
        addObject(new Floor(), 600, 700);
        addObject(new SmBrickWall(), 855,379);
        addObject(new Cop(GRAVITY),550, 770);
        addObject(new TrapDoor(GRAVITY), 1082,453);
        addObject(new Gem(), 600,780);
        addObject(new TrapDoor(GRAVITY), 714,468);
        addObject(new TrapDoor(GRAVITY), 573,578);
        addObject(new TrapDoor(GRAVITY), 466,141);
        addObject(new TrapDoor(GRAVITY), 47,584);
        addObject(new TrapDoor(GRAVITY), 854,192);
        addObject(new SmBrickWall(), 1040,279);
        addObject(new SmBrickWall(), 1138,104);
        addObject(new SmBrickWall(), 686,279);
        addObject(new SmBrickWall(), 473,379);
        addObject(new SmBrickWall(), 855,563);
        addObject(new SmBrickWall(), 308,585);
        addObject(new SmBrickWall(), 172,455);
        addObject(new SmBrickWall(), 84,220);
        addObject(new SmBrickWall(), 668,65);

    }
     
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        } 
  
    }
    
}   
