package SEGAMessages;

public class GetFileFromGroupRequest extends Request {
    private String filename;
    private String groupname;
    private String username;

    @Override
    public String toString() {
        return "GetFileFromGroupRequest{" +
                "filename='" + filename + '\'' +
                ", groupname='" + groupname + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
}
