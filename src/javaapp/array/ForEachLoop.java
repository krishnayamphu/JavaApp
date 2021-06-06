package javaapp.array;

public class ForEachLoop {
    /**
     * for(type var:arrayList)
     * {
     *     //statements;
     * }
     * =>int age[]=new int[5];
     * =>int[] age=new int[5];
     * =>int []age=new int[5];
     */
class Book{
    private String name;
    private String author;
    private double price;

        public Book() {
        }
        public Book(String name, String author, double price) {
            this.name = name;
            this.author = author;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }

        public double getPrice() {
            return price;
        }
    }
    public static void main(String[] args) {
        String colors[]={"Red","Green","Blue","Yellow","Orange"};

//        for(String color:colors){
//            System.out.println(color);
//        }

        ForEachLoop loop=new ForEachLoop();
        loop.getAllBooks();


    }
    public  void getAllBooks(){
        Book allBooks[]={
                new Book("Java Basic","Ramesh",500d),
                new Book("Java Advanced","Josheph",1500d),
                new Book("C Language","Uttam",6000.25d),
                new Book("Computer Fundamental","Bikash",400d),
                new Book("Spring Boot [J2EE]","Ramesh",900),
        };

        for (Book book:allBooks) {
            System.out.println("Book: "+book.getName());
            System.out.println("Author: "+book.getAuthor());
            System.out.println("Price: Rs."+book.getPrice());
            System.out.println("------------------------------");
        }
    }


}
