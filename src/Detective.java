public class Detective extends  Book{
    private String detectiveType;

    public Detective(String title, String author, int year, String detectiveType) {
        super(title, author, year);
        this.detectiveType = detectiveType;
    }

    public String getDetectiveType() {
        return detectiveType;
    }

    public void setDetectiveType(String detectiveType) {
        this.detectiveType = detectiveType;
    }

    public void getInfo() {
        System.out.printf("Title: %s, Author: %s, Year: %s, DetectiveType: %s \n",title,author,year,detectiveType);
    }
}
