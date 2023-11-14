package com.geeks.geeksDemo.DependencyInversionPrinciple;

public class LanguageTutorial {
    private final  User user;
    private final GoogleTranslateAPI googleTranslateAPI;
    private final ChatGPTTranslateAPI chatGPTTranslateAPI;
    private final ILanguageTranslator translator;

    public LanguageTutorial(){
        this(new User("none", "none"));
    }
    public LanguageTutorial(User user){
        this.user = user;
        this.googleTranslateAPI = new GoogleTranslateAPI(this.user); //violates DIP
        this.chatGPTTranslateAPI = new ChatGPTTranslateAPI(); //violates DIP
        this.translator = new GoogleTranslatorAdapter(user); //conforms to DIP

    }

    //conforms to DIP
    public void translate(String text, String from, String to){
        System.out.println(translator.translate(text, from, to));
    }

    //violates DIP
    public void translateTextViaGoogle(String text, String from, String to){
        System.out.println(googleTranslateAPI.translate(text, from, to));
    }

    //violates DIP
    public void translateTextViaChatGPT(String text, String from, String to){
        System.out.println(chatGPTTranslateAPI.translateInput(text, from, to, user));
    }

}
