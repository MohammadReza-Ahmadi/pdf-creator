//package com.vsq.pdfcreator.htm_to_image;
//
///**
// * Author: MohammadReza Ahmadi,  m.reza79ahmadi@gmail.com
// * 8/14/2020, 6:18 PM
// */
//
//import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.PdfWriter;
//
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//
//public class AnchorExample {
//
//    public static final String pdfDest = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\pdf-creator\\imageConverted\\html-to-image-fa-2.pdf";
//    public static void main(String[] args) {
//
//        Document document = new Document();
//
//        try {
//            PdfWriter.getInstance(document,new FileOutputStream(pdfDest));
//
//            document.open();
//            Paragraph paragraph = new Paragraph();
//            paragraph.add(new Phrase("You can find the IText tutorial at "));
//
//            Anchor anchor = new Anchor("http://tutorials.jenkov.com/java-itext/index.html");
//            anchor.setReference("http://tutorials.jenkov.com/java-itext/index.html");
//            paragraph.add(anchor);
//            document.add(paragraph);
//            document.close();
//
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    }
//}