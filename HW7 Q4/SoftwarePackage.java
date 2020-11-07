/**
 * define software package
 */
public class SoftwarePackage implements Comparable<SoftwarePackage> {
    /**
     * name of package
     */
    private String name;
    /**
     * quantity of package
     */
    private int quantity;
    /**
     * price of package
     */
    private double price;

    /**
     * constructor
     * @param name of package
     * @param quantity of package
     * @param price of package
     */
    public SoftwarePackage(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * no parameter constructor
     */
    public SoftwarePackage() {
    }

    /**
     * get name
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SoftwarePackage{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    /**
     * compare name of packages
     * @param o
     * @return
     */
    @Override
    public int compareTo(SoftwarePackage o) {
       return this.name.compareTo(o.name);
    }
}
