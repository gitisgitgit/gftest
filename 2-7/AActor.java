import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AActor extends Actor
{
    /**
     * Act - do whatever the AActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("down")){
           setRotation(90);
           move(1);
        }
    }    
}
