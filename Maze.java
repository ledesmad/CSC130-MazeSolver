package csc130.data.mazesearch;

import java.util.*;
import java.io.*;

public class Maze {
  private static final int tried = 2;
  private static final int path = 3;
  private int numr;
  private int numc;
  private int[][] mz;

  //Constructor, creates a 3d array from the file entered.
  public Maze(String Filename) throws FileNotFoundException {
    Scanner scan = new Scanner(new File(Filename)); //Scans the file.
    numr = scan.nextInt();
    numc = scan.nextInt();
    mz = new int[numr][numc];
    for (int i = 0; i < numr; i++) {  //Fills 3d Array
      for (int j = 0; j < numc; j++) {
        mz[i][j] = scan.nextInt();
      }
    }
  }
  //Returns the number of rows.
  public int getRows() {
    return numr;
  }

  //Returns the number of columns.
  public int getColumns() {
    return numc;
  }

  //Marks a coordinate tried.
  public void tryMove(int row, int column){
    mz[row][column] = tried;
  }

  //Marks a coordinate pathed.
  public void makePath(int row, int column){
    mz[row][column] = path;
  }

  //Checks if a move is valid.
  public boolean checkValid(int row, int column){
    if(row>=numr || row<0 || column>=numc || column<0)
      return false;
    else
      return mz[row][column] == 1;
  }

  //Converts to string.
  public String toString() {
    String result = "\n";
    for (int i = 0; i < mz.length; i++) {
      for (int j = 0; j < mz[i].length; j++) {
        result += mz[i][j] + " ";
      }
      result += "\n";
    }
    return result;
  }
}

