package shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service()
public class NotificationServiceImpl implements NotificationService {

    public static final String NOTIFY_MSG_SESSION_KEY = "siteNotificationMessage";

    @Autowired
    private HttpSession httpSession;

    @Override
    public void addInfoMessage(String msg) {
        addNotification(NotificationMessageType.INFO, msg);
    }

    @Override
    public void addErrorMessage(String msg) {
        addNotification(NotificationMessageType.ERROR, msg);
    }

    private void addNotification(NotificationMessageType type, String msg) {
        List<NotificationMessage> notificationMessages = (List<NotificationMessage>)
                httpSession.getAttribute(NOTIFY_MSG_SESSION_KEY);
        notificationMessages = Optional.ofNullable(notificationMessages).orElse(new ArrayList<NotificationMessage>());
        notificationMessages.add(new NotificationMessage(type, msg));
        httpSession.setAttribute(NOTIFY_MSG_SESSION_KEY, notificationMessages);
    }

    private enum NotificationMessageType {
        INFO,
        ERROR
    }

    private class NotificationMessage {
        NotificationMessageType type;
        String text;


        public NotificationMessage(NotificationMessageType type, String text) {
            this.text = text;
            this.type = type;

        }

        public NotificationMessageType getType() {
            return type;

        }

        public String getText() {
            return text;
        }
    }
}
