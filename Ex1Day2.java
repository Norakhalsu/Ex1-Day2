 // import com.sun.source.doctree.EscapeTree;
 // import javax.xml.transform.Source;
 // import java.sql.SQLOutput;
 import java.util.Scanner;

public class Ex1Day2 {

      /*   1.Develop a program that takes the weight (in kilograms) and height (in meters)
           as input and calculates the BMI, then prints it.
           • Input: Weight (kg) = 70, Height (m) = 1.75
           • Expected Output: BMI = 22.86   */

    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter your weight (in kilograms) : ");
        double weight = scanner.nextDouble();

        System.out.println("Enetr your height ( in meters) : ") ;
          double height = scanner.nextDouble();

          double bmi = weight / (height * height);
         System.out.println(" BMI " + bmi);

    } */

      // طريقه اخرى للسوال الاول
     /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter your weight (in kilograms) :");
        double weight = scanner.nextDouble();

        System.out.println(" Enetr your height ( in meters) : ");
        double hight = scanner.nextDouble();

        double bmi=calculatebmi(wight , hight);
        System.out.println(" the BMI is "+ String.format("%.2f" , bmi));
    }
public static double calculatebmi(double yourwight , double yourhight ){
        return  yourwight / (yourhight * yourhight );

} */



    /*  2.Write a program that takes the obtained marks and total marks as input and
        calculates the percentage, then prints it.
       •Input: Obtained Marks = 85, Total Marks = 100
       • Expected Output: Percentage = 85.0%    */

    /* public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);

       System.out.println("Enter obtained mark ");
       double obtained= scan.nextDouble();
       System.out.println("Enter Total Marks ");
       double total=scan.nextDouble();

       double percentage=calculatesPercentage(obtained,total);
       System.out.println("your percentge is " + percentage);
}
    public static double calculatesPercentage(double obtained ,double total ) {
        double  v = (obtained / total) * 100;
        return  v;    }   */





    /*   3. Create a program that takes an amount in one currency and an exchange rate as
         input, then converts and prints the amount in another currency.
         • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
         • Expected Output: Amount in EUR = 85.0     */

  /*  public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter amount in USD ");
        double usd= scan.nextDouble();

        System.out.println("Enter  Exchange Rate (USD to EUR ) ");
        double exchangeRate=scan.nextDouble();

        double amountinEUR=convert(usd, exchangeRate );
        System.out.println( " amount i eur " + amountinEUR) ;
    }
    public static double convert( double usd , double rate){
         double   output= usd * rate ;
         return output;

    } */






     /*    4. Create a program that takes a string as input, calculates its length, and then reverses
           the string using the StringBuilder class, finally printing both the length and reversed string.
           • Input: "Hello, World!"
           • Expected Output: Length of the string: 13 And Reversed string: "!dlroW ,olleH" */

    /*   public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);

           System.out.println(" Enter String input ");
           String stringInput=scan.nextLine();
             int  stringLenght=stringInput.length() ;

           System.out.println(" The lenght of string is " + stringLenght);

           StringBuilder reverString=new StringBuilder(stringInput);
           reverString.reverse();
           System.out.println(" The revers String is " + reverString);
     } */





     /*  5. Develop a program that takes a sentence as input and extracts a substring from it,
         then prints the extracted substring.
         • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
         = 10, End Index = 20
        • Expected Output: "brown fox" */

    /* public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);

         System.out.println(" enter Sentence ");
         String sentence = scan.nextLine();

         int stratindex= 10;
         int endindex= 20;
         String extract = extractSubtract(sentence , stratindex, endindex );
         System.out.println(" the extract subtract sentence is : " + extract);
     }
    public static String extractSubtract(String input , int start , int end ){
         return input.substring( start, end );
   }  */





    /*   6. Write a program that takes a sentence and a keyword as input, then check if the
         keyword is present in the sentence and prints the result.
         • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
         • Expected Output: Keyword "jumps" is present in the sentence.    */

  /*  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter Sentence Please ");
        String sentence = scan.nextLine();

        System.out.println(" Enter KeyWord please ");
        String keyword = scan.nextLine();

        boolean keywordpresent=checkkeyword(sentence , keyword);
        if (keywordpresent){
            System.out.println(" the keyword\" " + keyword +  "\" is prexent in sentence ");
        }

    }
    public static boolean checkkeyword( String sentence  , String keyword){
        return  sentence.contains(keyword);
    }  */




   /*  7. Develop a program that takes a sentence and a word to replace as input, then
       replace all occurrences of the word with another word and prints the modified sentence.
       • Input: Sentence = "The quick brown fox jumps over the lazy dog",
       Word to Replace = "fox", Replacement Word = "cat"
      • Expected Output: "The quick brown cat jumps over the lazy dog"  */

    /* public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println(" Enter your Sentence ");
        String sentence = scanner.nextLine();

        System.out.println(" what word want to replace ?  ");
        String wordtoreplace = scanner.nextLine();

        System.out.println(" write the new word ");
        String newword = scanner.nextLine();

        String modifysentece = replaceword(sentence , wordtoreplace , newword);
        System.out.println(" After modify  the Sentence is  " + modifysentece);
    }
    public static String replaceword( String sentence , String currentword , String newword){
        return  sentence.replaceAll(currentword ,newword );
    }    */





    /*   8. Write a program that takes two strings as input and check if they are equal, ignoring
         the case, then prints whether they are equal or not.
         • Input: String 1 = "Hello", String 2 = "hello"
         • Expected Output: Strings are equal (ignoring case)     */

  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Write Frist String : ");
        String string1 = scanner.nextLine();

        System.out.println(" Write Second String ");
        String strinig2 = scanner.nextLine();

        boolean stringEqual=ckeckEqual(string1 ,strinig2 );

         if ( stringEqual ){
             System.out.println(" the strings are equal ( ignore Case ) ");
         }
         else {
             System.out.println(" the strings are  not equal ( ignore Case ) ");
         }
    }
   public static boolean ckeckEqual( String str1 , String str2 ){
        return  str1.equalsIgnoreCase(str2);
   }    */



}
