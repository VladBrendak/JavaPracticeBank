import java.util.Objects;

public class BankResponseDTO {
    private int id;
    private String name;
    private int qnt;

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
        BankResponseDTO that = (BankResponseDTO) o;
        return id == that.id && qnt == that.qnt && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, qnt);
    }

    @Override
    public String toString() {
        return "BankResponseDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qnt=" + qnt +
                '}';
    }
}
