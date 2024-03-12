import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    /**
     * A StorageFacility keeps track the contents of many
     * storage units and their contents.
     */
    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    /**
     * TODO: Add an item to a storage unit.
     *       If the storage unit does not exist, it is created
     *       If the storage unit exists, the item is added
     *       to the contents of the storage unit.
     * @param unit the name of the storage unit
     * @param item to be added to the storage unit
     */
    public void add(String unit, String item) {

    }

    /**
     * TODO: Returns the items in a specified storage unit
     *       If the storage unit does not exist or is empty,
     *       returns an empty list.
     * @param unit the name of the storage unit
     * @return a list of all items in the unit or an empty list.
     */
    public ArrayList<String> contents(String unit) {
        return new ArrayList<>();
    }

    /**
     * TODO: Removes a specified item from a storage unit
     *       If there are multiple of the item, only one is removed.
     *       If the container would be empty after removing the item,
     *       the container itself is also removed.
     * @param unit the name of the storage unit
     * @param item the item to be removed from the unit
     */
    public void remove(String unit, String item) {

    }

    /**
     * TODO: Return the names of all non-empty storage units
     * @return list of names of non-empty storage units
     */
    public ArrayList<String> storageUnits() {
        return new ArrayList<>();
    }
}
