package FactoryPattern;

public class WordFactory extends DocumentFactory {
    public Document createDoc(){
        return new WordDoc();
    }
}
