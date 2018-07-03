package com.example.jarviz.chatapp;

public class ChatModel {

    public String chatMessage;
    public boolean iSend;


    public ChatModel(String chatMessage,boolean isSend){
        this.chatMessage = chatMessage;
        this.iSend = isSend;

    }

    public String getChatMessage() {
        return chatMessage;
    }

    public void setChatMessage(String chatMessage) {
        this.chatMessage = chatMessage;
    }

    public boolean isiSend() {
        return iSend;
    }

    public void setiSend(boolean iSend) {
        this.iSend = iSend;
    }
}


