package com.spicejet.breakchar;

public class Book {

    private String num;
    private String type;
    private String rev;
    private String by;
    private String text;

    public static Book getCopiedBookInstance(Book book) {
        Book value = new Book();
        value.setNum(book.getNum());
        value.setType(book.getType());
        value.setRev(book.getRev());
        value.setBy(book.getBy());
        value.setText(book.getText());
        return value;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
