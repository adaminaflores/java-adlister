import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    private String artist;
    private String name;
    private Date releaseDate;
    private Float sales;
    private String genre;

    public Album(){};

    public String getArtist(){
        return artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public String name(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Date getReleaseDate(){
        return releaseDate;
    }
    public void setReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    }
    public Float getSales(){
        return sales;
    }
    public void setSales(Float sales){
        this.sales = sales;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }


}
