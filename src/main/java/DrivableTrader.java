/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;

public class DrivableTrader extends Trader<Drivable>{

    /**
     * A constrcutor of DrivableTrader with three arguments which are
     * a list of drivable item inventory, a list of drivable item wishlist, and money.
     * @param inventory Drivable objects in this DrivableTrader's inventory
     * @param wishlist Drivable objects in this DrivableTrader's wislist
     * @param money The DrivableTrader's money
     */
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    /**
     * A constrcutor of DrivableTrader with a single int argument
     *
     * @param money The DrivableTrader's money
     */
    public DrivableTrader(int money){
        super(money);
    }

    /**
     * Get a selling price of drivable item.
     * @param item an item to sell
     * @return sum of selling price and object's max speed if tradable. If not, return missing price.
     */
    @Override
    public int getSellingPrice(Drivable item){
        int super_price = super.getSellingPrice(item);

        if (super_price == Tradable.MISSING_PRICE) {
            return Tradable.MISSING_PRICE;
        }

        return super_price + item.getMaxSpeed();
    }
}
