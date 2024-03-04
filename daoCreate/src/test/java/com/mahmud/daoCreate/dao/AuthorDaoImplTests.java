package com.mahmud.daoCreate.dao;

import com.mahmud.daoCreate.dao.impl.AuthorDaoImpl;
import com.mahmud.daoCreate.domain.Author;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

public class AuthorDaoImplTests {
    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private AuthorDaoImpl authorDao;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void insertAuthor() {
        Author author = Author.builder()
                .id(2)
                .name("Mugdho")
                .age(23)
                .build();
        authorDao.create(author);

        verify(jdbcTemplate).update(
                eq("INSERT INTO authors(id, name ,age)  VALUES(?,?,?)"),
                eq(2),
                eq("Mugdho"),
                eq(23)
        );
    }
}
