package com.jannbackendv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    private final EntryRepository entryRepository;
    @Autowired
    private MainController(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String getMethod(){
        return null;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/api/score")
    public EntryDTO write(@RequestBody EntryDTO entryDTO) {
        Entry entry = entryRepository.save(new Entry(entryDTO.get_name(), entryDTO.get_score(), entryDTO.get_time()));
        return new EntryDTO(entry.get_name(), entry.get_score(), entryDTO.get_time());
    }
}

