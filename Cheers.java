
public class Cheers {
        public static void main(String[] args) {
	
                String Cheer = args[0].toUpperCase();;
                int N = Integer.parseInt(args[1]);
                int i = 0;

                String anLetters = "AEFHILMNORSX";

                while (i < Cheer.length()) {
                    char letter = Cheer.charAt(i);

                    boolean useAn = anLetters.indexOf(letter) >= 0;
                    String article = useAn ? "an" : "a ";

                    System.out.println("Give me " + article + " " + letter + ": " + letter + "!");
                    i++;
                }

                System.out.println("What does that spell?");
                int count = 0;
                while(count < N){
                        System.out.println(Cheer + "!!!");
                        count++;
                }
 }
}