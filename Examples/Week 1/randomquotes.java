//Playing with a decent distribution of random numbers, integer casting
//and arrays
package randomquotes;

public class Main {

    static String[] quotes ={"hello", "shalom", "bonjour", "hola", "jambo", "hallo", "hej", "hei", "Ola", "helo", "czesc", "ciao", "halo", "szia"};

    public static void main(String[] args) {

        double generatedRandom = Main.randomNumberGenerator();

        int generatedRandomInteger = (int) generatedRandom; //cast: convert one type of variable to another

        System.out.println("Here is your quote of the day.");
        System.out.println("Quote: " + quotes[generatedRandomInteger-1]); //adjust random number for array; index into the array (0 to 14)
        //System.out.println(generatedRandomInteger);
    }

    public static double randomNumberGenerator(){

        double random = Math.floor((Math.random()*14)+1);

        return random;

    }

}