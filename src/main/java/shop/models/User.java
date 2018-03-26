package shop.models;

import java.util.HashSet;
import java.util.Set;

public class User {
    private Long id;
    private String login;
    private String name;
    private String passwordHash; // or password
    private Set<Post> posts = new HashSet<>();
// TODO   private String email, password in constructor?

    public User(Long id, String name,String login) {
        this.id=id;
        this.name=name;
        this.login = login;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                '}';
    }
}
