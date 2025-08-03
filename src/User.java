import java.io.Serializable;

public class User implements Serializable {

    private String id;
    private String name;
    private String password; // Fixed typo
    private int role; // 0 is student, 1 is professor
    private String email;
    private String profileBio;

    public User(String id, String name, String password, int role, String email, String profileBio) {
        this.id = id;
        this.name = name;
        this.password = password; // Fixed typo
        this.role = role;
        this.email = email;
        this.profileBio = profileBio;
    }

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public User(String id, String name, String password, int year) {
        this.id = id;
        this.name = name;
        this.password = password;
        // Initialize year if needed
    }

    public User() {
        this("admin", "DrKaur", "001", 1, null, null);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() { // Fixed typo
        return password;
    }

    public int getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileBio() {
        return profileBio;
    }

    public void setProfileBio(String bio) {
        this.profileBio = bio;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) { // Fixed typo
        this.password = password;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
