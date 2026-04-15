import java.util.ArrayList;

public class UC1 {
   public UC1() {
   }

   public static void main(String[] var0) {
      System.out.println("=== Train Consist Management App ===");
      ArrayList var1 = new ArrayList();
      System.out.println("Initial bogie count: " + var1.size());
   }

   public int getInitialCount() {
      ArrayList var1 = new ArrayList();
      return var1.size();
   }
}
