/**
 * this class implement systems methods
 * holds datas red black tree
 * data is softwarePackage class
 *
 * final static PASSWORD for admin
 *
 * no parameter constructor create datas in pdf(Adobe,Narton etg)
 */

public class Systems{
    /**
     * holds datas
     */
    private RedBlackTree<SoftwarePackage> softwarePackageRedBlackTree = new RedBlackTree<SoftwarePackage>();
    /**
     * password for admin
     */
    private static final String PASSWORD = "SoftwarePackageSystem";

    /**
     * create red black tree
     * @param softwarePackageRedBlackTree is tree
     */
    public Systems(RedBlackTree<SoftwarePackage> softwarePackageRedBlackTree) {
        this.softwarePackageRedBlackTree = softwarePackageRedBlackTree;
    }

    /**
     * no parameter constructor create datas in pdf(Adobe,Narton etg)
     */
    public Systems() {
        softwarePackageRedBlackTree.add(new SoftwarePackage(" Adobe Photoshop 6.0",2000,1450.78));
        softwarePackageRedBlackTree.add(new SoftwarePackage(" Adobe Photoshop 6.2",200,19650.78));
        softwarePackageRedBlackTree.add(new SoftwarePackage(" Narton 4.5",200,190.78));
        softwarePackageRedBlackTree.add(new SoftwarePackage(" Narton 5.5",200,2000.78));
        softwarePackageRedBlackTree.add(new SoftwarePackage(" Adobe Flash 3.3",2000,18460.78));
        softwarePackageRedBlackTree.add(new SoftwarePackage(" Adobe Flash 4.0",2900,1960.78));

    }

    /**
     * return string package information
     * @param softwareName is package name
     * @return
     */
        public String search(String softwareName){
                if(search(softwarePackageRedBlackTree,softwareName)==null){
                    return "there is not this package please try again";
                }
                else{
                    return search(softwarePackageRedBlackTree,softwareName).toString();
                }
        }

    /**
     * help search mthod
     * @param softwarePackageRedBlackTree is tree
     * @param softwareName name of package
     * @return Software package
     */
        private SoftwarePackage search(BinaryTree softwarePackageRedBlackTree ,String softwareName){
       softwareName=softwareName.trim();
       if(softwarePackageRedBlackTree.root!=null)
       if(((SoftwarePackage) softwarePackageRedBlackTree.root.data)!=null)
       ((SoftwarePackage)softwarePackageRedBlackTree.root.data).setName(((SoftwarePackage)softwarePackageRedBlackTree.root.data).getName().trim());
        if(softwarePackageRedBlackTree.root==null){
            return null;
        }
        if(softwareName.equals(((SoftwarePackage)softwarePackageRedBlackTree.root.data).getName())){
           // System.out.println(((SoftwarePackage)softwarePackageRedBlackTree.root.data));
            return ((SoftwarePackage) softwarePackageRedBlackTree.root.data);
        }
        else if(softwareName.compareTo(((SoftwarePackage)softwarePackageRedBlackTree.root.data).getName())<0){
            return  search((BinaryTree)softwarePackageRedBlackTree.getLeftSubtree(),softwareName);
        }
        else{
            return search((BinaryTree)softwarePackageRedBlackTree.getRightSubtree(),softwareName);
        }
    }

    /**
     * add data in tree(if admin otherwise do not add)
     * @param password for admin or user
     * @param softwarePackage is pacjage
     * @return boolean
     */
    public boolean add(String password,SoftwarePackage softwarePackage){
        if(password.equals(PASSWORD)){
            return softwarePackageRedBlackTree.add(softwarePackage);
        }
        else{
            System.out.println("user does not add");
            return false;
        }
    }

    /**
     * delete data if admin otherwise do not
     * @param password for admin or user
     * @param softwarePackage is package
     */
    public void delete(String password , SoftwarePackage softwarePackage){
        if(password.equals(PASSWORD)){
            softwarePackageRedBlackTree.delete(softwarePackage);
        }
        else{
            System.out.println("Users do not remove");
        }
    }

    /**
     * delete package if there is softwarePackageName in tree
     * @param password for admin or user
     * @param softwarePackageName name of package
     */
    public void delete(String password , String softwarePackageName){
        SoftwarePackage softwarePackage = search(softwarePackageRedBlackTree,softwarePackageName);
        if(softwarePackage!=null)
        delete(password,softwarePackage);
    }

