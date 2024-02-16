public class cwh_practset_2 {
    public static void main(String[] args) {
        // Problem 1
        String name = "Harry";
        String lstring = name.toLowerCase();
        System.out.println(lstring);

        // Problem 2
        String Text ="To Lower Case";
        Text=Text.replace(" ","_");
        System.out.println(Text);

        // Problem 3
        String Letter ="Dear <|name|>,Thanks a lot";
        Letter=Letter.replace("<|name|>","zaid");
        System.out.println(Letter);

        //Problem 4
        String myString="This  String   contains double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Problem 5
        String letter =" Dear Harry ,\n\t This Java Course is nice\n\t. Thanks!";
        System.out.println(letter);


    }
}
