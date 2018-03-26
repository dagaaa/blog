package shop.services;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

public interface NotificationService {
    void addInfoMessage(String msg);
    void addErrorMessage(String msg);

}
