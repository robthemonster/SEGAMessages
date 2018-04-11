package SEGAMessages;

public class RequestAuthorizationFromGroupResponse extends Response {
    public static final String TYPE = "RequestAuthorizationFromGroupResponse";
    private boolean succeeded;
    private String token;

    @Override
    public String toString() {
        return "RequestAuthorizationFromGroupResponse{" +
                "succeeded=" + succeeded +
                ", token='" + token + '\'' +
                '}';
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
