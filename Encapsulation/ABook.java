import java.util.*;
public class ABook {
    
    private String title;
    private String poet;
    private int yearPublished;

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for poet
    public String getPoet() {
        return poet;
    }
    public void setPoet(String poet) {
        this.poet = poet;
    }

    // Getter and Setter for yearPublished
    public int getYearPublished() {
        return yearPublished;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // Method to display poem details
    public void display() {
        System.out.println("Poem Details:");
        System.out.println("Title         : " + title);
        System.out.println("Poet          : " + poet);
        System.out.println("Published Year: " + yearPublished);
    }

    public static void main(String[] args) {
        ABook poem = new ABook();

        poem.setTitle("In the Bazaars of Hyderabad");
        poem.setPoet("Sarojini Naidu");
        poem.setYearPublished(1912);

        System.out.println(poem.getTitle());
        System.out.println(poem.getPoet());
        System.out.println(poem.getYearPublished());

        poem.display();
    }
}
