import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pattern p = new Pattern("=");
        Scanner scan = new Scanner(System.in);
        Customer g;
        String loc;
        System.out.println("Please enter your Customer Location");

        try {
           loc = scan.nextLine();
           g = switch (loc) {
                case ("punjab") -> new Punjab();
                case ("jammu") -> new Jammu();
                case ("himachal") -> new Himachal();
                default -> throw new IllegalArgumentException("Enter valid location");
            };
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            loc = scan.nextLine();
            g = switch (loc) {
                case ("punjab") -> new Punjab();
                case ("jammu") -> new Jammu();
                case ("himachal") -> new Himachal();
                default -> throw new IllegalArgumentException("Enter valid location");
            };
        }


        g.setcLoc(loc);
            System.out.println("Please enter Customer Name");
           try {g.setcName(scan.nextLine());}
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                System.out.println("Please enter Customer Name");
                g.setcName(scan.nextLine());

        }

            System.out.println("Please enter CustomerID");
        try {g.setcID(scan.nextLine());}
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            //System.out.println("Please enter CustomerID");
            g.setcID(scan.nextLine());

        }

            System.out.println("Please enter the number of units");
            g.setnUnits(scan.nextInt());
            LocalDateTime Date = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy                                      HH:mm");
//            System.out.println("==========================================================================================================================================================================================================================================================================================================================================================================");
            p.print();
            String formattedDate = Date.format(myFormatObj);
            System.out.println();
            System.out.println("DATE                                            TIME");
            System.out.println(formattedDate);

            g.bill();

    }
}