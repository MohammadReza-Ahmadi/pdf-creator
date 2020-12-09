package com.vsq.pdfcreator;

//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import org.dom4j.DocumentException;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author: MohammadReza Ahmadi,  m.reza79ahmadi@gmail.com
 * 8/13/2020, 10:42 PM
 */

public class HtmlToPdf {
    public static final String DEST = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\e-signature-micro-service\\content-repo\\html-to-pdf.html";
    public static final String SRC = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\e-signature-micro-service\\content-repo\\html-to-pdf.pdf";

    public static void main(String[] args) throws IOException, DocumentException {
//        Document document = new Document();
//        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(SRC));
        PdfWriter writer = new PdfWriter(SRC);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);
//        document.open();

        HtmlConverter.convertToPdf(DEST, new FileOutputStream(SRC));
/*        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                new FileInputStream(DEST));
        document.close();*/
    }
}
