package SEGAMessages;

public class GrantAuthorizationForGroupRequest extends Request {
    private String groupName;
    private String username;

    @Override
    public String toString() {
        return "GrantAuthorizationForGroupRequest{" +
                "groupName='" + groupName + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
