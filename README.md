<html>

<head>
<meta http-equiv=Content-Type content="text/html; charset=windows-1252">
<meta name=Generator content="Microsoft Word 15 (filtered)">


</head>

<body lang=EN-US link=blue vlink=purple style='word-wrap:break-word'>

<div class=WordSection1>

<h2 style='margin-left:.25in;text-indent:-.25in'><a name="_Toc133309302">1.<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp; </span>Introduction</a></h2>

<p class=MsoNormal style='text-align:justify'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>PDF Data Ripper is a Java-based
library that can be used with any Java-based application to extract data from
pdf documents. It provides vast flexibility to extract intended information
from the pdf and it includes text information and table information in any part
of the documents. Path to pdf document and instruction file to be provided as
the input and the output will be a data model with all requested information. The
instruction file tells the library how to read the document and what
information should be given as the output. </span></p>

<p class=MsoNormal style='text-align:justify'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>.  </span></p>

<h2 style='margin-left:.25in;text-indent:-.25in'><a name="_Toc133309303">2.<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp; </span>Extract
Data</a></h2>

<p class=MsoNormal style='text-align:justify'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>This library support extracting
text from real pdf (digitally created) and does not support scanned pdf. This
provides the following 3 types of extracting methods,</span></p>

<p class=MsoListParagraphCxSpFirst style='text-align:justify;text-indent:-.25in'><span
style='font-size:12.0pt;line-height:115%;font-family:Symbol'>·<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span><span style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>Read
by area</span></p>

<p class=MsoListParagraphCxSpMiddle style='text-align:justify;text-indent:-.25in'><span
style='font-size:12.0pt;line-height:115%;font-family:Symbol'>·<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span><span style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>Read
in document</span></p>

<p class=MsoListParagraphCxSpLast style='text-align:justify;text-indent:-.25in'><span
style='font-size:12.0pt;line-height:115%;font-family:Symbol'>·<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span><span style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>Read
table</span></p>

<h2 style='margin-left:.55in;text-indent:-.3in'><a name="_Toc133309304">2.1.Read
by area</a></h2>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>This function provides the
facility to read content by area (rectangular). Area can be defined by
providing x,y coordinates and the size (width and height). This function
provides two ways of reading,</span></p>

<p class=MsoListParagraphCxSpFirst style='margin-left:.75in;text-indent:-.25in'><span
style='font-size:12.0pt;line-height:115%;font-family:Symbol'>·<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span><span style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>Find
by text</span></p>

<p class=MsoListParagraphCxSpLast style='margin-left:.75in;text-indent:-.25in'><span
style='font-size:12.0pt;line-height:115%;font-family:Symbol'>·<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span><span style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>Full
text</span></p>

<h2 style='margin-left:.85in;text-indent:-.35in'><a name="_Toc133309305">2.1.1.<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp; </span>Find by text</a></h2>

<p class=MsoNormal style='margin-left:.5in'><a name="_Hlk132146244"><span
style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>It reads
the text inside the defined area line by line and use the provided search text
to locate the relevant text line and then replace the search text, trim
whitespaces in both side of the rest of the text and return as the value.</span></a></p>

<p class=MsoNormal style='margin-left:.25in'><img width=562 height=408
src="PDF_Data_Ripper_V1.1_files/image001.jpg"></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>Figure 01: read by area-find by
text</span></p>

<h2 style='margin-left:.85in;text-indent:-.35in'><a name="_Toc133309306">2.1.2.<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp; </span>Full text</a></h2>

<p class=MsoNormal style='margin-left:.25in;text-indent:.25in'><span
style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>It reads
the full text inside the defined area and return the same text as the output.</span></p>

<p class=MsoNormal style='margin-left:.25in'><img width=533 height=361
src="PDF_Data_Ripper_V1.1_files/image002.jpg"></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>Figure 01: read by area-full text</span></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>&nbsp;</span></p>

<h2 style='margin-left:.55in;text-indent:-.3in'><a name="_Toc133309307">2.2.Read
in document</a></h2>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>This function provides the
facility to read and search text withing the document and return the complete
line or part of the line. (What to do is defined in the configuration file). Also,
it can be defined the start point to start reading and end point (y) to stop
reading.</span></p>

<p class=MsoNormal style='margin-left:.25in'><img width=554 height=484
src="PDF_Data_Ripper_V1.1_files/image003.jpg"></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>content by area (rectangular).
Area can be defined by providing x,y coordinates and the size (width and
height). This function provides two ways of reading,</span></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>&nbsp;</span></p>

