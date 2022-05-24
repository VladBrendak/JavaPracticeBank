package org.practice.repository;

import org.practice.dto.BankResponseDto;
import org.practice.entity.BankEntity;

import java.util.List;

public interface BankRepository {
    void add(BankEntity bankEntity);

    List<BankEntity> getAllBanks();

    BankResponseDto getBankById(int id);

    void deleteById(int id);
}
