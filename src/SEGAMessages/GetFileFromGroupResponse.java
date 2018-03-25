package SEGAMessages;

public class GetFileFromGroupResponse extends Response {
    public static final String TYPE = "GetFileFromGroupResponse";
    private byte[] file;
    private String filename;

    @Override
    public String toString() {
        return "GetFileFromGroupResponse{" +
                "filename='" + filename + '\'' +
                '}';
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String type() {
        return TYPE;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }
}
