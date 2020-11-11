
package dto;

/**
 *
 * @author Selina A.S.
 */

public class KanyeWestDTO {
    private final String quote;

    public KanyeWestDTO(String quote) {
        this.quote = quote;
    }
    
    public String getQuote() {
        return quote;
    }
    
    @Override
    public String toString() {
        return "KanyeWestDTO {" + "quote=" + quote + '}';
    }  
}
