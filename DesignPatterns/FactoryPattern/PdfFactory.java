package FactoryPattern;

public class PdfFactory extends DocumentFactory {
    public Document createDoc(){
        return new PdfDoc();
    }
}
