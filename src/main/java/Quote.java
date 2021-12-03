import java.io.Serializable;

public class Quote implements Serializable {
    private String author;
    private String content;

    public Quote(){};

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
