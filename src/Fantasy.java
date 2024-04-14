public class Fantasy extends Book{
    private String  subGenre;

    public Fantasy(String title, String author, int year, String subGenre) {
        super(title, author, year);
        this.subGenre = subGenre;
    }

    public String getSubGenre() {
        return subGenre;
    }

    public void setSubGenre(String subGenre) {
        this.subGenre = subGenre;
    }

    public void getInfo() {
        System.out.printf("Title: %s, Author: %s, Year: %s, subGenre: %s \n",title,author,year,subGenre);
    }
}
