package SEGAMessages;

import java.io.Serializable;

public class GetGroupsForUserRequest implements Serializable {
    private String username;
    private String firebaseToken;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirebaseToken() {
        return firebaseToken;
    }

    public void setFirebaseToken(String firebaseToken) {
        this.firebaseToken = firebaseToken;
    }
}
