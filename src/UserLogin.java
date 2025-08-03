import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class UserLogin implements Serializable {

    private static final long serialVersionUID = 1L;
    private HashMap<String, User> userList;
    private List<User> users;

    public UserLogin() {
        userList = new HashMap<>();
        users = new ArrayList<>();
    }

    public HashMap<String, User> getUserList() {
        return userList;
    }

    public void setUserList(HashMap<String, User> userList) {
        this.userList = userList;
    }

    public void addUser(User user) {
        this.userList.put(user.getId(), user);
        users.add(user);
    }

    public boolean userExists(String id) {
        return userList.containsKey(id);
    }

    public User findUserById(String id) {
        for (User u : users) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public void updateUser(Student student) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Student && users.get(i).getId().equals(student.getId())) {
                users.set(i, student);
                break;
            }
        }
    }

    public void deleteUser(String id) {
        users.removeIf(u -> u.getId().equals(id));
    }

    // Save users to file
    public void saveToFile(String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(userList);
        }
    }

    // Load users from file
    @SuppressWarnings("unchecked")
    public void loadFromFile(String filename) throws IOException, ClassNotFoundException {
        File file = new File(filename);
        if (!file.exists()) return;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            userList = (HashMap<String, User>) in.readObject();
        }
    }
}
