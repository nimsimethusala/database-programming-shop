package lk.Ijse.dbp;

import java.util.ArrayList;

public class DB {
    private static ArrayList list = new ArrayList();
    private String username;
    private String password;
    private String name;

    public DB() {

    }

    public DB(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList getList() {
        return list;
    }

    public static void setList(ArrayList list) {
        DB.list = list;
    }

    public void createObject(){
        list.add(new DB(this.username, this.password, this.name));
    }

    @Override
    public String toString() {
        return "DB{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
