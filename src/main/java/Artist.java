import java.util.HashMap;
import java.util.Map;

public class Artist {
    private int id;
    private String name;

    Map<User, Integer> users = new HashMap<User, Integer>();

    public Artist(int id, String name) {
        this.id = id;
        this.name = name;
    }








    public void addUser(User user) {
        if (users.get(user) == null) {
            users.put(user, 1);
        } else {
            users.put(user, users.get(user) + 1);
        }


    }

    public User getTopFan() {
        Integer max = 0;
        User topFan = null;
        for (Map.Entry<User, Integer> entry : users.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                topFan = entry.getKey();

            }

        }
        return topFan;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

