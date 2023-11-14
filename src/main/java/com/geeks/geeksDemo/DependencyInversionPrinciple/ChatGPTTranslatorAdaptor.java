package com.geeks.geeksDemo.DependencyInversionPrinciple;

public class ChatGPTTranslatorAdaptor implements ILanguageTranslator{
    ChatGPTTranslateAPI chatGPTTranslateAPI;
    User user;

    public ChatGPTTranslatorAdaptor(User user){
        this.user = user;
        this.chatGPTTranslateAPI = new ChatGPTTranslateAPI();
    }
    @Override
    public String translate(String text, String from, String to) {
        return chatGPTTranslateAPI.translateInput(text, from, to, user);
    }
}
