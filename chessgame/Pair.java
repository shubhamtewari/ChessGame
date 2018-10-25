package chessgame.src;

/**
 *a class to store the x annd y coordinates of the elements on the chess board
 *@author shubhamtewari
 */
 public class Pair {

   private int xcoor;//x coordinate
   private int ycoor;//y coordinate

   //setter and getter functions >>>>
   public void setX(int x) {
     xcoor = x;
   }

   public void setY(int y) {
     ycoor = y;
   }

   public int getX() {
     return xcoor;
   }

   public int getY() {
     return ycoor;
   }
   //<<<<setter and getter functions end

 }
