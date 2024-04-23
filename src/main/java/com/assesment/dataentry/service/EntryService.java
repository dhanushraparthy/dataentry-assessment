package com.assesment.dataentry.service;

import com.assesment.dataentry.model.Entry;
import com.assesment.dataentry.repository.EntryRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EntryService {

    private final EntryRepository entryRepository;

    public EntryService(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    public void save(Entry entry) {
        entry.setCreatedAt(new Date());
        entryRepository.save(entry);
    }

    public List<Entry> findAll() {
        return entryRepository.findAll();
    }

    public Entry findFirstByOrderByCreatedAtDesc() {

        return entryRepository.findFirstByOrderByCreatedAtDesc();
    }
}
