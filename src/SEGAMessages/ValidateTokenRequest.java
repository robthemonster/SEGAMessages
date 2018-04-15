package SEGAMessages;

public class ValidateTokenRequest extends Request {
    private String groupname;
    private String token;

    @Override
    public String toString() {
        return "ValidateTokenRequest{" +
                "groupname='" + groupname + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
