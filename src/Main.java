
    import java.sql.SQLOutput;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            //let's create a scanner
            Scanner myScanner = new Scanner(System.in);
            //Name
            System.out.println("Hey, we are doing a totally useful survey so please tell me your name!");
            String name = myScanner.nextLine();
            System.out.println("Welcome,(*^▽^*) " + name);
            //
            System.out.println("Where are you from?");
            String response1 = myScanner.nextLine();
            if (response1 == "Allen") {
                System.out.println("That's where I'm from!");
            }
            else{
                System.out.println("Nice!");
            }
            System.out.println("Random Fact: A day on Venus lasts longer than a year, it is 243 Earth days. What is your random fact?");
            String fact = myScanner.nextLine();
            System.out.println("Wow! That is sick!");
            //Number
            System.out.println("Please tell me your favorite number.");
            int response = myScanner.nextInt();
            if (response == 10) {
                System.out.println("WOW that's my favourite number too");
            } else {
                System.out.println("Oof Good for you but 10 is better");
            }
                for (int i = 1; i <= 100; i++) {

                    int remainder = response % i; // let's get the remainder of response divided by 7
                    if (remainder == 0) {
                        System.out.println("Oh by the way, your number is divisible by  " + i);

                    }
                }
            }
        }

