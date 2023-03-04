package com.dev.wallet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.wallet.model.Entries;

public interface EntriesRepository extends JpaRepository<Entries, Long>{

}
