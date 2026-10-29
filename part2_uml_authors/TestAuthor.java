package part2_uml_authors;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
        System.out.println(author);
        
        author.setEmail("newemail@somewhere.com");
        System.out.println("Измененный email: " + author.getEmail());
    }
}
