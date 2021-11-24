import java.io.*;
import java.util.*;

public class day3{
  public static void solve (String command){
    int[] position = {0, 0};

    ArrayList<int[]> test = new ArrayList<int[]> ();
    test.add(position);
    for (int x = 0; x < test.size(); x++){
      System.out.print(Arrays.toString(test.get(x)));
    }
  }
  public static void main (String[] args){

    solve("");
  }
}
