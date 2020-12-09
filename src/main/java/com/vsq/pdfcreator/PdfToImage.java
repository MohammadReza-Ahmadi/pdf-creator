package com.vsq.pdfcreator;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Author: MohammadReza Ahmadi,  m.reza79ahmadi@gmail.com
 * 8/13/2020, 10:47 PM
 */

public class PdfToImage {

    public static final String DEST = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\e-signature-micro-service\\content-repo\\pdf-to-image.png";
    public static final String SRC = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\e-signature-micro-service\\content-repo\\html-to-pdf.pdf";


    public static void main(String[] args) throws IOException {
        PDDocument document = PDDocument.load(new File(SRC));
        PDFRenderer pdfRenderer = new PDFRenderer(document);
        for (int page = 0; page < document.getNumberOfPages(); ++page) {
            BufferedImage bim = pdfRenderer.renderImageWithDPI(
                    page, 300, ImageType.RGB);
            ImageIOUtil.writeImage(
//                    bim, String.format("src/output/pdf-%d.%s", page + 1, extension), 300);
                    bim, DEST, 300);
        }
        document.close();
    }
}
