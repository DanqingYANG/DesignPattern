package com.lena.designpattern.behavioral.memento;

public class Article {
    String title;
    String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Article() {
    }

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    ArticleMemento saveToMemento()
    {
        ArticleMemento articleMemento = new ArticleMemento(title,content);
        return articleMemento;
    }

    void undoFromMemento(ArticleMemento articleMemento)
    {
        // roll back
        title = articleMemento.title;
        content = articleMemento.content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
