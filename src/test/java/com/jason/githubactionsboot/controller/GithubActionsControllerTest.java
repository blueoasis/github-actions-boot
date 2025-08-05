package com.jason.githubactionsboot.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GithubActionsControllerTest {

    @Test
    void index() {
        GithubActionsController controller = new GithubActionsController();
        String result = controller.index();
        assertEquals("Hello and welcome to GitHub Actions Boot!!?", result);
    }

}