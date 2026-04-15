import java.util.HashSet;

public class TrainConsistApp {
    public static void main(String[] args) {

        HashSet<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIds);
    }
}