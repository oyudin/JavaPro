package homeWork5;

public class ReverceStringMain {
    public static void main(String[] args) {

        String sentence = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        String[] devidedSentence = sentence.split("Z");

        for (String word:devidedSentence) {
            for (int i = word.length() -1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
}