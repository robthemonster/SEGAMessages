package SEGAMessages;

public class UserLoginResponse extends Response {
    public static final String TYPE = "UserLoginResponse";
    private String username;
    private boolean succeeded;

    @Override
    public String toString() {
        return "UserLoginResponse{" +
                "username='" + username + '\'' +
                ", succeeded=" + succeeded +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    @Override
    public String type() {
        return TYPE;
    }
}
