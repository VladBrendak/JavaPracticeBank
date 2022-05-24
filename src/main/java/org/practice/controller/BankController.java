package org.practice.controller;

import org.practice.dto.BankRequestDto;
import org.practice.dto.BankResponseDto;
import org.practice.service.BankService;
import org.practice.service.BankServiceImpl;

import java.util.List;

public class BankController {
    private final BankService bankService = new BankServiceImpl();

    public void create(BankRequestDto bankRequestDto)
    {
        bankService.createBank(bankRequestDto);
    }

    public List<BankResponseDto> getAllBanks()
    {
        return bankService.getAllBanks();
    }

    public BankResponseDto getBankById(int id)
    {
        return bankService.getById(id);
    }

    public void deleteBankById(int id){

    }
}
