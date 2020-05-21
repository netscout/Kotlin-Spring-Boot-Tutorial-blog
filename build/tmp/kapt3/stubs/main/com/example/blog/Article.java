package com.example.blog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\b\u0017\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\"\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015\u00a8\u0006%"}, d2 = {"Lcom/example/blog/Article;", "", "title", "", "headline", "content", "author", "Lcom/example/blog/User;", "slug", "createdAt", "Ljava/time/LocalDateTime;", "id", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/blog/User;Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/Long;)V", "getAuthor", "()Lcom/example/blog/User;", "setAuthor", "(Lcom/example/blog/User;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getCreatedAt", "()Ljava/time/LocalDateTime;", "setCreatedAt", "(Ljava/time/LocalDateTime;)V", "getHeadline", "setHeadline", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSlug", "setSlug", "getTitle", "setTitle", "blog"})
@javax.persistence.Entity()
public class Article {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String headline;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String content;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToOne()
    private com.example.blog.User author;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String slug;
    @org.jetbrains.annotations.NotNull()
    private java.time.LocalDateTime createdAt;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue()
    @javax.persistence.Id()
    private java.lang.Long id;
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getTitle() {
        return null;
    }
    
    public void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getHeadline() {
        return null;
    }
    
    public void setHeadline(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getContent() {
        return null;
    }
    
    public void setContent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.example.blog.User getAuthor() {
        return null;
    }
    
    public void setAuthor(@org.jetbrains.annotations.NotNull()
    com.example.blog.User p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getSlug() {
        return null;
    }
    
    public void setSlug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    public void setCreatedAt(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Long getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    public Article(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String headline, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    com.example.blog.User author, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long id) {
        super();
    }
}