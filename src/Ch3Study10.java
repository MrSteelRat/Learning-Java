import java.io.IOException;
import java.util.Scanner;

public class Ch3Study10 {
  public static void main(String[] args) throws java.io.IOException {
    char ch;
    int case_changes = 0;
    System.out.println("Press . to stop.");
    while ((ch = (char) System.in.read()) != '.') {
      if (ch >= 'a' && ch <= 'z') {
        System.out.print((char) (ch - 32));
        case_changes++;
      } else if (ch >= 'A' && ch <= 'Z') {
        System.out.print((char) (ch + 32));
        case_changes++;
      } else {
        System.out.print(ch);
      }
    }
    System.out.println(" the number of case changes:" + case_changes);
  }
}
// aaaAAAAssss6666.