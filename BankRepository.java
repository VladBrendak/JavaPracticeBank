import java.util.ArrayList;

public class BankRepository
{
    public BankRepository() {}

    private ArrayList<BankEntity> List = new ArrayList<BankEntity>();

    public void addToList(BankEntity  bankEntity)
    {
        List.add(bankEntity);
    }
}
