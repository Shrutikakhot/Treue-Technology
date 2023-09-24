import java.util.Scanner;

class Movie_Recommender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("WELCOME TO MOVIE RECOMMENDATION SYSTEM");
        System.out.println("=============================================");
        System.out.println("Select the language:");
        System.out.println("1.ENGLISH");
        System.out.println("2.HINDI");
        System.out.println("3.TAMIL");
    
        int language = input.nextInt();    
        if (language == 1) {
            System.out.println("=============================================");
            System.out.println("Your Selected Language is English");
            System.out.println("=============================================");
            System.out.println("Select the Options:");
            System.out.println("1.ACTION");
            System.out.println("2.ADAVENTURE");
            System.out.println("3.COMEDY");
            int option1 = input.nextInt();
            System.out.println("These are the Recommended Movies for you");
            if (option1 == 1) {
                System.out.println("1.JAWAN");
                System.out.println("2.TRANSPORTERS");
                System.out.println("3.JAILER");
                System.out.println("4.POLICE STORY");
            } else if (option1 == 2) {
                System.out.println("1.JURASSIC PARK");
                System.out.println("2.777 CHARLIE");
                System.out.println("3.BRAHMASTRA");
                System.out.println("4.BARBIE");

            } else if (option1 == 3) {
                System.out.println("1.SIMMBA");
                System.out.println("2.JUG JUGG JEEYO");
                System.out.println("3.MR.BEAN");
                System.out.println("4.GOVINDA NAAM MERA");
            } 
        }
        if (language == 2) {
            System.out.println("=============================================");
            System.out.println("Your Selected Language is Hindi");
            System.out.println("=============================================");
            System.out.println("Select the Options:");
            System.out.println("1.ACTION");
            System.out.println("2.ADAVENTURE");
            System.out.println("3.COMEDY");
            int option2 = input.nextInt();
            System.out.println("These are the Recommended Movies for you");
            if (option2 == 1) {
                System.out.println("1.PATHAN");
                System.out.println("2.FORCE");
                System.out.println("3.DON");
                System.out.println("4.ATTACK");
            } else if (option2 == 2) {
                System.out.println("1.SATHYAMEVA JAYATHE");
                System.out.println("2.BELL BOTTOM");
                System.out.println("3.URI");
                System.out.println("4.ANTHIM");

            } else if (option2 == 3) {
                System.out.println("1.GRAND MASTHI");
                System.out.println("2.GOLMAL-2");
                System.out.println("3.CHENNAI EXPRESS");
                System.out.println("4.REMO");
            } 
        }
        if (language == 3) {
            System.out.println("=============================================");
            System.out.println("Your Selected Language is Tamil");
            System.out.println("=============================================");
            System.out.println("Select the Options:");
            System.out.println("1.ACTION");
            System.out.println("2.ADAVENTURE");
            System.out.println("3.COMEDY");
            int option3 = input.nextInt();
            System.out.println("These are the Recommended Movies for you");
            if (option3 == 1) {
                System.out.println("1.THUPPAKI");
                System.out.println("2.VEDALAM");
                System.out.println("3.KABALI");
                System.out.println("4.ANJAN");
            } else if (option3 == 2) {
                System.out.println("1.KOCHDIYAN");
                System.out.println("2.TEDDY");
                System.out.println("3.CAPTIAN");
                System.out.println("4.MAANAADU");

            } else if (option3 == 3) {
                System.out.println("1.THAMIZ PADAM");
                System.out.println("2.123");
                System.out.println("3.RAJINI MRUGAN");
                System.out.println("4.HERA PHERI");
            } 
        }
        System.out.println("=============================================");
        System.out.println("............THANK YOU VISIT AGAIN............");
        System.out.println("=============================================");

    }
}