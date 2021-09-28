package com.lena.designpattern.behavioral.memento;

import java.util.Stack;

public class ArticleMemento {
    String title;
    String content;

    public ArticleMemento(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public ArticleMemento() {
    }
}