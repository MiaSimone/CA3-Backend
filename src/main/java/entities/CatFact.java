
package entities;

/**
 *
 * @author miade
 */
public class CatFact {
    
    /*
    {"used":false,
    "source":"user",
    "type":"cat",
    "deleted":false,
    "_id":"591d9b2f227c1a0020d26823",
    "user":"5a9ac18c7478810ea6c06381",
    "text":"Every year, nearly four million cats are eaten in China as a delicacy.",
    "__v":0,
    "updatedAt":"2020-08-23T20:20:01.611Z",
    "createdAt":"2018-03-17T20:20:02.379Z",
    "status":{"verified":true,"sentCount":1}}
    */
    
    private String id;
    private String type;
    private String user;
    private String text;
    private int version;
    private String createdAt;

    public CatFact(String id, String type, String user, String text, int version, String createdAt) {
        this.id = id;
        this.type = type;
        this.user = user;
        this.text = text;
        this.version = version;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    
}
