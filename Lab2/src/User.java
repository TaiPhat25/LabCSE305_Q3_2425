import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private static Scanner sc = new Scanner(System.in);

    private int UserID;
    private String Password;
    private String Email;
    private String UserType;
    private ArrayList<User> userList = new ArrayList<>();

    public User() {
    }

    public User(int userID, String password, String email, String userType) {
        UserID = userID;
        Password = password;
        Email = email;
        UserType = userType;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }

    public void CreateUser(int UserID, String Password, String Email, String UserType) {
        var newUser = new User(UserID, Password, Email, UserType);
        userList.add(newUser);
    }

    public void ResetPassword(String newPassword) {
        this.Password = newPassword;
    }
}
