package csc130.data.mazesearch;

import java.io.*;

public class Test {
  public static void main(String[] args) throws FileNotFoundException {
    Maze j = new Maze("C:\\Users\\ledes\\Documents\\CSUS\\CSC130\\Projects\\MazeSearch\\src\\csc130\\data\\mazesearch\\mz.txt");
    System.out.println(j);
    solveMaze solver = new solveMaze(j);
    System.out.println("Maze can be solved: " + solver.solve());
    System.out.println(j);
    }
  }

