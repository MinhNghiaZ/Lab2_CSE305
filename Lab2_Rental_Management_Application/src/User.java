public class User {
    private String id;
    private String password;
    private String email;
    private String userType;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public User(String id, String password, String email, String userType) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public User CreateUser(String id, String password, String email, String userType) {
        return new User(id, password, email, userType);
    }

    public void ResetPassword(String password) {
        this.password = password;
    }

}
