package software_project.helper;


import javafx.event.ActionEvent;
import javafx.scene.control.ButtonType;
import software_project.UserManagement.User;
import software_project.authentication.UserSessionManager;


import java.util.Optional;

public class UserSession {
    private static String sessionId;
    private static User currentUser;
    private static User userToDisplay;


    public static String getSessionId() {
        return sessionId;
    }

    public static void setSessionId(String sessionId) {
        UserSession.sessionId = sessionId;
    }

    public static User getCurrentUser() {
        return new User(currentUser);
    }

    public static void setCurrentUser(User currentUser) {
        UserSession.currentUser = new User(currentUser);
    }

    public static User getUserToDisplay() {
        return userToDisplay;
    }

    public static void setUserToDisplay(User userToDisplay) {
        UserSession.userToDisplay = userToDisplay;
    }




    @Override
    public String toString() {
        return "Classes.UserSession{" + currentUser.getUsername() + ": " +
                "sessionId='" + sessionId + '\'' +
                '}';
    }
}