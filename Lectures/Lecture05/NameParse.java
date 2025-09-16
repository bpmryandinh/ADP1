package Names;
public class NameParse {
    public static void main(String[] args) {
        String name = "    Maxwell    ,     Jeff      ";
        
        int comma = name.indexOf(',');
        
        String lastName = name.substring(0, comma)
                              .trim();

        String firstName = name.substring(comma + 1, name.length()).trim();

        System.out.println(firstName + " " + lastName);

        firstName = firstName.replace("e", "E");

        System.out.println(firstName + " " + lastName);


    }
}
