import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StorageFacilityTest {
    private StorageFacility storageFacility;

    @BeforeEach
    public void setUp() {
        storageFacility = new StorageFacility();
    }

    @Test
    public void testAddItemToNewStorageUnit() {
        storageFacility.add("a14", "ice skates");
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a14"));
        Assertions.assertEquals(expected, storageFacility.contents("a14"));
    }

    @Test
    public void testAddItemToExistingStorageUnit() {
        storageFacility.add("a14", "ice skates");
        storageFacility.add("a14", "hockey stick");
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("ice skates", "hockey stick"));
        Assertions.assertEquals(expected, storageFacility.contents("a14"));
    }

    @Test
    public void testContentsOfNonExistingStorageUnit() {
        Assertions.assertTrue(storageFacility.contents("a14").isEmpty());
    }

    @Test
    public void testRemoveItemFromStorageUnit() {
        storageFacility.add("a14", "ice skates");
        storageFacility.add("a14", "hockey stick");
        storageFacility.remove("a14", "ice skates");
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("ice skates"));
        Assertions.assertEquals(expected, storageFacility.contents("a14"));
    }

    @Test
    public void testRemoveMakesStorageUnitEmpty() {
        storageFacility.add("a14", "ice skates");
        storageFacility.remove("a14", "ice skates");
        Assertions.assertTrue(storageFacility.storageUnits().isEmpty());
    }

    @Test
    public void testRemoveNonExistingItemFromStorageUnit() {
        storageFacility.add("a14", "ice skates");
        storageFacility.remove("a14", "hockey stick");
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("ice skates"));
        Assertions.assertEquals(expected, storageFacility.contents("a14"));
    }

    @Test
    public void testRemoveMultipleItemsFromStorageUnit() {
        storageFacility.add("a14", "hockey puck");
        storageFacility.add("a14", "hockey puck");
        storageFacility.add("a14", "hockey puck");
        storageFacility.remove("a14", "hockey puck");
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("hockey puck", "hockey puck"));
        Assertions.assertEquals(expected, storageFacility.contents("a14"));
    }

    @Test
    public void testStorageUnits() {
        storageFacility.add("a14", "ice skates");
        storageFacility.add("f77", "rollerblades");
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a14", "f77"));
        Assertions.assertEquals(expected, storageFacility.storageUnits());
    }

}
