package com.meezotech.recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    private Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long id = new Long(5);
        category.setId(5L);
        assertEquals(id, category.getId());
    }

    @Test
    public void getDescription() {
        category.setDescription("Cook it");
        assertEquals("Cook it", category.getDescription());
    }

    @Test
    public void getRecipes() {

    }
}