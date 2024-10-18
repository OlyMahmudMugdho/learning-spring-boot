package com.mahmud.jpa_relationship.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private Integer id;
    private String type;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "student_account_id",
            referencedColumnName = "student_id"
    )
    @Nullable
    private Student studentId;
}
