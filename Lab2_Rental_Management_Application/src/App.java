import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<User> arr = new ArrayList<>();
        arr.add(new User().CreateUser("325235", "325235", "uwa@gmail.com", "user"));

        arr.get(0).ResetPassword("66363636");

        

    }
}
