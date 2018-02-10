package SEGAMessages;
import java.io.Serializable;
public class ClientInfo implements Serializable {
    private String firebaseToken;
    private String message;

    public String getFirebaseToken() {
        return firebaseToken;
    }
    public String getMessage(){
        return message;
    }
    public void setFirebaseToken(String firebaseToken){
        this.firebaseToken = firebaseToken;
    }
    public void setMessage(String message){
        this.message = message;
    }
}

