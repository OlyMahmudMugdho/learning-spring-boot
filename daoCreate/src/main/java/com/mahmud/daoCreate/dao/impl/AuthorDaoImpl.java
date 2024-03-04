package com.mahmud.daoCreate.dao.impl;

import com.mahmud.daoCreate.dao.AuthorDao;
import com.mahmud.daoCreate.domain.Author;
import org.springframework.jdbc.core.JdbcTemplate;

public class AuthorDaoImpl implements AuthorDao {
    private final JdbcTemplate template;

    public AuthorDaoImpl(final JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void create(Author author) {
        template.update("INSERT INTO authors(id, name ,age)  VALUES(?,?,?)",
            author.getId(), author.getName(), author.getAge()
        );
    }
}
