
import java.util.Scanner;
public class Remconseqchar {
public static String deleteConsecutiveStrings(String s)
  {
     int i = 0, j = 0;
    String result ="";
  while (j < s.length()) {
      if (s.charAt(i)==s.charAt(j)) {
        j++;
      }
      else if (s.charAt(j)!=s.charAt(i) || j==s.length() - 1) {
        result+= s.charAt(i);
        i = j;
        j++;
      }
    }
  result+= s.charAt(j - 1);
    return result;
}
 public static void main (String args[]){
    Scanner in=new Scanner(System.in);
    String sr;
    System.out.println("Enter the string:");
    sr=in.nextLine();System.out.println("Output : "+ deleteConsecutiveStrings(sr));
 }   
}
