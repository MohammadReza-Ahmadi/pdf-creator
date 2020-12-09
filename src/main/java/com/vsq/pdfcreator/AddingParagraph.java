package com.vsq.pdfcreator;

/*
 Author: MohammadReza Ahmadi,  "m.reza79ahmadi@gmail.com"
 8/13/2020, 9:07 PM
*/

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.BaseDirection;
import com.itextpdf.layout.property.TextAlignment;

import java.io.FileNotFoundException;

public class AddingParagraph {
    public static final String DEST = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\e-signature-micro-service\\content-repo\\add-paragraph.pdf";

    public static void main(String[] args) throws FileNotFoundException {
        // Creating a PdfWriter
        PdfWriter writer = new PdfWriter(DEST);

        // Creating a PdfDocument
        PdfDocument pdf = new PdfDocument(writer);

        // Creating a Document
        Document document = new Document(pdf);
        Style arabic = new Style().setTextAlignment(TextAlignment.RIGHT).setBaseDirection(BaseDirection.RIGHT_TO_LEFT).
                setFontSize(20);
        String text = "Vosuoq: نحوه رایت کردن عکس در پی دی اف فایل با ";
        document.add(new Paragraph("Wrong: " + text).addStyle(arabic));
        document.add(new Paragraph(text).setFontScript(Character.UnicodeScript.ARABIC).addStyle(arabic));
        document.close();

    }

    public static void main2(String args[]) throws Exception {
        // Creating a PdfWriter
        PdfWriter writer = new PdfWriter(DEST);

        // Creating a PdfDocument
        PdfDocument pdf = new PdfDocument(writer);

        // Creating a Document
        Document document = new Document(pdf);
        String para1 = "Tutorials Point originated from the idea that there exists" +
                "a class of readers who respond better to online content and prefer to learn" +
                "new skills at their own pace from the comforts of their drawing rooms.";

        String para2 = "The journey commenced with a single tutorial on HTML in 2006" +
                "and elated by the response it generated, we worked our way to adding fresh" +
                "tutorials to our repository which now proudly flaunts a wealth of tutorials" +
                "and allied articles on topics ranging from programming languages to web designing" +
                "to academics and much more.";

        String para3 = new String("نحوه رایت کردن عکس در پی دی اف فایل با test2".getBytes(), "UTF-8");
//        String para3 = "نحوه رایت کردن عکس در پی دی اف فایل با ";
//        String para3 = "\\u0633\\u0644\\u0627\\u0645";
//        String para3 = "\\xd8\\xb3\\xd9\\x84\\xd8\\xa7\\xd9\\x85";

        // Creating Paragraphs
        Paragraph paragraph1 = new Paragraph(para1);
        Paragraph paragraph2 = new Paragraph(para2);
        Paragraph paragraph3 = new Paragraph(para3);
        paragraph3.setBaseDirection(BaseDirection.RIGHT_TO_LEFT);

        // Adding paragraphs to document
        document.add(paragraph1);
        document.add(paragraph2);
        document.add(paragraph3);
//        document.add(new Paragraph("Unicode: \u0633\u0644\u0627\u0645"));

        // Closing the document
        document.close();
        System.out.println("Paragraph added");
    }
}