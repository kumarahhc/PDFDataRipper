# PDFDataRipper
Extract data (structured or non structured data) in any PDF document in to a format that can be processed in a program. This library will not work with scanned document as image in to PDF.

1.	Introduction
PDF Data Ripper is a java-based library that can be used with any java-based application to extract data from pdf documents. It provides vast flexibility to extract intended information from the pdf and it includes text information and tables information in any part of the documents. Path to pdf document and instruction file to be provided as the input and the output will be a data model with all requested information. Instruction file tells the library how to read the document and what information should be given as the output. 
.  
2.	Extract Data
This library support extracting text from real pdf (digitally created) and does not support scanned pdf. This provides following 3 types of extracting methods,
•	Read by area
•	Read in document
•	Read table
2.1.	Read by area
This function provides the facility to read content by area (rectangular). Area can be defined by providing x,y coordinates and the size (width and height). This function provides two ways of reading,
•	Find by text
•	Full text
2.1.1.	Find by text
It reads the text inside the defined area line by line and use the provided search text to locate the relevant text line and then replace the search text, trim whitespaces in both side of the rest of the text and return as the value.
