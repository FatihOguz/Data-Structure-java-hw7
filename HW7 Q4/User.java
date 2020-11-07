/**
 * this class contact system
 */
public class User {
    /**
     * system store
     */
    private Systems systems;
    /**
     * for admin or user
     */
    private String password;

    /**
     * constructor admin or user
     * @param systems is system
     * @param password for admin or user
     */
    public User(Systems systems, String password) {
        this.systems = systems;
        this.password = password;
    }

    /**
     * return string package information
     * @param softwareName is package name
     * @return
     */
    public String search(String softwareName){
        return systems.search(softwareName);
    }

    /**
     * added data in tree if admin otherwise do not
     * @param softwarePackage added package
     * @return boolean
     */
    public boolean add(SoftwarePackage softwarePackage){
        return systems.add(password,softwarePackage);
    }

    /**
     * delete package
     * @param softwarePackage is package
     */
    public void delete(SoftwarePackage softwarePackage){
        systems.delete(password,softwarePackage);
    }

    /**
     * delete package if there is softwarepackage in tree
     * if admin delete otherwise do not
     * @param softwarePackageName is name of package
     */
    public void delete(String softwarePackageName){
        systems.delete(password,softwarePackageName);
    }

    /**
     * update name of package f admin otherwise do not
     * @param oldName old name of package
     * @param newName new name of package
     */
    public void updateName(String oldName,String newName){
        systems.updateName(password,oldName,newName);
    }
    /**
     * update auantity if admin otherwise do not

     * @param name name of package
     * @param quantity is quantity of package
     */
    public void updateQuantity(String name,int quantity){
        systems.updateQuantity(password,name,quantity);
    }
    /**
     * update price if admin otherwise do not

     * @param name name of package
     * @param price is price of package
     */
    public void updatePrice(String name,double price){
        systems.updatePrice(password,name,price);
    }
    /**
     * arrive store if admin otherwise do not
     * @param packageName name of package
     * @param quantity is quantity
     * @param price is price
     */
    public void arriveStore(String packageName,int quantity,double price){
        systems.arriveStore(password,packageName,quantity,price);
    }
    /**
     * for user only
     * buy package
     * @param packageName name of package
     * @param quantityBuy will remove quantity
     */
    public void buyPackage(String packageName,int quantityBuy){
        systems.buyPackage(password,packageName,quantityBuy);
    }

}
