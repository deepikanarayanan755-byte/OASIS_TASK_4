import java.util.Scanner;

public class OnlineMCQExam {

    static String username = "student";
    static String password = "1234";
    static String name = "Deepika";
    static String email = "student@mail.com";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("===== ONLINE MCQ EXAM SYSTEM =====");

        // LOGIN
        System.out.print("Enter Username: ");
        String user = sc.next();

        System.out.print("Enter Password: ");
        String pass = sc.next();

        if(user.equals(username) && pass.equals(password)) {
            System.out.println("Login Successful!\n");

            do {
                System.out.println("\n1. Update Profile");
                System.out.println("2. Change Password");
                System.out.println("3. Start Exam");
                System.out.println("4. Logout");
                System.out.print("Enter Choice: ");
                choice = sc.nextInt();

                switch(choice) {

                    case 1:
                        updateProfile(sc);
                        break;

                    case 2:
                        changePassword(sc);
                        break;

                    case 3:
                        startExam(sc);
                        break;

                    case 4:
                        System.out.println("Logged out successfully!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while(choice != 4);

        } else {
            System.out.println("Invalid Login!");
        }

    }

    // UPDATE PROFILE
    public static void updateProfile(Scanner sc) {

        System.out.println("\n--- Update Profile ---");

        System.out.print("Enter New Name: ");
        name = sc.next();

        System.out.print("Enter New Email: ");
        email = sc.next();

        System.out.println("Profile Updated Successfully!");
    }

    // CHANGE PASSWORD
    public static void changePassword(Scanner sc) {

        System.out.println("\n--- Change Password ---");

        System.out.print("Enter Old Password: ");
        String old = sc.next();

        if(old.equals(password)) {
            System.out.print("Enter New Password: ");
            password = sc.next();
            System.out.println("Password Updated!");
        } else {
            System.out.println("Incorrect Old Password!");
        }
    }

    // START EXAM
    public static void startExam(Scanner sc) {

        int score = 0;
        int ans;

        System.out.println("\nExam Started!");
        System.out.println("You have limited time!");

        try {
            Thread.sleep(2000); // Simple timer simulation
        } catch(Exception e){}

        // QUESTION 1
        System.out.println("\n1. Java is a?");
        System.out.println("1. Programming Language");
        System.out.println("2. Coffee");
        System.out.println("3. Operating System");
        System.out.println("4. Browser");

        ans = sc.nextInt();
        if(ans == 1) score++;

        // QUESTION 2
        System.out.println("\n2. Which keyword is used for class?");
        System.out.println("1. define");
        System.out.println("2. class");
        System.out.println("3. struct");
        System.out.println("4. object");

        ans = sc.nextInt();
        if(ans == 2) score++;

        // QUESTION 3
        System.out.println("\n3. JVM stands for?");
        System.out.println("1. Java Variable Machine");
        System.out.println("2. Java Virtual Machine");
        System.out.println("3. Java Verified Machine");
        System.out.println("4. Joint Virtual Machine");

        ans = sc.nextInt();
        if(ans == 2) score++;

        // AUTO SUBMIT
        System.out.println("\nExam Submitted Automatically!");

        System.out.println("Your Score: " + score + "/3");
    }
}