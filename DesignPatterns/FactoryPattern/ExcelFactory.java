package FactoryPattern;

public class ExcelFactory extends DocumentFactory{
    public Document createDoc(){
        return new ExcelDocument();
    }
}
