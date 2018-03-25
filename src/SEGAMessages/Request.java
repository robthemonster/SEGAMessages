package SEGAMessages;

import java.io.Serializable;

public abstract class Request implements Serializable {
    private String firebaseToken;

    public String getFirebaseToken() {
        return firebaseToken;
    }

    public abstract String toString();
    public void setFirebaseToken(String firebaseToken) {
        this.firebaseToken = firebaseToken;
    }
}
