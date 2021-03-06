package com.jayr.mabibloteque.Utility;

import com.jayr.mabibloteque.Model.Book;

import java.util.ArrayList;

public class Utils {
//    SingleTon Class , that will aid in reducing code boilerplate

    private static ArrayList<Book>allBooks;
    private static ArrayList<Book>alreadyReadBooks;
    private static ArrayList<Book>currentBookReads;
    private static ArrayList<Book>bookWishList;
    private static ArrayList<Book>favouriteBooks;

    private static Utils instance;

//    Makes sure there exists an instance of the class and if already instantiated we return the instance
//TODO: Create SharedPreference, add contect in the utils constructor and instance,
//    we will initalize a new arralist  then convert it to json using the GSON library (Serializing ) then adding it to the shared prefrences...


    public static Utils getInstance() {
        if(null!=instance){
        return instance;
        }
        else{
            instance = new Utils();
            return instance;
        }
    }

    private  Utils() {
        if( null == allBooks  ) {
            allBooks =new ArrayList<>();
            initData();
        }
        if( null == alreadyReadBooks  ) {
            alreadyReadBooks =new ArrayList<>();

        }
        if( null == currentBookReads  ) {
            currentBookReads =new ArrayList<>();

        }
        if( null == bookWishList  ) {
            bookWishList =new ArrayList<>();

        }
        if( null == favouriteBooks  ) {
            favouriteBooks =new ArrayList<>();

        }
    }

    private void initData() {
//    TODO : Data for the books
        allBooks.add(new Book("A001",
                "Laws Of Human Nature",
                "Robert Greene",
                588,
                "https://images-na.ssl-images-amazon.com/images/I/71OMelbI6sL.jpg",
                "Robert Greene is a master guide for millions of readers," +
                        " distilling ancient wisdom and philosophy into essential texts for seekers of power," +
                        " understanding and mastery. Now he turns to the most important subject of all " +
                        "- understanding people's drives and motivations," +
                        " even when they are unconscious of them themselves.",
                "We are social animals. Our very lives depend on our relationships with people." +
                        " Knowing why people do what they do is the most important tool we can possess," +
                        " without which our other talents can only take us so far." +
                        " Drawing from the ideas and examples of Pericles, Queen Elizabeth I," +
                        " Martin Luther King Jr, and many others, Greene teaches us how to detach ourselves" +
                        " from our own emotions and master self-control, how to develop the empathy that leads to insight, " +
                        "how to look behind people's masks, and how to resist conformity to develop your singular sense of purpose." +
                        " Whether at work, in relationships, or in shaping the world around you," +
                        " The Laws of Human Nature offers brilliant tactics for success, self-improvement, and self-defense."));
        allBooks.add(new Book(
                "A002",
                "Human + Machine",
                "Paul R. Daugherty and H. James Wilson",
                264,
                "https://www.uxmatters.com/mt/archives/2019/02/images/Cover_Human+Machine.png",
                "The authors' goal in publishing Human + Machine is to help executives, workers, " +
                        "students and others navigate the changes that AI is making to business and the economy. " +
                        "They believe AI will bring innovations that truly improve the way the world works and lives." +
                        " However, AI will cause disruption, and many people will need education, training and support " +
                        "to prepare for the newly created jobs. To support this need, the authors are donating the royalties " +
                        "received from the sale of this book to" +
                        " fund education and retraining programs focused on developing fusion skills " +
                        "for the age of artificial intelligence.",
                "Look around you. Artificial intelligence is no longer just a futuristic notion. I" +
                        "t's here right now--in software that senses what we need, supply chains that \"think\"" +
                        " in real time, and robots that respond to changes in their environment. Twenty-first-century pioneer companies are already using AI to innovate and grow fast. The bottom line is this: Businesses that understand how to harness AI can surge ahead. Those that neglect it will fall behind. Which side are you on?\n" +
                        "\n" +
                        "In Human + Machine, Accenture leaders Paul R. Daugherty and H. James (Jim) Wilson show" +
                        " that the essence of the AI paradigm shift is the transformation of all business processes " +
                        "within an organization--whether related to breakthrough innovation, everyday customer service," +
                        " or personal productivity habits. As humans and smart machines collaborate ever more closely, " +
                        "work processes become more fluid and adaptive, enabling companies to change them on the fly--or " +
                        "to completely reimagine them. AI is changing all the rules of how companies operate.\n" +
                        "\n" +
                        "Based on the authors' experience and research with 1,500 organizations," +
                        " the book reveals how" +
                        " companies are using the new rules of AI to leap ahead on innovation " +
                        "and profitability, as well " +
                        "as what you can do to achieve similar results. It describes six en" +
                        "tirely new types of hybrid " +
                        "human + machine roles that every company must develop, and it includes a \"leader’s guide\" " +
                        "with the five crucial principles required to become an AI-fueled business.\n" +
                        "\n" +
                        "Human + Machine provides the missing and much-needed management playbook for success in " +
                        "our new age of AI.\n" +
                        "\n" +
                        "BOOK PROCEEDS FOR THE AI GENERATION\n" +
                        "The authors' goal in publishing Human + Machine is to help executives, workers, students " +
                        "and others navigate the changes that AI is making to business and the economy. " +
                        "They believe AI will bring innovations that truly improve the way the world works and " +
                        "lives. However, AI will cause disruption, and many people will need education, training " +
                        "and support to prepare for the newly created jobs. To support this need, the authors are" +
                        " donating the royalties received from the sale of this book to fund education and retraining" +
                        " programs focused on developing fusion skills for the age of artificial intelligence"
        ));

    }

    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public static ArrayList<Book> getAlreadyReadBooks() {
        return alreadyReadBooks;
    }

    public static ArrayList<Book> getCurrentBookReads() {
        return currentBookReads;
    }

    public static ArrayList<Book> getBookWishList() {
        return bookWishList;
    }

    public static ArrayList<Book> getFavouriteBooks() {
        return favouriteBooks;
    }


    public Boolean AddToAlreadyAdded(Book book){
        return alreadyReadBooks.add(book);
    }

    public Boolean AddToCurrentReads(Book book){
        return currentBookReads.add(book);
    }

    public Boolean AddToWishList(Book book){
        return bookWishList.add(book);
    }

    public Boolean AddToFavourites(Book book){
        return favouriteBooks.add(book);
    }

    public Boolean RemoveFromFavourites(Book book){
        return favouriteBooks.remove(book);
    }
    public Boolean RemoveFromAlreadyAdded(Book book){
        return alreadyReadBooks.remove(book);
    }
    public Boolean RemoveFromCurrentReads(Book book){
        return currentBookReads.remove(book);
    }
    public Boolean RemoveFromWishList(Book book){
        return bookWishList.remove(book);
    }


    public Book getBookById(String id){
        for (Book b:allBooks) {
            if (id.equals(b.getId())) {
                return b;
            }
        }
        return null;
    }

}
