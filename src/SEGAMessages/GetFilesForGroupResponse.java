package SEGAMessages;

import java.util.List;

public class GetFilesForGroupResponse extends Response {
    public static final String TYPE = "GetFilesForGroupResponse";
    private List<FileAttributes> files;

    @Override
    public String type() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "GetFilesForGroupResponse{" +
                "files=" + files +
                '}';
    }

    public List<FileAttributes> getFiles() {
        return files;
    }

    public void setFiles(List<FileAttributes> files) {
        this.files = files;
    }
}
