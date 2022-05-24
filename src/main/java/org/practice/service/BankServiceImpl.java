package org.practice.service;

import org.practice.dto.BankRequestDto;
import org.practice.dto.BankResponseDto;
import org.practice.mapper.BankMapper;
import org.practice.repository.BankRepositoryImpl;

import java.util.List;
import java.util.stream.Collectors;

public class BankServiceImpl implements BankService {
    private final BankRepositoryImpl bankRepositoryImpl = new BankRepositoryImpl();
    private final BankMapper bankMapper = new BankMapper();

    @Override
    public void createBank(BankRequestDto bankRequestDto)
    {
        //TODO add check unique object
        bankRepositoryImpl.add(bankMapper.bankRequestDtoToBankEntity(bankRequestDto));
    }

    @Override
    public List<BankResponseDto> getAllBanks()
    {
        return bankRepositoryImpl.getAllBanks()
                .stream()
                .map(bankMapper::bankEntityToBankResponseDto).collect(Collectors.toList());
    }

    @Override
    public BankResponseDto getById(int id)
    {
        return null;
    }

    @Override
    public void deleteById(int id)
    {

    }
}
