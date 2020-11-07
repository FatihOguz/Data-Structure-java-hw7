import jdk.swing.interop.SwingInterOpUtils;

/**
 * tests some methods for admin and user
 */
public class Main {


    public static void main(String[] args){

        Systems  systems = new Systems();
        Administrator administrator = new Administrator(systems,"SoftwarePackageSystem");
        User user = new User(systems,"userPassword");


        System.out.println("SEARCH" + user.search(" Narton 4.5"));
        System.out.println("SEARCH" + administrator.search(" Narton 4.5"));

        System.out.println("USERS "  + user.add(new SoftwarePackage("Intelij IDEA" , 5207,85.79)));
        System.out.println(systems);
        System.out.println("**********************************************************************************************");
        System.out.println("ADMINNS " + administrator.add(new SoftwarePackage("Intelij IDEA" , 5207,85.79)));
        System.out.println(systems);
        System.out.println("**********************************************************************************************");

        System.out.println("admin " + administrator.search("Intelij IDEA"));


        administrator.delete("Intelij IDEA");
        System.out.println(systems);
        System.out.println("**********************************************************************************************");


        System.out.println("User update name " );
        user.updateName("Intelij IDEA","Netbeans");
        System.out.println(systems);
        System.out.println("**********************************************************************************************");
        System.out.println("admin update name " );
        administrator.updateName("Intelij IDEA","Netbeans");
        System.out.println(systems);
        System.out.println("**********************************************************************************************");

        administrator.arriveStore("Netbeans 2019",1000,520.3);
        System.out.println(systems);
        administrator.arriveStore("Netbeans 2019",100,520.3);
        System.out.println(systems);
        System.out.println("**********************************************************************************************");
        user.buyPackage("Netbeans 2019",50);
        System.out.println(systems);
        System.out.println("**********************************************************************************************");
        user.buyPackage("Netbeans 2019",1050);
        System.out.println(systems);
        System.out.println("**********************************************************************************************");
    }
}
