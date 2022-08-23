package io.github.josealmir.designpatterns.creation.demo;

public class BuilderDemo {
    public static void main(String[] args) {
        DocumentCreationEngine.createDocument(new XMLDocumentBuilder());
    }

    static class DocumentCreationEngine {
        static void createDocument(DocumentBuilder builder) {
            builder.createDocument();
            builder.createAuthor("Jose Almir");
            builder.createTitle("Document Title");
            builder.createTitle("Document Content");
            builder.createDate("01/01/2018");
            Document doc = builder.getDocument();
            doc.print();
        }
    }

    static abstract class Document {
        private String title;
        private String text;
        private String author;
        private String date;

        public Document() {

        }

        public abstract void print();

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    static class PDFDocument extends Document {
        @Override
        public void print() {
            System.out.println("Printing PDF document");
        }
    }

    static class XMLDocument extends Document {
        @Override
        public void print() {
            System.out.println("Printing XML document");
        }
    }

    interface DocumentBuilder {
        void createDocument();

        void createTitle(String title);

        void createText(String text);

        void createAuthor(String author);

        void createDate(String date);

        Document getDocument();
    }

    static class PDFDocumentBuider implements DocumentBuilder {
        private Document document;

        @Override
        public void createDocument() {
            document = new PDFDocument();
        }

        @Override
        public void createTitle(String title) {
            document.setTitle(title);
        }

        @Override
        public void createText(String text) {
            document.setText(text);
        }

        @Override
        public void createAuthor(String author) {
            document.setAuthor(author);
        }

        @Override
        public void createDate(String date) {
            document.setDate(date);
        }

        @Override
        public Document getDocument() {
            return document;
        }
    }

    static class XMLDocumentBuilder implements DocumentBuilder {
        private Document document;

        @Override
        public void createDocument() {
            document = new XMLDocument();
        }

        @Override
        public void createTitle(String title) {
            document.setTitle(title);
        }

        @Override
        public void createText(String text) {
            document.setText(text);
        }

        @Override
        public void createAuthor(String author) {
            document.setAuthor(author);
        }

        @Override
        public void createDate(String date) {
            document.setDate(date);
        }

        @Override
        public Document getDocument() {
            return document;
        }
    }
}

