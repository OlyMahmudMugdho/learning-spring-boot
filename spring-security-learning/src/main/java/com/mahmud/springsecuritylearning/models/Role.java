package com.mahmud.springsecuritylearning.models;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role  implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="role_id")
    private int roleId;

    private String authority;

    public Role() {
        super();
    }

    public Role(String authority) {
        this.authority = authority;
    }

    public Role(int roleId, String authority) {
        this.roleId = roleId;
        this.authority = authority;
    }


    @Override
    public String getAuthority() {
        return this.authority;
    }
}
