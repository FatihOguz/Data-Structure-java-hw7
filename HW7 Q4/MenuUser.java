import java.util.Scanner;

/**
 * * design for User
 *  * menu main
 */
public class MenuUser {
    private static void showTable(){
        System.out.println("********************************************************************");
        System.out.println("?: Display");
        System.out.println("q: Quit");
        System.out.println("s: Search");
        System.out.println("a: Add");
        System.out.println("d: Delete");
        System.out.println("un: Update Name");
        System.out.println("uq: Update Quantity");
        System.out.println("up: Update Price");
        System.out.println("as: Arrive Store");
        System.out.println("b: Buy Package");
        System.out.println("********************************************************************");
    }
    public static void main (String[] args){


        Systems  systems = new Systems();
       User user = new Administrator(systems,"User");





        Scanner scan = new Scanner(System.in);
        String choice = " ";
        do {
            showTable();
            choice = scan.nextLine();
            switch (choice){
                case "s":
                    System.out.println("Enter software name");
                    String res = scan.nextLine();
                    System.out.println(user.search(res));
                    break;
                case "b":
                    System.out.println("Enter software name");
                    res = scan.nextLine();
                    System.out.println("Enter qunatity");
                    int quantity = scan.nextInt();
                    user.buyPackage(res,quantity);
                    break;
                case "a":
                    System.out.println("Enter software name");
                    res = scan.nextLine();
                    System.out.println("Enter qunatity");
                    quantity = scan.nextInt();
                    System.out.println("Enter software price");
                    double price = scan.nextDouble();
                    user.add(new SoftwarePackage(res,quantity,price));
                    break;
                case "d":
                    System.out.println("Enter software name");
                    res = scan.nextLine();
                    user.delete(res);
                    break;
                case "un":
                    System.out.println("Enter software old name");
                    res = scan.nextLine();
                    System.out.println("Enter software new name");
                    String newName = scan.nextLine();
                    user.updateName(res,newName);
                    break;
                case "uq":
                    System.out.println("Enter software name");
                    res = scan.nextLine();
                    System.out.println("Enter qunatity");
                    quantity = scan.nextInt();
                    user.updateQuantity(res,quantity);

                    break;
                case "up":
                    System.out.println("Enter software name");
                    res = scan.nextLine();
                    System.out.println("Enter software price");
                    price = scan.nextDouble();
                    user.updatePrice(res,price);
                    break;
                case "as":
                    System.out.println("Enter software name");
                    res = scan.nextLine();
                    System.out.println("Enter qunatity");
                    quantity = scan.nextInt();
                    System.out.println("Enter software price");
                    price = scan.nextDouble();
                    user.arriveStore(res,quantity,price);
                    break;

                case "?":
                    System.out.println(systems);
                    break;
            }  }while (!choice.equals("q"));


    }
}
