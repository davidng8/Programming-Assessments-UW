// This program will produce a couple a verses that are repeating.
public class Song {
    public static void main(String[] args){
        fly();
        spider();
        bird();
        cat();
        dog();
        cougar();
        horse();
    }

    //produces the first line in the first paragraph
    public static void fly(){ 
        System.out.println("There was an old woman who swallowed a fly.");
        endline();
    }

    //produces the first 2 lines in the 2nd paragraph
    public static void spider(){
        System.out.println("There was an old woman who swallowed a spider,");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        spiderFly();
        endline();
    }

    //produces the first 2 lines in the 3nd paragraph
    public static void bird(){
        System.out.println("There was an old woman who swallowed a bird,");
        System.out.println("How absurd to swallow a bird.");
        birdSpider();
        endline();

    }
    
    //produces the first 2 lines in the 4th paragraph
    public static void cat(){
        System.out.println("There was an old woman who swallowed a cat,");
        System.out.println("Imagine that to swallow a cat.");
        catBird();
        endline();
    }

    //produces the first 2 lines in the 5th paragraph
    public static void dog(){
        System.out.println("There was an old woman who swallowed a dog,");
        System.out.println("What a hog to swallow a dog.");
        dogCat();
        endline();

    }

    //the custom line with it produces the first 2 lines at the start of the 6th paragraph
    public static void cougar(){
        System.out.println("There was an old woman who swallowed a cougar,");
        System.out.println("What a loser to swallow a cougar.");
        spiderCougar();
        endline();

    }

    //produces the last two final lines
    public static void horse(){
        System.out.println("There was an old woman who swallowed a horse,");
        System.out.println("She died of course.");

    }

    //produces the last two lines in every paragraph including the space
    public static void endline(){
        System.out.println("I don't know why she swallowed that fly,");
        System.out.println("Perhaps she'll die.");
        System.out.println();

    }

    //the 3rd line in the 2nd paragraph
    public static void spiderFly(){
        System.out.println("She swallowed the spider to catch the fly,");
  
    }

    //produces the 3rd line in the 3rd paragraph and adding the lines in the previous paragraph
    public static void birdSpider(){
        System.out.println("She swallowed the bird to catch the spider,");
        spiderFly();
 
    }

    //produces the 3rd line in the 4th paragraph and adding the lines in the previous paragraph
    public static void catBird(){
        System.out.println("She swallowed the cat to catch the bird,");
        birdSpider();
        
    }

    //produces the 3rd line in the 5th paragraph and adding the lines in the previous paragraph
    public static void dogCat(){
        System.out.println("She swallowed the dog to catch the cat,");
        catBird();

    }

    //produces the 3rd line in the 6th paragraph and adding the lines in the previous paragraph
    public static void spiderCougar(){
        System.out.println("She swallowed the cougar to catch the dog,");
        dogCat();

    }
}
