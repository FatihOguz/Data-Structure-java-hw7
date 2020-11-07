/**
 * this class extends User class
 * can do different methods according to User class
 * so has special password according to User class
 */
public class Administrator extends User {
    /**
     * constructor
     * @param systems is system
     * @param password is special password
     */
    public Administrator(Systems systems, String password) {
        super(systems, password);
    }
}
