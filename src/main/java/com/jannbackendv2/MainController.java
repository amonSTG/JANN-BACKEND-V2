package com.jannbackendv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MainController {

    private final EntryRepository entryRepository;
    @Autowired
    private MainController(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    @GetMapping("/api/results")
    public List<EntryDTO> read() {
        List<EntryDTO> response = new LinkedList<>();

        for (Entry entry : entryRepository.findAllByOrderByCreatedAtDesc()) {
            response.add(new EntryDTO(entry.get_name(), entry.get_score(), entry.get_time()));
        }

        return response;
    }

    @PostMapping("/api/score")
    public EntryDTO write(@RequestBody EntryDTO entryDTO) {
        Entry entry = entryRepository.save(new Entry(entryDTO.get_name(), entryDTO.get_score(), entryDTO.get_time()));
        return new EntryDTO(entry.get_name(), entry.get_score(), entryDTO.get_time());
    }
}

