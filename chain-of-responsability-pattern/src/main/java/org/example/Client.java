package org.example;

public class Client {

    public static void main(String[] args){
        //Building the chain
        TextDocumentHandler textDocumentHandler = new TextDocumentHandler(null);
        SlideshowHandler slideshowHandler = new SlideshowHandler(textDocumentHandler);
        DocumentHandler chain = new SpreadsheetHandler(slideshowHandler);

        //The file extension will be passed along the chain until some handler be able to open the file extension.
        chain.openDocument("ppt");
        chain.openDocument("txt");
    }
}
