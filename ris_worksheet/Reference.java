import java.util.List;

public class Reference{
    private String referenceType = null;
    private List<String> authors = null;
    private String title = null;
    private String journal = null;
    private int year = 0;
    private int volume = 0;
    private String doi = null;
    private String url = null;
    private String abstractText = null;

    public String getReferenceTyoe(){
        return referenceType;
    }
    
    public List<String> getAuthors(){
        return authors;
    }

    public String getTitle(){
        return title;
    }

    public String getJournal(){
        return journal;
    }

    public int getYear(){
        return year;
    }

    public String getDoi(){
        return doi;
    }

    public String getUrl(){
        return url;
    }

    public String getAbstract(){
        return abstractText;
    }

    public int getVolume(){
        return volume;
    }


    public void setReferenceType(String referenceType){
        this.referenceType = referenceType;
    }

    public void setAuthors(List<String> authors){
        this.authors = authors;
    }

    public void setTitle (String title){
        this.title = title;
    }

    public void setYear(int year){
        this.year = year;
    }
    
    public void setJournal(String journal){
        this.journal = journal;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
    
    public void setDoi(String doi){
        this.doi = doi;
    }

    public void setUrl(String url){
        this.url = url;
    }
    
    public void setAbstract(String abstractText){
        this.abstractText = abstractText;
    }


    
    

}