
package dto;

import entities.CatFact;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miade
 */
public class CatFactDTO {
    
    /*
    "_id":"591d9b2f227c1a0020d26823",
    "text":"Every year, nearly four million cats are eaten in China as a delicacy.",
    "createdAt":"2018-03-17T20:20:02.379Z"
    */
    
    private String id;
    private String text;
    private String createdAt;
    
    private List<CatFactDTO> catFactList;

    public CatFactDTO() {}

    public CatFactDTO(CatFact catFact) {
        this.id = catFact.getId();
        this.text = catFact.getText();
        this.createdAt = catFact.getCreatedAt();
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

    public List<CatFactDTO> getCatFactList() {
        return catFactList;
    }

    public void addCatFactToList(CatFactDTO catFact) {
        this.catFactList.add(catFact);
    }
    
    
    
    
}
