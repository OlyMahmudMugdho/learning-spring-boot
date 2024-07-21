package com.mahmud.mastering_spring_data_jpa.IdCard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/id-card")
public class IdCardController {
    private final IdCardRepository idCardRepository;

    public IdCardController(IdCardRepository idCardRepository) {
        this.idCardRepository = idCardRepository;
    }
}