<h2 style='margin-left:.55in;text-indent:-.3in'><a name="_Toc133309308"><span
style='font-size:12.0pt;line-height:115%'>2.3.<span style='font:7.0pt "Times New Roman"'>&nbsp;
</span></span>Read Table</a></h2>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>Reading table data will be a
tricky part and defining correct configuration file will be more important to
read table data correctly. There will be two types of reading namely “single”
or “EachPage”.</span></p>

<p class=MsoNormal style='margin-left:1.0in;text-indent:-.75in'><span
style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>Single        -
it is a single table. It may be single page or it may be continued to multiple
pages without header or any other content between page breaks.</span></p>

<p class=MsoNormal style='margin-left:1.0in;text-indent:-.75in'><span
style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>EachPage  -
same format of table will repeat on each page. (ex. If header present, each
page has the header and the table in format is same in each page.</span></p>

<p class=MsoNormal style='margin-left:1.0in;text-indent:-.75in'><span
style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>Following
requirements has to be full fill by the table to read data correctly,</span></p>

<p class=MsoListParagraphCxSpFirst style='margin-left:.75in;text-indent:-.25in'><span
style='font-size:12.0pt;line-height:115%;font-family:Symbol'>·<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span><span style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>Should
have distinguishable header</span></p>

<p class=MsoListParagraphCxSpMiddle style='margin-left:.75in;text-indent:-.25in'><span
style='font-size:12.0pt;line-height:115%;font-family:Symbol'>·<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span><span style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>There
should be one column that can be used to identify the row.</span></p>

<p class=MsoListParagraphCxSpLast style='margin-left:.75in;text-indent:-.25in'><span
style='font-size:12.0pt;line-height:115%;font-family:Symbol'>·<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span><span style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>Should
provide the header measurement to identify column widths.</span></p>

<p class=MsoNormal style='margin-left:.5in'><img width=624 height=295
src="PDF_Data_Ripper_V1.1_files/image004.jpg"></p>

<p class=MsoNormal style='margin-left:.5in'><img width=624 height=443
src="PDF_Data_Ripper_V1.1_files/image005.jpg"></p>

<p class=MsoNormal style='margin-left:.5in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>&nbsp;</span></p>

<h2 style='margin-left:.25in;text-indent:-.25in'><a name="_Toc133309309">3.<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp; </span>Instruction
file</a></h2>

<p class=MsoNormal><a name="_Hlk132543438"><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>This will be a xml file with
pre-defined structure and the extracting data from the pdf document is
completely </span></a><span style='font-size:12.0pt;line-height:115%;
font-family:"Cambria",serif'>done based on these instructions.</span></p>

<p class=MsoNormal><span style='font-size:12.0pt;line-height:115%;font-family:
"Cambria",serif'>The file structure can be found in the sample_config folder in the repository</span></p>


<p class=MsoNormal><span style='font-size:12.0pt;line-height:115%;font-family:
"Cambria",serif'>One instruction file can have all types of reading types and
the library will include all values separately in to PDFData object and return.</span></p>

<p class=MsoNormal><span style='font-family:"Cambria",serif'>&nbsp;</span></p>

<p class=MsoNormal><img width=624 height=288
src="PDF_Data_Ripper_V1.1_files/image006.jpg"></p>

<p class=MsoNormal><span style='font-family:"Cambria",serif'>Figure 03:
defining read by area -find by text</span></p>

<p class=MsoNormal><span style='font-family:"Cambria",serif'>&nbsp;</span></p>

<p class=MsoNormal><img width=623 height=314
src="PDF_Data_Ripper_V1.1_files/image007.jpg"></p>

<p class=MsoNormal><span style='font-family:"Cambria",serif'>Figure 04:
defining read by area – full text</span></p>

<p class=MsoNormal><span style='font-family:"Cambria",serif'>&nbsp;</span></p>

<p class=MsoNormal><img width=624 height=270
src="PDF_Data_Ripper_V1.1_files/image008.jpg"></p>

<p class=MsoNormal><span style='font-family:"Cambria",serif'>Figure 05:
defining read in the document</span></p>

<p class=MsoNormal><span style='font-family:"Cambria",serif'>&nbsp;</span></p>

<p class=MsoNormal><img width=624 height=337
src="PDF_Data_Ripper_V1.1_files/image009.jpg"></p>

<p class=MsoNormal><span style='font-family:"Cambria",serif'>Figure 06:
defining read table (header present)</span></p>

<p class=MsoNormal><span style='font-family:"Cambria",serif'>&nbsp;</span></p>

<p class=MsoNormal><img width=623 height=279
src="PDF_Data_Ripper_V1.1_files/image010.jpg"></p>

<p class=MsoNormal><span style='font-family:"Cambria",serif'>Figure 07: defining
read table (no header)</span></p>

<p class=MsoNormal>&nbsp;</p>

<p class=MsoNormal>&nbsp;</p>

<h2 style='margin-left:.25in;text-indent:-.25in'><a name="_Toc133309310">4.<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp; </span>Output
data</a></h2>

<p class=MsoNormal><span style='font-size:12.0pt;line-height:115%;font-family:
"Cambria",serif'>The output of the jar module will be a PDFData object that
contain all the details extracted from the PDF according to the instruction
given. Variable names are mapped according to the ids given in the instruction
file. For more details refer the Class documentation.</span></p>

<p class=MsoNormal><span style='font-size:12.0pt;line-height:115%;font-family:
"Cambria",serif'>PDFData object contains HashMap&lt;String,Object&gt; object
called pdf_data and it contains all extracted data. There will be 3 types of
Object,</span></p>

<p class=MsoListParagraphCxSpFirst style='text-indent:-.25in'><span
style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>1.<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></span><span
style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>String </span></p>

<p class=MsoListParagraphCxSpMiddle style='text-indent:-.25in'><span
style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>2.<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></span><span
style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>HashMap&lt;String,String&gt;</span></p>

<p class=MsoListParagraphCxSpLast style='text-indent:-.25in'><span
style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>3.<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></span><span
style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>PDFTable</span></p>

<p class=MsoNormal style='margin-left:.25in'><b><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>String</span></b></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>This will be a direct declaration
of variable in the config file. ID if each element is used as the variable name
&lt;key for HashMap&gt; and the respective extracted string value will be
assigned as the value of HashMap.</span></p>

<p class=MsoNormal style='margin-left:.25in'><img width=624 height=565
src="PDF_Data_Ripper_V1.1_files/image011.jpg"></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>Ex: </span></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>cus_address=&gt;customer name,
address line-1,address line 2,160</span></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>delivery_address=&gt; delivery
address line1, address line 2, 26542</span></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>Code sample:</span></p>

<p class=MsoNormal style='margin-left:.25in'><img width=508 height=126
src="PDF_Data_Ripper_V1.1_files/image012.png"></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>&nbsp;</span></p>

<p class=MsoNormal style='text-indent:.25in'><b><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>HashMap&lt;String,String&gt;</span></b></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>&nbsp;</span></p>

<p class=MsoNormal style='margin-left:.25in'><img width=624 height=493
src="PDF_Data_Ripper_V1.1_files/image013.jpg"></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>&nbsp;</span></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>po_data=&gt;[</span></p>

<p class=MsoNormal style='margin-left:.75in;text-indent:.25in'><span
style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>{orderNo=&gt;53020985}</span></p>

<p class=MsoNormal style='margin-left:.5in;text-indent:.5in'><span
style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>{required_date19/01/21}</span></p>

<p class=MsoNormal style='margin-left:1.0in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>{generatedAt=&gt;12/01/21}</span></p>

<p class=MsoNormal style='margin-left:.75in;text-indent:.25in'><span
style='font-size:12.0pt;line-height:115%;font-family:"Cambria",serif'>{order_by=&gt;John
Doe}</span></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>]</span></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>Code sample:</span></p>

<p class=MsoNormal style='margin-left:.25in'><img width=593 height=152
src="PDF_Data_Ripper_V1.1_files/image014.png"></p>

<p class=MsoNormal>&nbsp;</p>

<p class=MsoNormal>&nbsp;</p>

<p class=MsoNormal style='text-indent:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>PDFTable</span></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>Table in the PDF document will be
translated in to Table object that consist of multiple TableRow and the
TableRow consist multiple TableCell.</span></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>Please fere documentation related
to Table,TableRow,TableCell for more information.</span></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>getTableRows() method will return
ArrayList&lt;String[]&gt; of table rows that contain Array if String for a row.</span></p>

<p class=MsoNormal style='margin-left:.25in'><img width=624 height=462
src="PDF_Data_Ripper_V1.1_files/image015.jpg"></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>&nbsp;</span></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>Sample code: </span></p>

<p class=MsoNormal style='margin-left:.25in'><img width=517 height=244
src="PDF_Data_Ripper_V1.1_files/image016.png"></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>&nbsp;</span></p>

<p class=MsoNormal style='margin-left:.25in'><span style='font-size:12.0pt;
line-height:115%;font-family:"Cambria",serif'>&nbsp;</span></p>

<p class=MsoNormal>&nbsp;</p>

contact for more info kumarahhc@gmail.com

</div>

</body>

</html>
