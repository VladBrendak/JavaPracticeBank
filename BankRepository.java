import java.util.ArrayList;

public class BankRepository
{
    public BankRepository() {}

    ArrayList<BankEntity> List = new ArrayList<BankEntity>();

    public void add(BankEntity  bankEntity)
    {
        List.add(bankEntity);
    }

    public ArrayList<BankEntity> getList()
    {
        return List;
    }

    public void displayList()
    {
        System.out.println("Display Banks");
        for(int i = 0; i < List.size(); i++)
        {
            System.out.println(List.get(i).toString());
        }
    }

}

