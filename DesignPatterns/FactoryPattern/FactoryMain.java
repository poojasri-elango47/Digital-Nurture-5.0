package FactoryPattern;

public class FactoryMain {
    public static void main (String [] args){
        DocumentFactory pdfFact=new PdfFactory();
        Document pdf=pdfFact.createDoc();
        pdf.open();

        DocumentFactory wordFact=new WordFactory();
        Document word=wordFact.createDoc();
        word.open();

        DocumentFactory ExcelFact=new ExcelFactory();
        Document Excel=ExcelFact.createDoc();
        Excel.open();


    }
    
}
