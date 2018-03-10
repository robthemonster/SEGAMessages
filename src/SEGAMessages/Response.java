package SEGAMessages;

import java.io.Serializable;

public abstract class Response implements Serializable {
    public abstract String type();
}
