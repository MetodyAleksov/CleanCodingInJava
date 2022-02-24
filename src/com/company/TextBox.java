package com.company;

public class TextBox {
    public String text;

    public TextBox(String text){
        this.text = text;
    }

    public TextBox(){
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }

    public String toString(){
        return text;
    }
}
