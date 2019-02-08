public class RegexTestStrings {

    public static void main(String[] args) {
        String[] validNames= {"3M", "ABC", "Google", "mozaiq operations GmbH", "Robert Bosch GmbH. Wuppertal", "Föhringer Bratwurstl AG",
        "Cox's Crackers", "Mc`Guire's", "Ditcher, Quick & Hyde", "Sew What?", "Ben&Jerry", "René Magritte Panties", "Søren Kierkegård",
        "Mika Häkkinen Steering Wheels", "Camille Saint-Saëns",
        "András Sütő", "Trevor Żahra", "Tor Åge Bringsværd", "123 Co.",
        "Lech Wałęsa", "Ľudovít Štúr", "Chocs_and_Donuts","1+1", "1&1", "Yahoo!", "Ἀρχὴ μεγίστη τοῦ βίου τὰ γράμματα"};
        String[] invalidNames= {"", "<<<====", "alert()", "123", "Bosch "};
        
        String validRegex="^[\\p{L}\\d\\w][\\p{L}\\d\\w\'\"` ,.\\-&@\\+\\!]+$";
        
        int numberOfItems = validNames.length;
        for (int i=0; i<numberOfItems; i++)
        {
            String name = validNames[i];
            System.out.println(name);
            System.out.println(name.matches(validRegex));
        }
        
        numberOfItems = invalidNames.length;
        for (int i=0; i<numberOfItems; i++)
        {
            String name = invalidNames[i];
            System.out.println(name);
            System.out.println(name.matches(validRegex));
        }
       
    }
}
