package com.ck.pdfripper;

import java.io.IOException;

import com.i3cubes.pdfdataripper.PDFData;
import com.i3cubes.pdfdataripper.PDFDataRipper;

public class PDFRipper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file_path="D:\\Kumara\\Projects\\PDF-Ripping\\SO.pdf";
        String config_path="D:\\Kumara\\Projects\\PDF-Ripping\\read_config_so.xml";
        
        PDFDataRipper data_ripper=new PDFDataRipper(config_path);
        PDFData data=null;
		try {
			data = data_ripper.ExtractPDFData(file_path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
        System.out.println("DATA:"+data.toString());
	}

}
