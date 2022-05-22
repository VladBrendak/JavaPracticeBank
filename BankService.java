import java.util.Objects;

public class BankService
{
    public BankService() {}

    private BankRepository bankRepo = new BankRepository();

    public void addToRepository(BankRequestDto requestDto)
    {
        bankRepo.addToList(requestDto.mapToEntity());
    }

}
