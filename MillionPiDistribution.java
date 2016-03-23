import java.io.*;
import java.util.Scanner;

public class MillionPiDistribution{
  public static void main(String[] args){
    int zero=0,one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;

  BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
  String x = " ";
  while(x != null) {
    try {
        x = f.readLine();
    }
    catch (IOException e) {
        e.printStackTrace();
    }
    if(x != null){
      for(int y = 0; y <= x.length()-1; y++){
        char current = x.charAt(y);
        if(current != '.'){
          switch(Character.getNumericValue(current)){
            case 0: zero++; break;
            case 1: one++; break;
            case 2: two++; break;
            case 3: three++; break;
            case 4: four++; break;
            case 5: five++; break;
            case 6: six++; break;
            case 7: seven++; break;
            case 8: eight++; break;
            case 9: nine++; break;
          }
        }
      }
    }
  }
      int total = zero+one+two+three+four+five+six+seven+eight+nine;
      double percentZero = (double)zero/(double)total;
      double percentOne = (double)one/(double)total;
      double percentTwo = (double)two/(double)total;
      double percentThree = (double)three/(double)total;
      double percentFour = (double)four/(double)total;
      double percentFive = (double)five/(double)total;
      double percentSix = (double)six/(double)total;
      double percentSeven = (double)seven/(double)total;
      double percentEight = (double)eight/(double)total;
      double percentNine = (double)nine/(double)total;


      System.out.println("Percent Zero is "+ (percentZero*100)+"%");
      System.out.println("Percent One is "+ (percentOne*100)+"%");
      System.out.println("Percent Two is "+ (percentTwo*100)+"%");
      System.out.println("Percent Three is "+ (percentThree*100)+"%");
      System.out.println("Percent Four is "+ (percentFour*100)+"%");
      System.out.println("Percent Five is "+ (percentFive*100)+"%");
      System.out.println("Percent Six is "+ (percentSix*100)+"%");
      System.out.println("Percent Seven is "+ (percentSeven*100)+"%");
      System.out.println("Percent Eight is "+ (percentEight*100)+"%");
      System.out.println("Percent Nine is "+ (percentNine*100)+"%");
  }
}
