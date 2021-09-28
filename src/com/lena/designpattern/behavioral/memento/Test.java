package com.lena.designpattern.behavioral.memento;

public class Test {
    public static void main(String[] args) {
        MementoManager mementoManager = new MementoManager();

        Article article = new Article("oldtitle","blabla...");

        // here is the point, articleMemento is returned/created in Article
        ArticleMemento articleMemento = article.saveToMemento(); // create an memento, latest version in Article

        mementoManager.addToMemento(articleMemento); // add to stack in manager

        System.out.println(article.getTitle() + " " + article.getContent());


        // change title
        article.setTitle("Title");

        articleMemento = article.saveToMemento(); // reuse, update memento
        mementoManager.addToMemento(articleMemento); // store to stack

        // change title again
        article.setTitle("newTitle");

        System.out.println();

        // roll back
        System.out.println("before:" + article.toString());
        article.undoFromMemento(mementoManager.getMemento());// which one?
        System.out.println("after:" + article.toString()); //

        System.out.println();

        // roll back again
        System.out.println("before:" + article.toString());
        article.undoFromMemento(mementoManager.getMemento());// which one?
        System.out.println("after:" + article.toString()); //
    }
}
