import java.util.ArrayList;
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

        BankRequestDto requestDto = new BankRequestDto();

        requestDto.setId(BankId);
        requestDto.setName(BankName);
        requestDto.setQnt(BankQnt);

        BankController bankController = new BankController();
        bankController.createBank(requestDto);

        BankService bankService = new BankService();
        bankService.addToRepository(requestDto);

        BankRepository bankRepository = new BankRepository();

        ArrayList<BankEntity> list = new ArrayList<BankEntity>();

    }
}