package com.geeks.geeksDemo.DependencyInversionPrinciple;

public class ChatGPTTranslateAPI {
    public String translateInput(String text, String from, String to, User user){
        String authToken = generateAuthToken(user);
        return validAuthToken(authToken, user) ? "ChatGPT Translated Text: " + text : "Operation not authorised";
    }

    //This should be the responsibility of an authentication class,
    // but we will put it here for the sake of this example
    private String generateAuthToken(User user){
        return user.getEmail()+ user.getName();
    }
    //This should be the responsibility of an authentication class,
    // but we will put it here for the sake of this example
    private boolean validAuthToken(String authToken, User user){
        return authToken.equals(user.getEmail() + user.getName());
    }
}
