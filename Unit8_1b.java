public class Unit8_1b
{
  public int [] [] modifyRows (int [] [] array)
 { 
 int[][] modified = new int[array.length][array[0].length];
 for (int r = 0; r < array.length-1; r++){
     for(int c = 0; c  < array[0].length; c++){
        if (r%2 == 0)
            modified[r][c] = array[r][c];
            modified[r+1][c] = modified[r][c];
    } 
}
return modified;
      }
    }
 