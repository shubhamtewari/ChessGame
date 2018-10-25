package chessgame.src;
import java.util.ArrayList;

/**
 *the rook chess piece
 *implements GamePiece
 *extends Placable
 *@author shubhamtewari
 */
class Rook extends Placable implements GamePiece {

  Rook() {
    type = Type.ROOK;
  }

  @Override
  public ArrayList tracePath(Pair p1,Pair p2) {
    ArrayList<Pair> path = new ArrayList<Pair>();//to store path
    if((p1.getX()!=p2.getX())||(p2.getY()!=p1.getY())) {//if not diagonal path
      if(p1.getX()==p2.getX()) {//going horizontal
        for(int i = 0;i<Math.abs(p2.getY()-p1.getY()+1);i++) {
          Pair p = new Pair();
          p.setX(p1.getX());
          p.setY(p1.getY()+i);
          path.add(p);
        }
      }
        else if(p1.getY()==p2.getY()) {//going vertical
          for(int i = 0;i<Math.abs(p2.getX()-p1.getX()+1);i++) {
            Pair p = new Pair();
            p.setX(p1.getX()+i);
            p.setY(p1.getY());
            path.add(p);
          }
        }
        return path;
      }
      else {
        Pair p = new Pair();
        p.setX(-1);
        p.setY(-1);
        path.add(p);
        return path;
      }
    }
  }
