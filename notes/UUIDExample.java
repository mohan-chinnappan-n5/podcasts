import java.util.UUID;

public class UUIDExample {
    public static void main(String[] args) {
        // Generate a random UUID
        UUID randomUUID = UUID.randomUUID();
        System.out.println("Random UUID: " + randomUUID);

        // Generate a UUID from a string (deterministic, useful for reproducibility)
        String inputString = "example";
        UUID nameUUID = UUID.nameUUIDFromBytes(inputString.getBytes());
        System.out.println("UUID from input string: " + nameUUID);

        // Example: Using UUID for unique identifiers
        String uniqueOrderId = "ORDER-" + UUID.randomUUID();
        System.out.println("Unique Order ID: " + uniqueOrderId);

        // Parsing a UUID from a string
        String uuidString = randomUUID.toString();
        UUID parsedUUID = UUID.fromString(uuidString);
        System.out.println("Parsed UUID: " + parsedUUID);

        // Comparison of two UUIDs
        UUID anotherUUID = UUID.randomUUID();
        if (randomUUID.equals(anotherUUID)) {
            System.out.println("UUIDs are equal");
        } else {
            System.out.println("UUIDs are not equal");
        }
    }
}