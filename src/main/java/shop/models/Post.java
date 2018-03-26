package shop.models;

import java.util.Calendar;
import java.util.Date;

public class Post {
    private Long id;
    private String title;
    private String body;
    private User author;
    private Calendar calendar ;

    public Post() {
        this.calendar=Calendar.getInstance();
    }

    public Post(Long id,String title, String body, User author, Calendar calendar) {
        this.id=id;
        this.title = title;
        this.body = body;
        this.author = author;
        this.calendar = calendar;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", author=" + author +
                ", date=" + calendar.getTime() +
                '}';
    }
}
