import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShapeFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShapeFactory extends Actor
{
    //use getShape method to get object of type shape 
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("WALL")){  
         return new Wall();
         
      } else if(shapeType.equalsIgnoreCase("GROUND")){
         return new Ground();
         
      } else if(shapeType.equalsIgnoreCase("THORND")){
         return new ThornD();
         
      } else if(shapeType.equalsIgnoreCase("THORNL")){
         return new ThornL();
         
      } else if(shapeType.equalsIgnoreCase("THORNT")){
         return new ThornT(); 
         
      } else if(shapeType.equalsIgnoreCase("THORNR")){
         return new ThornR();
         
      } else if(shapeType.equalsIgnoreCase("MOVET")){
          return new MoveT();
      }
      
      return null;
   }    
}
