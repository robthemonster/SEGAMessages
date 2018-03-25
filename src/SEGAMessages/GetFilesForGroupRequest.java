package SEGAMessages;

public class GetFilesForGroupRequest extends Request {
    private String groupname;
    private String username;

    @Override
    public String toString() {
        return "GetFilesForGroupRequest{" +
                "groupname='" + groupname + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
