public class Ch2Study10 {
  public static void main(String[] args) {
    for (int i = 2; i <= 100; i++) {
      boolean primary = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          primary = false;
          break;
        }
      }
      if (primary) {
        System.out.println(i);
      }
    }
  }
}
