package SEGAMessages;

public class UploadFileToGroupRequest extends Request {
    private String groupname;
    private String username;
    private String filename;
    private byte[] file;

    @Override
    public String toString() {
        return "UploadFileToGroupRequest{" +
                "groupname='" + groupname + '\'' +
                ", username='" + username + '\'' +
                ", filename='" + filename + '\'' +
                '}';
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }
}
