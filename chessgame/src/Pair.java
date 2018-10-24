package chessgame.src;

/**
 *a class to store the x annd y coordinates of the elements on the chess board
 *@author shubhamtewari
 */
 class Pair {

   private int xcoor;//x coordinate
   private int ycoor;//y coordinate

   //setter and getter functions >>>>
   void setX(int x) {
     xcoor = x;
   }

   void setY(int y) {
     ycoor = y;
   }

   int getX() {
     return xcoor;
   }

   int getY() {
     return ycoor;
   }
   //<<<<setter and getter functions end

 }
