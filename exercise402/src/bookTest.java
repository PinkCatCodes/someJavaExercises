import java.util.Scanner;

public class bookTest {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        Book book1 = new Book("Maria","Swim", 30, 150);
        Book book2 = new Book("Steve", "love", 15,50);

        System.out.println("Enter author for first book: ");
        String author; //initialising author
        author = keyboard.nextLine();

        System.out.println("Enter title of the first book: ");
        String title = keyboard.nextLine();// this is the same as initialisng author above

        System.out.println(" Enter price of the first book:");
        double price = keyboard.nextInt();

        System.out.println("Enter the amount of the pages");
        int pages = keyboard.nextInt();
        String emptyBuffer = keyboard.nextLine();// enter this line if the string needs to read after int


        book2.setAuthor(author);
        System.out.println("Enter the author for the second book:");
        author = keyboard.nextLine(); //once variable  is initialised it can be used anywhere

        book2.setTitle(title);
        System.out.println("Enter the title of the second book:");
        title = keyboard.nextLine();

        book2.setPrice(price);
        System.out.println("Enter the price for the second book:");
        price = keyboard.nextInt();

//        emptyBuffer = keyboard.nextLine();

        book2.setPages(pages);
        System.out.println("Enter the amount of pages for the second book:");
        pages = keyboard.nextInt();

        book1.setPrice(price);
        System.out.println("Enter the new price:");
        price = keyboard.nextInt();
        price = price - (price *20/100);
        System.out.println("the new price is:"+price);

        book2.setPrice(price);
        System.out.println("Enter the new price for the second book:");
        price = keyboard.nextInt();


    }

}
