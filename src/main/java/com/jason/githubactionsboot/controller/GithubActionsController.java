package com.jason.githubactionsboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
class GithubActionsController {

    @GetMapping
    public String index() {
        return "Hello and welcome to GitHub Actions Boot!!?";
    }
}
