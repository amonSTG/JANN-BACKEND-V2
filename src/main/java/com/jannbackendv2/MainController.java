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

        for (Entry entry : entryRepository.findAllByOrderByScoreDesc()) {
            response.add(new EntryDTO(entry.getName(), entry.getScore(), entry.getTime(), entry.getGameType()));
        }

        return response;
    }

    @PostMapping("/api/score")
    public EntryDTO write(@RequestBody EntryDTO entryDTO) {
        Entry entry = entryRepository.save(new Entry(entryDTO.getName(), entryDTO.getScore(), entryDTO.getTime(), entryDTO.getGameType()));
        return new EntryDTO(entry.getName(), entry.getScore(), entryDTO.getTime(), entry.getGameType());
    }
}

