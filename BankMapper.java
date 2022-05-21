

public class BankMapper
{
    public BankMapper() {}

    public BankEntity mapRequestDtoToEntity(BankRequestDto requestDto)
    {
        if (requestDto == null)
        {
            return null;
        }

        BankEntity bankEntity = new BankEntity();

        bankEntity.setId(requestDto.getId());
        bankEntity.setName(requestDto.getName());
        bankEntity.setQnt(requestDto.getQnt());

        return bankEntity;
    }

}
