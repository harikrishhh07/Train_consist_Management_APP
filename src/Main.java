import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC5 - Preserve Insertion Order of Bogies");
        System.out.println("=====================================\n");

        // LinkedHashSet preserves insertion order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // Adding bogies (including duplicates)
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Duplicate entries (will be ignored)
        formation.add("Sleeper");
        formation.add("Cargo");

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}