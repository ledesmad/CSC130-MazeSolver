package csc130.data.mazesearch;

import java.util.*;

public class solveMaze {
  private Maze mz;

  //Constructor.
  public solveMaze(Maze mz) {
    this.mz = mz;
  }

  //Uses a stack to find a path through the maze.
  public boolean solve() {
    boolean solved = false;
    Position p = new Position();
    Deque<Position> stack = new LinkedList<Position>();
    stack.push(p);
    while (!(solved) && !stack.isEmpty()) {
      p = stack.pop();
      mz.tryMove(p.getX(),p.getY()); //Marks the coordinate as tried.
      if (p.getX() == mz.getRows()-1 && p.getY() == mz.getColumns()-1) //Win Condition.
        solved = true;
      else {
        pushPosition(p.getX()-1,p.getY(), stack); //Left
        pushPosition(p.getX()+1,p.getY(), stack); //Right
        pushPosition(p.getX(),p.getY()-1, stack); //Down
        pushPosition(p.getX(),p.getY()+1, stack); //Up
      }
    }
    return solved;
  }

  //Pushes a new position onto the stack.
  private void pushPosition(int x, int y, Deque<Position> moves) {
    Position np = new Position();
    np.setX(x);
    np.setY(y);
    if (mz.checkValid(x, y)) { //Pushes to stack if valid.
      moves.push(np);
    }
  }
}
