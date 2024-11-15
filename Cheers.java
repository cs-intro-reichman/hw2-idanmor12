// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheeringWord = args[0].toUpperCase();
                int repeatsNum = Integer.parseInt(args[1]);
                String VowelSoundLetters = "AEFHILMNORSX";

                for (int i = 0; i < cheeringWord.length(); i++) {
                        char currLetter = cheeringWord.charAt(i);
                        String indefiniteArticle= "a ";
                                for (int j = 0; j < VowelSoundLetters.length(); j++) {
                                        if (VowelSoundLetters.indexOf(currLetter) != -1)
                                        {
                                                indefiniteArticle = "an";
                                                break;
                                        }
                                }
                        System.out.print("Give me " + indefiniteArticle + " " + currLetter + ": ");
                        System.out.println(currLetter + "!");
                }

                System.out.println("What does that Spell?");
                for (int i = 0; i < repeatsNum; i++) {
                        System.out.println(cheeringWord + "!!!");
                }
                System.out.println();
        }
}
