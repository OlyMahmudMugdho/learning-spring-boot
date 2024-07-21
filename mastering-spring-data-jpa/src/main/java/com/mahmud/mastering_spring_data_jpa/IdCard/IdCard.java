package com.mahmud.mastering_spring_data_jpa.IdCard;

import com.mahmud.mastering_spring_data_jpa.student.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class IdCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "card_number")
    private Long cardNo;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "student_id")
    private Student student;
}

