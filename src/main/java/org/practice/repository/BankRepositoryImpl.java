package org.practice.repository;

import org.practice.dto.BankResponseDto;
import org.practice.entity.BankEntity;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class BankRepositoryImpl implements BankRepository {
    private final List<BankEntity> bankEntityList = new ArrayList<>();

    @Override
    public void add(BankEntity bankEntity)
    {
        bankEntityList.add(bankEntity);
    }

    @Override
    public List<BankEntity> getAllBanks()
    {
        return bankEntityList;
    }

    @Override
    public BankResponseDto getBankById(int id)
    {
        return null;
    }

    @Override
    public void deleteById(int id)
    {

    }
}
