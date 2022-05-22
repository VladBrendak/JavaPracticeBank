import java.util.Objects;

public class BankController
{
    public BankController() {}

    private BankService bankService = new BankService();

    public void createBank(BankRequestDto requestDto)
    {
        bankService.addToRepository(requestDto);
    }
}
