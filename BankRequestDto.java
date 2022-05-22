import java.util.Objects;

public class BankRequestDto {
    private int id;
    private String name;
    private int qnt;

    private BankMapper bankMapper = new BankMapper();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankRequestDto that = (BankRequestDto) o;
        return id == that.id && qnt == that.qnt && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, qnt);
    }

    @Override
    public String toString() {
        return "BankRequestDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qnt=" + qnt +
                '}';
    }

    public BankEntity mapToEntity()
    {
        return bankMapper.mapRequestDtoToEntity(this);
    }
}
