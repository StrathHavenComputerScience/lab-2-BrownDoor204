public class Lab2
{
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    makeRowLight();
    makeRowLight();
    makeRowLight();
    makeRowLight();
  }
  
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    doRow();
    doRow();
    doRow();
    doRow();
    makeRowDark();
    getOut();
  }
  
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    doTwoRows();
    doTwoRows();
    doTwoRows();
    checkerTwoRows();
  }
  //precondition: square in front of the robot is dark
  //postcondition: square now under the robot is light
  public static void makeLight()
  {
    Robot.move();
    Robot.makeLight();
    }
  //precondition: Row of squares is dark
  //postcondition: row of squares is light, and the robot is ready for the next row
  public static void makeRowLight()
  {
    makeLight();
    makeLight();
    makeLight();
    makeLight();
    makeLight();
    Robot.move();
    Robot.turnLeft();
    }
  //precondition: the square in front of the robot is light
  //postcondition: the square now under the robot is dark
  public static void makeDark()
  {
    Robot.move();
    Robot.makeDark();
    }
  //precondition: Row of squares is dark
  //postcondition: row of squares is light, and the robot is ready for the next row
  public static void makeRowDark()
  {
    turnRight();
    makeDark();
    makeDark();
    makeDark();
    makeDark();
    makeDark();
    makeDark();
    }
  //precondition: robot is facing a certain way
  //postcondition: robot has turned 90 degrees to the right relative to the previous direction
  public static void turnRight()
  {
    Robot.turnLeft();
    Robot.turnLeft();
    Robot.turnLeft();
    }
  //precondition: robot is facing a wall at the end of the comb
  //postcondition: robot is facing a wall at the other end of the comb.
  public static void getOut()
  {
    Robot.turnLeft();
    Robot.turnLeft();
    Robot.move();
    Robot.move();
    Robot.move();
    Robot.move();
    Robot.move();
    makeDark();
    }
  //precondition: robot isn't ready to do the next row
  //postcondition: robot is ready for the next row
  public static void prepForRow()
  {
    turnRight();
    makeDark();
    Robot.move();
    }
  //precondition: robot hasn't fully completed the row
  //postcondition: robot has fully completed the row.
  public static void doRow()
  {
    makeRowDark();
    getOut();
    prepForRow();
    }
  //precondition: first to-be-checkered square hasn't been checkered
  //postcondition: said square has been darkened
  public static void checkerFirstSquare()
  {
    Robot.makeDark();
    Robot.move();
    }
  //precondition: square in front of the robot is not darkened
  //postcondition: square now behind the robot is darkened
  public static void checkerSquare()
  {
    makeDark();
    Robot.move();
    }
  //precondition: row hasn't been checkered
  //postcondition: row has been checkered
  public static void checkerRow()
  {
    checkerFirstSquare();
    checkerSquare();
    checkerSquare();
    checkerSquare();
    }
  //precondition: two rows aren't checkered
  //postcondition: two rows are checkered
  public static void checkerTwoRows()
  {
    checkerRow();
    goToNextRow();
    checkerRow();
    }
  //precondition: robot isn't prepped to do the next two rows
  //postcondition: robot is prepped to do the next two rows
  public static void prepForChecker()
  {
    Robot.turnLeft();
    Robot.move();
    Robot.turnLeft();
    }
  //precondition: two rows aren't checkered
  //postcondition: two rows are checkered, and the robot is prepped for the next two
  public static void doTwoRows()
  {
    checkerTwoRows();
    prepForChecker();
    }
  //precondition: robot isn't prepped for the next row
  //postocndition: robot is prepped for the row
  public static void goToNextRow()
  {
    turnRight();
    Robot.move();
    turnRight();
    }
}
