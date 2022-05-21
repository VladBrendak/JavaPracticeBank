import java.util.Objects;

public class BankController
{
    public BankController() {}

    public void createBank(BankRequestDto requestDto)
    {
        new BankService().addToRepository(requestDto);
    }
}
