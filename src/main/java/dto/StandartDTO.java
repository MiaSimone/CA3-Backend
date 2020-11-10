
package dto;

/**
 *
 * @author miade
 */
public class StandartDTO {
    
    private String time;
    
    private String id;
    private String text;
    private String createdAt;

    public StandartDTO(CatFactDTO factDTO, String time) {
        this.time = time;
        this.id = factDTO.getId();
        this.text = factDTO.getText();
        this.createdAt = factDTO.getCreatedAt();
    }

    public StandartDTO() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    
    
    
    
    
}
