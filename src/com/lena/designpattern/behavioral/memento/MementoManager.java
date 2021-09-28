package com.lena.designpattern.behavioral.memento;

import java.util.Stack;

public class MementoManager {
    private Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<ArticleMemento>();

    // pop
    public ArticleMemento getMemento()
    {
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop(); // here empty check
        return  articleMemento;
    }

    // push
    void addToMemento(ArticleMemento articleMemento)
    {
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }

}
