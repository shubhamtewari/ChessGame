package chessgame.src;

/**
 *this interface defines a general chess piece
 *each and every game piece implements this interface
 *@author shubhamtewari
 */
interface GamePiece {

  /**
   *gets the x and y positions of the piece
   *@return a pair object with the x and y positions
   */
   Pair getCoordinates();

   /**
    *move the piece to the new x and y
    *@param coor Pair class object storing the destination x and y
    *@return true for sucessful move
    */
    boolean movePiece(Pair coor);

    /**
     *checks if the move path is valid
     *@param coor Pair object storing the destination x and y coordinates
     *@return true if valid path
     */
     boolean isValidPath(Pair coor);

     /**
      *remove piece from board
      */
      void destroy();

      /**
       *overloaded destroy function, to destroy some other piece
       *@param p Piece interface reference that is to be estroyed
       *@return true if sucessfully destroyed
       */
       boolean destroy(Piece p);

}
