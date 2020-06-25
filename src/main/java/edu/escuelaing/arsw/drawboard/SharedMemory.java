package edu.escuelaing.arsw.drawboard;

import edu.escuelaing.arsw.drawboard.entity.Color;
import edu.escuelaing.arsw.drawboard.entity.User;

import java.util.ArrayList;
import java.util.List;

public class SharedMemory {
    private static final SharedMemory instance = new SharedMemory();
    private List<User> users = new ArrayList<User>();
    private List<List<Integer>> points = new ArrayList<>();

    private SharedMemory() {

    }

    public static SharedMemory getInstance() {
        return instance;
    }

    public void add(User user) {
        users.add(user);
    }

    public String toString() {
        return users.toString();
    }

    public void addPoint(List<Integer> point) {
        points.add(point);
    }

    public List<List<Integer>> getPoints() {
        return points;
    }

    public void restart() {
        points.clear();
    }

    public Color getUserSession(String name) {
        for (User u : users) {
            if (u.getName().equals(name)) {
                return u.getColor();
            }
        }
        Color color = new Color(0, 0, 0);
        return color;
    }
}