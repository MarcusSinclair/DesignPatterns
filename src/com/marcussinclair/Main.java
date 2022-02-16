package com.marcussinclair;
import com.marcussinclair.memento.Document;
import com.marcussinclair.memento.Editor;
import com.marcussinclair.memento.DocumentHistory;

public class Main {

    public static void main(String[] args) {
//        var editor = new Editor();
//        var history = new History();
//
//        editor.setContent("a");
//        history.push(editor.createState());
//
//        editor.setContent("ab");
//        history.push(editor.createState());
//
//        editor.setContent("abc");
//        editor.restore(history.pop());
//
//        System.out.println(editor.getContent());

        var document = new Document();
        var history = new DocumentHistory();

        document.setContent("Hello");
        history.push(document.createState());
        document.setContent("Hello World!");
        history.push(document.createState());
        document.setFontName("Montserrat");
        history.push(document.createState());
        document.setFontName("Times New Roman");
        history.push(document.createState());
        document.setFontSize(10);
        history.push(document.createState());
        document.setFontSize(20);

        System.out.println(document);

        document.restore(history.pop());
        document.restore(history.pop());
        document.restore(history.pop());

        System.out.println(document);
    }
}
