import java.util.*;

class IDCard {
    String name;
    String id;
    String department;
    String contact;

    IDCard(String name, String id, String department, String contact) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.contact = contact;
    }

    void displayCard() {
        System.out.println("=================================");
        System.out.println("|         ID CARD               |");
        System.out.println("=================================");
        System.out.println("| Name      : " + name);
        System.out.println("| ID        : " + id);
        System.out.println("| Dept.     : " + department);
        System.out.println("| Contact   : " + contact);
        System.out.println("=================================");
    }
}

public class IDCardGenerator {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<IDCard> cards = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- ID Card Generator System ---");
            System.out.println("1. Create New ID Card");
            System.out.println("2. View All ID Cards");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1: createCard(); break;
                case 2: viewCards(); break;
                case 3: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }

    static void createCard() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Contact No.: ");
        String contact = sc.nextLine();

        IDCard newCard = new IDCard(name, id, dept, contact);
        cards.add(newCard);
        System.out.println("ID Card created successfully!\n");
        newCard.displayCard();
    }

    static void viewCards() {
        if (cards.isEmpty()) {
            System.out.println("No ID Cards available.");
            return;
        }

        System.out.println("\n--- All Generated ID Cards ---");
        for (IDCard card : cards) {
            card.displayCard();
        }
    }
}