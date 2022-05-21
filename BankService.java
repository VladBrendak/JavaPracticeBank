import java.util.Objects;

public class BankService
{
    public BankService() {}

    public void addToRepository(BankRequestDto requestDto)
    {
        BankEntity entity = requestDto.mapToEntity();
        new BankRepository().add(entity);
    }

}
