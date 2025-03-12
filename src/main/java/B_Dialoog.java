public class B_Dialoog {

    public static void main(String[] args) {
        // In deze dialoog praten Bert en Ernie met elkaar.
        // Maak methode bertSays die "Bert says: " + de string print en een methode ernieSays die de string " says Ernie" print.
        // De methode heeft als parameter de tekst die gesproken moet worden.
        // De volgende zin wordt steeds door de ander gesproken.
        // Vervang System.out.println() steeds door je eigen method.

        String hey = ("Hey"); //Bert //Ernie
        // String hey = ("Hey");
        String welkom = ("Welcome to this wonderful conversation"); //Bert
        String welkom1 = ("Thnx, I'm looking forward to it"); //Ernie
        String weather = ("How about this weather?"); //Bert
        String cold = ("I really don't mind the cold...."); //Ernie
        String program =("And did you see that random program on that random channel?"); //Bert
        String channel = ("Well... I did watch a random program on a random channel..."); //Ernie
        String bye = ("Thank you for a wonderful conversation!"); //Bert
        String bye1 = ("Cya"); //Ernie

        bertSays(hey);
        ernieSays(hey);
        bertSays(welkom);
        ernieSays(welkom1);
        bertSays(weather);
        ernieSays(cold);
        bertSays(program);
        ernieSays(channel);
        bertSays(bye);
        ernieSays(bye1);
    }

    // nieuwe methods komen hier

    public static void bertSays(String text) {
        System.out.println("Bert says: " + text );
    }

    public static void ernieSays(String text) {
        System.out.println(text + " says Ernie");
    }

}
