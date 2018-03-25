package SEGAMessages;

public class GetGroupsForUserRequest extends Request {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "GetGroupsForUserRequest{" +
                "username='" + username + '\'' +
                '}';
    }
}
