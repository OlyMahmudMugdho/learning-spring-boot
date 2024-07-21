package com.mahmud.mastering_spring_data_jpa.IdCard;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/id-card")
public class IdCardController {
    private final IdCardRepository idCardRepository;

    public IdCardController(IdCardRepository idCardRepository) {
        this.idCardRepository = idCardRepository;
    }

    @GetMapping
    public List<IdCard> getIdCards() {
        return idCardRepository.findAll();
    }

    @PostMapping
    public IdCard createIdCard(@RequestBody IdCard idCard) {
        return idCardRepository.save(idCard);
    }
}
