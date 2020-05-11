package se.lexicon.MartinKlasson;

public class App 
{
    public static void main( String[] args )
    {
        String[] clients1 = {"Martin", "Anders"};
        SalesPerson salesP1 = new SalesPerson(clients1, 3);
        String[] certs = {"AbbA", "Arla", "Lexicon"};
        String[] languages = {"Java", "C++"};
        SystemDeveloper develop1 = new SystemDeveloper(certs,languages);
        System.out.println(salesP1);
        salesP1.calculateSalary();
        System.out.println(develop1);
        develop1.calculateSalary();
    }
}
