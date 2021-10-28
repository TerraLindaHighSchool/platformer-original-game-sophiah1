import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private final float GRAVITY = 0.08f;
    private final GreenfootSound MUSIC = new GreenfootSound("incompetech_tribal.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level3.class;  
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
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
        addObject(new BrickWall(), -65,578);
        addObject(new Cop(GRAVITY), 537,387);
        addObject(new BrickWall(),1220,105);
        addObject(new Cop(GRAVITY),550, 770);
        addObject(new BrickWall(), 370,152);
        addObject(new Cop(GRAVITY),259,99);
        addObject(new Cop(GRAVITY), 515,100);
        addObject(new TrapDoor(GRAVITY), 50, 250);
        addObject(new TrapDoor(GRAVITY), 500,575);
        addObject(new Gem(), 600,780);
        addObject(new Gem(), 344,116);
        addObject(new Gem(), 53,218);
        addObject(new Gem(), 1030,72);
        addObject(new Gem(), 85,538);
        addObject(new Gem(), 494,540);
        addObject(new Gem(), 444,111);
        addObject(new Gem(), 844,344);
        addObject(new SmBrickWall(),534,443 );
        addObject(new SmBrickWall(),667,390);
        addObject(new TrapDoor(GRAVITY), 374,513);
        addObject(new Gem(), 371,465);
        addObject(new SmBrickWall(),379,352);
        addObject(new SmBrickWall(),262,457);
        addObject(new SmBrickWall(),667,390);
        addObject(new SmBrickWall(),704,246);
        addObject(new SmBrickWall(),916,145);   
        addObject(new TrapDoor(GRAVITY),136,312);     
    }

    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        } 
  
    }
    
}   
