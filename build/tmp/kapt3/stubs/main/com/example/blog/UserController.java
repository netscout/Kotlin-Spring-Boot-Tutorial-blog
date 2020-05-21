package com.example.blog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a$\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\t0\u0006H\u0017J\u0012\u0010\n\u001a\u00020\u00012\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/blog/UserController;", "", "repository", "Lcom/example/blog/UserRepository;", "(Lcom/example/blog/UserRepository;)V", "findAll", "", "Lcom/example/blog/User;", "kotlin.jvm.PlatformType", "", "findOne", "login", "", "blog"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"api/user"})
@org.springframework.web.bind.annotation.RestController()
public class UserController {
    private final com.example.blog.UserRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/"})
    public java.lang.Iterable<com.example.blog.User> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{login}"})
    public java.lang.Object findOne(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PathVariable()
    java.lang.String login) {
        return null;
    }
    
    public UserController(@org.jetbrains.annotations.NotNull()
    com.example.blog.UserRepository repository) {
        super();
    }
}