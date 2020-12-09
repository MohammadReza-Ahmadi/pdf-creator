package com.vsq.pdfcreator.htm_to_image;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfArray;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.action.PdfAction;
import com.itextpdf.kernel.pdf.annot.PdfAnnotation;
import com.itextpdf.kernel.pdf.annot.PdfLinkAnnotation;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.xobject.PdfFormXObject;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Link;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.HorizontalAlignment;
import org.apache.batik.bridge.TextHit;
import org.dom4j.DocumentException;

import java.io.IOException;

//import com.itextpdf.text.*;

/**
 * Author: MohammadReza Ahmadi,  m.reza79ahmadi@gmail.com
 * 8/14/2020, 1:26 AM
 */

public class ImageToPdf {

    public static final String src = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\pdf-creator\\imageConverted\\html-to-image-fa.png";
    public static final String dest = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\pdf-creator\\imageConverted\\html-to-image.pdf";


    public static void main(String[] args) throws IOException, DocumentException {
/*        Document document = new Document();
//        String input = filename + "." + extension;
//        String output = "src/output/" + extension + ".pdf";
        FileOutputStream fos = new FileOutputStream(dest);

        PdfWriter writer = PdfWriter.getInstance(document, fos);
        writer.open();
        document.open();
//        document.add(Image.getInstance((new URL(src))));
        document.add(Image.getInstance((src)));
        document.close();
        writer.close();*/
    }

    public static void writeImageToPdf(String src, String dest) throws IOException, DocumentException {
//        Document document = new Document();
//        FileOutputStream fos = new FileOutputStream(dest);
//        PdfWriter writer = PdfWriter.getInstance(document, fos);


        /** new-code*/
        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document document = new Document(pdfDoc);




//        writer.open();
//        document.open();
//        document.add(Image.getInstance((new URL(src))));


//        Image image = Image.getInstance((src));


        ImageData imageData = ImageDataFactory.create(src);
        Image image = new Image(imageData);
        image.scaleToFit(PageSize.A5.getWidth(), PageSize.A5.getHeight());


//        float x = (PageSize.A5.getWidth() - image.getScaledWidth()) / 2;
//        float y = (PageSize.A4.getHeight() - image.getScaledHeight()) / 2;
//        image.setAbsolutePosition(x, 0);

        image.setFixedPosition(80,470);
//        image.setAbsolutePosition(80, 470);

/*        PdfFormXObject xObject = new PdfFormXObject(new Rectangle(850, 600));
        PdfCanvas xObjectCanvas = new PdfCanvas(xObject, pdfDoc);
        xObjectCanvas.ellipse(0, 0, 850, 600);
//        xObjectCanvas.roundRectangle(0, 0, 850, 600, 5);
        xObjectCanvas.clip();
        xObjectCanvas.newPath();
        xObjectCanvas.addImage(imageData, 120, 0, 0, 120, 0, -600);
        com.itextpdf.layout.element.Image clipped = new com.itextpdf.layout.element.Image(xObject);
        clipped.scale(0.5f, 0.5f);
        document.add(clipped);*/

        document.add(image);


        /** Add anchor hypertext*/
        Paragraph paragraph = new Paragraph();
        Style style = new Style();
        PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
        Color color = Color.convertRgbToCmyk(new DeviceRgb(60,60,60));
        style.setFont(font).setFontSize(9).setFontColor(color);
//        Text text = new Text("This is a like ...");
//        text.addStyle(style);
//        paragraph.add(text);

        paragraph.setFirstLineIndent(50);
        paragraph.setFixedLeading(245);
        PdfAction pdfAction =  PdfAction.createURI("http://www.google.com");
//        style.setBorder(Border.NO_BORDER);
//        style.setBorderTop(Border.NO_BORDER);
        Link link = new Link("my link ..",pdfAction);
        link.addStyle(style);
//        link.setBorder(Border.NO_BORDER);
//        paragraph.setBorder(Border.NO_BORDER);
//        link.GetLinkAnnotation().SetBorder(new PdfAnnotationBorder(0, 0, 0));

//        PdfAnnotation pdfAnnotation = new PdfLinkAnnotation(new Rectangle(0, 0, 0, 0));
//                .setHighlightMode(PdfAnnotation.HIGHLIGHT_INVERT)
//                .setAction(js)
//                .setBorderStyle(PdfAnnotation.STYLE_UNDERLINE);
        link.getLinkAnnotation().setBorder(new PdfArray(new int[]{0,0,0}));

        paragraph.add(link);

//        paragraph.setHorizontalAlignment(HorizontalAlignment.RIGHT);
//        paragraph.setFirstLineIndent(50);
//        paragraph.setHeight(115);

//        Font green = new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.NORMAL, new BaseColor(60, 60, 60));
//        Chunk greenText = new Chunk("link-of-certificate-url ", green);
/*
        Anchor anchor = new Anchor(greenText);
        anchor.setReference("http://tutorials.jenkov.com/java-itext/index.html");
        paragraph.add(anchor);
        paragraph.setAlignment(Paragraph.ALIGN_LEFT);
        paragraph.setIndentationLeft(50);
        paragraph.setSpacingBefore(115);
*/

        document.add(paragraph);


        /** rounded style*/
//        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(dest));
//        Document doc = new Document(pdfDoc);
//        ImageData img = ImageDataFactory.create(imgSrc);
//        Image imgModel = new Image(img);
//        float w = imgModel.getImageScaledWidth();
//        float h = imgModel.getImageScaledHeight();




        /** add column text*/
/*        ColumnText ct = new ColumnText("hi this is a column text");
        ct.setSimpleColumn(new Rectangle(0, 0, 523, 50));
        ct.addElement(
                new Paragraph(
                        String.format("There are %s pages in this document", writer.getPageNumber())));
        ct.go();*/


        document.close();
        writer.close();

    }
}
