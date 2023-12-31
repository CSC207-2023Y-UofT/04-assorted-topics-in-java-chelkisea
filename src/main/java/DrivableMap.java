/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* TODO: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */

    /**
     * Add a new drivable object to this DrivableMap.
     * @param id a string ID of this object
     * @param object an object to add
     * @return true if an item is added. If an item is already exists in this map, return false.
     */
    public boolean addDrivable(String id, Drivable object){
        if (this.drivable_map.containsKey(id)) {
            return false;
        } else {
            this.drivable_map.put(id, object);
            return true;
        }
    }




    /* TODO: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */

    /**
     * Return true if there is at least one item in DrivableMap
     * that has a max speed >= given speed.
     * @param speed a given speed
     * @return true if at least one item's max speed >= given speed . False if not.
     */
    public boolean hasFasterThan(int speed){
        for (Drivable item: this.drivable_map.values()){
            if (item.getMaxSpeed() >= speed){
                return true;
            }
        }
        return false;
    }







    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */

    /**
     * Get a List containing all of the Tradable items in this DrivableMap.
     * @return a List containing all of the Tradable items
     */
    public List<Tradable> getTradable() {
        ArrayList<Tradable> store = new ArrayList<Tradable>();
        for (Drivable item : this.drivable_map.values()) {
            if (item instanceof Tradable) {
                store.add((Tradable) item);
            }

        }
        return store;
    }



    
}