import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program Bank running... \n");

        System.out.print("Enter bank id: ");
        int BankId = in.nextInt();

        System.out.print("Enter bank name: ");
        String BankName = in.next();

        System.out.print("Enter bank qnt: ");
        int BankQnt = in.nextInt();

        BankRequestDTO dto = new BankRequestDTO();

        dto.setId(BankId);
        dto.setName(BankName);
        dto.setQnt(BankQnt);




    }
}