    /**
     * update name of package f admin otherwise do not
     * @param password for admin or user
     * @param oldSoftwarePackageName old name of package
     * @param newSoftarePackageName new name of package
     */
    public void updateName(String password,String  oldSoftwarePackageName,String newSoftarePackageName){
       if(password.equals(PASSWORD )){
           SoftwarePackage softwarePackage = search(softwarePackageRedBlackTree,oldSoftwarePackageName);
           if(softwarePackage!=null)
           softwarePackage.setName(newSoftarePackageName);
       }
       else {
           System.out.println("User do not update Name,price,quatity");
       }
    }

    /**
     * update auantity if admin otherwise do not
     * @param password for admin or user
     * @param SoftwarePackageName name of package
     * @param quantity is quantity of package
     */
    public void updateQuantity(String password,String SoftwarePackageName,int quantity){
        if(password.equals(PASSWORD )){
            SoftwarePackage softwarePackage = search(softwarePackageRedBlackTree,SoftwarePackageName);
            if(softwarePackage!=null){
                System.out.println("-------------------------------------------");
                softwarePackage.setQuantity(quantity);
            }

        }
        else {
            System.out.println("User do not update Name,price,quatity");
        }
    }

    /**
     * update price if admin otherwise do not
     * @param password for admin or user
     * @param SoftwarePackageName name of package
     * @param price is price of package
     */
    public void updatePrice(String password,String  SoftwarePackageName,double price){
        if(password.equals(PASSWORD )){
            SoftwarePackage softwarePackage = search(softwarePackageRedBlackTree,SoftwarePackageName);
            if(softwarePackage!=null)
                softwarePackage.setPrice(price);
        }
        else {
            System.out.println("User do not update Name,price,quatity");
        }
    }

    /**
     * arrive store if admin otherwise do not
     * @param password for admin or user
     * @param packageName name of package
     * @param quantity is quantity
     * @param price is price
     */
    public void arriveStore(String password,String packageName,int quantity,double price){
       if(password.equals(PASSWORD)){
           SoftwarePackage softwarePackage = search(softwarePackageRedBlackTree,packageName);
           if(softwarePackage!=null){
               softwarePackage.setQuantity(softwarePackage.getQuantity()+quantity);
           }
           else{
               softwarePackageRedBlackTree.add(new SoftwarePackage(packageName,quantity,price));
           }

       }
       else{
           System.out.println("user do not this action");
       }
    }

    /**
     * for user only
     * buy package
     * @param password for admin or user
     * @param packageName name of package
     * @param quantityBuy will remove quantity
     */
    public void buyPackage(String password,String packageName,int quantityBuy){
        if(!password.equals(PASSWORD)){
            SoftwarePackage softwarePackage = search(softwarePackageRedBlackTree,packageName);
            if(softwarePackage!=null){
                if(quantityBuy > softwarePackage.getQuantity()){
                    System.out.println("there are not enough products in the store");
                }
                else if(quantityBuy <= softwarePackage.getQuantity()){
                    soldPackage(PASSWORD, packageName,quantityBuy);
                    System.out.println( quantityBuy + " " + packageName + " buys");
                }


            }
            else {
                System.out.println("out of stock");
            }
        }
        else{
            System.out.println("administrator can not buy package");
        }

    }

    /**
     * if package's quantity equals 0 (zero) deleted package in tree
     * @param password for admin or user
     * @param packageName name of package
     * @param soldQuantity is quantity
     */
    private void soldPackage(String password,String packageName,int soldQuantity){
            if(password.equals(PASSWORD)){

                SoftwarePackage softwarePackage = search(softwarePackageRedBlackTree,packageName);
                if(softwarePackage!=null){
                    softwarePackage.setQuantity(softwarePackage.getQuantity()-soldQuantity);
                    if(0==softwarePackage.getQuantity()){
                        delete(PASSWORD,packageName);
                    }
                }
            }
            else{
                System.out.println("user can not this action");
            }
    }

    /**
     * show tree
     * @return string
     */
    @Override
    public String toString() {
        return " " + softwarePackageRedBlackTree;
    }
}
