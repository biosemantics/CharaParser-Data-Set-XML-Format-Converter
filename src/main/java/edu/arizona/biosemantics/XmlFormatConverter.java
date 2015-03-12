package edu.arizona.biosemantics;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;
import org.jdom2.input.sax.XMLReaderJDOMFactory;
import org.jdom2.input.sax.XMLReaderSchemaFactory;
import org.jdom2.input.sax.XMLReaderXSDFactory;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.xml.sax.SAXException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.NameFileComparator;
import org.apache.commons.io.filefilter.FileFileFilter;

public class XmlFormatConverter {

	public XmlFormatConverter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws SAXException, JDOMException,
			IOException {
		// TODO Auto-generated method stub

		// readXML("49.xml");
		// readSchema("123.xml");
		// writeXML("123.xml");
		// transferXMLFormat("1.xml", "2.xml");
		// batchTransform("Anemonae");
		// batchTransformFromCharaParserXML("ThackerStudent1");

		// File sourceLocation = new File("ThackerStudent1");
		// File targetLocation = new File("ThackerStudent1-1");
		// copyDirectory(sourceLocation, targetLocation);

		// batchTransformFromOldXMLVersion1("ThackerStudent1");

		// walk("oldFormat");

		// walk("oldFormat1");

		// walk("V23");
		// walk("Cycad");
		// walk("ferns");
		// walk("ThackerStudent1");
		// walk("ThackerStudent2");
		// walk("Comparison");

		// walk("FNA Rubus");
		// walk("Gray Rubus");

		// walk("Microbial Phenomics Project Experiment1 papers");

		// walk("Mollicutes");

		// walk2("V23");
		// walk2("V19-add-missing-files-correct-ranks-in-3-files");
		// walk("V19-add-missing-files-correct-ranks-in-3-files",
		// "transferXMLFormatFromOldXMLFNAInJSTORReplaced");
		// walk2("V19-add-missing-files-correct-ranks-in-3-files");
		// walk("FNA-In-JSTOR-test", "transferXMLFormatFromOldXMLFNAInJSTORReplaced");
		// walk2("FNA-In-JSTOR-test");

		
		// Transfer
		// FoC-Original
		// walk("FoC-Original", "transferXMLFormatFromOldXMLFoC");
		
		// Folder: FoC-Old-Format-Original
		// walk("FoC-Old-Format-Original", "transferXMLFormatFromOldXMLFoC");
		
		// String inputXmlFileName = "1299.xml";
		// Set<String> allSchemaAttributeName =
		// extractAllSchemaAttributeName("semanticMarkupInput.xsd");
		// copyCurrentXmlfile(inputXmlFileName, allSchemaAttributeName);

		
		// Nov 05, 2014 Wednesday Added
		// 141105 add
		
		// String inputXmlFileName = "regroupRootFolder-FoC/thymelaeaceae/thymelaeaceae_FoCV13_683.xml";
		// Set<String> allSchemaAttributeName = extractAllSchemaAttributeName("semanticMarkupInput.xsd");
		// addUnknownInFoc(inputXmlFileName, allSchemaAttributeName);

		// walk3AddUnknowInFoc("regroupRootFolder-FoC-2");
		// String extractKeyStatementIdList = extractKeyStatementIdList("regroupRootFolder-FoC-Add-Unknown/taxaceae/taxaceae_FoCV4_353.xml");
		// System.out.println("extractKeyStatementIdList:" + extractKeyStatementIdList);
		
		
		
		
		
		// Work on 141217
		// Transform to new schema
		// walk("FNA-In-JSTOR-test-141217-processing", "transferXMLFormatFromOldXMLFNAInJSTORReplaced");
		// 
		// add unknown
		// walk3AddUnknowInFoc("FNA-In-JSTOR-test-141217-processing-Transformed-To-New-Schema-Add-Unknown/");
		
		
		
		
		
		// walk4CheckKeyError("regroupRootFolder-FoC-Add-Unknown");
		
		
		
		
		
		
		// findFamilyTribeName("FNA-In-JSTOR-test");
		// findTaxonHierarchyName("FNA-In-JSTOR-test");
		// findAllExtractedRootElements("FNA-In-JSTOR-test");
		// findAllExtractedRootElements("FNA-In-JSTOR-test-Original");
		
		// findAllExtractedRootElements("FoC-Original");
		
		// findNumber("FNA-In-JSTOR-test/V22");
		// System.out.println(extractFamilyRankWithKeyDesc("FNA-In-JSTOR-test/V21/1.xml"));

		/*
		 * Set<String> initialFamilyTribeSetString = new HashSet<String>();
		 * Set<String> familyTribeRankSetStringList =
		 * createFamilyTribeRankSetStringList("FNA-In-JSTOR-test",
		 * initialFamilyTribeSetString); String[]
		 * familyTribeRankSetStringListArray =
		 * familyTribeRankSetStringList.toArray(new
		 * String[familyTribeRankSetStringList.size()]); //
		 * System.out.println(Arrays
		 * .toString(familyTribeRankSetStringListArray)); //
		 * System.out.println("familyTribeRankSetStringListArray.length::" +
		 * familyTribeRankSetStringListArray.length);
		 * 
		 * StringBuilder outputStringBuilder = new StringBuilder("");
		 * 
		 * for (String familyTribeName : familyTribeRankSetStringListArray) { //
		 * System.out.println(familyTribeName);
		 * outputStringBuilder.append(familyTribeName + "\n"); } try
		 * (PrintWriter out = new PrintWriter(new BufferedWriter(new
		 * FileWriter("FamilyTribeList.csv", true)))) {
		 * out.println(outputStringBuilder); } catch (IOException e) { //
		 * exception handling left as an exercise for the reader }
		 * 
		 * Set<String> initialFamilySetString = new HashSet<String>();
		 * Set<String> familyRankSetStringList =
		 * createFamilyRankSetStringList("FNA-In-JSTOR-test",
		 * initialFamilySetString); String[] familyRankSetStringListArray =
		 * familyRankSetStringList.toArray(new
		 * String[familyRankSetStringList.size()]);
		 * 
		 * System.out.println("familyRankSetStringListArray.length::" +
		 * familyRankSetStringListArray.length); //
		 * System.out.println(Arrays.toString(familyRankSetStringListArray));
		 */

		// Set<String> initialTribeSetString = new HashSet<String>();
		// Set<String> tribeRankSetStringList =
		// createTribeRankSetStringList("FNA-In-JSTOR-test",
		// initialTribeSetString);
		// String[] tribeRankSetStringListArray =
		// tribeRankSetStringList.toArray(new
		// String[tribeRankSetStringList.size()]);

		// Generate genus list
		/*
		 * Set<String> initialGenusSetString = new HashSet<String>();
		 * Set<String> genusRankSetStringList =
		 * createGenusRankSetStringList("FNA-In-JSTOR-test",
		 * initialGenusSetString);
		 * 
		 * 
		 * String[] genusRankSetStringListArray =
		 * genusRankSetStringList.toArray(new
		 * String[genusRankSetStringList.size()]); //
		 * System.out.println(Arrays.toString(genusRankSetStringListArray)); //
		 * System.out.println("genusRankSetStringListArray.length::" +
		 * genusRankSetStringListArray.length);
		 * 
		 * StringBuilder outputStringBuilder = new StringBuilder("");
		 * 
		 * for (String genusName : genusRankSetStringListArray) { //
		 * System.out.println(genusName); outputStringBuilder.append(genusName +
		 * "\n"); } try (PrintWriter out = new PrintWriter(new
		 * BufferedWriter(new FileWriter("GenusNameList.csv", true)))) {
		 * out.println(outputStringBuilder); } catch (IOException e) { //
		 * exception handling left as an exercise for the reader }
		 */



		// Step 0: Set up default target folder name
		// =>
		// -->OK--> 1.// String targetFolderName = "FNA-In-JSTOR-test/V21";
		// -->OK--> 2.// String targetFolderName = "FNA-In-JSTOR-test/V2-Corrected";
		// -->OK--> 3.// String targetFolderName = "FNA-In-JSTOR-test/V2";		
		// -->FAIL--> 4.// String targetFolderName = "FNA-In-JSTOR-test/NewAdditions/FNA 24";
		// -->FAIL--> 5.// String targetFolderName = "FNA-In-JSTOR-test/V3";
		// -->OK--> 6.// String targetFolderName = "FNA-In-JSTOR-test/V4";
		// -->OK--> 7.// String targetFolderName = "FNA-In-JSTOR-test/V5";
		// -->OK--> 8.// String targetFolderName = "FNA-In-JSTOR-test/V7";
		// -->OK--> 9.// String targetFolderName = "FNA-In-JSTOR-test/V8";
		// -->OK--> 10.// String targetFolderName = "FNA-In-JSTOR-test/V19";
		// -->OK--> 11.// String targetFolderName = "FNA-In-JSTOR-test/V19_newHabPhenTaxHier";
		// -->OK--> 12.// String targetFolderName = "FNA-In-JSTOR-test/V19-add-missing-files-correct-ranks-in-3-files";
		// -->OK--> 13.// String targetFolderName = "FNA-In-JSTOR-test/V20";
		// -->FAIL--> 14.// String targetFolderName = "FNA-In-JSTOR-test/V22";
		// -->OK--> 15.// String targetFolderName = "FNA-In-JSTOR-test/V23 copy";
		// -->OK--> 16.// String targetFolderName = "FNA-In-JSTOR-test/V26";
		// -->OK--> 17.// String targetFolderName = "FNA-In-JSTOR-test/V27";
		
		// -->OK--> 1.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV2-3";
		// -->OK--> 2.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV4";
		// -->OK--> 3.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV5";
		// -->OK--> 4.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV6";
		// -->OK--> 5.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV7";
		// -->OK--> 6.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV8";
		// -->OK--> 7.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV9";
		// -->FAIL--> 8.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV10";
		// -->FAIL--> 9.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV11";
		// -->OK--> 10.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV12";
		// -->OK--> 11.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV13";
		// -->OK--> 12.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV14";
		// -->OK--> 13.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV18";
		// -->OK--> 14.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV19";
		// -->OK--> 15.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV20-21";
		// -->OK--> 16.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV22";
		// -->OK--> 17.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV23";
		// -->OK--> 18.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV24";
		// -->OK--> 19.// String targetFolderName = "FoC-Old-Format-Original-Transformed/FoCV25";
		
		// Step 0: createTaxonIdentificationList
		// String createTaxonIdentificationListString = createTaxonIdentificationList(targetFolderName, "");
		// System.out.println(createTaxonIdentificationListString);
		// copy it to ...
		
		
		
		// no Step 1 and Step 2 anymore ...
		
		// Step 1: Generate familyRankWithKeyDescSetStringList.csv
		// generateFamilyRankWithKeyDescSetStringList(targetFolderName);
		
		// Step 2: Then, manual check it

		// no Step 1 and Step 2 anymore ...
		
		
		// -->OK--> 1.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V21.csv";
		// -->OK--> 2.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V2.csv";
		// -->OK--> 3.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V2.csv";
		// -->FAIL--> 4.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-NewAdditions-FNA-24.csv";
		// -->FAIL--> 5.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V3.csv";
		// -->OK--> 6.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V4.csv";
		// -->OK--> 7.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V5.csv";
		// -->OK--> 8.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V7.csv";
		// -->OK--> 9.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V8.csv";
		// -->OK--> 10.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V19.csv";
		// -->OK--> 11.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V19_newHabPhenTaxHier.csv";
		// -->OK--> 12.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V19-add-missing-files-correct-ranks-in-3-files.csv";
		// -->OK--> 13.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V20.csv";
		// -->FAIL--> 14.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V22.csv";
		// -->OK--> 15.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V23.csv";
		// -->OK--> 16.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V26.csv";
		// -->OK--> 17.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V27.csv";
		
		
		// -->OK--> 1.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV2-3.csv";
		// -->OK--> 2.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV4.csv";
		// -->OK--> 3.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV5.csv";
		// -->OK--> 4.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV6.csv";
		// -->OK--> 5.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV7.csv";
		// -->OK--> 6.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV8.csv";
		// -->OK--> 7.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV9.csv";
		// -->FAIL--> 8.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV10.csv";
		// -->FAIL--> 9.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV11.csv";
		// -->OK--> 10.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV12.csv";
		// -->OK--> 11.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV13.csv";
		// -->OK--> 12.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV14.csv";
		// -->OK--> 13.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV18.csv";
		// -->OK--> 14.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV19.csv";
		// -->OK--> 15.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV20-21.csv";
		// -->OK--> 16.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV22.csv";
		// -->OK--> 17.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV23.csv";
		// -->OK--> 18.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV24.csv";
		// -->OK--> 19.// String targetCsvFileName = "familyRankWithKeyDescSetStringList-FoCV25.csv";
		
		
		// Step 3 to Step 4
		// Set<String> genusToCorrespondingFamilyEtcSetString = step3ToStep4(targetFolderName, targetCsvFileName);
		
		// Step 5
		// step5Process(targetFolderName, genusToCorrespondingFamilyEtcSetString);

		
		// String targetFolderName = "FNA-In-JSTOR-test-141217-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V19_newHabPhenTaxHier";
		// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V19_newHabPhenTaxHier.csv";
		// Step 3 to Step 4
		// Set<String> genusToCorrespondingFamilyEtcSetString = step3ToStep4(targetFolderName, targetCsvFileName);
		// Step 5
		// step5Process(targetFolderName, genusToCorrespondingFamilyEtcSetString);
		
		
		
		// December 30, 2014 Key Correction testing
		// correctKeyStatement("FNA-In-JSTOR-test-141217-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V21/895.xml"); => This one is expired.
		// walk4CorrectKeyStatement("FNA-In-JSTOR-test-141217-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V21-test");
		
		
		// January 05 2015 Monday Working => Key Correction
		
		// Task 1 => V19
		// String targetFolderName = "FNA-In-JSTOR-test-141217-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V19";
		// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V19.csv";
		// Step 3 to Step 4
		// Set<String> genusToCorrespondingFamilyEtcSetString = step3ToStep4(targetFolderName, targetCsvFileName);
		// Step 5
		// step5Process(targetFolderName, genusToCorrespondingFamilyEtcSetString);
		
		
		// Task 2 => V19-add-missing-files-correct-ranks-in-3-files
		// String targetFolderName = "FNA-In-JSTOR-test-141217-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V19-add-missing-files-correct-ranks-in-3-files";
		// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V19-add-missing-files-correct-ranks-in-3-files.csv";
		// Step 3 to Step 4
		// Set<String> genusToCorrespondingFamilyEtcSetString = step3ToStep4(targetFolderName, targetCsvFileName);
		// Step 5
		// step5Process(targetFolderName, genusToCorrespondingFamilyEtcSetString);

		
		// Task 3 => V20
		// String targetFolderName = "FNA-In-JSTOR-test-141217-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V20";
		// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V20.csv";
		// Step 3 to Step 4
		// Set<String> genusToCorrespondingFamilyEtcSetString = step3ToStep4(targetFolderName, targetCsvFileName);
		// Step 5
		// step5Process(targetFolderName, genusToCorrespondingFamilyEtcSetString);
		
		// Task 4 => V21
		// String targetFolderName = "FNA-In-JSTOR-test-141217-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V21";
		// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V21.csv";
		// Step 3 to Step 4
		// Set<String> genusToCorrespondingFamilyEtcSetString = step3ToStep4(targetFolderName, targetCsvFileName);
		// Step 5
		// step5Process(targetFolderName, genusToCorrespondingFamilyEtcSetString);		
		
		
		// Task 5 => REGROUPING
		// String targetFolderName = "FNA-V19-to-V21";
		// regrouping(targetFolderName);
		
		
		// Task 6 => Just for testing
		// regroupRootFolder-FNA-V21-895-xml
		// walk4CorrectKeyStatement("regroupRootFolder-FNA-V21-895-xml");
		
		// Task 6 =>
		// regroupRootFolder-FNA-V19-to-V21
		// walk4CorrectKeyStatement("regroupRootFolder-FNA-V19-to-V21");

		
		// January 05 2015 Monday Working => Key Correction

		
		// January 12 2015 Monday Working => Add taxon_hierarchy
		
		// taxon_hireachy
		// taxon_hierarchy

		// regroupRootFolder-FNA-V21-895-xml-taxon-hierarchy-testing
		// walk5AddTaxonHierarchy("regroupRootFolder-FNA-V21-895-xml-taxon-hierarchy-testing");
		// regroupRootFolder-FNA-V19-to-V21-add-Taxon_Hierarchy
		// walk5AddTaxonHierarchy("regroupRootFolder-FNA-V19-to-V21-add-Taxon_Hierarchy");
		
		// January 12 2015 Monday Working => Add taxon_hierarchy
		
		
		
		// January 15, 2015 Thursday Working 
		
		// Task 1::
		// Transform to new schema
		// walk("FNA-In-JSTOR-test-150115-processing-Step1-Transformed-To-New-Schema", "transferXMLFormatFromOldXMLFNAInJSTORReplaced");
		// 
		// Taks 2::
		// add unknown
		// walk3AddUnknowInFoc("FNA-In-JSTOR-test-150115-processing-Step2-Transformed-To-New-Schema-Add-Unknown");
		
		// Taks 3::Add Higher Rank Taxon Identification
		// FNA-V19-to-V21-150116-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V19_newHabPhenTaxHier
		// String targetFolderName = "FNA-V19-to-V21-150116-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V19_newHabPhenTaxHier";
		// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V19_newHabPhenTaxHier.csv";
		// Step 3 to Step 4
		// Set<String> genusToCorrespondingFamilyEtcSetString = step3ToStep4(targetFolderName, targetCsvFileName);
		// Step 5
		// step5Process(targetFolderName, genusToCorrespondingFamilyEtcSetString);
		
		
		
		// Taks 4::Add Higher Rank Taxon Identification
		// FNA-V19-to-V21-150116-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V19
		// String targetFolderName = "FNA-V19-to-V21-150116-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V19";
		// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V19.csv";
		// Step 3 to Step 4
		// Set<String> genusToCorrespondingFamilyEtcSetString = step3ToStep4(targetFolderName, targetCsvFileName);
		// Step 5
		// step5Process(targetFolderName, genusToCorrespondingFamilyEtcSetString);
				
				
		// Taks 5::Add Higher Rank Taxon Identification
		// FNA-V19-to-V21-150116-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V19-add-missing-files-correct-ranks-in-3-files
		// String targetFolderName = "FNA-V19-to-V21-150116-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V19-add-missing-files-correct-ranks-in-3-files";
		// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V19-add-missing-files-correct-ranks-in-3-files.csv";
		// Step 3 to Step 4
		// Set<String> genusToCorrespondingFamilyEtcSetString = step3ToStep4(targetFolderName, targetCsvFileName);
		// Step 5
		// step5Process(targetFolderName, genusToCorrespondingFamilyEtcSetString);

				
		// Taks 6::Add Higher Rank Taxon Identification
		// FNA-V19-to-V21-150116-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V20
		// String targetFolderName = "FNA-V19-to-V21-150116-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V20";
		// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V20.csv";
		// Step 3 to Step 4
		// Set<String> genusToCorrespondingFamilyEtcSetString = step3ToStep4(targetFolderName, targetCsvFileName);
		// Step 5
		// step5Process(targetFolderName, genusToCorrespondingFamilyEtcSetString);
				
		// Taks 7::Add Higher Rank Taxon Identification
		// FNA-V19-to-V21-150116-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V21
		// String targetFolderName = "FNA-V19-to-V21-150116-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification/V21";
		// String targetCsvFileName = "familyRankWithKeyDescSetStringList-V21.csv";
		// Step 3 to Step 4
		// Set<String> genusToCorrespondingFamilyEtcSetString = step3ToStep4(targetFolderName, targetCsvFileName);
		// Step 5
		// step5Process(targetFolderName, genusToCorrespondingFamilyEtcSetString);		
						
		// Task 8:: => REGROUPING
		// String targetFolderName = "FNA-V19-to-V21-150116-processing-Transformed-To-New-Schema-Add-Unknown-Add-Higher-Rank-Taxon-Identification";
		// regrouping(targetFolderName);
				
		// Task 9:: => Correct Key Statement	
		// regroupRootFolder-FNA-V19-to-V21-150116
		// walk4CorrectKeyStatement("regroupRootFolder-FNA-V19-to-V21-150116");
		
		
		// Task 10:: => Update or Add Taxon Hierarchy
		// regroupRootFolder-FNA-V19-to-V21-150116-Key-Correction
		// walk5AddTaxonHierarchy("regroupRootFolder-FNA-V19-to-V21-150116-Key-Correction");
		
		
		// Task 11:: => Change Key => Key_Disscussion ToDiscussion
		// Testing
		// ChangeKey_Key_DisscussionToDiscussion-140116-Test
		// walk6ChangeKey_Key_DisscussionToDiscussion("ChangeKey_Key_DisscussionToDiscussion-140116-Test");
		// Actual working
		// regroupRootFolder-FNA-V19-to-V21-150116-processing-Step7-Key-Correction-Update-Or-Add-Taxon-Hierarchy
		// walk6ChangeKey_Key_DisscussionToDiscussion("regroupRootFolder-FNA-V19-to-V21-150116-processing-Step7-Key-Correction-Update-Or-Add-Taxon-Hierarchy");
		
		
		// Task 12:: => Change all empty string to "unknown"
		// regroupRootFolder-FNA-V19-to-V21-150116-processing-Step8-Key-Correction-Update-Or-Add-Taxon-Hierarchy-Key-Key_Disscussion-To-Discussion
		// walk7ChangeAllEmptyStringToUnknown("regroupRootFolder-FNA-V19-to-V21-150116-processing-Step8-Key-Correction-Update-Or-Add-Taxon-Hierarchy-Key-Key_Disscussion-To-Discussion");
		
		// walk8ChangeElement_publication_title_EmptyStringToUnknown("regroupRootFolder-FNA-V19-to-V21-150116-processing-Step8-Key-Correction-Update-Or-Add-Taxon-Hierarchy-Key-Key_Disscussion-To-Discussion");
		
		
		
		// January 15, 2015 Thursday Working 

		
		
		
		// Just a testing, you can ignore it!!
		// // String aaa = "family::asteraceae;tribe::heliantheae;subtribe::flaveriinae;325. haploësthes , p. 245;326. sartwellia , p. 246;327. flaveria , p. 247;";
		// // String bbb = "haploësthes";

		// // if (aaa.contains(bbb)) {
		// //	System.out.println("Yes!!");
		// // }
		// Jut a testing, you can ignore it!!

		
		
		
		
		
		
		
		
		// REGROUPING
		// String targetFolderName = "FNA-In-JSTOR-test-111";
		// regrouping(targetFolderName);
		
		// String targetFolderName = "FoC-Transformed-Reviewed-Appended";
		// regrouping(targetFolderName);
		
		// REGROUPING
		
		

	}

	public static void readXML(String xmlFileName) {
		SAXBuilder saxBuilder = new SAXBuilder();
		try {
			// System.out.println("Hello Elvis!!");
			InputStream inputStream = new FileInputStream(xmlFileName);
			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			// String message = xmlDocument.getRootElement().getText();
			// System.out.println("message::" + message);
			Element rootNode = xmlDocument.getRootElement();
			System.out.println("rootNode::" + rootNode.getName());

			// <?xml version="1.0" encoding="UTF-8"?>
			// <treatment>
			// <TaxonIdentification Status="ACCEPTED">
			// <suborder_name>Endocoentheae</suborder_name>
			// </TaxonIdentification>
			// <TaxonHierarchy>suborder Endocoentheae;</TaxonHierarchy>
			// <description>Actiniaria with well-developed pedal disc but
			// without basilar muscles. Column without vesicles and verrucae,
			// nearly always with spirocysts. Margin tentaculate. No sphincter.
			// Tentacles in variable number, often with their aboral side
			// thickened, either in two alternating cycles or, owing to the
			// curious development of the mesenteries, arranged in a way very
			// different from the normal type, but usually in cycles.
			// Longitudinal muscles of tentacles and radial muscles of oral disc
			// ectodermal, with a slight mesogloeal tendency. Oral disc
			// sometimes lobed. One siphonoglyph or two. Usually more
			// mesenteries than the directives attached to the siphonoglyph.
			// Arrangement of the mesenteries curious. After the first 12
			// mesenteries (six couples) are developed, all subsequent pairs
			// appear in the lateral endocoels and have their longitudinal
			// muscles oriented as in the directives. Cnidom: spirocysts,
			// basitrichs, microbasic p-mastigophors.</description>
			// </treatment>

			Element taxonIdentification = rootNode
					.getChild("TaxonIdentification");
			List taxonIdentificationList = taxonIdentification.getChildren();
			Iterator<Element> iterator = taxonIdentificationList.iterator();
			while (iterator.hasNext()) {
				Element elementInTaxonIdentificationList = iterator.next();
				System.out.println(elementInTaxonIdentificationList.getName()
						+ "::" + elementInTaxonIdentificationList.getText());
			}

			Element taxonHierarchy = rootNode.getChild("TaxonHierarchy");
			String taxonHierarchyText = taxonHierarchy.getText();
			System.out.println("taxonHierarchyText::" + taxonHierarchyText);

			Element description = rootNode.getChild("description");

			String descriptionText = description.getText();
			System.out.println("descriptionText::" + descriptionText);

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}

	}

	public static void readSchema(String xmlfileName) throws SAXException,
			JDOMException, IOException {
		String file = "1.xml";
		String schemaFile = "semanticMarkupInput.xsd";

		// METHOD 1

		// Define a schema factory and a schema
		SchemaFactory schemaFactory = SchemaFactory
				.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = schemaFactory.newSchema(new File(schemaFile));

		// create an XMLReaderJDOMFactory by passing the schema
		XMLReaderJDOMFactory factory = new XMLReaderSchemaFactory(schema);

		// create a SAXBuilder using the XMLReaderJDOMFactory
		SAXBuilder sb = new SAXBuilder(factory);

		// Document doc = sb.build(new File(file));
		// System.out.println(doc.getRootElement().getName());

		/*
		 * // METHOD 2
		 * 
		 * File xsd = new File(schemaFile); // Create the XMLReaderJDOMFacotory
		 * directly using the schema file // instead of 'Schema'
		 * XMLReaderJDOMFactory factory2 = new XMLReaderXSDFactory(schemaFile);
		 * SAXBuilder sb2 = new SAXBuilder(factory2); Document doc2 =
		 * sb2.build(new File(file));
		 * System.out.println(doc2.getRootElement().getName());
		 */

	}

	public static void writeXML(String outputXmlFileName) {
		try {

			Element company = new Element("company");
			Document doc = new Document(company);
			// doc.setRootElement(company);

			Element staff = new Element("staff");
			staff.setAttribute(new Attribute("id", "1"));
			staff.addContent(new Element("firstname").setText("yong"));
			staff.addContent(new Element("lastname").setText("mook kim"));
			staff.addContent(new Element("nickname").setText("mkyong"));
			staff.addContent(new Element("salary").setText("199999"));

			doc.getRootElement().addContent(staff);

			Element staff2 = new Element("staff");
			staff2.setAttribute(new Attribute("id", "2"));
			staff2.addContent(new Element("firstname").setText("low"));
			staff2.addContent(new Element("lastname").setText("yin fong"));
			staff2.addContent(new Element("nickname").setText("fong fong"));
			staff2.addContent(new Element("salary").setText("188888"));

			doc.getRootElement().addContent(staff2);

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter("elvis_write_xml.xml"));

			System.out.println("File Saved!");
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}

	public static void transferXMLFormatFromCharaParserXML(
			String targetFolderName, String inputXmlFileName,
			String outputXmlFileName) {

		new File("new_" + targetFolderName).mkdirs();
		SAXBuilder saxBuilder = new SAXBuilder();
		try {

			InputStream inputStream = new FileInputStream(targetFolderName
					+ "/" + inputXmlFileName);
			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			// String rootElement = xmlDocument.getRootElement().getText();
			// System.out.println("rootElement::" + rootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>
			// <treatment>
			// <TaxonIdentification Status="ACCEPTED">
			// <suborder_name>Endocoentheae</suborder_name>
			// </TaxonIdentification>
			// <TaxonHierarchy>suborder Endocoentheae;</TaxonHierarchy>
			// <description>Actiniaria with well-developed pedal disc but
			// without basilar muscles. Column without vesicles and verrucae,
			// nearly always with spirocysts. Margin tentaculate. No sphincter.
			// Tentacles in variable number, often with their aboral side
			// thickened, either in two alternating cycles or, owing to the
			// curious development of the mesenteries, arranged in a way very
			// different from the normal type, but usually in cycles.
			// Longitudinal muscles of tentacles and radial muscles of oral disc
			// ectodermal, with a slight mesogloeal tendency. Oral disc
			// sometimes lobed. One siphonoglyph or two. Usually more
			// mesenteries than the directives attached to the siphonoglyph.
			// Arrangement of the mesenteries curious. After the first 12
			// mesenteries (six couples) are developed, all subsequent pairs
			// appear in the lateral endocoels and have their longitudinal
			// muscles oriented as in the directives. Cnidom: spirocysts,
			// basitrichs, microbasic p-mastigophors.</description>
			// </treatment>

			Map<String, String> taxonNameAndRankMap = new HashMap<String, String>();

			Element taxonIdentification = rootNode
					.getChild("TaxonIdentification");
			List taxonIdentificationList = taxonIdentification.getChildren();
			Iterator<Element> iterator = taxonIdentificationList.iterator();
			while (iterator.hasNext()) {
				Element elementInTaxonIdentificationList = iterator.next();
				String taxon_rank = elementInTaxonIdentificationList.getName();
				String new_taxon_rank = taxon_rank;
				String[] taxon_rank_array = taxon_rank.split("_");
				if (taxon_rank_array.length > 1) {
					new_taxon_rank = taxon_rank_array[0];
				}
				String taxon_name = elementInTaxonIdentificationList.getText();
				// System.out.println(taxon_rank
				// + "::" + taxon_name);
				taxonNameAndRankMap.put(taxon_name, new_taxon_rank);
			}

			Element inputTaxonHierarchy = rootNode.getChild("TaxonHierarchy");
			String inputTaxonHierarchyText = inputTaxonHierarchy.getText();
			// System.out.println("inputTaxonHierarchyText::" +
			// inputTaxonHierarchyText);

			Element inputDescription = rootNode.getChild("description");

			String inputDescriptionText = inputDescription.getText();
			// System.out.println("inputDescriptionText::" +
			// inputDescriptionText);

			// Write XML
			//

			Element treatment = new Element("treatment");
			Document doc = new Document(treatment);

			Element source = new Element("source");
			source.addContent(new Element("author").setText(""));
			source.addContent(new Element("date").setText(""));
			source.addContent(new Element("title").setText(""));

			Element processor = new Element("processor");
			processor.addContent(new Element("date").setText(""));

			Element software = new Element("software");
			software.setAttribute(new Attribute("type",
					"xml format transformer"));
			software.setAttribute(new Attribute("version", "1.0"));

			processor.addContent(software);
			processor.addContent(new Element("operator").setText(""));

			Element processed_by = new Element("processed_by");
			processed_by.addContent(processor);

			Element meta = new Element("meta");
			meta.addContent(source);
			meta.addContent(processed_by);

			doc.getRootElement().addContent(meta);

			// Section 2

			Element taxon_hierarchy = new Element("taxon_hierarchy");
			taxon_hierarchy.setText(inputTaxonHierarchyText);

			Element taxon_identification = new Element("taxon_identification");
			taxon_identification.setAttribute(new Attribute("status",
					"ACCEPTED"));

			for (Map.Entry<String, String> entry : taxonNameAndRankMap
					.entrySet()) {
				Element taxon_name = new Element("taxon_name");

				// System.out.println(entry.getKey() + "/" + entry.getValue());
				String taxonName = entry.getKey();
				String taxonRank = entry.getValue();
				taxon_name.setAttribute(new Attribute("rank", taxonRank));
				taxon_name.setText(taxonName);
				taxon_identification.addContent(taxon_name);
			}
			taxon_identification.addContent(taxon_hierarchy);

			doc.getRootElement().addContent(taxon_identification);

			// Section 3

			Element description = new Element("description");
			description.setAttribute(new Attribute("type", "morphology"));
			description.setText(inputDescriptionText);

			doc.getRootElement().addContent(description);

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter("new_" + targetFolderName
					+ "/" + outputXmlFileName));

			// System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}

	}

	public static void batchTransformFromCharaParserXML(String targetFolderName) {
		File inputFolder = new File(targetFolderName);
		File[] inputFiles = inputFolder.listFiles();
		for (File inputFile : inputFiles) {
			try {
				String inputXmlFileName = inputFile.getName();
				String outputXmlFileName = inputFile.getName();
				transferXMLFormatFromCharaParserXML(targetFolderName,
						inputXmlFileName, outputXmlFileName);
			} catch (Exception e) {
				// handle Exception
			}
		}
	}

	public static void copyDirectory(File sourceLocation, File targetLocation)
			throws IOException {

		if (sourceLocation.isDirectory()) {
			if (!targetLocation.exists()) {
				targetLocation.mkdir();
			}

			String[] children = sourceLocation.list();
			for (int i = 0; i < children.length; i++) {
				copyDirectory(new File(sourceLocation, children[i]), new File(
						targetLocation, children[i]));
			}
		} else {

			InputStream in = new FileInputStream(sourceLocation);
			OutputStream out = new FileOutputStream(targetLocation);

			// Copy the bits from instream to outstream
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		}
	}

	public static void transferXMLFormatFromOldXMLVersion1NewFolder(
			String targetFolderName, String inputXmlFileName,
			String outputXmlFileName) {

		new File("new_" + targetFolderName).mkdirs();

		SAXBuilder saxBuilder = new SAXBuilder();

		try {
			// System.out.println(targetFolderName + "/" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			Element meta = new Element("meta");
			Element source = new Element("source");
			Element processed_by = new Element("processed_by");
			Element processor = new Element("processor");
			List<Element> other_info_on_metaList = new ArrayList<Element>();
			List<Element> taxon_nameList = new ArrayList<Element>();

			Element taxon_identification = new Element("taxon_identification");

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(targetFolderName
					+ "/" + inputXmlFileName);
			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String rootElement = xmlDocument.getRootElement().getText();
			System.out.println("rootElement::" + rootElement);
			Element rootNode = xmlDocument.getRootElement();
			System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List rootChildren = rootNode.getChildren();

			Iterator<Element> rootChildrenIterator = rootChildren.iterator();
			while (rootChildrenIterator.hasNext()) {
				Element rootChildrenElement = rootChildrenIterator.next();
				String rootChildrenElementName = rootChildrenElement.getName();
				System.out.println(rootChildrenElementName);

				if (rootChildrenElementName == "meta") {
					List metaChildren = rootChildrenElement.getChildren();
					Iterator<Element> metaChildrenIterator = metaChildren
							.iterator();
					while (metaChildrenIterator.hasNext()) {
						Element metaChildrenElement = metaChildrenIterator
								.next();
						String metaChildrenElementName = metaChildrenElement
								.getName();
						System.out.println(metaChildrenElementName);

						if (metaChildrenElementName == "source") {

							boolean hasAuthor = false;
							boolean hasDate = false;
							boolean hasTitle = false;

							List sourceChildren = metaChildrenElement
									.getChildren();
							Iterator<Element> sourceChildrenIterator = sourceChildren
									.iterator();
							while (sourceChildrenIterator.hasNext()) {
								Element sourceChildrenElement = sourceChildrenIterator
										.next();
								String sourceChildrenElementName = sourceChildrenElement
										.getName();
								// System.out.println(sourceChildrenElementName);
								if (sourceChildrenElementName == "author") {
									source.addContent(new Element("author")
											.setText(sourceChildrenElement
													.getText()));
									hasAuthor = true;
								}
								if (sourceChildrenElementName == "date") {
									source.addContent(new Element("date")
											.setText(sourceChildrenElement
													.getText()));
									hasDate = true;
								}
								if (sourceChildrenElementName == "title") {
									source.addContent(new Element("title")
											.setText(sourceChildrenElement
													.getText()));
									hasTitle = true;
								}
							}

							if (!hasAuthor) {
								source.addContent(new Element("author")
										.setText(""));
							}
							if (!hasDate) {
								source.addContent(new Element("date")
										.setText(""));
							}
							if (!hasTitle) {
								source.addContent(new Element("title")
										.setText(""));
							}

						}

						if (metaChildrenElementName == "processed_by") {

							boolean hasProcessor = false;

							List processed_byChildren = metaChildrenElement
									.getChildren();
							Iterator<Element> processed_byChildrenIterator = processed_byChildren
									.iterator();
							while (processed_byChildrenIterator.hasNext()) {
								Element processed_byChildrenElement = processed_byChildrenIterator
										.next();
								String processed_byChildrenElementName = processed_byChildrenElement
										.getName();
								// System.out.println(processed_byChildrenElementName);
								if (processed_byChildrenElementName == "processor") {

									hasProcessor = true;

									boolean hasDate = false;
									boolean hasSoftware = false;
									boolean hasOperator = false;
									List processorChildren = processed_byChildrenElement
											.getChildren();
									Iterator<Element> processorChildrenIterator = processorChildren
											.iterator();
									while (processorChildrenIterator.hasNext()) {
										Element processorChildrenElement = processorChildrenIterator
												.next();
										String processorChildrenElementName = processorChildrenElement
												.getName();
										// System.out.println(processorChildrenElementName);
										if (processorChildrenElementName == "date") {
											processor
													.addContent(new Element(
															"date")
															.setText(processorChildrenElement
																	.getText()));
											hasDate = true;
										}
										if (processorChildrenElementName == "software") {

											// processor.addContent(new
											// Element("software").setText(processorChildrenElement.getText()));
											Element software = new Element(
													"software");
											software.setAttribute(new Attribute(
													"type",
													processorChildrenElement
															.getAttributeValue("type")));
											// software.setAttribute(new
											// Attribute("type",
											// "xml format transformer"));
											software.setAttribute(new Attribute(
													"version",
													processorChildrenElement
															.getAttributeValue("version")));
											// software.setAttribute(new
											// Attribute("version", "1.0"));

											processor.addContent(software);

											hasSoftware = true;
										}
										if (processorChildrenElementName == "operator") {
											processor
													.addContent(new Element(
															"operator")
															.setText(processorChildrenElement
																	.getText()));
											hasOperator = true;
										}

									}

									if (!hasDate) {
										processor
												.addContent(new Element("date")
														.setText(""));
									}
									if (!hasSoftware) {
										processor.addContent(new Element(
												"software").setText(""));
									}
									if (!hasOperator) {
										processor.addContent(new Element(
												"operator").setText(""));
									}

								}

							}
							processed_by.addContent(processor);

							// if ( ! hasProcessor) {
							// processed_by.addContent(processor);
							// } else {
							// processed_by.addContent(processor);
							// }

						}

						// other_info_on_meta
						if (metaChildrenElementName == "other_info_on_meta") {
							// Example:
							// <other_info_on_meta
							// type="doi">10.1.11.12</other_info_on_meta>
							// <other_info_on_meta type="citation">Full
							// Citation</other_info_on_meta>

							Element other_info_on_meta = new Element(
									"other_info_on_meta");

							String other_info_on_metaString = metaChildrenElement
									.getText();
							// System.out.println("other_info_on_meta:" +
							// other_info_on_metaString);

							// other_info_on_meta.addContent(other_info_on_metaString);
							// other_info_on_metaList.add(other_info_on_meta);

							String[] other_info_on_metaStringArray = other_info_on_metaString
									.split(":");
							// System.out.println("other_info_on_metaStringArray.length:"
							// + other_info_on_metaStringArray.length);

							if (other_info_on_metaStringArray.length > 1) {
								System.out
										.println("other_info_on_metaStringArray[0]:"
												+ other_info_on_metaStringArray[0]);
								String restString = other_info_on_metaString
										.replace(
												other_info_on_metaStringArray[0]
														+ ":", "").trim();
								System.out.println("restString:" + restString);

								if (other_info_on_metaStringArray[0]
										.equals("doi")) {
									other_info_on_meta
											.setAttribute(new Attribute("type",
													"doi"));
									other_info_on_meta.addContent(restString);
								} else if (other_info_on_metaStringArray[0]
										.equals("full citation")) {
									other_info_on_meta
											.setAttribute(new Attribute("type",
													"citation"));
									other_info_on_meta.addContent(restString);
								}
								other_info_on_metaList.add(other_info_on_meta);

							}

						}

					}

				}

				if (rootChildrenElementName == "taxon_identification") {
					String attributeStatus = rootChildrenElement
							.getAttributeValue("status");
					if (attributeStatus.equals("ACCEPTED")) {
						List taxon_identificationChildren = rootChildrenElement
								.getChildren();
						Iterator<Element> taxon_identificationChildrenIterator = taxon_identificationChildren
								.iterator();
						while (taxon_identificationChildrenIterator.hasNext()) {
							Element taxon_identificationChildrenElement = taxon_identificationChildrenIterator
									.next();
							String taxon_identificationChildrenElementName = taxon_identificationChildrenElement
									.getName();
							String taxon_identificationChildrenElementText = taxon_identificationChildrenElement
									.getText();
							System.out
									.println(taxon_identificationChildrenElementName);

							// Old::
							// <family_name>Hemiasterellidae Lendenfeld,
							// 1889</family_name>

							// New::
							// <taxon_name rank="family">familyBBB</taxon_name>
							// <taxon_name rank="order">OrderAAA</taxon_name>
							Element taxon_name = new Element("taxon_name");

							String[] taxon_identificationChildrenElementNameArray = taxon_identificationChildrenElementName
									.split("_");
							if (taxon_identificationChildrenElementNameArray.length > 1) {
								taxon_name
										.setAttribute(new Attribute(
												"rank",
												taxon_identificationChildrenElementNameArray[0]));
								taxon_name
										.addContent(taxon_identificationChildrenElementText);
								taxon_nameList.add(taxon_name);
							}

						}
					}

				}

				if (rootChildrenElementName == "description") {
					System.out
							.println("description:" + rootChildrenElementName);
					String attributeType = rootChildrenElement
							.getAttributeValue("type");
					String descriptionChildrenElementText = rootChildrenElement
							.getText();

					Element description = new Element("description");
					description.setAttribute(new Attribute("type",
							attributeType));
					description.addContent(descriptionChildrenElementText);

					descriptionList.add(description);

				}

			}

			meta.addContent(source);
			meta.addContent(processed_by);
			// meta.addContent(other_info_on_meta);
			for (Element itemInOther_info_on_metaList : other_info_on_metaList) {
				meta.addContent(itemInOther_info_on_metaList);
			}

			taxon_identification.setAttribute(new Attribute("status",
					"ACCEPTED"));

			for (Element itemInTaxon_nameList : taxon_nameList) {
				taxon_identification.addContent(itemInTaxon_nameList);
			}

			doc.getRootElement().addContent(meta);
			doc.getRootElement().addContent(taxon_identification);

			for (Element itemInDescriptionList : descriptionList) {
				doc.getRootElement().addContent(itemInDescriptionList);
			}

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter("new_" + targetFolderName
					+ "/" + outputXmlFileName));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}

	}

	public static void batchTransformFromOldXMLVersion1(String targetFolderName) {
		File inputFolder = new File(targetFolderName);
		File[] inputFiles = inputFolder.listFiles();
		for (File inputFile : inputFiles) {
			try {
				String inputXmlFileName = inputFile.getName();
				String outputXmlFileName = inputFile.getName();
				// System.out.println("inputXmlFileName::" + inputXmlFileName);

				transferXMLFormatFromOldXMLVersion1NewFolder(targetFolderName,
						inputXmlFileName, outputXmlFileName);
			} catch (Exception e) {
				// handle Exception
			}
		}
	}

	public static void transferXMLFormatFromOldXMLVersion1Replaced(
			String inputXmlFileName) {

		SAXBuilder saxBuilder = new SAXBuilder();

		try {
			// System.out.println(targetFolderName + "/" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			Element meta = new Element("meta");
			Element source = new Element("source");
			Element processed_by = new Element("processed_by");
			Element processor = new Element("processor");
			List<Element> other_info_on_metaList = new ArrayList<Element>();
			List<Element> taxon_nameList = new ArrayList<Element>();

			Element taxon_identification = new Element("taxon_identification");

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String rootElement = xmlDocument.getRootElement().getText();
			System.out.println("rootElement::" + rootElement);
			Element rootNode = xmlDocument.getRootElement();
			System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> rootChildren = rootNode.getChildren();

			Iterator<Element> rootChildrenIterator = rootChildren.iterator();
			while (rootChildrenIterator.hasNext()) {
				Element rootChildrenElement = rootChildrenIterator.next();
				String rootChildrenElementName = rootChildrenElement.getName();
				System.out.println(rootChildrenElementName);

				if (rootChildrenElementName == "meta") {
					List metaChildren = rootChildrenElement.getChildren();
					Iterator<Element> metaChildrenIterator = metaChildren
							.iterator();
					while (metaChildrenIterator.hasNext()) {
						Element metaChildrenElement = metaChildrenIterator
								.next();
						String metaChildrenElementName = metaChildrenElement
								.getName();
						System.out.println(metaChildrenElementName);

						if (metaChildrenElementName == "source") {

							boolean hasAuthor = false;
							boolean hasDate = false;
							boolean hasTitle = false;

							List sourceChildren = metaChildrenElement
									.getChildren();
							Iterator<Element> sourceChildrenIterator = sourceChildren
									.iterator();
							while (sourceChildrenIterator.hasNext()) {
								Element sourceChildrenElement = sourceChildrenIterator
										.next();
								String sourceChildrenElementName = sourceChildrenElement
										.getName();
								// System.out.println(sourceChildrenElementName);
								if (sourceChildrenElementName == "author") {
									source.addContent(new Element("author")
											.setText(sourceChildrenElement
													.getText()));
									hasAuthor = true;
								}
								if (sourceChildrenElementName == "date") {
									source.addContent(new Element("date")
											.setText(sourceChildrenElement
													.getText()));
									hasDate = true;
								}
								if (sourceChildrenElementName == "title") {
									source.addContent(new Element("title")
											.setText(sourceChildrenElement
													.getText()));
									hasTitle = true;
								}
							}

							if (!hasAuthor) {
								source.addContent(new Element("author")
										.setText(""));
							}
							if (!hasDate) {
								source.addContent(new Element("date")
										.setText(""));
							}
							if (!hasTitle) {
								source.addContent(new Element("title")
										.setText(""));
							}

						}

						if (metaChildrenElementName == "processed_by") {

							boolean hasProcessor = false;

							List processed_byChildren = metaChildrenElement
									.getChildren();
							Iterator<Element> processed_byChildrenIterator = processed_byChildren
									.iterator();
							while (processed_byChildrenIterator.hasNext()) {
								Element processed_byChildrenElement = processed_byChildrenIterator
										.next();
								String processed_byChildrenElementName = processed_byChildrenElement
										.getName();
								// System.out.println(processed_byChildrenElementName);
								if (processed_byChildrenElementName == "processor") {

									hasProcessor = true;

									boolean hasDate = false;
									boolean hasSoftware = false;
									boolean hasOperator = false;
									List processorChildren = processed_byChildrenElement
											.getChildren();
									Iterator<Element> processorChildrenIterator = processorChildren
											.iterator();
									while (processorChildrenIterator.hasNext()) {
										Element processorChildrenElement = processorChildrenIterator
												.next();
										String processorChildrenElementName = processorChildrenElement
												.getName();
										// System.out.println(processorChildrenElementName);
										if (processorChildrenElementName == "date") {
											processor
													.addContent(new Element(
															"date")
															.setText(processorChildrenElement
																	.getText()));
											hasDate = true;
										}
										if (processorChildrenElementName == "software") {

											// processor.addContent(new
											// Element("software").setText(processorChildrenElement.getText()));
											Element software = new Element(
													"software");
											software.setAttribute(new Attribute(
													"type",
													processorChildrenElement
															.getAttributeValue("type")));
											// software.setAttribute(new
											// Attribute("type",
											// "xml format transformer"));
											software.setAttribute(new Attribute(
													"version",
													processorChildrenElement
															.getAttributeValue("version")));
											// software.setAttribute(new
											// Attribute("version", "1.0"));

											processor.addContent(software);

											hasSoftware = true;
										}
										if (processorChildrenElementName == "operator") {
											processor
													.addContent(new Element(
															"operator")
															.setText(processorChildrenElement
																	.getText()));
											hasOperator = true;
										}

									}

									if (!hasDate) {
										processor
												.addContent(new Element("date")
														.setText(""));
									}
									if (!hasSoftware) {
										processor.addContent(new Element(
												"software").setText(""));
									}
									if (!hasOperator) {
										processor.addContent(new Element(
												"operator").setText(""));
									}

								}

							}
							processed_by.addContent(processor);

							// if ( ! hasProcessor) {
							// processed_by.addContent(processor);
							// } else {
							// processed_by.addContent(processor);
							// }

						}

						// other_info_on_meta
						if (metaChildrenElementName == "other_info_on_meta") {
							// Example:
							// <other_info_on_meta
							// type="doi">10.1.11.12</other_info_on_meta>
							// <other_info_on_meta type="citation">Full
							// Citation</other_info_on_meta>

							Element other_info_on_meta = new Element(
									"other_info_on_meta");

							String other_info_on_metaString = metaChildrenElement
									.getText();
							// System.out.println("other_info_on_meta:" +
							// other_info_on_metaString);

							// other_info_on_meta.addContent(other_info_on_metaString);
							// other_info_on_metaList.add(other_info_on_meta);

							String[] other_info_on_metaStringArray = other_info_on_metaString
									.split(":");
							// System.out.println("other_info_on_metaStringArray.length:"
							// + other_info_on_metaStringArray.length);

							if (other_info_on_metaStringArray.length > 1) {
								System.out
										.println("other_info_on_metaStringArray[0]:"
												+ other_info_on_metaStringArray[0]);
								String restString = other_info_on_metaString
										.replace(
												other_info_on_metaStringArray[0]
														+ ":", "").trim();
								System.out.println("restString:" + restString);

								if (other_info_on_metaStringArray[0]
										.equals("doi")) {
									other_info_on_meta
											.setAttribute(new Attribute("type",
													"doi"));
									other_info_on_meta.addContent(restString);
								} else if (other_info_on_metaStringArray[0]
										.equals("full citation")) {
									other_info_on_meta
											.setAttribute(new Attribute("type",
													"citation"));
									other_info_on_meta.addContent(restString);
								}
								other_info_on_metaList.add(other_info_on_meta);

							}

						}

					}

				}

				if (rootChildrenElementName == "taxon_identification") {
					String attributeStatus = rootChildrenElement
							.getAttributeValue("status");
					if (attributeStatus.equals("ACCEPTED")) {
						List taxon_identificationChildren = rootChildrenElement
								.getChildren();
						Iterator<Element> taxon_identificationChildrenIterator = taxon_identificationChildren
								.iterator();
						while (taxon_identificationChildrenIterator.hasNext()) {
							Element taxon_identificationChildrenElement = taxon_identificationChildrenIterator
									.next();
							String taxon_identificationChildrenElementName = taxon_identificationChildrenElement
									.getName();
							String taxon_identificationChildrenElementText = taxon_identificationChildrenElement
									.getText();
							System.out
									.println(taxon_identificationChildrenElementName);

							// Old::
							// <family_name>Hemiasterellidae Lendenfeld,
							// 1889</family_name>

							// New::
							// <taxon_name rank="family">familyBBB</taxon_name>
							// <taxon_name rank="order">OrderAAA</taxon_name>
							Element taxon_name = new Element("taxon_name");

							String[] taxon_identificationChildrenElementNameArray = taxon_identificationChildrenElementName
									.split("_");
							if (taxon_identificationChildrenElementNameArray.length > 1) {
								taxon_name
										.setAttribute(new Attribute(
												"rank",
												taxon_identificationChildrenElementNameArray[0]));
								taxon_name
										.addContent(taxon_identificationChildrenElementText);
								taxon_nameList.add(taxon_name);
							}

						}
					}

				}

				if (rootChildrenElementName == "description") {
					System.out
							.println("description:" + rootChildrenElementName);
					String attributeType = rootChildrenElement
							.getAttributeValue("type");
					String descriptionChildrenElementText = rootChildrenElement
							.getText();

					Element description = new Element("description");
					description.setAttribute(new Attribute("type",
							attributeType));
					description.addContent(descriptionChildrenElementText);

					descriptionList.add(description);

				}

			}

			meta.addContent(source);
			meta.addContent(processed_by);
			// meta.addContent(other_info_on_meta);
			for (Element itemInOther_info_on_metaList : other_info_on_metaList) {
				meta.addContent(itemInOther_info_on_metaList);
			}

			taxon_identification.setAttribute(new Attribute("status",
					"ACCEPTED"));

			for (Element itemInTaxon_nameList : taxon_nameList) {
				taxon_identification.addContent(itemInTaxon_nameList);
			}

			doc.getRootElement().addContent(meta);
			doc.getRootElement().addContent(taxon_identification);

			for (Element itemInDescriptionList : descriptionList) {
				doc.getRootElement().addContent(itemInDescriptionList);
			}

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}

	}

	public static void transferXMLFormatFromOldXMLFNAInJSTORReplaced(
			String inputXmlFileName, Set<String> allSchemaAttributeName) {

		SAXBuilder saxBuilder = new SAXBuilder();

		try {
			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			Element meta = new Element("meta");
			Element source = new Element("source");
			Element processed_by = new Element("processed_by");
			Element processor = new Element("processor");
			List<Element> other_info_on_metaList = new ArrayList<Element>();
			List<Element> taxon_nameList = new ArrayList<Element>();

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String rootElement = xmlDocument.getRootElement().getText();
			// System.out.println("rootElement::" + rootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();

			// recursively read List<Element> rootChildren and gather required
			// information

			// Scheme
			// Iterator<Element> childrenOfRootIterator =
			// childrenOfRoot.iterator();
			// while (childrenOfRootIterator.hasNext()) {
			// Element elementOfChildrenOfRoot = childrenOfRootIterator.next();
			// String nameOfElementOfChildrenOfRoot =
			// elementOfChildrenOfRoot.getName();
			// String textOfElementOfChildrenOfRoot =
			// elementOfChildrenOfRoot.getText();
			// System.out.println("nameOfElementOfChildrenOfRoot::" +
			// nameOfElementOfChildrenOfRoot);
			// }

			// Build meta

			Iterator<Element> childrenOfRootIterator = childrenOfRoot
					.iterator();

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				// if (nameOfElementOfChildrenOfRoot.equals("phenology")) {
				// System.out.println("phenology::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if (nameOfElementOfChildrenOfRoot.equals("conservation")) {
				// System.out.println("conservation::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if (nameOfElementOfChildrenOfRoot.equals("introduced")) {
				// System.out.println("introduced::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if
				// (nameOfElementOfChildrenOfRoot.equals("phenology_fruiting"))
				// {
				// System.out.println("phenology_fruiting::inputXmlFileName::" +
				// inputXmlFileName);
				// }
			}

			Element meta_author = new Element("author");

			String authorConcatenator = "";

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();

				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "author") {
					authorConcatenator += textOfElementOfChildrenOfRoot + ", ";
				}
			}
			// System.out.println("authorConcatenator.length():" +
			// authorConcatenator.length());

			if (authorConcatenator.length() > 2) {
				authorConcatenator = authorConcatenator.substring(0,
						authorConcatenator.length() - 2);
			}
			meta_author.setText(authorConcatenator);

			source.addContent(meta_author);
			source.addContent(new Element("date").setText(""));
			source.addContent(new Element("title").setText(""));

			meta.addContent(source);

			processor.addContent(new Element("date").setText(""));

			Element software = new Element("software");
			software.setAttribute(new Attribute("type",
					"xml format transformer"));
			software.setAttribute(new Attribute("version", "1.0"));

			processor.addContent(software);

			processor.addContent(new Element("operator").setText(""));

			processed_by.addContent(processor);

			meta.addContent(processed_by);

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "references") {
					// System.out.println(nameOfElementOfChildrenOfRoot);

					List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
							.getChildren();
					Iterator<Element> childrenOfElementOfChildrenOfRootIterator = childrenOfElementOfChildrenOfRoot
							.iterator();
					while (childrenOfElementOfChildrenOfRootIterator.hasNext()) {
						Element elementOfChildrenOfElementOfChildrenOfRoot = childrenOfElementOfChildrenOfRootIterator
								.next();
						String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getName();
						String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getText();

						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("reference")) {
							Element other_info_on_metaElement = new Element(
									"other_info_on_meta");
							other_info_on_metaElement.setAttribute("type",
									"citation");
							other_info_on_metaElement
									.setText(textOfElementOfChildrenOfElementOfChildrenOfRoot);
							meta.addContent(other_info_on_metaElement);
						}
					}
					// <meta>
					// <other_info_on_meta type="citation">Wiedenmayer F. 1977.
					// Shallow-Water Sponges of the Western Bahamas. Experientia
					// Supplementum 28: 1-287, pls 1-43.</other_info_on_meta>
					// </meta>
				}

			}

			// etymology
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "etymology") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type", "etymology");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="etymology">...</other_info_on_meta>
					// </meta>
				}
			}

			// number_of_infrataxa
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "number_of_infrataxa") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"number_of_infrataxa");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="etymology">...</other_info_on_meta>
					// </meta>
				}
			}

			// common_name
			// past_name
			// invalid_name
			// conserved_name

			// introduced
			// phenology_fruiting

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "common_name") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"common_name");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="common_name">...</other_info_on_meta>
					// </meta>
				}

				if (nameOfElementOfChildrenOfRoot == "past_name") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type", "past_name");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="past_name">...</other_info_on_meta>
					// </meta>
				}

				if (nameOfElementOfChildrenOfRoot == "invalid_name") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"invalid_name");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="invalid_name">...</other_info_on_meta>
					// </meta>
				}

				if (nameOfElementOfChildrenOfRoot == "conserved_name") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"conserved_name");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="conserved_name">...</other_info_on_meta>
					// </meta>
				}

				// introduced
				if (nameOfElementOfChildrenOfRoot == "introduced") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement
							.setAttribute("type", "introduced");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="introduced">...</other_info_on_meta>
					// </meta>
				}

				// phenology_fruiting
				if (nameOfElementOfChildrenOfRoot == "phenology_fruiting") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"phenology_fruiting");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="phenology_fruiting">...</other_info_on_meta>
					// </meta>
				}

				// phenology
				if (nameOfElementOfChildrenOfRoot == "phenology") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type", "phenology");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="phenology">...</other_info_on_meta>
					// </meta>
				}

				// conservation
				if (nameOfElementOfChildrenOfRoot == "conservation") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"conservation");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="conservation">...</other_info_on_meta>
					// </meta>
				}

			}

			doc.getRootElement().addContent(meta);

			// <TaxonIdentification Status="ACCEPTED">
			// <genus_name>SCIRPUS</genus_name>
			// <genus_authority>Linnaeus</genus_authority>
			// <place_of_publication>
			// <publication_title>Sp. Pl.</publication_title>
			// <place_in_publication>1: 47. 1753</place_in_publication>
			// </place_of_publication>
			// <place_of_publication>
			// <publication_title>Gen. Pl. ed.</publication_title>
			// <place_in_publication>5, 26. 1754</place_in_publication>
			// </place_of_publication>
			// </TaxonIdentification>

			childrenOfRootIterator = childrenOfRoot.iterator();
			while (childrenOfRootIterator.hasNext()) {
				Element elementOfChildrenOfRoot = childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);
				if (nameOfElementOfChildrenOfRoot == "TaxonIdentification") {
					// System.out.println("nameOfElementOfChildrenOfRoot::" +
					// nameOfElementOfChildrenOfRoot);

					Element taxon_identification = new Element(
							"taxon_identification");

					String nameOfAttritueStatus = elementOfChildrenOfRoot
							.getAttribute("Status").getName();
					String valueOfAttritueStatus = elementOfChildrenOfRoot
							.getAttributeValue("Status");

					// System.out.println(nameOfAttritueStatus);
					// System.out.println(valueOfAttritueStatus);

					taxon_identification.setAttribute("status",
							valueOfAttritueStatus);

					List<Element> taxonIdentificationChildNodesList = visitChildNodes(
							elementOfChildrenOfRoot.getChildren(),
							allSchemaAttributeName);
					// System.out.println("taxonIdentificationChildNodesList.size():"
					// + taxonIdentificationChildNodesList.size());

					// Iterator<Element>
					// taxonIdentificationChildNodesListIterator =
					// taxonIdentificationChildNodesList.iterator();
					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {

						// while
						// (taxonIdentificationChildNodesListIterator.hasNext())
						// {
						// Element elementOfTaxonIdentificationChildNodesList =
						// taxonIdentificationChildNodesListIterator.next();
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						// System.out.println("nameOfElementOfTaxonIdentificationChildNodesList:"
						// + nameOfElementOfTaxonIdentificationChildNodesList);
						// Old::
						// <family_name>Hemiasterellidae Lendenfeld,
						// 1889</family_name>

						// New::
						// <taxon_name rank="family">familyBBB</taxon_name>
						// <taxon_name rank="order">OrderAAA</taxon_name>

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.contains("_name")) {
							String[] nameOfElementOfChildrenOfElementOfChildrenOfRootArray = nameOfElementOfTaxonIdentificationChildNodesList
									.split("_");

							if (nameOfElementOfChildrenOfElementOfChildrenOfRootArray.length > 1) {
								Element taxon_nameElement = new Element(
										"taxon_name");

								String rankString = nameOfElementOfChildrenOfElementOfChildrenOfRootArray[0];

								String rankTaxonText = textOfElementOfTaxonIdentificationChildNodesList;

								// System.out.println("rankString:" +
								// rankString);

								taxon_nameElement.setAttribute("rank",
										rankString);

								// taxonIdentificationChildNodesListIterator =
								// taxonIdentificationChildNodesList.iterator();
								for (Element elementOfTaxonIdentificationChildNodesList2 : taxonIdentificationChildNodesList) {
									// while
									// (taxonIdentificationChildNodesListIterator.hasNext())
									// {
									// elementOfTaxonIdentificationChildNodesList
									// =
									// taxonIdentificationChildNodesListIterator.next();
									nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList2
											.getName();
									textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList2
											.getText();

									if (nameOfElementOfTaxonIdentificationChildNodesList
											.contains(rankString + "_authority")) {
										// rankTaxonText += " " +
										// textOfElementOfTaxonIdentificationChildNodesList;
										taxon_nameElement
												.setAttribute("authority",
														textOfElementOfTaxonIdentificationChildNodesList);

									}
								}

								taxon_nameElement.setText(rankTaxonText);

								taxon_identification
										.addContent(taxon_nameElement);
							}

						}
					}

					// taxonIdentificationChildNodesListIterator =
					// taxonIdentificationChildNodesList.iterator();
					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {
						// while
						// (taxonIdentificationChildNodesListIterator.hasNext())
						// {
						// Element elementOfTaxonIdentificationChildNodesList =
						// taxonIdentificationChildNodesListIterator.next();
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						// Old::
						// <family_name>Hemiasterellidae Lendenfeld,
						// 1889</family_name>

						// New::
						// <taxon_name rank="family">familyBBB</taxon_name>
						// <taxon_name rank="order">OrderAAA</taxon_name>

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.equals("place_of_publication")) {
							Element place_of_publicationElement = new Element(
									"place_of_publication");

							List<Element> visitChildNodesList = visitChildNodes(
									elementOfTaxonIdentificationChildNodesList
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								String nameOfElementInVisitChildNodesList = elementInVisitChildNodesList
										.getName();
								if (nameOfElementInVisitChildNodesList
										.equals("other_info")) {
									// System.out.println("nameOfElementInVisitChildNodesList:"
									// + nameOfElementInVisitChildNodesList);
									elementInVisitChildNodesList
											.setName("other_info_on_pub");
								}
								place_of_publicationElement
										.addContent(elementInVisitChildNodesList);

							}
							taxon_identification
									.addContent(place_of_publicationElement);
						}
					}

					// TaxonHierarchy
					// Under Taxon Identification

					for (Element elementOfChildrenOfRoot2 : childrenOfRoot) {
						// childrenOfRootIterator = childrenOfRoot.iterator();
						// while (childrenOfRootIterator.hasNext()) {
						// Element elementOfChildrenOfRoot =
						// childrenOfRootIterator.next();
						String nameOfElementOfChildrenOfRoot2 = elementOfChildrenOfRoot2
								.getName();
						String textOfElementOfChildrenOfRoot2 = elementOfChildrenOfRoot2
								.getText();
						// System.out.println(nameOfElementOfChildrenOfRoot2);

						if (nameOfElementOfChildrenOfRoot2
								.contains("taxon_hierarchy")) {
							// Old code ...
							// Element taxonHierarchyElement = new Element(
							// 		"taxon_hierarchy");
							// taxonHierarchyElement
							//		.setText(textOfElementOfChildrenOfRoot2);
							//taxon_identification
							//		.addContent(taxonHierarchyElement);
							// Old code ...
							
							// Using New code
							if ( taxon_identification.getAttributeValue("status").equals("ACCEPTED")) {
								Element taxonHierarchyElement = new Element("taxon_hierarchy");
								taxonHierarchyElement.setText(textOfElementOfChildrenOfRoot2);
								taxon_identification.addContent(taxonHierarchyElement);
							}
							// Using New code

						}
					}

					doc.getRootElement().addContent(taxon_identification);

				}
			}

			// description
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "description") {
					Element descriptionElement = new Element("description");
					descriptionElement.setAttribute("type", "morphology");
					descriptionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(descriptionElement);

				}
			}

			// global_distribution
			// us_distribution
			// ca_distribution

			// allUnvalidatedTerms::[etymology, global_distribution, elevation,
			// common_name, phenology, number_of_infrataxa, habitat, past_name,
			// references, us_distribution, ca_distribution, conservation,
			// introduced, invalid_name, phenology_fruiting, conserved_name,
			// TaxonIdentification]

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("distribution")) {
					Element descriptionElement = new Element("description");
					descriptionElement.setAttribute("type", "distribution");
					descriptionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(descriptionElement);

				}
			}

			
			// habitat

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("habitat")) {
					System.out.println("Yes, file: " + inputXmlFileName + " contains \"habitat\"");
					Element habitatElement = new Element("description");
					habitatElement.setAttribute("type", "habitat");
					habitatElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(habitatElement);

				}
			}

			// elevation

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("elevation")) {
					Element elevationElement = new Element("description");
					elevationElement.setAttribute("type", "elevation");
					elevationElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(elevationElement);

				}
			}

			// discussion
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("discussion")) {
					Element discussionElement = new Element("discussion");
					discussionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(discussionElement);

				}
			}

			// number
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("number")) {
					Element numberElement = new Element("number");
					numberElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(numberElement);

				}
			}

			// key
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("key")) {
					Element keyElement = new Element("key");

					List<Element> visitChildNodesList = visitChildNodes(
							elementOfChildrenOfRoot.getChildren(),
							allSchemaAttributeName);
					for (Element elementInVisitChildNodesList : visitChildNodesList) {

						keyElement.addContent(elementInVisitChildNodesList);

					}

					doc.getRootElement().addContent(keyElement);

				}
			}


			//	<phenology_info>
			//		<text>Flowering spring–summer (Apr–Aug).</text>
			// 		<phenology>spring</phenology>
			//		<phenology>summer</phenology>
			//		<phenology>apr</phenology>
			//		<phenology>may</phenology>
			//		<phenology>jun</phenology>
			//		<phenology>jul</phenology>
			//		<phenology>aug</phenology>
			//		</phenology_info>
			//	<habitat_info>
			//		<text>grassy areas , sagebrush steppe , california woodlands , open coniferous or conifer-hardwood forests , roadsides ;</text>
			//		<habitat>grassy areas</habitat>
			//		<habitat>sagebrush steppe</habitat>
			//		<habitat>california woodlands</habitat>
			//		<habitat>open coniferous</habitat>
			//		<habitat>conifer-hardwood forests</habitat>
			//		<habitat>roadsides</habitat>
			//	</habitat_info>			
			
			// 
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("phenology_info")) {
					List<Element> childrenOf_phenology_info = elementOfChildrenOfRoot.getChildren();

					for (Element elementOf_phenology_info : childrenOf_phenology_info) {
						
						String textOfElementOf_phenology_info = elementOf_phenology_info
								.getText();
						
						Element other_info_on_metaElement = new Element(
								"other_info_on_meta");
						other_info_on_metaElement.setAttribute("type", "phenology");
						other_info_on_metaElement
								.setText(textOfElementOf_phenology_info);
						meta.addContent(other_info_on_metaElement);
						
						
						
					}
				}
				
				if (nameOfElementOfChildrenOfRoot.equals("habitat_info")) {
					List<Element> childrenOf_habitat_info = elementOfChildrenOfRoot.getChildren();

					for (Element elementOf_habitat_info : childrenOf_habitat_info) {
						
						String textOfElementOf_habitat_info = elementOf_habitat_info
								.getText();
						
						Element description_habitatElement = new Element("description");
						description_habitatElement.setAttribute("type", "habitat");
						description_habitatElement.setText(textOfElementOf_habitat_info);
						doc.getRootElement().addContent(description_habitatElement);
						
						
						
					}
				}
				
			}			
			
			
			
			
			
			
			
			
			
			
			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}

	}
	
	

	
	public static void transferXMLFormatFromOldXMLFoC(
			String inputXmlFileName, Set<String> allSchemaAttributeName) {

		SAXBuilder saxBuilder = new SAXBuilder();

		try {
			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			Element meta = new Element("meta");
			Element source = new Element("source");
			Element processed_by = new Element("processed_by");
			Element processor = new Element("processor");
			List<Element> other_info_on_metaList = new ArrayList<Element>();
			List<Element> taxon_nameList = new ArrayList<Element>();

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String rootElement = xmlDocument.getRootElement().getText();
			// System.out.println("rootElement::" + rootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();

			// recursively read List<Element> rootChildren and gather required
			// information

			// Scheme
			// Iterator<Element> childrenOfRootIterator =
			// childrenOfRoot.iterator();
			// while (childrenOfRootIterator.hasNext()) {
			// Element elementOfChildrenOfRoot = childrenOfRootIterator.next();
			// String nameOfElementOfChildrenOfRoot =
			// elementOfChildrenOfRoot.getName();
			// String textOfElementOfChildrenOfRoot =
			// elementOfChildrenOfRoot.getText();
			// System.out.println("nameOfElementOfChildrenOfRoot::" +
			// nameOfElementOfChildrenOfRoot);
			// }

			// Build meta

			Iterator<Element> childrenOfRootIterator = childrenOfRoot
					.iterator();

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				// if (nameOfElementOfChildrenOfRoot.equals("phenology")) {
				// System.out.println("phenology::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if (nameOfElementOfChildrenOfRoot.equals("conservation")) {
				// System.out.println("conservation::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if (nameOfElementOfChildrenOfRoot.equals("introduced")) {
				// System.out.println("introduced::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if
				// (nameOfElementOfChildrenOfRoot.equals("phenology_fruiting"))
				// {
				// System.out.println("phenology_fruiting::inputXmlFileName::" +
				// inputXmlFileName);
				// }
			}

			Element meta_author = new Element("author");

			String authorConcatenator = "";

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();

				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "author") {
					authorConcatenator += textOfElementOfChildrenOfRoot + ", ";
				}
			}
			// System.out.println("authorConcatenator.length():" +
			// authorConcatenator.length());

			if (authorConcatenator.length() > 2) {
				authorConcatenator = authorConcatenator.substring(0,
						authorConcatenator.length() - 2);
			}
			meta_author.setText(authorConcatenator);

			source.addContent(meta_author);
			source.addContent(new Element("date").setText(""));
			source.addContent(new Element("title").setText(""));

			meta.addContent(source);

			processor.addContent(new Element("date").setText(""));

			Element software = new Element("software");
			software.setAttribute(new Attribute("type",
					"xml format transformer"));
			software.setAttribute(new Attribute("version", "1.0"));

			processor.addContent(software);

			processor.addContent(new Element("operator").setText(""));

			processed_by.addContent(processor);

			meta.addContent(processed_by);

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "references") {
					// System.out.println(nameOfElementOfChildrenOfRoot);

					List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
							.getChildren();
					Iterator<Element> childrenOfElementOfChildrenOfRootIterator = childrenOfElementOfChildrenOfRoot
							.iterator();
					while (childrenOfElementOfChildrenOfRootIterator.hasNext()) {
						Element elementOfChildrenOfElementOfChildrenOfRoot = childrenOfElementOfChildrenOfRootIterator
								.next();
						String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getName();
						String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getText();

						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("reference")) {
							Element other_info_on_metaElement = new Element(
									"other_info_on_meta");
							other_info_on_metaElement.setAttribute("type",
									"citation");
							other_info_on_metaElement
									.setText(textOfElementOfChildrenOfElementOfChildrenOfRoot);
							meta.addContent(other_info_on_metaElement);
						}
					}
					// <meta>
					// <other_info_on_meta type="citation">Wiedenmayer F. 1977.
					// Shallow-Water Sponges of the Western Bahamas. Experientia
					// Supplementum 28: 1-287, pls 1-43.</other_info_on_meta>
					// </meta>
				}

			}

			
			// other_info
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "other_info") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type", "other_info");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="etymology">...</other_info_on_meta>
					// </meta>
				}
			}

			
			// key_heading
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "key_heading") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type", "key_heading");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					
					System.out.println("inputXmlFileName:" + inputXmlFileName);
					// <meta>
					// <other_info_on_meta
					// type="etymology">...</other_info_on_meta>
					// </meta>
				}
			}		
			
			
			
			
			// etymology
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "etymology") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type", "etymology");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="etymology">...</other_info_on_meta>
					// </meta>
				}
			}

			// number_of_infrataxa
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "number_of_infrataxa") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"number_of_infrataxa");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="etymology">...</other_info_on_meta>
					// </meta>
				}
			}

			// common_name
			// past_name
			// invalid_name
			// conserved_name

			// introduced
			// phenology_fruiting

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "common_name") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"common_name");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="common_name">...</other_info_on_meta>
					// </meta>
				}

				if (nameOfElementOfChildrenOfRoot == "past_name") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type", "past_name");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="past_name">...</other_info_on_meta>
					// </meta>
				}

				if (nameOfElementOfChildrenOfRoot == "invalid_name") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"invalid_name");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="invalid_name">...</other_info_on_meta>
					// </meta>
				}

				if (nameOfElementOfChildrenOfRoot == "conserved_name") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"conserved_name");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="conserved_name">...</other_info_on_meta>
					// </meta>
				}

				// introduced
				if (nameOfElementOfChildrenOfRoot == "introduced") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement
							.setAttribute("type", "introduced");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="introduced">...</other_info_on_meta>
					// </meta>
				}

				// phenology_fruiting
				if (nameOfElementOfChildrenOfRoot == "phenology_fruiting") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"phenology_fruiting");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="phenology_fruiting">...</other_info_on_meta>
					// </meta>
				}

				// phenology
				if (nameOfElementOfChildrenOfRoot == "phenology") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type", "phenology");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="phenology">...</other_info_on_meta>
					// </meta>
				}

				// conservation
				if (nameOfElementOfChildrenOfRoot == "conservation") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"conservation");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="conservation">...</other_info_on_meta>
					// </meta>
				}

			}

			doc.getRootElement().addContent(meta);

			// <TaxonIdentification Status="ACCEPTED">
			// <genus_name>SCIRPUS</genus_name>
			// <genus_authority>Linnaeus</genus_authority>
			// <place_of_publication>
			// <publication_title>Sp. Pl.</publication_title>
			// <place_in_publication>1: 47. 1753</place_in_publication>
			// </place_of_publication>
			// <place_of_publication>
			// <publication_title>Gen. Pl. ed.</publication_title>
			// <place_in_publication>5, 26. 1754</place_in_publication>
			// </place_of_publication>
			// </TaxonIdentification>

			childrenOfRootIterator = childrenOfRoot.iterator();
			while (childrenOfRootIterator.hasNext()) {
				Element elementOfChildrenOfRoot = childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);
				if (nameOfElementOfChildrenOfRoot == "TaxonIdentification") {
					// System.out.println("nameOfElementOfChildrenOfRoot::" +
					// nameOfElementOfChildrenOfRoot);

					Element taxon_identification = new Element(
							"taxon_identification");

					String nameOfAttritueStatus = elementOfChildrenOfRoot
							.getAttribute("Status").getName();
					String valueOfAttritueStatus = elementOfChildrenOfRoot
							.getAttributeValue("Status");

					// System.out.println(nameOfAttritueStatus);
					// System.out.println(valueOfAttritueStatus);

					taxon_identification.setAttribute("status",
							valueOfAttritueStatus);

					List<Element> taxonIdentificationChildNodesList = visitChildNodes(
							elementOfChildrenOfRoot.getChildren(),
							allSchemaAttributeName);
					// System.out.println("taxonIdentificationChildNodesList.size():"
					// + taxonIdentificationChildNodesList.size());

					// Iterator<Element>
					// taxonIdentificationChildNodesListIterator =
					// taxonIdentificationChildNodesList.iterator();
					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {

						// while
						// (taxonIdentificationChildNodesListIterator.hasNext())
						// {
						// Element elementOfTaxonIdentificationChildNodesList =
						// taxonIdentificationChildNodesListIterator.next();
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						// System.out.println("nameOfElementOfTaxonIdentificationChildNodesList:"
						// + nameOfElementOfTaxonIdentificationChildNodesList);
						// Old::
						// <family_name>Hemiasterellidae Lendenfeld,
						// 1889</family_name>

						// New::
						// <taxon_name rank="family">familyBBB</taxon_name>
						// <taxon_name rank="order">OrderAAA</taxon_name>

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.contains("_name")) {
							String[] nameOfElementOfChildrenOfElementOfChildrenOfRootArray = nameOfElementOfTaxonIdentificationChildNodesList
									.split("_");

							if (nameOfElementOfChildrenOfElementOfChildrenOfRootArray.length > 1) {
								Element taxon_nameElement = new Element(
										"taxon_name");

								String rankString = nameOfElementOfChildrenOfElementOfChildrenOfRootArray[0];

								String rankTaxonText = textOfElementOfTaxonIdentificationChildNodesList;

								// System.out.println("rankString:" +
								// rankString);

								taxon_nameElement.setAttribute("rank",
										rankString);

								// taxonIdentificationChildNodesListIterator =
								// taxonIdentificationChildNodesList.iterator();
								for (Element elementOfTaxonIdentificationChildNodesList2 : taxonIdentificationChildNodesList) {
									// while
									// (taxonIdentificationChildNodesListIterator.hasNext())
									// {
									// elementOfTaxonIdentificationChildNodesList
									// =
									// taxonIdentificationChildNodesListIterator.next();
									nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList2
											.getName();
									textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList2
											.getText();

									if (nameOfElementOfTaxonIdentificationChildNodesList
											.contains(rankString + "_authority")) {
										// rankTaxonText += " " +
										// textOfElementOfTaxonIdentificationChildNodesList;
										taxon_nameElement
												.setAttribute("authority",
														textOfElementOfTaxonIdentificationChildNodesList);

									}
								}

								taxon_nameElement.setText(rankTaxonText);

								taxon_identification
										.addContent(taxon_nameElement);
							}

						}
					}

					// taxonIdentificationChildNodesListIterator =
					// taxonIdentificationChildNodesList.iterator();
					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {
						// while
						// (taxonIdentificationChildNodesListIterator.hasNext())
						// {
						// Element elementOfTaxonIdentificationChildNodesList =
						// taxonIdentificationChildNodesListIterator.next();
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						// Old::
						// <family_name>Hemiasterellidae Lendenfeld,
						// 1889</family_name>

						// New::
						// <taxon_name rank="family">familyBBB</taxon_name>
						// <taxon_name rank="order">OrderAAA</taxon_name>

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.equals("place_of_publication")) {
							Element place_of_publicationElement = new Element(
									"place_of_publication");

							List<Element> visitChildNodesList = visitChildNodes(
									elementOfTaxonIdentificationChildNodesList
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								String nameOfElementInVisitChildNodesList = elementInVisitChildNodesList
										.getName();
								if (nameOfElementInVisitChildNodesList
										.equals("other_info")) {
									// System.out.println("nameOfElementInVisitChildNodesList:"
									// + nameOfElementInVisitChildNodesList);
									elementInVisitChildNodesList
											.setName("other_info_on_pub");
								}
								place_of_publicationElement
										.addContent(elementInVisitChildNodesList);

							}
							taxon_identification
									.addContent(place_of_publicationElement);
						}
					}

					// TaxonHierarchy
					// Under Taxon Identification

					for (Element elementOfChildrenOfRoot2 : childrenOfRoot) {
						// childrenOfRootIterator = childrenOfRoot.iterator();
						// while (childrenOfRootIterator.hasNext()) {
						// Element elementOfChildrenOfRoot =
						// childrenOfRootIterator.next();
						String nameOfElementOfChildrenOfRoot2 = elementOfChildrenOfRoot2
								.getName();
						String textOfElementOfChildrenOfRoot2 = elementOfChildrenOfRoot2
								.getText();
						// System.out.println(nameOfElementOfChildrenOfRoot2);

						if (nameOfElementOfChildrenOfRoot2
								.contains("taxon_hierarchy")) {
							
							// Old code ...
							// Element taxonHierarchyElement = new Element(
							// 		"taxon_hierarchy");
							// taxonHierarchyElement
							//		.setText(textOfElementOfChildrenOfRoot2);
							//taxon_identification
							//		.addContent(taxonHierarchyElement);
							// Old code ...
							
							// Using New code
							if ( taxon_identification.getAttributeValue("status").equals("ACCEPTED")) {
								Element taxonHierarchyElement = new Element("taxon_hierarchy");
								taxonHierarchyElement.setText(textOfElementOfChildrenOfRoot2);
								taxon_identification.addContent(taxonHierarchyElement);
							}
							// Using New code

							
							
						}
					}

					doc.getRootElement().addContent(taxon_identification);

				}
			}

			// description
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "description") {
					Element descriptionElement = new Element("description");
					descriptionElement.setAttribute("type", "morphology");
					descriptionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(descriptionElement);

				}
			}

			// global_distribution
			// us_distribution
			// ca_distribution

			// allUnvalidatedTerms::[etymology, global_distribution, elevation,
			// common_name, phenology, number_of_infrataxa, habitat, past_name,
			// references, us_distribution, ca_distribution, conservation,
			// introduced, invalid_name, phenology_fruiting, conserved_name,
			// TaxonIdentification]

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.contains("distribution")) {
					
					// System.out.println("There is a distribution!");
					
					Element descriptionElement = new Element("description");
					descriptionElement.setAttribute("type", "distribution");
					descriptionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(descriptionElement);

				}
			}

			// habitat

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.contains("habitat")) {
					Element habitatElement = new Element("description");
					habitatElement.setAttribute("type", "habitat");
					habitatElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(habitatElement);

				}
			}

			// elevation

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.contains("elevation")) {
					Element elevationElement = new Element("description");
					elevationElement.setAttribute("type", "elevation");
					elevationElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(elevationElement);

				}
			}

			// discussion
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("discussion")) {
					Element discussionElement = new Element("discussion");
					discussionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(discussionElement);

				}
			}

			// number
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("number")) {
					Element numberElement = new Element("number");
					numberElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(numberElement);

				}
			}

			// key
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("key")) {
					Element keyElement = new Element("key");

					List<Element> visitChildNodesList = visitChildNodes(
							elementOfChildrenOfRoot.getChildren(),
							allSchemaAttributeName);
					for (Element elementInVisitChildNodesList : visitChildNodesList) {

						keyElement.addContent(elementInVisitChildNodesList);

					}

					doc.getRootElement().addContent(keyElement);

				}
			}

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}

	}	
	

	public static void transferXMLFormatFromOldXMLCycadReplaced(
			String inputXmlFileName, Set<String> allSchemaAttributeName) {

		SAXBuilder saxBuilder = new SAXBuilder();

		try {
			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			Element meta = new Element("meta");
			Element source = new Element("source");
			Element processed_by = new Element("processed_by");
			Element processor = new Element("processor");
			List<Element> other_info_on_metaList = new ArrayList<Element>();
			List<Element> taxon_nameList = new ArrayList<Element>();

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String rootElement = xmlDocument.getRootElement().getText();
			// System.out.println("rootElement::" + rootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();

			// recursively read List<Element> rootChildren and gather required
			// information

			// Scheme
			// Iterator<Element> childrenOfRootIterator =
			// childrenOfRoot.iterator();
			// while (childrenOfRootIterator.hasNext()) {
			// Element elementOfChildrenOfRoot = childrenOfRootIterator.next();
			// String nameOfElementOfChildrenOfRoot =
			// elementOfChildrenOfRoot.getName();
			// String textOfElementOfChildrenOfRoot =
			// elementOfChildrenOfRoot.getText();
			// System.out.println("nameOfElementOfChildrenOfRoot::" +
			// nameOfElementOfChildrenOfRoot);
			// }

			// Build meta

			Iterator<Element> childrenOfRootIterator = childrenOfRoot
					.iterator();

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				// if (nameOfElementOfChildrenOfRoot.equals("phenology")) {
				// System.out.println("phenology::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if (nameOfElementOfChildrenOfRoot.equals("conservation")) {
				// System.out.println("conservation::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if (nameOfElementOfChildrenOfRoot.equals("introduced")) {
				// System.out.println("introduced::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if
				// (nameOfElementOfChildrenOfRoot.equals("phenology_fruiting"))
				// {
				// System.out.println("phenology_fruiting::inputXmlFileName::" +
				// inputXmlFileName);
				// }
			}

			Element meta_author = new Element("author");

			String authorConcatenator = "";

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();

				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "author") {
					authorConcatenator += textOfElementOfChildrenOfRoot + ", ";
				}
			}
			// System.out.println("authorConcatenator.length():" +
			// authorConcatenator.length());

			if (authorConcatenator.length() > 2) {
				authorConcatenator = authorConcatenator.substring(0,
						authorConcatenator.length() - 2);
			}
			meta_author.setText(authorConcatenator);

			source.addContent(meta_author);
			source.addContent(new Element("date").setText(""));
			source.addContent(new Element("title").setText(""));

			meta.addContent(source);

			processor.addContent(new Element("date").setText(""));

			Element software = new Element("software");
			software.setAttribute(new Attribute("type",
					"xml format transformer"));
			software.setAttribute(new Attribute("version", "1.0"));

			processor.addContent(software);

			processor.addContent(new Element("operator").setText(""));

			processed_by.addContent(processor);

			meta.addContent(processed_by);

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "references") {
					// System.out.println(nameOfElementOfChildrenOfRoot);

					List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
							.getChildren();
					Iterator<Element> childrenOfElementOfChildrenOfRootIterator = childrenOfElementOfChildrenOfRoot
							.iterator();
					while (childrenOfElementOfChildrenOfRootIterator.hasNext()) {
						Element elementOfChildrenOfElementOfChildrenOfRoot = childrenOfElementOfChildrenOfRootIterator
								.next();
						String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getName();
						String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getText();

						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("reference")) {
							Element other_info_on_metaElement = new Element(
									"other_info_on_meta");
							other_info_on_metaElement.setAttribute("type",
									"citation");
							other_info_on_metaElement
									.setText(textOfElementOfChildrenOfElementOfChildrenOfRoot);
							meta.addContent(other_info_on_metaElement);
						}
					}
					// <meta>
					// <other_info_on_meta type="citation">Wiedenmayer F. 1977.
					// Shallow-Water Sponges of the Western Bahamas. Experientia
					// Supplementum 28: 1-287, pls 1-43.</other_info_on_meta>
					// </meta>
				}

			}

			/*
			 * // other_info for ( Element elementOfChildrenOfRoot :
			 * childrenOfRoot ) { // childrenOfRootIterator =
			 * childrenOfRoot.iterator(); // while
			 * (childrenOfRootIterator.hasNext()) { // Element
			 * elementOfChildrenOfRoot = childrenOfRootIterator.next(); String
			 * nameOfElementOfChildrenOfRoot =
			 * elementOfChildrenOfRoot.getName(); String
			 * textOfElementOfChildrenOfRoot =
			 * elementOfChildrenOfRoot.getText(); //
			 * System.out.println(nameOfElementOfChildrenOfRoot);
			 * 
			 * 
			 * if (nameOfElementOfChildrenOfRoot == "other_info") { Element
			 * other_info_on_metaElement = new Element("other_info_on_meta");
			 * other_info_on_metaElement.setAttribute("type", "other_info");
			 * other_info_on_metaElement.setText(textOfElementOfChildrenOfRoot);
			 * meta.addContent(other_info_on_metaElement);
			 * 
			 * // <meta> // <other_info_on_meta
			 * type="other_info">...</other_info_on_meta> // </meta> } }
			 */

			// number_of_infrataxa
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "number_of_infrataxa") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"number_of_infrataxa");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="etymology">...</other_info_on_meta>
					// </meta>
				}
			}

			// common_name
			// past_name
			// invalid_name
			// conserved_name

			// introduced
			// phenology_fruiting

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "common_name") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"common_name");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="common_name">...</other_info_on_meta>
					// </meta>
				}

				if (nameOfElementOfChildrenOfRoot == "past_name") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type", "past_name");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="past_name">...</other_info_on_meta>
					// </meta>
				}

				if (nameOfElementOfChildrenOfRoot == "invalid_name") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"invalid_name");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="invalid_name">...</other_info_on_meta>
					// </meta>
				}

				if (nameOfElementOfChildrenOfRoot == "conserved_name") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"conserved_name");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="conserved_name">...</other_info_on_meta>
					// </meta>
				}

				// introduced
				if (nameOfElementOfChildrenOfRoot == "introduced") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement
							.setAttribute("type", "introduced");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="introduced">...</other_info_on_meta>
					// </meta>
				}

				// phenology_fruiting
				if (nameOfElementOfChildrenOfRoot == "phenology_fruiting") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"phenology_fruiting");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="phenology_fruiting">...</other_info_on_meta>
					// </meta>
				}

				// phenology
				if (nameOfElementOfChildrenOfRoot == "phenology") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type", "phenology");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="phenology">...</other_info_on_meta>
					// </meta>
				}

				// conservation
				if (nameOfElementOfChildrenOfRoot == "conservation") {
					Element other_info_on_metaElement = new Element(
							"other_info_on_meta");
					other_info_on_metaElement.setAttribute("type",
							"conservation");
					other_info_on_metaElement
							.setText(textOfElementOfChildrenOfRoot);
					meta.addContent(other_info_on_metaElement);

					// <meta>
					// <other_info_on_meta
					// type="conservation">...</other_info_on_meta>
					// </meta>
				}

			}

			doc.getRootElement().addContent(meta);

			// <TaxonIdentification Status="ACCEPTED">
			// <genus_name>SCIRPUS</genus_name>
			// <genus_authority>Linnaeus</genus_authority>
			// <place_of_publication>
			// <publication_title>Sp. Pl.</publication_title>
			// <place_in_publication>1: 47. 1753</place_in_publication>
			// </place_of_publication>
			// <place_of_publication>
			// <publication_title>Gen. Pl. ed.</publication_title>
			// <place_in_publication>5, 26. 1754</place_in_publication>
			// </place_of_publication>
			// </TaxonIdentification>

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);
				if (nameOfElementOfChildrenOfRoot == "TaxonIdentification") {
					// System.out.println("nameOfElementOfChildrenOfRoot::" +
					// nameOfElementOfChildrenOfRoot);

					Element taxon_identification = new Element(
							"taxon_identification");

					String nameOfAttritueStatus = elementOfChildrenOfRoot
							.getAttribute("Status").getName();
					String valueOfAttritueStatus = elementOfChildrenOfRoot
							.getAttributeValue("Status");

					// System.out.println(nameOfAttritueStatus);
					// System.out.println(valueOfAttritueStatus);

					taxon_identification.setAttribute("status",
							valueOfAttritueStatus);

					List<Element> taxonIdentificationChildNodesList = visitChildNodes(
							elementOfChildrenOfRoot.getChildren(),
							allSchemaAttributeName);
					// System.out.println("taxonIdentificationChildNodesList.size():"
					// + taxonIdentificationChildNodesList.size());

					// Check if it contains entity/element <taxon_name
					// rank="">AAA</taxon_name> or not
					boolean containTaxonName = false;

					// Iterator<Element>
					// taxonIdentificationChildNodesListIterator =
					// taxonIdentificationChildNodesList.iterator();
					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {

						// while
						// (taxonIdentificationChildNodesListIterator.hasNext())
						// {
						// Element elementOfTaxonIdentificationChildNodesList =
						// taxonIdentificationChildNodesListIterator.next();
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						// System.out.println("nameOfElementOfTaxonIdentificationChildNodesList:"
						// + nameOfElementOfTaxonIdentificationChildNodesList);
						// Old::
						// <family_name>Hemiasterellidae Lendenfeld,
						// 1889</family_name>

						// New::
						// <taxon_name rank="family">familyBBB</taxon_name>
						// <taxon_name rank="order">OrderAAA</taxon_name>

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.contains("_name")) {
							containTaxonName = true;

							String[] nameOfElementOfChildrenOfElementOfChildrenOfRootArray = nameOfElementOfTaxonIdentificationChildNodesList
									.split("_");

							if (nameOfElementOfChildrenOfElementOfChildrenOfRootArray.length > 1) {
								Element taxon_nameElement = new Element(
										"taxon_name");

								String rankString = nameOfElementOfChildrenOfElementOfChildrenOfRootArray[0];

								String rankTaxonText = textOfElementOfTaxonIdentificationChildNodesList;

								// System.out.println("rankString:" +
								// rankString);

								taxon_nameElement.setAttribute("rank",
										rankString);

								// taxonIdentificationChildNodesListIterator =
								// taxonIdentificationChildNodesList.iterator();
								for (Element elementOfTaxonIdentificationChildNodesList2 : taxonIdentificationChildNodesList) {
									// while
									// (taxonIdentificationChildNodesListIterator.hasNext())
									// {
									// elementOfTaxonIdentificationChildNodesList
									// =
									// taxonIdentificationChildNodesListIterator.next();
									nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList2
											.getName();
									textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList2
											.getText();

									if (nameOfElementOfTaxonIdentificationChildNodesList
											.contains(rankString + "_authority")) {
										// rankTaxonText += " " +
										// textOfElementOfTaxonIdentificationChildNodesList;
										taxon_nameElement
												.setAttribute("authority",
														textOfElementOfTaxonIdentificationChildNodesList);

									}
								}

								taxon_nameElement.setText(rankTaxonText);

								taxon_identification
										.addContent(taxon_nameElement);
							}
						}
					}

					if (containTaxonName == false) {

						boolean containOther_info = false;

						// other_info
						for (Element elementOfChildrenOfRoot2 : childrenOfRoot) {
							// childrenOfRootIterator =
							// childrenOfRoot.iterator();
							// while (childrenOfRootIterator.hasNext()) {
							// Element elementOfChildrenOfRoot =
							// childrenOfRootIterator.next();
							String nameOfElementOfChildrenOfRoot2 = elementOfChildrenOfRoot2
									.getName();
							String textOfElementOfChildrenOfRoot2 = elementOfChildrenOfRoot2
									.getText();
							// System.out.println(nameOfElementOfChildrenOfRoot);

							if (nameOfElementOfChildrenOfRoot2 == "other_info") {
								containOther_info = true;

								// <other_info>GenusName
								// speciesName</other_info>
								String[] textOfElementOfChildrenOfRoot2Array = textOfElementOfChildrenOfRoot2
										.split(" ");

								if (textOfElementOfChildrenOfRoot2Array.length > 1) {
									String genusName = textOfElementOfChildrenOfRoot2Array[0];
									String speciesName = textOfElementOfChildrenOfRoot2Array[1];

									Element taxon_nameElement = new Element(
											"taxon_name");
									taxon_nameElement.setAttribute("rank",
											"genus");
									taxon_nameElement.setText(genusName);
									taxon_identification
											.addContent(taxon_nameElement);

									taxon_nameElement = new Element(
											"taxon_name");
									taxon_nameElement.setAttribute("rank",
											"species");
									taxon_nameElement.setText(speciesName);
									taxon_identification
											.addContent(taxon_nameElement);

								}

							}
						}

						if (containOther_info == false) {

							Element taxon_nameElement = new Element(
									"taxon_name");

							taxon_nameElement.setAttribute("rank", "unknown");

							taxon_nameElement.setText("unknown");

							taxon_identification.addContent(taxon_nameElement);
						}
					}

					// taxonIdentificationChildNodesListIterator =
					// taxonIdentificationChildNodesList.iterator();
					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {
						// while
						// (taxonIdentificationChildNodesListIterator.hasNext())
						// {
						// Element elementOfTaxonIdentificationChildNodesList =
						// taxonIdentificationChildNodesListIterator.next();
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						// Old::
						// <family_name>Hemiasterellidae Lendenfeld,
						// 1889</family_name>

						// New::
						// <taxon_name rank="family">familyBBB</taxon_name>
						// <taxon_name rank="order">OrderAAA</taxon_name>

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.equals("place_of_publication")) {
							Element place_of_publicationElement = new Element(
									"place_of_publication");

							List<Element> visitChildNodesList = visitChildNodes(
									elementOfTaxonIdentificationChildNodesList
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								String nameOfElementInVisitChildNodesList = elementInVisitChildNodesList
										.getName();
								if (nameOfElementInVisitChildNodesList
										.equals("other_info")) {
									// System.out.println("nameOfElementInVisitChildNodesList:"
									// + nameOfElementInVisitChildNodesList);
									elementInVisitChildNodesList
											.setName("other_info_on_pub");
								}
								place_of_publicationElement
										.addContent(elementInVisitChildNodesList);

							}
							taxon_identification
									.addContent(place_of_publicationElement);
						}
					}

					// TaxonHierarchy
					// Under Taxon Identification

					for (Element elementOfChildrenOfRoot2 : childrenOfRoot) {
						// childrenOfRootIterator = childrenOfRoot.iterator();
						// while (childrenOfRootIterator.hasNext()) {
						// Element elementOfChildrenOfRoot =
						// childrenOfRootIterator.next();
						String nameOfElementOfChildrenOfRoot2 = elementOfChildrenOfRoot2
								.getName();
						String textOfElementOfChildrenOfRoot2 = elementOfChildrenOfRoot2
								.getText();
						// System.out.println(nameOfElementOfChildrenOfRoot2);

						if (nameOfElementOfChildrenOfRoot2
								.contains("TaxonHierarchy")) {
							Element taxonHierarchyElement = new Element(
									"taxon_hierarchy");
							taxonHierarchyElement
									.setText(textOfElementOfChildrenOfRoot2);
							taxon_identification
									.addContent(taxonHierarchyElement);

						}
					}

					doc.getRootElement().addContent(taxon_identification);

				}
			}

			// description
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot == "description") {
					Element descriptionElement = new Element("description");

					descriptionElement.setAttribute("type", "morphology");
					descriptionElement.setText(textOfElementOfChildrenOfRoot);
					/*
					 * // ex: <description>Habit: dioecious fern-like shrubs
					 * with a naked subterranean stem producing one to many
					 * short, slender, determinate leaf and conebearing
					 * branches, sometimes themselves branched. New leaves
					 * emerging singly. Cataphylls absent. Leaves: bipinnate,
					 * longitudinal ptyxis circinate, horizontal ptyxis
					 * involute. Leaflets with circinate ptyxis and often a true
					 * terminal leaflet, lower leaflets not reduced to spines.
					 * Petioles lacking spines or prickles. Leaflets flat,
					 * lacking a midrib, with numerous subparallel longitudinal
					 * veins and stomata on both surfaces, individual ptyxis
					 * flat. Leaves pubescent, at least when young, with
					 * coloured or transparent, unbranched hairs.
					 * Microsporophylls: spirally orthostichous, aggregated into
					 * male cones and each with a simple, peltate sterile apex,
					 * which is not produced into a terminal spine. Each
					 * microsporophyll bearing numerous microsporangia
					 * (pollen-sacs) on the undersurface. Microsporangia opening
					 * by slits. Pollen cymbiform, monosulcate. Male cones
					 * stalked, ovoid. Megasporophylls: spirally orthostichous,
					 * aggregated into female cones. Sporophylls simple, with a
					 * dilated peltate apex or lamina which is not produced into
					 * a terminal spine. Ovules two (rarely three), sessile,
					 * orthotropous, inserted on the inner (axisfacing) surface
					 * of the thickened lamina and directed inwards
					 * ("inverted"). Female cones stalked but not elevated above
					 * soil surface, ovoid to globose; sporophylls in about 8
					 * ranks, the expanded ends hexagonal. Seeds: subglobular to
					 * ovoid, with a white aging to purple sarcotesta. Endosperm
					 * haploid, derived from the female gametophyte. Embryo
					 * straight; with 2 cotyledons that are usually united at
					 * the tips and a very long, spirally twisted suspensor.
					 * Seeds radiospermic; germination
					 * cryptocotular.</description> String[]
					 * textOfElementOfChildrenOfRootArray =
					 * textOfElementOfChildrenOfRoot.split(":");
					 * 
					 * if ( textOfElementOfChildrenOfRootArray.length > 1 ) {
					 * String descType = textOfElementOfChildrenOfRootArray[0];
					 * 
					 * String descText =
					 * textOfElementOfChildrenOfRoot.replace(descType+":", "");
					 * 
					 * descriptionElement.setAttribute("type", descType);
					 * descriptionElement.setText(descText); } else {
					 * descriptionElement.setAttribute("type", "morphology");
					 * descriptionElement
					 * .setText(textOfElementOfChildrenOfRoot); }
					 */

					doc.getRootElement().addContent(descriptionElement);

				}
			}

			// global_distribution
			// us_distribution
			// ca_distribution

			// allUnvalidatedTerms::[etymology, global_distribution, elevation,
			// common_name, phenology, number_of_infrataxa, habitat, past_name,
			// references, us_distribution, ca_distribution, conservation,
			// introduced, invalid_name, phenology_fruiting, conserved_name,
			// TaxonIdentification]

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.contains("distribution")) {
					Element descriptionElement = new Element("description");
					descriptionElement.setAttribute("type", "distribution");
					descriptionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(descriptionElement);

				}
			}

			// habitat

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.contains("habitat")) {
					Element habitatElement = new Element("description");
					habitatElement.setAttribute("type", "habitat");
					habitatElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(habitatElement);

				}
			}

			// elevation

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.contains("elevation")) {
					Element elevationElement = new Element("description");
					elevationElement.setAttribute("type", "elevation");
					elevationElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(elevationElement);

				}
			}

			// discussion
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("discussion")) {
					Element discussionElement = new Element("discussion");
					discussionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(discussionElement);

				}
			}

			// number
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("number")) {
					Element numberElement = new Element("number");
					numberElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(numberElement);

				}
			}

			// key
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("key")) {
					Element keyElement = new Element("key");

					List<Element> visitChildNodesList = visitChildNodes(
							elementOfChildrenOfRoot.getChildren(),
							allSchemaAttributeName);
					for (Element elementInVisitChildNodesList : visitChildNodesList) {

						keyElement.addContent(elementInVisitChildNodesList);

					}

					doc.getRootElement().addContent(keyElement);

				}
			}

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}

	}

	// transferXMLFormatFromOldThackerStudentReplaced
	public static void transferXMLFormatFromOldThackerStudentReplaced(
			String inputXmlFileName, Set<String> allSchemaAttributeName) {

		SAXBuilder saxBuilder = new SAXBuilder();

		try {
			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String rootElement = xmlDocument.getRootElement().getText();
			// System.out.println("rootElement::" + rootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();
			// for loop recursively read List<Element> childrenOfRoot and gather
			// required information

			// Scheme
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				// if (nameOfElementOfChildrenOfRoot.equals("phenology")) {
				// System.out.println("phenology::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if (nameOfElementOfChildrenOfRoot.equals("conservation")) {
				// System.out.println("conservation::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if (nameOfElementOfChildrenOfRoot.equals("introduced")) {
				// System.out.println("introduced::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if
				// (nameOfElementOfChildrenOfRoot.equals("phenology_fruiting"))
				// {
				// System.out.println("phenology_fruiting::inputXmlFileName::" +
				// inputXmlFileName);
				// }
			}

			// meta
			Element meta = new Element("meta");

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("meta")) {
					List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
							.getChildren();
					for (Element elementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfRoot) {
						String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getName();
						String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getText();

						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("source")) {
							Element sourceElement = new Element("source");
							List<Element> visitChildNodesList = visitChildNodes(
									elementOfChildrenOfElementOfChildrenOfRoot
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								sourceElement
										.addContent(elementInVisitChildNodesList);
							}
							meta.addContent(sourceElement);
						}
						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("processed_by")) {
							Element processed_byElement = new Element(
									"processed_by");
							List<Element> visitChildNodesList = visitChildNodes(
									elementOfChildrenOfElementOfChildrenOfRoot
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								processed_byElement
										.addContent(elementInVisitChildNodesList);
							}
							meta.addContent(processed_byElement);
						}
						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("other_info_on_meta")) {
							Element other_info_on_metaElement = new Element(
									"other_info_on_meta");

							String[] textOfElementOfChildrenOfElementOfChildrenOfRootArray = textOfElementOfChildrenOfElementOfChildrenOfRoot
									.split(":");

							if (textOfElementOfChildrenOfElementOfChildrenOfRootArray.length > 1) {

								String restString = textOfElementOfChildrenOfElementOfChildrenOfRoot
										.replace(
												textOfElementOfChildrenOfElementOfChildrenOfRootArray[0]
														+ ":", "").trim();
								// System.out.println("restString:" +
								// restString);

								if (textOfElementOfChildrenOfElementOfChildrenOfRootArray[0]
										.equals("doi")) {
									other_info_on_metaElement
											.setAttribute(new Attribute("type",
													"doi"));
									other_info_on_metaElement
											.addContent(restString);
								} else if (textOfElementOfChildrenOfElementOfChildrenOfRootArray[0]
										.equals("full citation")) {
									other_info_on_metaElement
											.setAttribute(new Attribute("type",
													"citation"));
									other_info_on_metaElement
											.addContent(restString);
								}
							}
							meta.addContent(other_info_on_metaElement);
						}

					}
				}
			}
			doc.getRootElement().addContent(meta);

			// taxon_identification
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);
				if (nameOfElementOfChildrenOfRoot == "taxon_identification") {
					// System.out.println("nameOfElementOfChildrenOfRoot::" +
					// nameOfElementOfChildrenOfRoot);

					Element taxon_identification = new Element(
							"taxon_identification");

					String nameOfAttritueStatus = elementOfChildrenOfRoot
							.getAttribute("status").getName();
					String valueOfAttritueStatus = elementOfChildrenOfRoot
							.getAttributeValue("status");

					// System.out.println(nameOfAttritueStatus);
					// System.out.println(valueOfAttritueStatus);
					taxon_identification.setAttribute(nameOfAttritueStatus,
							valueOfAttritueStatus);

					List<Element> taxonIdentificationChildNodesList = visitChildNodes(
							elementOfChildrenOfRoot.getChildren(),
							allSchemaAttributeName);
					// System.out.println("taxonIdentificationChildNodesList.size():"
					// + taxonIdentificationChildNodesList.size());

					// Iterator<Element>
					// taxonIdentificationChildNodesListIterator =
					// taxonIdentificationChildNodesList.iterator();
					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {

						// while
						// (taxonIdentificationChildNodesListIterator.hasNext())
						// {
						// Element elementOfTaxonIdentificationChildNodesList =
						// taxonIdentificationChildNodesListIterator.next();
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						// System.out.println("nameOfElementOfTaxonIdentificationChildNodesList:"
						// + nameOfElementOfTaxonIdentificationChildNodesList);
						// Old::
						// <family_name>Hemiasterellidae Lendenfeld,
						// 1889</family_name>

						// New::
						// <taxon_name rank="family">familyBBB</taxon_name>
						// <taxon_name rank="order">OrderAAA</taxon_name>

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.contains("_name")) {
							String[] nameOfElementOfChildrenOfElementOfChildrenOfRootArray = nameOfElementOfTaxonIdentificationChildNodesList
									.split("_");

							if (nameOfElementOfChildrenOfElementOfChildrenOfRootArray.length > 1) {
								Element taxon_nameElement = new Element(
										"taxon_name");

								String rankString = nameOfElementOfChildrenOfElementOfChildrenOfRootArray[0];

								String rankTaxonText = textOfElementOfTaxonIdentificationChildNodesList;

								// System.out.println("rankString:" +
								// rankString);

								taxon_nameElement.setAttribute("rank",
										rankString);

								// taxonIdentificationChildNodesListIterator =
								// taxonIdentificationChildNodesList.iterator();
								for (Element elementOfTaxonIdentificationChildNodesList2 : taxonIdentificationChildNodesList) {
									// while
									// (taxonIdentificationChildNodesListIterator.hasNext())
									// {
									// elementOfTaxonIdentificationChildNodesList
									// =
									// taxonIdentificationChildNodesListIterator.next();
									nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList2
											.getName();
									textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList2
											.getText();

									if (nameOfElementOfTaxonIdentificationChildNodesList
											.contains(rankString + "_authority")) {
										// rankTaxonText += " " +
										// textOfElementOfTaxonIdentificationChildNodesList;
										taxon_nameElement
												.setAttribute("authority",
														textOfElementOfTaxonIdentificationChildNodesList);

									}
								}

								taxon_nameElement.setText(rankTaxonText);

								taxon_identification
										.addContent(taxon_nameElement);
							}

						}
					}

					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						// Old::
						// <family_name>Hemiasterellidae Lendenfeld,
						// 1889</family_name>

						// New::
						// <taxon_name rank="family">familyBBB</taxon_name>
						// <taxon_name rank="order">OrderAAA</taxon_name>

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.equals("place_of_publication")) {
							Element place_of_publicationElement = new Element(
									"place_of_publication");

							List<Element> visitChildNodesList = visitChildNodes(
									elementOfTaxonIdentificationChildNodesList
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								String nameOfElementInVisitChildNodesList = elementInVisitChildNodesList
										.getName();
								if (nameOfElementInVisitChildNodesList
										.equals("other_info")) {
									// System.out.println("nameOfElementInVisitChildNodesList:"
									// + nameOfElementInVisitChildNodesList);
									elementInVisitChildNodesList
											.setName("other_info_on_pub");
								}
								place_of_publicationElement
										.addContent(elementInVisitChildNodesList);

							}
							taxon_identification
									.addContent(place_of_publicationElement);
						}
					}

					doc.getRootElement().addContent(taxon_identification);

				}
			}

			// description
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);
				if (nameOfElementOfChildrenOfRoot == "description") {
					Element descriptionElement = new Element("description");

					if (elementOfChildrenOfRoot.hasAttributes() == true) {
						// get attributes names and values
						List<Attribute> elementOfChildrenOfRootAttributeList = elementOfChildrenOfRoot
								.getAttributes();
						for (Attribute attributeOfElementOfChildrenOfRootAttributeList : elementOfChildrenOfRootAttributeList) {
							String nameOfAttributeOfElementOfChildrenOfRootAttributeList = attributeOfElementOfChildrenOfRootAttributeList
									.getName();
							String valueOfAttributeOfElementOfChildrenOfRootAttributeList = attributeOfElementOfChildrenOfRootAttributeList
									.getValue();
							// System.out.println("nameOfAttributeOfElementOfChildrenOfRootAttributeList:"
							// +
							// nameOfAttributeOfElementOfChildrenOfRootAttributeList
							// +
							// "::valueOfAttributeOfElementOfChildrenOfRootAttributeList:"
							// +
							// valueOfAttributeOfElementOfChildrenOfRootAttributeList);

							descriptionElement
									.setAttribute(
											nameOfAttributeOfElementOfChildrenOfRootAttributeList,
											valueOfAttributeOfElementOfChildrenOfRootAttributeList);
						}

					}

					descriptionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(descriptionElement);

				}
			}

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}

	}

	// transferXMLFormatFromOldComparisonReplaced
	public static void transferXMLFormatFromOldComparisonReplaced(
			String inputXmlFileName, Set<String> allSchemaAttributeName) {

		SAXBuilder saxBuilder = new SAXBuilder();

		try {
			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String rootElement = xmlDocument.getRootElement().getText();
			// System.out.println("rootElement::" + rootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();
			// for loop recursively read List<Element> childrenOfRoot and gather
			// required information

			// Scheme
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				// if (nameOfElementOfChildrenOfRoot.equals("phenology")) {
				// System.out.println("phenology::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if (nameOfElementOfChildrenOfRoot.equals("conservation")) {
				// System.out.println("conservation::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if (nameOfElementOfChildrenOfRoot.equals("introduced")) {
				// System.out.println("introduced::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if
				// (nameOfElementOfChildrenOfRoot.equals("phenology_fruiting"))
				// {
				// System.out.println("phenology_fruiting::inputXmlFileName::" +
				// inputXmlFileName);
				// }
			}

			// meta
			Element meta = new Element("meta");

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("meta")) {
					List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
							.getChildren();
					for (Element elementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfRoot) {
						String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getName();
						String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getText();

						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("source")) {
							Element sourceElement = new Element("source");
							List<Element> visitChildNodesList = visitChildNodes(
									elementOfChildrenOfElementOfChildrenOfRoot
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								sourceElement
										.addContent(elementInVisitChildNodesList);
							}
							meta.addContent(sourceElement);
						}
						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("processed_by")) {
							Element processed_byElement = new Element(
									"processed_by");
							List<Element> visitChildNodesList = visitChildNodes(
									elementOfChildrenOfElementOfChildrenOfRoot
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								processed_byElement
										.addContent(elementInVisitChildNodesList);
							}
							meta.addContent(processed_byElement);
						}
						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("other_info_on_meta")) {
							Element other_info_on_metaElement = new Element(
									"other_info_on_meta");

							String[] textOfElementOfChildrenOfElementOfChildrenOfRootArray = textOfElementOfChildrenOfElementOfChildrenOfRoot
									.split(":");

							if (textOfElementOfChildrenOfElementOfChildrenOfRootArray.length > 1) {

								String restString = textOfElementOfChildrenOfElementOfChildrenOfRoot
										.replace(
												textOfElementOfChildrenOfElementOfChildrenOfRootArray[0]
														+ ":", "").trim();
								// System.out.println("restString:" +
								// restString);

								if (textOfElementOfChildrenOfElementOfChildrenOfRootArray[0]
										.equals("doi")) {
									other_info_on_metaElement
											.setAttribute(new Attribute("type",
													"doi"));
									other_info_on_metaElement
											.addContent(restString);
								} else if (textOfElementOfChildrenOfElementOfChildrenOfRootArray[0]
										.equals("full citation")) {
									other_info_on_metaElement
											.setAttribute(new Attribute("type",
													"citation"));
									other_info_on_metaElement
											.addContent(restString);
								}
							} else {
								List<Element> visitChildNodesList = visitChildNodes(
										elementOfChildrenOfElementOfChildrenOfRoot
												.getChildren(),
										allSchemaAttributeName);
								for (Element elementInVisitChildNodesList : visitChildNodesList) {
									other_info_on_metaElement
											.addContent(elementInVisitChildNodesList);
								}
							}
							meta.addContent(other_info_on_metaElement);
						}

					}
				}
			}
			doc.getRootElement().addContent(meta);

			// taxon_identification
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);
				if (nameOfElementOfChildrenOfRoot == "taxon_identification") {
					// System.out.println("nameOfElementOfChildrenOfRoot::" +
					// nameOfElementOfChildrenOfRoot);

					Element taxon_identification = new Element(
							"taxon_identification");

					String nameOfAttritueStatus = elementOfChildrenOfRoot
							.getAttribute("status").getName();
					String valueOfAttritueStatus = elementOfChildrenOfRoot
							.getAttributeValue("status");

					// System.out.println(nameOfAttritueStatus);
					// System.out.println(valueOfAttritueStatus);
					taxon_identification.setAttribute(nameOfAttritueStatus,
							valueOfAttritueStatus);

					List<Element> taxonIdentificationChildNodesList = visitChildNodes(
							elementOfChildrenOfRoot.getChildren(),
							allSchemaAttributeName);
					// System.out.println("taxonIdentificationChildNodesList.size():"
					// + taxonIdentificationChildNodesList.size());

					// Iterator<Element>
					// taxonIdentificationChildNodesListIterator =
					// taxonIdentificationChildNodesList.iterator();
					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {

						// while
						// (taxonIdentificationChildNodesListIterator.hasNext())
						// {
						// Element elementOfTaxonIdentificationChildNodesList =
						// taxonIdentificationChildNodesListIterator.next();
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						// System.out.println("nameOfElementOfTaxonIdentificationChildNodesList:"
						// + nameOfElementOfTaxonIdentificationChildNodesList);
						// Old::
						// <family_name>Hemiasterellidae Lendenfeld,
						// 1889</family_name>

						// New::
						// <taxon_name rank="family">familyBBB</taxon_name>
						// <taxon_name rank="order">OrderAAA</taxon_name>

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.contains("_name")) {
							String[] nameOfElementOfChildrenOfElementOfChildrenOfRootArray = nameOfElementOfTaxonIdentificationChildNodesList
									.split("_");

							if (nameOfElementOfChildrenOfElementOfChildrenOfRootArray.length > 1) {
								Element taxon_nameElement = new Element(
										"taxon_name");

								String rankString = nameOfElementOfChildrenOfElementOfChildrenOfRootArray[0];

								String rankTaxonText = textOfElementOfTaxonIdentificationChildNodesList;

								// System.out.println("rankString:" +
								// rankString);

								taxon_nameElement.setAttribute("rank",
										rankString);

								// taxonIdentificationChildNodesListIterator =
								// taxonIdentificationChildNodesList.iterator();
								for (Element elementOfTaxonIdentificationChildNodesList2 : taxonIdentificationChildNodesList) {
									// while
									// (taxonIdentificationChildNodesListIterator.hasNext())
									// {
									// elementOfTaxonIdentificationChildNodesList
									// =
									// taxonIdentificationChildNodesListIterator.next();
									nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList2
											.getName();
									textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList2
											.getText();

									if (nameOfElementOfTaxonIdentificationChildNodesList
											.contains(rankString + "_authority")) {
										// rankTaxonText += " " +
										// textOfElementOfTaxonIdentificationChildNodesList;
										taxon_nameElement
												.setAttribute("authority",
														textOfElementOfTaxonIdentificationChildNodesList);

									}
								}

								taxon_nameElement.setText(rankTaxonText);

								taxon_identification
										.addContent(taxon_nameElement);
							}

						}
					}

					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						// Old::
						// <family_name>Hemiasterellidae Lendenfeld,
						// 1889</family_name>

						// New::
						// <taxon_name rank="family">familyBBB</taxon_name>
						// <taxon_name rank="order">OrderAAA</taxon_name>

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.equals("place_of_publication")) {
							Element place_of_publicationElement = new Element(
									"place_of_publication");

							List<Element> visitChildNodesList = visitChildNodes(
									elementOfTaxonIdentificationChildNodesList
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								String nameOfElementInVisitChildNodesList = elementInVisitChildNodesList
										.getName();
								if (nameOfElementInVisitChildNodesList
										.equals("other_info")) {
									// System.out.println("nameOfElementInVisitChildNodesList:"
									// + nameOfElementInVisitChildNodesList);
									elementInVisitChildNodesList
											.setName("other_info_on_pub");
								}
								place_of_publicationElement
										.addContent(elementInVisitChildNodesList);

							}
							taxon_identification
									.addContent(place_of_publicationElement);
						}
					}

					// taxon_hierarchy
					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.equals("taxon_hierarchy")) {
							Element taxon_hierarchyElement = new Element(
									"taxon_hierarchy");
							taxon_hierarchyElement
									.setText(textOfElementOfTaxonIdentificationChildNodesList);
							taxon_identification
									.addContent(taxon_hierarchyElement);
						}
					}

					// OLD
					// <taxon_identification status="ACCEPTED">
					// <genus_name>Mycoplasma</genus_name>
					// <species_name>felifaucium</species_name>
					// <strain_number>PU</strain_number>
					// <equivalent_strain_number>NCTC
					// 11703</equivalent_strain_number>
					// <accession_number_16s_rRNA>U15795</accession_number_16s_rRNA>
					// </taxon_identification>

					// NEW
					//

					// strain_number

					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.equals("strain_number")) {
							Element strain_numberElement = new Element(
									"strain_number");
							strain_numberElement
									.setText(textOfElementOfTaxonIdentificationChildNodesList);

							for (Element elementOfTaxonIdentificationChildNodesList2 : taxonIdentificationChildNodesList) {
								String nameOfElementOfTaxonIdentificationChildNodesList2 = elementOfTaxonIdentificationChildNodesList2
										.getName();
								String textOfElementOfTaxonIdentificationChildNodesList2 = elementOfTaxonIdentificationChildNodesList2
										.getText();

								// equivalent_strain_number =>
								// attritube::equivalent_strain_numbers
								if (nameOfElementOfTaxonIdentificationChildNodesList2
										.equals("equivalent_strain_number")) {
									strain_numberElement
											.setAttribute(
													"equivalent_strain_numbers",
													textOfElementOfTaxonIdentificationChildNodesList2);
								}

								// accession_number_16s_rRNA =>
								// attritube::accession_number_16s_rrna
								if (nameOfElementOfTaxonIdentificationChildNodesList2
										.equals("accession_number_16s_rRNA")) {
									strain_numberElement
											.setAttribute(
													"accession_number_16s_rrna",
													textOfElementOfTaxonIdentificationChildNodesList2);
								}
							}

							taxon_identification
									.addContent(strain_numberElement);

						}

					}

					/*
					 * // equivalent_strain_number =>
					 * attritube::equivalent_strain_numbers for ( Element
					 * elementOfTaxonIdentificationChildNodesList :
					 * taxonIdentificationChildNodesList) { String
					 * nameOfElementOfTaxonIdentificationChildNodesList =
					 * elementOfTaxonIdentificationChildNodesList.getName();
					 * String textOfElementOfTaxonIdentificationChildNodesList =
					 * elementOfTaxonIdentificationChildNodesList.getText();
					 * 
					 * if
					 * (nameOfElementOfTaxonIdentificationChildNodesList.equals
					 * ("equivalent_strain_number")) {
					 * strain_numberElement.setAttribute
					 * ("equivalent_strain_numbers",
					 * textOfElementOfTaxonIdentificationChildNodesList); } }
					 * 
					 * 
					 * // accession_number_16s_rRNA =>
					 * attritube::accession_number_16s_rrna for ( Element
					 * elementOfTaxonIdentificationChildNodesList :
					 * taxonIdentificationChildNodesList) { String
					 * nameOfElementOfTaxonIdentificationChildNodesList =
					 * elementOfTaxonIdentificationChildNodesList.getName();
					 * String textOfElementOfTaxonIdentificationChildNodesList =
					 * elementOfTaxonIdentificationChildNodesList.getText();
					 * 
					 * if
					 * (nameOfElementOfTaxonIdentificationChildNodesList.equals
					 * ("accession_number_16s_rRNA")) {
					 * strain_numberElement.setAttribute
					 * ("accession_number_16s_rrna",
					 * textOfElementOfTaxonIdentificationChildNodesList);
					 * 
					 * } }
					 */

					doc.getRootElement().addContent(taxon_identification);

				}
			}

			// description
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);
				if (nameOfElementOfChildrenOfRoot == "description") {
					Element descriptionElement = new Element("description");

					if (elementOfChildrenOfRoot.hasAttributes() == true) {
						// get attributes names and values
						List<Attribute> elementOfChildrenOfRootAttributeList = elementOfChildrenOfRoot
								.getAttributes();
						for (Attribute attributeOfElementOfChildrenOfRootAttributeList : elementOfChildrenOfRootAttributeList) {
							String nameOfAttributeOfElementOfChildrenOfRootAttributeList = attributeOfElementOfChildrenOfRootAttributeList
									.getName();
							String valueOfAttributeOfElementOfChildrenOfRootAttributeList = attributeOfElementOfChildrenOfRootAttributeList
									.getValue();
							// System.out.println("nameOfAttributeOfElementOfChildrenOfRootAttributeList:"
							// +
							// nameOfAttributeOfElementOfChildrenOfRootAttributeList
							// +
							// "::valueOfAttributeOfElementOfChildrenOfRootAttributeList:"
							// +
							// valueOfAttributeOfElementOfChildrenOfRootAttributeList);

							descriptionElement
									.setAttribute(
											nameOfAttributeOfElementOfChildrenOfRootAttributeList,
											valueOfAttributeOfElementOfChildrenOfRootAttributeList);
						}

					}

					descriptionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(descriptionElement);

				}
			}

			// discussion
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("discussion")) {
					Element discussionElement = new Element("discussion");
					discussionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(discussionElement);

				}
			}

			// number
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("number")) {
					Element numberElement = new Element("number");
					numberElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(numberElement);

				}
			}

			// key
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("key")) {
					Element keyElement = new Element("key");

					List<Element> visitChildNodesList = visitChildNodes(
							elementOfChildrenOfRoot.getChildren(),
							allSchemaAttributeName);
					for (Element elementInVisitChildNodesList : visitChildNodesList) {

						keyElement.addContent(elementInVisitChildNodesList);

					}

					doc.getRootElement().addContent(keyElement);

				}
			}

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}

	}

	// transferXMLFormatFromOldFNARubusReplaced
	public static void transferXMLFormatFromOldFNARubusReplaced(
			String inputXmlFileName, Set<String> allSchemaAttributeName) {

		SAXBuilder saxBuilder = new SAXBuilder();

		try {
			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String rootElement = xmlDocument.getRootElement().getText();
			// System.out.println("rootElement::" + rootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();
			// for loop recursively read List<Element> childrenOfRoot and gather
			// required information

			// Scheme
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				// if (nameOfElementOfChildrenOfRoot.equals("phenology")) {
				// System.out.println("phenology::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if (nameOfElementOfChildrenOfRoot.equals("conservation")) {
				// System.out.println("conservation::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if (nameOfElementOfChildrenOfRoot.equals("introduced")) {
				// System.out.println("introduced::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if
				// (nameOfElementOfChildrenOfRoot.equals("phenology_fruiting"))
				// {
				// System.out.println("phenology_fruiting::inputXmlFileName::" +
				// inputXmlFileName);
				// }
			}

			// meta
			Element meta = new Element("meta");

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("meta")) {
					List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
							.getChildren();
					for (Element elementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfRoot) {
						String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getName();
						String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getText();

						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("source")) {
							Element sourceElement = new Element("source");
							List<Element> visitChildNodesList = visitChildNodes(
									elementOfChildrenOfElementOfChildrenOfRoot
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								sourceElement
										.addContent(elementInVisitChildNodesList);
							}
							meta.addContent(sourceElement);
						}
						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("processed_by")) {
							Element processed_byElement = new Element(
									"processed_by");
							List<Element> visitChildNodesList = visitChildNodes(
									elementOfChildrenOfElementOfChildrenOfRoot
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								processed_byElement
										.addContent(elementInVisitChildNodesList);
							}
							meta.addContent(processed_byElement);
						}
						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("other_info_on_meta")) {
							Element other_info_on_metaElement = new Element(
									"other_info_on_meta");

							String[] textOfElementOfChildrenOfElementOfChildrenOfRootArray = textOfElementOfChildrenOfElementOfChildrenOfRoot
									.split(":");

							if (textOfElementOfChildrenOfElementOfChildrenOfRootArray.length > 1) {

								String restString = textOfElementOfChildrenOfElementOfChildrenOfRoot
										.replace(
												textOfElementOfChildrenOfElementOfChildrenOfRootArray[0]
														+ ":", "").trim();
								// System.out.println("restString:" +
								// restString);

								if (textOfElementOfChildrenOfElementOfChildrenOfRootArray[0]
										.equals("doi")) {
									other_info_on_metaElement
											.setAttribute(new Attribute("type",
													"doi"));
									other_info_on_metaElement
											.addContent(restString);
								} else if (textOfElementOfChildrenOfElementOfChildrenOfRootArray[0]
										.equals("full citation")) {
									other_info_on_metaElement
											.setAttribute(new Attribute("type",
													"citation"));
									other_info_on_metaElement
											.addContent(restString);
								}
							} else {
								List<Element> visitChildNodesList = visitChildNodes(
										elementOfChildrenOfElementOfChildrenOfRoot
												.getChildren(),
										allSchemaAttributeName);
								for (Element elementInVisitChildNodesList : visitChildNodesList) {
									other_info_on_metaElement
											.addContent(elementInVisitChildNodesList);
								}
							}
							meta.addContent(other_info_on_metaElement);
						}

					}
				}
			}
			doc.getRootElement().addContent(meta);

			// taxon_identification
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);
				if (nameOfElementOfChildrenOfRoot == "taxon_identification") {
					// System.out.println("nameOfElementOfChildrenOfRoot::" +
					// nameOfElementOfChildrenOfRoot);

					Element taxon_identification = new Element(
							"taxon_identification");

					String nameOfAttritueStatus = elementOfChildrenOfRoot
							.getAttribute("status").getName();
					String valueOfAttritueStatus = elementOfChildrenOfRoot
							.getAttributeValue("status");

					// System.out.println(nameOfAttritueStatus);
					// System.out.println(valueOfAttritueStatus);
					taxon_identification.setAttribute(nameOfAttritueStatus,
							valueOfAttritueStatus);

					List<Element> taxonIdentificationChildNodesList = visitChildNodes(
							elementOfChildrenOfRoot.getChildren(),
							allSchemaAttributeName);
					// System.out.println("taxonIdentificationChildNodesList.size():"
					// + taxonIdentificationChildNodesList.size());

					// Iterator<Element>
					// taxonIdentificationChildNodesListIterator =
					// taxonIdentificationChildNodesList.iterator();
					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {

						// while
						// (taxonIdentificationChildNodesListIterator.hasNext())
						// {
						// Element elementOfTaxonIdentificationChildNodesList =
						// taxonIdentificationChildNodesListIterator.next();
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						// System.out.println("nameOfElementOfTaxonIdentificationChildNodesList:"
						// + nameOfElementOfTaxonIdentificationChildNodesList);
						// Old::
						// <family_name>Hemiasterellidae Lendenfeld,
						// 1889</family_name>

						// New::
						// <taxon_name rank="family">familyBBB</taxon_name>
						// <taxon_name rank="order">OrderAAA</taxon_name>

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.contains("_name")) {
							String[] nameOfElementOfChildrenOfElementOfChildrenOfRootArray = nameOfElementOfTaxonIdentificationChildNodesList
									.split("_");

							if (nameOfElementOfChildrenOfElementOfChildrenOfRootArray.length > 1) {
								Element taxon_nameElement = new Element(
										"taxon_name");

								String rankString = nameOfElementOfChildrenOfElementOfChildrenOfRootArray[0];

								String rankTaxonText = textOfElementOfTaxonIdentificationChildNodesList;

								// System.out.println("rankString:" +
								// rankString);

								taxon_nameElement.setAttribute("rank",
										rankString);

								// taxonIdentificationChildNodesListIterator =
								// taxonIdentificationChildNodesList.iterator();
								for (Element elementOfTaxonIdentificationChildNodesList2 : taxonIdentificationChildNodesList) {
									// while
									// (taxonIdentificationChildNodesListIterator.hasNext())
									// {
									// elementOfTaxonIdentificationChildNodesList
									// =
									// taxonIdentificationChildNodesListIterator.next();
									nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList2
											.getName();
									textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList2
											.getText();

									if (nameOfElementOfTaxonIdentificationChildNodesList
											.contains(rankString + "_authority")) {
										// rankTaxonText += " " +
										// textOfElementOfTaxonIdentificationChildNodesList;
										taxon_nameElement
												.setAttribute("authority",
														textOfElementOfTaxonIdentificationChildNodesList);

									}
								}

								taxon_nameElement.setText(rankTaxonText);

								taxon_identification
										.addContent(taxon_nameElement);
							}

						}
					}

					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						// Old::
						// <family_name>Hemiasterellidae Lendenfeld,
						// 1889</family_name>

						// New::
						// <taxon_name rank="family">familyBBB</taxon_name>
						// <taxon_name rank="order">OrderAAA</taxon_name>

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.equals("place_of_publication")) {
							Element place_of_publicationElement = new Element(
									"place_of_publication");

							List<Element> visitChildNodesList = visitChildNodes(
									elementOfTaxonIdentificationChildNodesList
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								String nameOfElementInVisitChildNodesList = elementInVisitChildNodesList
										.getName();
								if (nameOfElementInVisitChildNodesList
										.equals("other_info")) {
									// System.out.println("nameOfElementInVisitChildNodesList:"
									// + nameOfElementInVisitChildNodesList);
									elementInVisitChildNodesList
											.setName("other_info_on_pub");
								}
								place_of_publicationElement
										.addContent(elementInVisitChildNodesList);

							}
							taxon_identification
									.addContent(place_of_publicationElement);
						}
					}

					// taxon_hierarchy
					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.equals("taxon_hierarchy")) {
							Element taxon_hierarchyElement = new Element(
									"taxon_hierarchy");
							taxon_hierarchyElement
									.setText(textOfElementOfTaxonIdentificationChildNodesList);
							taxon_identification
									.addContent(taxon_hierarchyElement);
						}
					}

					doc.getRootElement().addContent(taxon_identification);

				}
			}

			// description
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);
				if (nameOfElementOfChildrenOfRoot == "description") {
					Element descriptionElement = new Element("description");

					if (elementOfChildrenOfRoot.hasAttributes() == true) {
						// get attributes names and values
						List<Attribute> elementOfChildrenOfRootAttributeList = elementOfChildrenOfRoot
								.getAttributes();
						for (Attribute attributeOfElementOfChildrenOfRootAttributeList : elementOfChildrenOfRootAttributeList) {
							String nameOfAttributeOfElementOfChildrenOfRootAttributeList = attributeOfElementOfChildrenOfRootAttributeList
									.getName();
							String valueOfAttributeOfElementOfChildrenOfRootAttributeList = attributeOfElementOfChildrenOfRootAttributeList
									.getValue();
							// System.out.println("nameOfAttributeOfElementOfChildrenOfRootAttributeList:"
							// +
							// nameOfAttributeOfElementOfChildrenOfRootAttributeList
							// +
							// "::valueOfAttributeOfElementOfChildrenOfRootAttributeList:"
							// +
							// valueOfAttributeOfElementOfChildrenOfRootAttributeList);

							descriptionElement
									.setAttribute(
											nameOfAttributeOfElementOfChildrenOfRootAttributeList,
											valueOfAttributeOfElementOfChildrenOfRootAttributeList);
						}

					}

					descriptionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(descriptionElement);

				}
			}

			// discussion
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("discussion")) {
					Element discussionElement = new Element("discussion");
					discussionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(discussionElement);

				}
			}

			// number
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("number")) {
					Element numberElement = new Element("number");
					numberElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(numberElement);

				}
			}

			// key
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("key")) {
					Element keyElement = new Element("key");

					List<Element> visitChildNodesList = visitChildNodes(
							elementOfChildrenOfRoot.getChildren(),
							allSchemaAttributeName);
					for (Element elementInVisitChildNodesList : visitChildNodesList) {

						keyElement.addContent(elementInVisitChildNodesList);

					}

					doc.getRootElement().addContent(keyElement);

				}
			}

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}

	}

	// transferXMLFormatFromOldGrayRubusReplaced
	public static void transferXMLFormatFromOldGrayRubusReplaced(
			String inputXmlFileName, Set<String> allSchemaAttributeName) {

		SAXBuilder saxBuilder = new SAXBuilder();

		try {
			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String rootElement = xmlDocument.getRootElement().getText();
			// System.out.println("rootElement::" + rootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();
			// for loop recursively read List<Element> childrenOfRoot and gather
			// required information

			// Scheme
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				// if (nameOfElementOfChildrenOfRoot.equals("phenology")) {
				// System.out.println("phenology::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if (nameOfElementOfChildrenOfRoot.equals("conservation")) {
				// System.out.println("conservation::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if (nameOfElementOfChildrenOfRoot.equals("introduced")) {
				// System.out.println("introduced::inputXmlFileName::" +
				// inputXmlFileName);
				// }
				// if
				// (nameOfElementOfChildrenOfRoot.equals("phenology_fruiting"))
				// {
				// System.out.println("phenology_fruiting::inputXmlFileName::" +
				// inputXmlFileName);
				// }
			}

			// meta
			Element meta = new Element("meta");

			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("meta")) {
					List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
							.getChildren();
					for (Element elementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfRoot) {
						String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getName();
						String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getText();

						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("source")) {
							Element sourceElement = new Element("source");
							List<Element> visitChildNodesList = visitChildNodes(
									elementOfChildrenOfElementOfChildrenOfRoot
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								sourceElement
										.addContent(elementInVisitChildNodesList);
							}
							meta.addContent(sourceElement);
						}
						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("processed_by")) {
							Element processed_byElement = new Element(
									"processed_by");
							List<Element> visitChildNodesList = visitChildNodes(
									elementOfChildrenOfElementOfChildrenOfRoot
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								processed_byElement
										.addContent(elementInVisitChildNodesList);
							}
							meta.addContent(processed_byElement);
						}
						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("other_info_on_meta")) {
							Element other_info_on_metaElement = new Element(
									"other_info_on_meta");

							String[] textOfElementOfChildrenOfElementOfChildrenOfRootArray = textOfElementOfChildrenOfElementOfChildrenOfRoot
									.split(":");

							if (textOfElementOfChildrenOfElementOfChildrenOfRootArray.length > 1) {

								String restString = textOfElementOfChildrenOfElementOfChildrenOfRoot
										.replace(
												textOfElementOfChildrenOfElementOfChildrenOfRootArray[0]
														+ ":", "").trim();
								// System.out.println("restString:" +
								// restString);

								if (textOfElementOfChildrenOfElementOfChildrenOfRootArray[0]
										.equals("doi")) {
									other_info_on_metaElement
											.setAttribute(new Attribute("type",
													"doi"));
									other_info_on_metaElement
											.addContent(restString);
								} else if (textOfElementOfChildrenOfElementOfChildrenOfRootArray[0]
										.equals("full citation")) {
									other_info_on_metaElement
											.setAttribute(new Attribute("type",
													"citation"));
									other_info_on_metaElement
											.addContent(restString);
								}
							} else {
								List<Element> visitChildNodesList = visitChildNodes(
										elementOfChildrenOfElementOfChildrenOfRoot
												.getChildren(),
										allSchemaAttributeName);
								for (Element elementInVisitChildNodesList : visitChildNodesList) {
									other_info_on_metaElement
											.addContent(elementInVisitChildNodesList);
								}
							}
							meta.addContent(other_info_on_metaElement);
						}

					}
				}
			}
			doc.getRootElement().addContent(meta);

			// taxon_identification
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);
				if (nameOfElementOfChildrenOfRoot == "taxon_identification") {
					// System.out.println("nameOfElementOfChildrenOfRoot::" +
					// nameOfElementOfChildrenOfRoot);

					Element taxon_identification = new Element(
							"taxon_identification");

					String nameOfAttritueStatus = elementOfChildrenOfRoot
							.getAttribute("status").getName();
					String valueOfAttritueStatus = elementOfChildrenOfRoot
							.getAttributeValue("status");

					// System.out.println(nameOfAttritueStatus);
					// System.out.println(valueOfAttritueStatus);
					taxon_identification.setAttribute(nameOfAttritueStatus,
							valueOfAttritueStatus);

					List<Element> taxonIdentificationChildNodesList = visitChildNodes(
							elementOfChildrenOfRoot.getChildren(),
							allSchemaAttributeName);
					// System.out.println("taxonIdentificationChildNodesList.size():"
					// + taxonIdentificationChildNodesList.size());

					// Iterator<Element>
					// taxonIdentificationChildNodesListIterator =
					// taxonIdentificationChildNodesList.iterator();
					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {

						// while
						// (taxonIdentificationChildNodesListIterator.hasNext())
						// {
						// Element elementOfTaxonIdentificationChildNodesList =
						// taxonIdentificationChildNodesListIterator.next();
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						// System.out.println("nameOfElementOfTaxonIdentificationChildNodesList:"
						// + nameOfElementOfTaxonIdentificationChildNodesList);
						// Old::
						// <family_name>Hemiasterellidae Lendenfeld,
						// 1889</family_name>

						// New::
						// <taxon_name rank="family">familyBBB</taxon_name>
						// <taxon_name rank="order">OrderAAA</taxon_name>

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.contains("_name")) {
							String[] nameOfElementOfChildrenOfElementOfChildrenOfRootArray = nameOfElementOfTaxonIdentificationChildNodesList
									.split("_");

							if (nameOfElementOfChildrenOfElementOfChildrenOfRootArray.length > 1) {
								Element taxon_nameElement = new Element(
										"taxon_name");

								String rankString = nameOfElementOfChildrenOfElementOfChildrenOfRootArray[0];

								String rankTaxonText = textOfElementOfTaxonIdentificationChildNodesList;

								// System.out.println("rankString:" +
								// rankString);

								taxon_nameElement.setAttribute("rank",
										rankString);

								// taxonIdentificationChildNodesListIterator =
								// taxonIdentificationChildNodesList.iterator();
								for (Element elementOfTaxonIdentificationChildNodesList2 : taxonIdentificationChildNodesList) {
									// while
									// (taxonIdentificationChildNodesListIterator.hasNext())
									// {
									// elementOfTaxonIdentificationChildNodesList
									// =
									// taxonIdentificationChildNodesListIterator.next();
									nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList2
											.getName();
									textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList2
											.getText();

									if (nameOfElementOfTaxonIdentificationChildNodesList
											.contains(rankString + "_authority")) {
										// rankTaxonText += " " +
										// textOfElementOfTaxonIdentificationChildNodesList;
										taxon_nameElement
												.setAttribute("authority",
														textOfElementOfTaxonIdentificationChildNodesList);

									}
								}

								taxon_nameElement.setText(rankTaxonText);

								taxon_identification
										.addContent(taxon_nameElement);
							}

						}
					}

					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						// Old::
						// <family_name>Hemiasterellidae Lendenfeld,
						// 1889</family_name>

						// New::
						// <taxon_name rank="family">familyBBB</taxon_name>
						// <taxon_name rank="order">OrderAAA</taxon_name>

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.equals("place_of_publication")) {
							Element place_of_publicationElement = new Element(
									"place_of_publication");

							List<Element> visitChildNodesList = visitChildNodes(
									elementOfTaxonIdentificationChildNodesList
											.getChildren(),
									allSchemaAttributeName);
							for (Element elementInVisitChildNodesList : visitChildNodesList) {
								String nameOfElementInVisitChildNodesList = elementInVisitChildNodesList
										.getName();
								if (nameOfElementInVisitChildNodesList
										.equals("other_info")) {
									// System.out.println("nameOfElementInVisitChildNodesList:"
									// + nameOfElementInVisitChildNodesList);
									elementInVisitChildNodesList
											.setName("other_info_on_pub");
								}
								place_of_publicationElement
										.addContent(elementInVisitChildNodesList);

							}
							taxon_identification
									.addContent(place_of_publicationElement);
						}
					}

					// taxon_hierarchy
					for (Element elementOfTaxonIdentificationChildNodesList : taxonIdentificationChildNodesList) {
						String nameOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getName();
						String textOfElementOfTaxonIdentificationChildNodesList = elementOfTaxonIdentificationChildNodesList
								.getText();

						if (nameOfElementOfTaxonIdentificationChildNodesList
								.equals("taxon_hierarchy")) {
							Element taxon_hierarchyElement = new Element(
									"taxon_hierarchy");
							taxon_hierarchyElement
									.setText(textOfElementOfTaxonIdentificationChildNodesList);
							taxon_identification
									.addContent(taxon_hierarchyElement);
						}
					}

					doc.getRootElement().addContent(taxon_identification);

				}
			}

			// description
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);
				if (nameOfElementOfChildrenOfRoot == "description") {
					Element descriptionElement = new Element("description");

					if (elementOfChildrenOfRoot.hasAttributes() == true) {
						// get attributes names and values
						List<Attribute> elementOfChildrenOfRootAttributeList = elementOfChildrenOfRoot
								.getAttributes();
						for (Attribute attributeOfElementOfChildrenOfRootAttributeList : elementOfChildrenOfRootAttributeList) {
							String nameOfAttributeOfElementOfChildrenOfRootAttributeList = attributeOfElementOfChildrenOfRootAttributeList
									.getName();
							String valueOfAttributeOfElementOfChildrenOfRootAttributeList = attributeOfElementOfChildrenOfRootAttributeList
									.getValue();
							// System.out.println("nameOfAttributeOfElementOfChildrenOfRootAttributeList:"
							// +
							// nameOfAttributeOfElementOfChildrenOfRootAttributeList
							// +
							// "::valueOfAttributeOfElementOfChildrenOfRootAttributeList:"
							// +
							// valueOfAttributeOfElementOfChildrenOfRootAttributeList);

							descriptionElement
									.setAttribute(
											nameOfAttributeOfElementOfChildrenOfRootAttributeList,
											valueOfAttributeOfElementOfChildrenOfRootAttributeList);
						}

					}

					descriptionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(descriptionElement);

				}
			}

			// discussion
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("discussion")) {
					Element discussionElement = new Element("discussion");
					discussionElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(discussionElement);

				}
			}

			// number
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("number")) {
					Element numberElement = new Element("number");
					numberElement.setText(textOfElementOfChildrenOfRoot);
					doc.getRootElement().addContent(numberElement);

				}
			}

			// key
			for (Element elementOfChildrenOfRoot : childrenOfRoot) {
				// childrenOfRootIterator = childrenOfRoot.iterator();
				// while (childrenOfRootIterator.hasNext()) {
				// Element elementOfChildrenOfRoot =
				// childrenOfRootIterator.next();
				String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getName();
				String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getText();
				// System.out.println(nameOfElementOfChildrenOfRoot);

				if (nameOfElementOfChildrenOfRoot.equals("key")) {
					Element keyElement = new Element("key");

					List<Element> visitChildNodesList = visitChildNodes(
							elementOfChildrenOfRoot.getChildren(),
							allSchemaAttributeName);
					for (Element elementInVisitChildNodesList : visitChildNodesList) {

						keyElement.addContent(elementInVisitChildNodesList);

					}

					doc.getRootElement().addContent(keyElement);

				}
			}

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}

	}

	//

	//
	// copyCurrentXmlfile
	public static void copyCurrentXmlfile(String inputXmlFileName,
			Set<String> allSchemaAttributeName) {

		SAXBuilder saxBuilder = new SAXBuilder();

		try {

			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String textOfRootElement = xmlDocument.getRootElement().getText();
			// System.out.println("textOfRootElement::" + textOfRootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();
			// for loop recursively read List<Element> childrenOfRoot and gather
			// required information

			List<Element> visitChildNodesList = visitChildNodes(
					rootNode.getChildren(), allSchemaAttributeName);

			for (Element elementInVisitChildNodesList : visitChildNodesList) {
				String nameOfElementInVisitChildNodesList = elementInVisitChildNodesList
						.getName();

				if (nameOfElementInVisitChildNodesList
						.equals("taxon_identification")) {
					String valueOfAttritubeStatusOfElementInVisitChildNodesList = elementInVisitChildNodesList
							.getAttributeValue("status");
					if (valueOfAttritubeStatusOfElementInVisitChildNodesList
							.equals("ACCEPTED")) {
						System.out.println("Exist::taxon_identification");
						Element taxon_name = new Element("taxon_name");
						taxon_name.setText("ExampleFamilyName");
						taxon_name.setAttribute("rank", "family");
						elementInVisitChildNodesList.addContent(taxon_name);
					}

				}

				treatment.addContent(elementInVisitChildNodesList);
			}

			/*
			 * for (Element elementOfChildrenOfRoot : childrenOfRoot) { String
			 * nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
			 * .getName();
			 * 
			 * Element newElementOfChildrenOfRoot = new
			 * Element(nameOfElementOfChildrenOfRoot);
			 * 
			 * List<Element> visitChildNodesList = visitChildNodes(
			 * elementOfChildrenOfRoot.getChildren(), allSchemaAttributeName);
			 * for (Element elementInVisitChildNodesList : visitChildNodesList)
			 * {
			 * newElementOfChildrenOfRoot.addContent(elementInVisitChildNodesList
			 * );
			 * 
			 * }
			 * 
			 * doc.getRootElement().addContent(newElementOfChildrenOfRoot);
			 * 
			 * }
			 */

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			// xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			xmlOutput.output(doc,
					new FileWriter(inputXmlFileName.split("\\.")[0] + "-1"
							+ inputXmlFileName.split("\\.")[1]));
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}

	}

	
	
	// addUnknownInFoc
	// from => copyCurrentXmlfile
	public static void addUnknownInFoc(String inputXmlFileName,
			Set<String> allSchemaAttributeName) {

		SAXBuilder saxBuilder = new SAXBuilder();

		try {

			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String textOfRootElement = xmlDocument.getRootElement().getText();
			// System.out.println("textOfRootElement::" + textOfRootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();
			// for loop recursively read List<Element> childrenOfRoot and gather
			// required information

			List<Element> visitChildNodesList = visitChildNodes(
					rootNode.getChildren(), allSchemaAttributeName);

			for (Element elementInVisitChildNodesList : visitChildNodesList) {
				String nameOfElementInVisitChildNodesList = elementInVisitChildNodesList
						.getName();

				if (nameOfElementInVisitChildNodesList
						.equals("meta")) {
					List<Element> childrenOfElementInVisitChildNodesList = elementInVisitChildNodesList
							.getChildren();
					for (Element elementOfChildrenOfElementInVisitChildNodesList : childrenOfElementInVisitChildNodesList) {
						
						/*
						String nameOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementInVisitChildNodesList
								.getName();
						String textOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementInVisitChildNodesList
								.getText();

						if (nameOfElementOfChildrenOfElementInVisitChildNodesList
								.equals("source")) {
							//
						}
						*/
						List<Element> childrenOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementInVisitChildNodesList
								.getChildren();
						for (Element elementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList : childrenOfElementOfChildrenOfElementInVisitChildNodesList) {
							
							String nameOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList.getName();
							String textOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList.getText();
							
							if (textOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList.equals("")) {
								elementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList.setText("unknown");
							} 
							
							// System.out.println(nameOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList + "::" + textOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList);
							
							// Second Level
							List<Element> childrenOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList
									.getChildren();
							for (Element elementOfChildrenOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList : childrenOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList) {
								
								String nameOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList.getName();
								String textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList.getText();
								


								
								if ( !nameOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList.equals("software") && textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList.equals("")) {
									elementOfChildrenOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList.setText("unknown");
								}
								
								// System.out.println("Second Level::" + nameOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList + "::" + textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList);
							}
							
							
						}

					}

				}

				treatment.addContent(elementInVisitChildNodesList);
			}

			/*
			 * for (Element elementOfChildrenOfRoot : childrenOfRoot) { String
			 * nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
			 * .getName();
			 * 
			 * Element newElementOfChildrenOfRoot = new
			 * Element(nameOfElementOfChildrenOfRoot);
			 * 
			 * List<Element> visitChildNodesList = visitChildNodes(
			 * elementOfChildrenOfRoot.getChildren(), allSchemaAttributeName);
			 * for (Element elementInVisitChildNodesList : visitChildNodesList)
			 * {
			 * newElementOfChildrenOfRoot.addContent(elementInVisitChildNodesList
			 * );
			 * 
			 * }
			 * 
			 * doc.getRootElement().addContent(newElementOfChildrenOfRoot);
			 * 
			 * }
			 */

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			// xmlOutput.output(doc,
			//		new FileWriter(inputXmlFileName.split("\\.")[0] + "-1"
			// 				+ inputXmlFileName.split("\\.")[1]));
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}

	}	
	
	

	// applyFamilyRankAndEtcToGenusXmlfile
	// from => copyCurrentXmlfile
	public static void applyFamilyRankAndEtcToGenusXmlfile(String inputXmlFileName,
			Set<String> genusToCorrespondingFamilyEtcSetString, Set<String> allSchemaAttributeName) {

		SAXBuilder saxBuilder = new SAXBuilder();

		try {

			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String textOfRootElement = xmlDocument.getRootElement().getText();
			// System.out.println("textOfRootElement::" + textOfRootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();
			// for loop recursively read List<Element> childrenOfRoot and gather
			// required information

			List<Element> visitChildNodesList = visitChildNodes(
					rootNode.getChildren(), allSchemaAttributeName);

			for (Element elementInVisitChildNodesList : visitChildNodesList) {
				String nameOfElementInVisitChildNodesList = elementInVisitChildNodesList
						.getName();

				if (nameOfElementInVisitChildNodesList
						.equals("taxon_identification")) {
					String valueOfAttritubeStatusOfElementInVisitChildNodesList = elementInVisitChildNodesList
							.getAttributeValue("status");
					if (valueOfAttritubeStatusOfElementInVisitChildNodesList
							.equals("ACCEPTED")) {
						// System.out.println("Exist::taxon_identification");
						
						List<Element> childrenOfElementInVisitChildNodesList = elementInVisitChildNodesList.getChildren();
						
						boolean isTargetXmlFile = false;
						boolean isContainingFamily = false;
						boolean isContainingGenus = false;
						
						
						String genusName = "";
						
						for (Element elementOfChildrenOfElementInVisitChildNodesList : childrenOfElementInVisitChildNodesList) {
							String nameOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementInVisitChildNodesList.getName();
							String textOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementInVisitChildNodesList.getText();
						
							if (nameOfElementOfChildrenOfElementInVisitChildNodesList.equals("taxon_name")) {
								String valueOfAttritubeStatusOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementInVisitChildNodesList
										.getAttributeValue("rank");
								
								if (valueOfAttritubeStatusOfElementOfChildrenOfElementInVisitChildNodesList.equals("family")) {
									isContainingFamily = true;
								}

								if (valueOfAttritubeStatusOfElementOfChildrenOfElementInVisitChildNodesList.equals("genus")) {
									isContainingGenus = true;
									
									genusName = textOfElementOfChildrenOfElementInVisitChildNodesList;
									genusName = genusName.toLowerCase();
								}
								
							}
						
						}
						
						
						if (isContainingFamily == false && isContainingGenus == true) {
							isTargetXmlFile = true;
						}
						
						
						if ( isTargetXmlFile == true) {
							System.out.println("inputXmlFileName::" + inputXmlFileName);

							System.out.println("isTargetXmlFile::" + isTargetXmlFile);
							System.out.println("isContainingFamily::" + isContainingFamily);
							System.out.println("isContainingGenus::" + isContainingGenus);

							// System.out.println("genusName::" + genusName);
							
							
							
							String[] genusToCorrespondingFamilyEtcSetStringArray = genusToCorrespondingFamilyEtcSetString.toArray(new String[genusToCorrespondingFamilyEtcSetString.size()]);
							
							for (String itemInGenusToCorrespondingFamilyEtcSetStringArray : genusToCorrespondingFamilyEtcSetStringArray) {							
								String[] arrayOfItemInGenusToCorrespondingFamilyEtcSetStringArray = itemInGenusToCorrespondingFamilyEtcSetStringArray.split(";");
								String genusNameInArrayOfItemInGenusToCorrespondingFamilyEtcSetStringArray = arrayOfItemInGenusToCorrespondingFamilyEtcSetStringArray[0];
								genusNameInArrayOfItemInGenusToCorrespondingFamilyEtcSetStringArray = genusNameInArrayOfItemInGenusToCorrespondingFamilyEtcSetStringArray.toLowerCase();
								
								
								boolean isContainingTargetGenusName = false;
								
								if (genusName.equals(genusNameInArrayOfItemInGenusToCorrespondingFamilyEtcSetStringArray)) {
									// System.out.println("itemInGenusToCorrespondingFamilyEtcSetStringArray::" + itemInGenusToCorrespondingFamilyEtcSetStringArray);
									
									System.out.println("genusName::" + genusName);
									System.out.println("genusNameInArrayOfItemInGenusToCorrespondingFamilyEtcSetStringArray::" + genusNameInArrayOfItemInGenusToCorrespondingFamilyEtcSetStringArray);
																	
									isContainingTargetGenusName = true;
								}

								

								if (isContainingTargetGenusName == true) {
									
									for (int i = arrayOfItemInGenusToCorrespondingFamilyEtcSetStringArray.length-1; i > 0; i--) {
										// System.out.println(arrayOfItemInGenusToCorrespondingFamilyEtcSetStringArray[i]);
										String taxon_nameString = arrayOfItemInGenusToCorrespondingFamilyEtcSetStringArray[i].split("::")[1];
										String rankString = arrayOfItemInGenusToCorrespondingFamilyEtcSetStringArray[i].split("::")[0];
										
										
										Element taxon_name = new Element("taxon_name");
										taxon_name.setText(taxon_nameString);
										taxon_name.setAttribute("rank", rankString);
										
										
										List<Element> childrenOfelementInVisitChildNodesList = elementInVisitChildNodesList.getChildren();
										
										boolean isDuplicatedElement = false;
										
										for (Element elementOfchildrenOfelementInVisitChildNodesList : childrenOfelementInVisitChildNodesList) {
											String nameOfElementOfchildrenOfelementInVisitChildNodesList = elementOfchildrenOfelementInVisitChildNodesList
													.getName();
											String textOfElementOfchildrenOfelementInVisitChildNodesList = elementOfchildrenOfelementInVisitChildNodesList
													.getText();
										
											if (textOfElementOfchildrenOfelementInVisitChildNodesList.equals(taxon_nameString)) { // if it is not duplicated, add it
												isDuplicatedElement = true;
											
											}
										}
										if ( isDuplicatedElement == false ) {
											elementInVisitChildNodesList.addContent(0, taxon_name);
											System.out.println("Add::" + taxon_nameString + "at rank::" + rankString);
										}
										
									}
									
									
								}
							}
							
							
							
						}
						
						

					}

				}
				treatment.addContent(elementInVisitChildNodesList);


			}

			
			

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			
			
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			// xmlOutput.output(doc,
			//		new FileWriter(inputXmlFileName.split("\\.")[0] + "-1"
			//				+ inputXmlFileName.split("\\.")[1]));
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");
			
			
			

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}

	}	
	
	
	
	public static void iterateAllElements(String inputXmlFileName,
			Set<String> allSchemaAttributeName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		System.out.println("inputXmlFileName::" + inputXmlFileName);

		// System.out.println(targetFolderName + "/" + inputXmlFileName);

		// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
		// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
		// </bio:treatment>

		Namespace namespace = Namespace.getNamespace("bio",
				"http://www.github.com/biosemantics");
		Element treatment = new Element("treatment", namespace);

		Namespace XSI = Namespace.getNamespace("xsi",
				"http://www.w3.org/2001/XMLSchema-instance");
		treatment.addNamespaceDeclaration(XSI);
		treatment
				.setAttribute(
						"schemaLocation",
						"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
						XSI);

		Document doc = new Document(treatment);

		InputStream inputStream = new FileInputStream(inputXmlFileName);

		SAXBuilder saxBuilder = new SAXBuilder();

		Document xmlDocument = (Document) saxBuilder
				.build(new InputStreamReader(inputStream, "UTF8"));

		Element rootNode = xmlDocument.getRootElement();
		System.out.println("rootNodeName::" + rootNode.getName());

		List<Element> rootChildren = rootNode.getChildren();

		List<Element> rootChildrenList = visitChildNodes(rootChildren,
				allSchemaAttributeName);

		for (Element elementInRootChildrenList : rootChildrenList) {
			System.out.println("elementInRootChildrenList.getName()::"
					+ elementInRootChildrenList.getName());
			doc.getRootElement().addContent(elementInRootChildrenList);
		}

		// new XMLOutputter().output(doc, System.out);
		XMLOutputter xmlOutput = new XMLOutputter();

		// display nice nice
		xmlOutput.setFormat(Format.getPrettyFormat());
		xmlOutput.output(doc, new FileWriter(inputXmlFileName));

		System.out.println("new_inputXmlFileName Saved!");

	}

	public static Set<String> extractAllSchemaAttributeName(
			String inputXmlFileName) throws UnsupportedEncodingException,
			JDOMException, IOException {
		System.out.println("inputXmlFileName::" + inputXmlFileName);

		InputStream inputStream = new FileInputStream(inputXmlFileName);

		SAXBuilder saxBuilder = new SAXBuilder();

		Document xmlDocument = (Document) saxBuilder
				.build(new InputStreamReader(inputStream, "UTF8"));

		Element rootNode = xmlDocument.getRootElement();
		System.out.println("rootNodeName::" + rootNode.getName());

		List<Element> rootChildren = rootNode.getChildren();

		/*
		 * List<Element> rootChildrenList = visitChildNodes2(rootChildren);
		 * 
		 * Set<String> schemaElementNameSet = new HashSet<String>();
		 * 
		 * for (Element elementInRootChildrenList : rootChildrenList) {
		 * schemaElementNameSet.add(elementInRootChildrenList.getName());
		 * schemaElementNameSet
		 * .add(elementInRootChildrenList.getAttributeValue("name")); }
		 */

		Set<String> allSchemaAttributeNameSetString = visitChildNodes2(rootChildren);
		// String[] allSchemaAttributeNameSetStringArray =
		// allSchemaAttributeNameSetString.toArray(new String[0]);
		// System.out.println("Arrays.toString(allSchemaAttributeNameSetStringArray)::"
		// + Arrays.toString(allSchemaAttributeNameSetStringArray));

		return allSchemaAttributeNameSetString;

	}

	// extractAllUnvalidatedTerms
	public static Set<String> extractAllUnvalidatedTerms(
			String inputXmlFileName, Set<String> allSchemaAttributeName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		// System.out.println("inputXmlFileName::" + inputXmlFileName);

		InputStream inputStream = new FileInputStream(inputXmlFileName);

		SAXBuilder saxBuilder = new SAXBuilder();

		Document xmlDocument = (Document) saxBuilder
				.build(new InputStreamReader(inputStream, "UTF8"));

		Element rootNode = xmlDocument.getRootElement();

		// System.out.println("rootNodeName::" + rootNode.getName());

		List<Element> rootChildren = rootNode.getChildren();

		/*
		 * List<Element> rootChildrenList = visitChildNodes2(rootChildren);
		 * 
		 * Set<String> schemaElementNameSet = new HashSet<String>();
		 * 
		 * for (Element elementInRootChildrenList : rootChildrenList) {
		 * schemaElementNameSet.add(elementInRootChildrenList.getName());
		 * schemaElementNameSet
		 * .add(elementInRootChildrenList.getAttributeValue("name")); }
		 */

		Set<String> allSchemaAttributeNameSetString = visitAllUnvalidatedTerms(
				rootChildren, allSchemaAttributeName);
		// String[] allSchemaAttributeNameSetStringArray =
		// allSchemaAttributeNameSetString.toArray(new String[0]);
		// System.out.println("Arrays.toString(allSchemaAttributeNameSetStringArray)::"
		// + Arrays.toString(allSchemaAttributeNameSetStringArray));

		return allSchemaAttributeNameSetString;

	}

	// extractAllUnvalidatedTerms
	public static Set<String> extractAllRootElements(String inputXmlFileName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		// System.out.println("inputXmlFileName::" + inputXmlFileName);

		InputStream inputStream = new FileInputStream(inputXmlFileName);

		SAXBuilder saxBuilder = new SAXBuilder();

		Document xmlDocument = (Document) saxBuilder
				.build(new InputStreamReader(inputStream, "UTF8"));

		Element rootNode = xmlDocument.getRootElement();

		// System.out.println("rootNodeName::" + rootNode.getName());

		List<Element> childrenOfRoot = rootNode.getChildren();

		Set<String> allRootElementsSetString = new HashSet<String>();
		for (Element elementOfChildrenOfRoot : childrenOfRoot) {
			String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getName();
			allRootElementsSetString.add(nameOfElementOfChildrenOfRoot);
		}

		return allRootElementsSetString;

	}

	// extractTaxonFamilyName
	public static String extractTaxonFamilyName(String inputXmlFileName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		// System.out.println("inputXmlFileName::" + inputXmlFileName);

		InputStream inputStream = new FileInputStream(inputXmlFileName);

		SAXBuilder saxBuilder = new SAXBuilder();

		Document xmlDocument = (Document) saxBuilder
				.build(new InputStreamReader(inputStream, "UTF8"));

		Element rootNode = xmlDocument.getRootElement();

		// System.out.println("rootNodeName::" + rootNode.getName());

		List<Element> childrenOfRoot = rootNode.getChildren();

		String returnFamilyName = "empty";

		for (Element elementOfChildrenOfRoot : childrenOfRoot) {
			String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getName();
			String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getText();
			// System.out.println(nameOfElementOfChildrenOfRoot);

			String valueOfAttritueOfstatusOftaxon_identification = elementOfChildrenOfRoot
					.getAttributeValue("status");

			if (nameOfElementOfChildrenOfRoot.equals("taxon_identification")
					&& valueOfAttritueOfstatusOftaxon_identification
							.equals("ACCEPTED")) {
				List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getChildren();
				for (Element elementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfRoot) {
					String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getName();
					String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getText();

					if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
							.equals("taxon_name")) {

						String valueOfAttritueOfRankOfTaxon_name = elementOfChildrenOfElementOfChildrenOfRoot
								.getAttributeValue("rank");
						if (valueOfAttritueOfRankOfTaxon_name.equals("family")) {
							// System.out.println("family is :" +
							// textOfElementOfChildrenOfElementOfChildrenOfRoot);
							returnFamilyName = textOfElementOfChildrenOfElementOfChildrenOfRoot;
						}
						// else {
						// System.out.println("There is no family name.");
						// }

					}
				}
			}

		}

		return returnFamilyName;

	}

	// extractTaxonTribeName
	public static String extractTaxonTribeName(String inputXmlFileName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		// System.out.println("inputXmlFileName::" + inputXmlFileName);

		InputStream inputStream = new FileInputStream(inputXmlFileName);

		SAXBuilder saxBuilder = new SAXBuilder();

		Document xmlDocument = (Document) saxBuilder
				.build(new InputStreamReader(inputStream, "UTF8"));

		Element rootNode = xmlDocument.getRootElement();

		// System.out.println("rootNodeName::" + rootNode.getName());

		List<Element> childrenOfRoot = rootNode.getChildren();

		String returnTribeName = "empty";

		for (Element elementOfChildrenOfRoot : childrenOfRoot) {
			String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getName();
			String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getText();
			// System.out.println(nameOfElementOfChildrenOfRoot);

			String valueOfAttritueOfstatusOftaxon_identification = elementOfChildrenOfRoot
					.getAttributeValue("status");

			if (nameOfElementOfChildrenOfRoot.equals("taxon_identification")
					&& valueOfAttritueOfstatusOftaxon_identification
							.equals("ACCEPTED")) {
				List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getChildren();
				for (Element elementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfRoot) {
					String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getName();
					String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getText();

					if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
							.equals("taxon_name")) {

						String valueOfAttritueOfRankOfTaxon_name = elementOfChildrenOfElementOfChildrenOfRoot
								.getAttributeValue("rank");
						if (valueOfAttritueOfRankOfTaxon_name.equals("tribe")) {
							// System.out.println("tribe is :" +
							// textOfElementOfChildrenOfElementOfChildrenOfRoot);
							returnTribeName = textOfElementOfChildrenOfElementOfChildrenOfRoot;
						}
						// else {
						// System.out.println("There is no family name.");
						// }

					}
				}
			}

		}

		return returnTribeName;

	}

	// extractTaxonGenusName
	public static String extractTaxonGenusName(String inputXmlFileName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		// System.out.println("inputXmlFileName::" + inputXmlFileName);

		InputStream inputStream = new FileInputStream(inputXmlFileName);

		SAXBuilder saxBuilder = new SAXBuilder();

		Document xmlDocument = (Document) saxBuilder
				.build(new InputStreamReader(inputStream, "UTF8"));

		Element rootNode = xmlDocument.getRootElement();

		// System.out.println("rootNodeName::" + rootNode.getName());

		List<Element> childrenOfRoot = rootNode.getChildren();

		String returnGenusName = "empty";

		for (Element elementOfChildrenOfRoot : childrenOfRoot) {
			String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getName();
			String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getText();
			// System.out.println(nameOfElementOfChildrenOfRoot);

			String valueOfAttritueOfstatusOftaxon_identification = elementOfChildrenOfRoot
					.getAttributeValue("status");

			if (nameOfElementOfChildrenOfRoot.equals("taxon_identification")
					&& valueOfAttritueOfstatusOftaxon_identification
							.equals("ACCEPTED")) {
				List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getChildren();
				for (Element elementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfRoot) {
					String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getName();
					String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getText();

					if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
							.equals("taxon_name")) {

						String valueOfAttritueOfRankOfTaxon_name = elementOfChildrenOfElementOfChildrenOfRoot
								.getAttributeValue("rank");
						if (valueOfAttritueOfRankOfTaxon_name.equals("genus")) {
							// System.out.println("genus is :" +
							// textOfElementOfChildrenOfElementOfChildrenOfRoot);
							returnGenusName = textOfElementOfChildrenOfElementOfChildrenOfRoot;
						}
						// else {
						// System.out.println("There is no genus name.");
						// }

					}
				}
			}

		}

		return returnGenusName;

	}

	// extract TaxonHierarchy
	public static String extractTaxonHierarchyName(String inputXmlFileName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		// System.out.println("inputXmlFileName::" + inputXmlFileName);

		InputStream inputStream = new FileInputStream(inputXmlFileName);

		SAXBuilder saxBuilder = new SAXBuilder();

		Document xmlDocument = (Document) saxBuilder
				.build(new InputStreamReader(inputStream, "UTF8"));

		Element rootNode = xmlDocument.getRootElement();

		// System.out.println("rootNodeName::" + rootNode.getName());

		List<Element> childrenOfRoot = rootNode.getChildren();

		String returnGenusName = "empty";

		for (Element elementOfChildrenOfRoot : childrenOfRoot) {
			String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getName();
			String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getText();
			// System.out.println(nameOfElementOfChildrenOfRoot);

			if (nameOfElementOfChildrenOfRoot.equals("taxon_hierarchy")) {
				List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getChildren();

				System.out.println("TaxonHierarchy::inputXmlFileName::"
						+ inputXmlFileName);
				/*
				 * for (Element elementOfChildrenOfElementOfChildrenOfRoot :
				 * childrenOfElementOfChildrenOfRoot) { String
				 * nameOfElementOfChildrenOfElementOfChildrenOfRoot =
				 * elementOfChildrenOfElementOfChildrenOfRoot .getName(); String
				 * textOfElementOfChildrenOfElementOfChildrenOfRoot =
				 * elementOfChildrenOfElementOfChildrenOfRoot .getText();
				 * 
				 * if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
				 * .equals("taxon_name")) {
				 * 
				 * String valueOfAttritueOfRankOfTaxon_name =
				 * elementOfChildrenOfElementOfChildrenOfRoot
				 * .getAttributeValue("rank"); if
				 * (valueOfAttritueOfRankOfTaxon_name.equals("genus")) { //
				 * System.out.println("genus is :" + //
				 * textOfElementOfChildrenOfElementOfChildrenOfRoot);
				 * returnGenusName =
				 * textOfElementOfChildrenOfElementOfChildrenOfRoot; } // else {
				 * // System.out.println("There is no genus name."); // }
				 * 
				 * } }
				 */
			}

		}

		return returnGenusName;

	}
	
	
	// extractTaxonIdentification
	public static String extractTaxonIdentification(String inputXmlFileName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		// System.out.println("inputXmlFileName::" + inputXmlFileName);

		InputStream inputStream = new FileInputStream(inputXmlFileName);

		SAXBuilder saxBuilder = new SAXBuilder();

		Document xmlDocument = (Document) saxBuilder
				.build(new InputStreamReader(inputStream, "UTF8"));

		Element rootNode = xmlDocument.getRootElement();

		// System.out.println("rootNodeName::" + rootNode.getName());

		List<Element> childrenOfRoot = rootNode.getChildren();

		String returnTaxonIdentification = "";

		for (Element elementOfChildrenOfRoot : childrenOfRoot) {
			String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getName();
			String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getText();
			// System.out.println(nameOfElementOfChildrenOfRoot);

			String valueOfAttritueOfstatusOftaxon_identification = elementOfChildrenOfRoot
					.getAttributeValue("status");
			
			if (nameOfElementOfChildrenOfRoot.equals("taxon_identification")
					&& valueOfAttritueOfstatusOftaxon_identification
							.equals("ACCEPTED")) {
				List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getChildren();			


				for (Element elementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfRoot) {
					String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getName();
					String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getText();

					if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
							.equals("taxon_name")) {

						String valueOfAttritueOfRankOfTaxon_name = elementOfChildrenOfElementOfChildrenOfRoot
								.getAttributeValue("rank");

						returnTaxonIdentification += valueOfAttritueOfRankOfTaxon_name
								+ "::"
								+ textOfElementOfChildrenOfElementOfChildrenOfRoot
								+ ";";

					}
				}				

			}

		}
		
		if ( returnTaxonIdentification.equals("") ) {
			returnTaxonIdentification = "empty";
		}

		return returnTaxonIdentification;

	}
	
	

	// extractFamilyRankWithKeyDesc
	public static String extractFamilyRankWithKeyDesc(String inputXmlFileName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		// System.out.println("inputXmlFileName::" + inputXmlFileName);

		InputStream inputStream = new FileInputStream(inputXmlFileName);

		SAXBuilder saxBuilder = new SAXBuilder();

		Document xmlDocument = (Document) saxBuilder
				.build(new InputStreamReader(inputStream, "UTF8"));

		Element rootNode = xmlDocument.getRootElement();

		// System.out.println("rootNodeName::" + rootNode.getName());

		List<Element> childrenOfRoot = rootNode.getChildren();

		String returnFamilyRankWithKeyDesc = "empty";

		boolean isContainingKey = false;

		for (Element elementOfChildrenOfRoot : childrenOfRoot) {
			String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getName();
			String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getText();
			// System.out.println(nameOfElementOfChildrenOfRoot);

			String valueOfAttritueOfstatusOftaxon_identification = elementOfChildrenOfRoot
					.getAttributeValue("status");

			if (nameOfElementOfChildrenOfRoot.equals("taxon_identification")
					&& valueOfAttritueOfstatusOftaxon_identification
							.equals("ACCEPTED")) {
				List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getChildren();

				boolean isContainingFamilyRank = false;

				for (Element elementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfRoot) {
					String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getName();
					String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getText();

					if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
							.equals("taxon_name")) {

						String valueOfAttritueOfRankOfTaxon_name = elementOfChildrenOfElementOfChildrenOfRoot
								.getAttributeValue("rank");
						if (valueOfAttritueOfRankOfTaxon_name.equals("family")) {
							// System.out.println("family is :" +
							// textOfElementOfChildrenOfElementOfChildrenOfRoot);
							// returnFamilyRankWithKeyDesc =
							// textOfElementOfChildrenOfElementOfChildrenOfRoot;

							isContainingFamilyRank = true;

						}

						// else {
						// System.out.println("There is no family name.");
						// }

					}
				}

				if (isContainingFamilyRank == true) {

					returnFamilyRankWithKeyDesc = "";

					for (Element elementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfRoot) {
						String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getName();
						String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getText();

						if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
								.equals("taxon_name")) {

							String valueOfAttritueOfRankOfTaxon_name = elementOfChildrenOfElementOfChildrenOfRoot
									.getAttributeValue("rank");

							returnFamilyRankWithKeyDesc += valueOfAttritueOfRankOfTaxon_name
									+ "::"
									+ textOfElementOfChildrenOfElementOfChildrenOfRoot
									+ ";";

						}
					}

				}

			}

			if (nameOfElementOfChildrenOfRoot.equals("key")) {
				List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getChildren();
				for (Element elementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfRoot) {
					String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getName();
					String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getText();

					if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
							.equals("key_statement")) {

						// System.out.println("key_statement");

						List<Element> childrenOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getChildren();
						for (Element elementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfElementOfChildrenOfRoot) {
							String nameOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot
									.getName();
							String textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot
									.getText();

							if (nameOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot
									.equals("determination")) {

								// System.out.println("determination");
								// System.out.println("textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot:"
								// +
								// textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot);

								if (!returnFamilyRankWithKeyDesc
										.equals("empty")) {

									isContainingKey = true;

									returnFamilyRankWithKeyDesc += textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot
											+ ";";
									// System.out.println("key determination is :"
									// +
									// textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot);
								}
							}
						}
					}
				}
			}

		}

		
		
		
		/*
		 * for (Element elementOfChildrenOfRoot : childrenOfRoot) { String
		 * nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot .getName();
		 * String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
		 * .getText(); // System.out.println(nameOfElementOfChildrenOfRoot); if
		 * (isContainingKey == false) { if
		 * (nameOfElementOfChildrenOfRoot.equals("discussion")) {
		 * 
		 * if (!returnFamilyRankWithKeyDesc.equals("empty")) {
		 * 
		 * returnFamilyRankWithKeyDesc += textOfElementOfChildrenOfRoot + ";";
		 * // System.out.println("textOfElementOfChildrenOfRoot:" +
		 * textOfElementOfChildrenOfRoot); } }
		 * 
		 * }
		 * 
		 * 
		 * }
		 */

		return returnFamilyRankWithKeyDesc;

	}

	// extract number
	public static String extractNumber(String inputXmlFileName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		// System.out.println("inputXmlFileName::" + inputXmlFileName);

		InputStream inputStream = new FileInputStream(inputXmlFileName);

		SAXBuilder saxBuilder = new SAXBuilder();

		Document xmlDocument = (Document) saxBuilder
				.build(new InputStreamReader(inputStream, "UTF8"));

		Element rootNode = xmlDocument.getRootElement();

		// System.out.println("rootNodeName::" + rootNode.getName());

		List<Element> childrenOfRoot = rootNode.getChildren();

		String returnGenusName = "empty";

		for (Element elementOfChildrenOfRoot : childrenOfRoot) {
			String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getName();
			String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getText();
			// System.out.println(nameOfElementOfChildrenOfRoot);

			if (nameOfElementOfChildrenOfRoot.equals("number")) {
				List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getChildren();

				System.out.println("Number::" + textOfElementOfChildrenOfRoot
						+ "inputXmlFileName::" + inputXmlFileName);
				/*
				 * for (Element elementOfChildrenOfElementOfChildrenOfRoot :
				 * childrenOfElementOfChildrenOfRoot) { String
				 * nameOfElementOfChildrenOfElementOfChildrenOfRoot =
				 * elementOfChildrenOfElementOfChildrenOfRoot .getName(); String
				 * textOfElementOfChildrenOfElementOfChildrenOfRoot =
				 * elementOfChildrenOfElementOfChildrenOfRoot .getText();
				 * 
				 * if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
				 * .equals("taxon_name")) {
				 * 
				 * String valueOfAttritueOfRankOfTaxon_name =
				 * elementOfChildrenOfElementOfChildrenOfRoot
				 * .getAttributeValue("rank"); if
				 * (valueOfAttritueOfRankOfTaxon_name.equals("genus")) { //
				 * System.out.println("genus is :" + //
				 * textOfElementOfChildrenOfElementOfChildrenOfRoot);
				 * returnGenusName =
				 * textOfElementOfChildrenOfElementOfChildrenOfRoot; } // else {
				 * // System.out.println("There is no genus name."); // }
				 * 
				 * } }
				 */
			}

		}

		return returnGenusName;

	}

	
	
	/*
	<key>
    	<key_statement>
      		<statement_id>1.</statement_id>
      		<statement>Ray florets 8–9 (disc corolla tubes glabrous; s California)9j . Eriophyllum lanatum var . hallii</statement>
      		<next_statement_id>1.</next_statement_id>
    	</key_statement>
	</key>
	=>
	=>
	<key>
    	<key_statement>
      		<statement_id>1.</statement_id>
      		<statement>Ray florets 8–9 (disc corolla tubes glabrous; s California)</statement>
      		<determination>9j . Eriophyllum lanatum var . hallii</determination>
    	</key_statement>
	</key>	
	*/
	
	
	
	// correctKeyStatement
	public static void correctKeyStatement(String inputXmlFileName, Set<String> allSchemaAttributeName)
			throws UnsupportedEncodingException, JDOMException, IOException {


		SAXBuilder saxBuilder = new SAXBuilder();

		try {

			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String textOfRootElement = xmlDocument.getRootElement().getText();
			// System.out.println("textOfRootElement::" + textOfRootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();
			// for loop recursively read List<Element> childrenOfRoot and gather
			// required information

			List<Element> visitChildNodesList = visitChildNodes(
					rootNode.getChildren(), allSchemaAttributeName);

			for (Element elementInVisitChildNodesList : visitChildNodesList) {
				String nameOfElementInVisitChildNodesList = elementInVisitChildNodesList
						.getName();

				if (nameOfElementInVisitChildNodesList
						.equals("key")) {
					List<Element> childrenOfElementInVisitChildNodesList = elementInVisitChildNodesList
							.getChildren();
					for (Element elementOfChildrenOfElementInVisitChildNodesList : childrenOfElementInVisitChildNodesList) {
						
						String nameOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementInVisitChildNodesList
								.getName();
						String textOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementInVisitChildNodesList
								.getText();

						
						
						if (nameOfElementOfChildrenOfElementInVisitChildNodesList
								.equals("key_statement")) {
							//
							List<Element> childrenOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementInVisitChildNodesList
									.getChildren();
							
							String statement_id = "";
							String statement = "";
							String next_statement_id = "";
							String determinationString = "";
							
							
							for (Element elementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList : childrenOfElementOfChildrenOfElementInVisitChildNodesList) {
								
								String nameOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList
										.getName();
								String textOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList
										.getText();
								if (nameOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList.equals("statement_id")) {
									statement_id = textOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList;
								}
								
								if (nameOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList.equals("statement")) {
									statement = textOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList;
								}
								
								if (nameOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList.equals("next_statement_id")) {
									next_statement_id = textOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList;
								}
								
								if (nameOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList.equals("determination")) {
									determinationString = textOfElementOfChildrenOfElementOfChildrenOfElementInVisitChildNodesList;
								}
							}

							// still miss situation 2 and situation 3
							// condition 2
							//
						    //	<key_statement>
						    //		<statement_id>9.</statement_id>
						    //		<description type="morphology">Peduncles mostly 5–15(–20) cm; cypselae (3.4–)3.5–5 mm; Idaho, Montana, ne Oregon, e Washington9h . Eriophyllum lanatum var. lanatum (in part)</description>
						    //		<next_statement_id>8.</next_statement_id>
						    //	</key_statement>
						    
						    // condition 3
						    //	<key_statement>
						    //		<statement_id>11.</statement_id>
						    //		<description type="morphology">Involucres 12–15 mm diam.; ray laminae 7–10(–15) mm; n California,s Oregon9e . Eriophyllum lanatum var. lanceolatum</description>
							//	</key_statement>
							
							
							
							boolean isCondition2 = false; // next_statement_id_without_dot_int < statement_id_without_dot_int
							boolean isCondition3 = false; // 

							
							if ( !statement_id.equals("") && !next_statement_id.equals("") ) {
								String statement_id_without_dot = statement_id.replace(".", "");
								String next_statement_id_without_dot = next_statement_id.replace(".", "");
								int statement_id_without_dot_int = Integer.parseInt(statement_id_without_dot);
								int next_statement_id_without_dot_int = Integer.parseInt( next_statement_id_without_dot);
								
								
								System.out.println("statement_id_without_dot::" + statement_id_without_dot );
								System.out.println("next_statement_id_without_dot::" + next_statement_id_without_dot);
								if ( next_statement_id_without_dot_int < statement_id_without_dot_int ) {
									isCondition2 = true;
								}																
							}
														
							
							if ( next_statement_id.equals("") && determinationString.equals("") ) {
								System.out.println("next_statement_id::" + next_statement_id);
								System.out.println("determinationString::" + determinationString);
								isCondition3 = true;
							}
							
							System.out.println("isCondition2::" + isCondition2);
							System.out.println("isCondition3::" + isCondition3);

							
							
							
							//	<key>
							//		<key_statement>
							//			<statement_id>1.</statement_id>
							//			<statement>Ray florets 8–9 (disc corolla tubes glabrous; s California)</statement>
							//			<determination>9j . Eriophyllum lanatum var . hallii</determination>
							//		</key_statement>
							//	</key>
							
							// => 
							
							//	<key>
						    //		<key_statement>
						    //			<statement_id>1.</statement_id>
						    //			<description type="morphology">Ray florets 8–9 (disc corolla tubes glabrous; s California)</description>
						    //			<determination>9j . Eriophyllum lanatum var . hallii</determination>
						    //		</key_statement>
							//	</key>
						  
							
							

							
							if ( statement_id.equals(next_statement_id) || isCondition2 == true || isCondition3 == true ) {
							// if ( statement_id.equals(next_statement_id) ) {

								
								// still miss situation 2 and situation 3
								// condition 2
								//
							    //	<key_statement>
							    //		<statement_id>9.</statement_id>
							    //		<description type="morphology">Peduncles mostly 5–15(–20) cm; cypselae (3.4–)3.5–5 mm; Idaho, Montana, ne Oregon, e Washington9h . Eriophyllum lanatum var. lanatum (in part)</description>
							    //		<next_statement_id>8.</next_statement_id>
							    //	</key_statement>
							    
							    // condition 3
							    //	<key_statement>
							    //		<statement_id>11.</statement_id>
							    //		<description type="morphology">Involucres 12–15 mm diam.; ray laminae 7–10(–15) mm; n California,s Oregon9e . Eriophyllum lanatum var. lanceolatum</description>
								//	</key_statement>
								
								
								System.out.println("statement_id.equals(next_statement_id)");
								System.out.println("statement_id::" + statement_id);
								System.out.println("next_statement_id::" + next_statement_id);
								System.out.println("statement::" + statement);
								
								int startIndex = 0;
															
								Pattern pattern = Pattern.compile("\\d+\\w\\s\\.");
							    Matcher matcher = pattern.matcher(statement);
							    while (matcher.find()) {
							      
							    	startIndex = matcher.start();
							    	
							    	System.out.println("Start index: " + matcher.start());
							    	System.out.println(" End index: " + matcher.end() + " ");
							    	System.out.println(matcher.group());
							    }
							    
							    // http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
							    // http://docs.oracle.com/javase/tutorial/essential/regex/bounds.html
							    
							    System.out.println("determination::" + statement.substring(startIndex));
							    
							    
							    // http://www.mkyong.com/java/how-to-modify-xml-file-in-java-jdom/
							    
							    /*
								// add new age element
								Element age = new Element("age").setText("28");
								staff.addContent(age);
 
								// update salary value
								staff.getChild("salary").setText("7000");
 
								// remove firstname element
								staff.removeChild("firstname");
							    
							    */
							    
							    // update text of element "statement"
							    elementOfChildrenOfElementInVisitChildNodesList.getChild("statement").setText(statement.substring(0, startIndex));


							    // update element "statement" to "description" with attritube name "type" and value "morphology"
							    elementOfChildrenOfElementInVisitChildNodesList.getChild("statement").setAttribute("type", "morphology");
							    elementOfChildrenOfElementInVisitChildNodesList.getChild("statement").setName("description");
							    

							    
								// delete element statement
								// elementOfChildrenOfElementInVisitChildNodesList.removeChild("statement");
								// add element description with attritube name "type" and value "morphology"
							    // Element description = new Element("description").setText(statement.substring(0, startIndex));
							    // description.setAttribute("type", "morphology");
							    // elementOfChildrenOfElementInVisitChildNodesList.addContent(description);
							    
							    // delete next_statement_id
							    elementOfChildrenOfElementInVisitChildNodesList.removeChild("next_statement_id");
							    // add determination
							    Element determination = new Element("determination").setText(statement.substring(startIndex));
							    elementOfChildrenOfElementInVisitChildNodesList.addContent(determination);
							    
							    
							    
							    							    
								
							} else {
								// update element "statement" to "description" with attritube name "type" and value "morphology"
							    elementOfChildrenOfElementInVisitChildNodesList.getChild("statement").setAttribute("type", "morphology");
							    elementOfChildrenOfElementInVisitChildNodesList.getChild("statement").setName("description");
							    
								// delete element statement
								// elementOfChildrenOfElementInVisitChildNodesList.removeChild("statement");
								// add element description with attritube name "type" and value "morphology"
							    // Element description = new Element("description").setText(statement);
							    // description.setAttribute("type", "morphology");
							    // elementOfChildrenOfElementInVisitChildNodesList.addContent(description);
								
							}
						
						}
						


					}

				}

				treatment.addContent(elementInVisitChildNodesList);
			}

			/*
			 * for (Element elementOfChildrenOfRoot : childrenOfRoot) { String
			 * nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
			 * .getName();
			 * 
			 * Element newElementOfChildrenOfRoot = new
			 * Element(nameOfElementOfChildrenOfRoot);
			 * 
			 * List<Element> visitChildNodesList = visitChildNodes(
			 * elementOfChildrenOfRoot.getChildren(), allSchemaAttributeName);
			 * for (Element elementInVisitChildNodesList : visitChildNodesList)
			 * {
			 * newElementOfChildrenOfRoot.addContent(elementInVisitChildNodesList
			 * );
			 * 
			 * }
			 * 
			 * doc.getRootElement().addContent(newElementOfChildrenOfRoot);
			 * 
			 * }
			 */

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			
			// xmlOutput.output(doc,
			//		new FileWriter(inputXmlFileName.split("\\.")[0] + "-1"
			// 				+ inputXmlFileName.split("\\.")[1]));
			
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}		
		
		
		
		/*
		System.out.println("inputXmlFileName::" + inputXmlFileName);

		InputStream inputStream = new FileInputStream(inputXmlFileName);

		SAXBuilder saxBuilder = new SAXBuilder();

		Document xmlDocument = (Document) saxBuilder
				.build(new InputStreamReader(inputStream, "UTF8"));

		Element rootNode = xmlDocument.getRootElement();

		System.out.println("rootNodeName::" + rootNode.getName());

		List<Element> childrenOfRoot = rootNode.getChildren();

		for (Element elementOfChildrenOfRoot : childrenOfRoot) {
			String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getName();
			String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getText();
			// System.out.println(nameOfElementOfChildrenOfRoot);

			if ( nameOfElementOfChildrenOfRoot.equals("key") ) {
				List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getChildren();
				for (Element elementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfRoot) {
					String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getName();
					String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getText();

					if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
							.equals("key_statement")) {
						List<Element> childrenOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getChildren();
						
						String statement_id = "";
						String statement = "";
						String next_statement_id = "";
						
						
						for (Element elementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfElementOfChildrenOfRoot) {
							
							String nameOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot
									.getName();
							String textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot
									.getText();
							if (nameOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot.equals("statement_id")) {
								statement_id = textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot;
							}
							
							if (nameOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot.equals("statement")) {
								statement = textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot;
							}
							
							if (nameOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot.equals("next_statement_id")) {
								next_statement_id = textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot;
							}
						}
						
						if ( statement_id.equals(next_statement_id) ) {
							
							System.out.println("statement_id.equals(next_statement_id)");
							System.out.println("statement_id::" + statement_id);
							System.out.println("next_statement_id::" + next_statement_id);
							System.out.println("statement::" + statement);
							
							int startIndex = 0;
														
							Pattern pattern = Pattern.compile("\\d\\w\\s\\.");
						    Matcher matcher = pattern.matcher(statement);
						    while (matcher.find()) {
						      
						    	startIndex = matcher.start();
						    	
						    	System.out.println("Start index: " + matcher.start());
						      System.out.println(" End index: " + matcher.end() + " ");
						      System.out.println(matcher.group());
						    }
						    
						    // http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
						    // http://docs.oracle.com/javase/tutorial/essential/regex/bounds.html
						    
						    System.out.println("determination::" + statement.substring(startIndex));
						    
						    
						    
						    
							
						}

					}
				}
			}
			
		}
		*/
	}	
		
	
	
	// checkAndAddTaxonHierarchy
	public static void checkAndAddTaxonHierarchy(String inputXmlFileName, Set<String> allSchemaAttributeName)
			throws UnsupportedEncodingException, JDOMException, IOException {


		SAXBuilder saxBuilder = new SAXBuilder();

		try {

			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String textOfRootElement = xmlDocument.getRootElement().getText();
			// System.out.println("textOfRootElement::" + textOfRootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();
			// for loop recursively read List<Element> childrenOfRoot and gather
			// required information

			List<Element> visitChildNodesList = visitChildNodes(
					rootNode.getChildren(), allSchemaAttributeName);

			/*
			  <taxon_identification status="ACCEPTED">
			    <taxon_name rank="family">asteraceae</taxon_name>
			    <taxon_name rank="tribe">cynareae</taxon_name>
			    <taxon_name rank="genus">Cirsium</taxon_name>
			    <taxon_name rank="species" authority="(A. Gray) Petrak">parryi</taxon_name>
			    <place_of_publication>
			      <publication_title>Bot. Tidsskr.</publication_title>
			      <place_in_publication>31: 68. 1911</place_in_publication>
			    </place_of_publication>
			    <taxon_hierarchy>family Asteraceae;tribe Cynareae;genus Cirsium;species parryi;</taxon_hierarchy>
			  </taxon_identification>			


			*/
			
			
			for (Element elementInVisitChildNodesList : visitChildNodesList) {
				String nameOfElementInVisitChildNodesList = elementInVisitChildNodesList
						.getName();
				String valueOfAttritueOfstatusOftaxon_identification = elementInVisitChildNodesList
						.getAttributeValue("status");

				if (nameOfElementInVisitChildNodesList
						.equals("taxon_identification")
						&& valueOfAttritueOfstatusOftaxon_identification
						.equals("ACCEPTED")) {
					List<Element> childrenOfElementInVisitChildNodesList = elementInVisitChildNodesList
							.getChildren();
					
					// Step 1: check if it contains element "taxon_hierarchy" or not
					boolean isContainingTaxonHierarchy = false;
					for (Element elementOfChildrenOfElementInVisitChildNodesList : childrenOfElementInVisitChildNodesList) {
						
						String nameOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementInVisitChildNodesList
								.getName();
						String textOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementInVisitChildNodesList
								.getText();
						
						if (nameOfElementOfChildrenOfElementInVisitChildNodesList
								.equals("taxon_hierarchy")) {
							isContainingTaxonHierarchy = true;
						}
					}
					
					
					String taxon_hierarchy_text = "";

					for (Element elementOfChildrenOfElementInVisitChildNodesList : childrenOfElementInVisitChildNodesList) {
						
						String nameOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementInVisitChildNodesList
								.getName();
						String textOfElementOfChildrenOfElementInVisitChildNodesList = elementOfChildrenOfElementInVisitChildNodesList
								.getText();
						
						
						if (nameOfElementOfChildrenOfElementInVisitChildNodesList
								.equals("taxon_name")) {
							String valueOfAttritueOfstatusOftaxon_name = elementOfChildrenOfElementInVisitChildNodesList
									.getAttributeValue("rank");
							
							taxon_hierarchy_text += valueOfAttritueOfstatusOftaxon_name + " " + textOfElementOfChildrenOfElementInVisitChildNodesList + ";";
							
							
						}
					}					
					
					if ( isContainingTaxonHierarchy == false ) {
						
						
						
						// add element "taxon_hierarchy" under element "taxon_identification"
					    Element taxon_hierarchy = new Element("taxon_hierarchy").setText(taxon_hierarchy_text);
					    
					    elementInVisitChildNodesList.addContent(taxon_hierarchy);
						
					} else {
						// update element "taxon_hierarchy"
						elementInVisitChildNodesList.getChild("taxon_hierarchy").setText(taxon_hierarchy_text);
					    
						
					}

				} 

				treatment.addContent(elementInVisitChildNodesList);
			}

			/*
			 * for (Element elementOfChildrenOfRoot : childrenOfRoot) { String
			 * nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
			 * .getName();
			 * 
			 * Element newElementOfChildrenOfRoot = new
			 * Element(nameOfElementOfChildrenOfRoot);
			 * 
			 * List<Element> visitChildNodesList = visitChildNodes(
			 * elementOfChildrenOfRoot.getChildren(), allSchemaAttributeName);
			 * for (Element elementInVisitChildNodesList : visitChildNodesList)
			 * {
			 * newElementOfChildrenOfRoot.addContent(elementInVisitChildNodesList
			 * );
			 * 
			 * }
			 * 
			 * doc.getRootElement().addContent(newElementOfChildrenOfRoot);
			 * 
			 * }
			 */

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			
			// xmlOutput.output(doc,
			//		new FileWriter(inputXmlFileName.split("\\.")[0] + "-1"
			// 				+ inputXmlFileName.split("\\.")[1]));
			
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}		
		

	}
	
	// changeKey_Key_DisscussionToDiscussion
	// From
	//	<key>
    //		<key_head>Key to Groups of Erigeron Species</key_head>
    // 		<key_discussion>Artificial distinctions are used in the key to groups of species recognized by leafy runners, pinnately lobed or dissected leaves, discoid or disciform heads, and yellow rays. Otherwise, species tend to be identified within natural groups. Couplets that use basal parts for distinction or inference of duration may be difficult if collections lack diagnostic basal parts or if the nature of the basal parts is not clear. Yet, these differences are significant in delimiting species groups and often critical in identification, and the pertinent species otherwise would be scattered widely in a more artificial key.</key_discussion>
    // 		<key_statement>
    //			<statement_id>1.</statement_id>
    //			<description type="morphology">Heads discoid or disciform (pistillate florets 0 or their corollas filiform, lacking laminae)</description>
    //			<determination>Group 1, p. 260</determination>
    //		</key_statement>
	//		...
	//		...
	//	</key>
	// To
	//	<key>
    //		<key_head>Key to Groups of Erigeron Species</key_head>
    // 		<discussion>Artificial distinctions are used in the key to groups of species recognized by leafy runners, pinnately lobed or dissected leaves, discoid or disciform heads, and yellow rays. Otherwise, species tend to be identified within natural groups. Couplets that use basal parts for distinction or inference of duration may be difficult if collections lack diagnostic basal parts or if the nature of the basal parts is not clear. Yet, these differences are significant in delimiting species groups and often critical in identification, and the pertinent species otherwise would be scattered widely in a more artificial key.</discussion>
    // 		<key_statement>
    //			<statement_id>1.</statement_id>
    //			<description type="morphology">Heads discoid or disciform (pistillate florets 0 or their corollas filiform, lacking laminae)</description>
    //			<determination>Group 1, p. 260</determination>
    //		</key_statement>
	//		...
	//		...
	//	</key>
	
	public static void changeKey_Key_DisscussionToDiscussion(String inputXmlFileName, Set<String> allSchemaAttributeName)
			throws UnsupportedEncodingException, JDOMException, IOException {


		SAXBuilder saxBuilder = new SAXBuilder();

		try {

			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String textOfRootElement = xmlDocument.getRootElement().getText();
			// System.out.println("textOfRootElement::" + textOfRootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();
			// for loop recursively read List<Element> childrenOfRoot and gather
			// required information

			List<Element> visitChildNodesList = visitChildNodes(
					rootNode.getChildren(), allSchemaAttributeName);


			
			
			for (Element elementInVisitChildNodesList : visitChildNodesList) {
				String nameOfElementInVisitChildNodesList = elementInVisitChildNodesList
						.getName();

				if (nameOfElementInVisitChildNodesList
						.equals("key")) {
					List<Element> childrenOfKey = elementInVisitChildNodesList
							.getChildren();
					
					
					for (Element elementOfChildrenOfKey : childrenOfKey) {
						
						String nameOfElementOfChildrenOfKey = elementOfChildrenOfKey
								.getName();
						String textOfElementOfChildrenOfKey = elementOfChildrenOfKey
								.getText();
						
						if (nameOfElementOfChildrenOfKey
								.equals("key_discussion")) {
							
							// update element "key_discussion" to "discussion"
							elementInVisitChildNodesList.getChild("key_discussion").setName("discussion");
						    
						}
					}
				} 

				treatment.addContent(elementInVisitChildNodesList);
			}

			/*
			 * for (Element elementOfChildrenOfRoot : childrenOfRoot) { String
			 * nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
			 * .getName();
			 * 
			 * Element newElementOfChildrenOfRoot = new
			 * Element(nameOfElementOfChildrenOfRoot);
			 * 
			 * List<Element> visitChildNodesList = visitChildNodes(
			 * elementOfChildrenOfRoot.getChildren(), allSchemaAttributeName);
			 * for (Element elementInVisitChildNodesList : visitChildNodesList)
			 * {
			 * newElementOfChildrenOfRoot.addContent(elementInVisitChildNodesList
			 * );
			 * 
			 * }
			 * 
			 * doc.getRootElement().addContent(newElementOfChildrenOfRoot);
			 * 
			 * }
			 */

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			
			// xmlOutput.output(doc,
			//		new FileWriter(inputXmlFileName.split("\\.")[0] + "-1"
			// 				+ inputXmlFileName.split("\\.")[1]));
			
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}		
		

	}	
	
	
	// changeAllEmptyStringToUnknown
	public static void changeAllEmptyStringToUnknown(String inputXmlFileName, Set<String> allSchemaAttributeName)
			throws UnsupportedEncodingException, JDOMException, IOException {


		SAXBuilder saxBuilder = new SAXBuilder();

		try {

			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String textOfRootElement = xmlDocument.getRootElement().getText();
			// System.out.println("textOfRootElement::" + textOfRootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();
			// for loop recursively read List<Element> childrenOfRoot and gather
			// required information

			List<Element> visitChildNodesList = visitAllChildNodesAndChangeEmptyStringToUnknown(
					rootNode.getChildren(), allSchemaAttributeName);


			treatment.addContent(visitChildNodesList);
			

			

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			
			// xmlOutput.output(doc,
			//		new FileWriter(inputXmlFileName.split("\\.")[0] + "-1"
			// 				+ inputXmlFileName.split("\\.")[1]));
			
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}		
		

	}	
	
	
	// changeElement_publication_title_EmptyStringToUnknown
	public static void changeElement_publication_title_EmptyStringToUnknown(String inputXmlFileName, Set<String> allSchemaAttributeName)
			throws UnsupportedEncodingException, JDOMException, IOException {


		SAXBuilder saxBuilder = new SAXBuilder();

		try {

			// System.out.println(targetFolderName + "/" + inputXmlFileName);
			// System.out.println("inputXmlFileName::" + inputXmlFileName);

			// <bio:treatment xmlns:bio="http://www.github.com/biosemantics"
			// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			// xsi:schemaLocation="http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd">
			// </bio:treatment>

			Namespace namespace = Namespace.getNamespace("bio",
					"http://www.github.com/biosemantics");
			Element treatment = new Element("treatment", namespace);

			Namespace XSI = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			treatment.addNamespaceDeclaration(XSI);
			treatment
					.setAttribute(
							"schemaLocation",
							"http://www.github.com/biosemantics http://raw.githubusercontent.com/biosemantics/schemas/0.0.1/semanticMarkupInput.xsd",
							XSI);

			Document doc = new Document(treatment);

			List<Element> descriptionList = new ArrayList<Element>();

			InputStream inputStream = new FileInputStream(inputXmlFileName);

			Document xmlDocument = (Document) saxBuilder
					.build(new InputStreamReader(inputStream, "UTF8"));

			String textOfRootElement = xmlDocument.getRootElement().getText();
			// System.out.println("textOfRootElement::" + textOfRootElement);
			Element rootNode = xmlDocument.getRootElement();
			// System.out.println("rootNodeName::" + rootNode.getName());

			// Here is the input example
			// <?xml version="1.0" encoding="UTF-8"?>

			List<Element> childrenOfRoot = rootNode.getChildren();
			// for loop recursively read List<Element> childrenOfRoot and gather
			// required information

			List<Element> visitChildNodesList = visitAllChildNodesAndChangeElement_publication_title_EmptyStringToUnknown(
					rootNode.getChildren(), allSchemaAttributeName);


			treatment.addContent(visitChildNodesList);
			

			

			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			
			xmlOutput.output(doc, new FileWriter(inputXmlFileName));
			
			// xmlOutput.output(doc,
			//		new FileWriter(inputXmlFileName.split("\\.")[0] + "-1"
			// 				+ inputXmlFileName.split("\\.")[1]));
			
			// xmlOutput.output(doc, new FileWriter("111-222.xml"));

			System.out.println("File Saved!");

		} catch (JDOMException e) {
			// handle JDOMException
		} catch (IOException e) {
			// handle IOException
		}		
		

	}
	
	
	// extractKeyStatementIdList
	/*
	public static String extractKeyStatementIdList(String inputXmlFileName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		String returnKeyStatementIdList = "";
				
		// System.out.println("inputXmlFileName::" + inputXmlFileName);

		InputStream inputStream = new FileInputStream(inputXmlFileName);

		SAXBuilder saxBuilder = new SAXBuilder();

		Document xmlDocument = (Document) saxBuilder
				.build(new InputStreamReader(inputStream, "UTF8"));

		Element rootNode = xmlDocument.getRootElement();

		// System.out.println("rootNodeName::" + rootNode.getName());

		List<Element> childrenOfRoot = rootNode.getChildren();

		for (Element elementOfChildrenOfRoot : childrenOfRoot) {
			String nameOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getName();
			String textOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
					.getText();
			// System.out.println(nameOfElementOfChildrenOfRoot);

			if ( nameOfElementOfChildrenOfRoot.equals("key") ) {
				List<Element> childrenOfElementOfChildrenOfRoot = elementOfChildrenOfRoot
						.getChildren();
				for (Element elementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfRoot) {
					String nameOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getName();
					String textOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
							.getText();

					if (nameOfElementOfChildrenOfElementOfChildrenOfRoot
							.equals("key_statement")) {
						List<Element> childrenOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfRoot
								.getChildren();
						
						for (Element elementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot : childrenOfElementOfChildrenOfElementOfChildrenOfRoot) {
							
							String nameOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot
									.getName();
							String textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot = elementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot
									.getText();
							if (nameOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot.equals("statement_id")) {
								
								returnKeyStatementIdList += ";" + textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot;
							}
							
							if (nameOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot.equals("next_statement_id")) {

								returnKeyStatementIdList += "::" + textOfElementOfChildrenOfElementOfChildrenOfElementOfChildrenOfRoot;
							}
							
							
							
							
						}

					}
				}
			}

		}
		
		String[] returnKeyStatementIdListToArray = returnKeyStatementIdList.split(";");
		for (int i = 0; i < returnKeyStatementIdListToArray.length; i++) {
			if (returnKeyStatementIdListToArray[i].contains("::")) {
				
				String[] returnKeyStatementIdListToArrayItemIToArray = returnKeyStatementIdListToArray[i].split("::");
				String returnKeyStatementIdListToArrayIToArrayItemTwo = returnKeyStatementIdListToArrayIToArray[1];

				
				
				if (!returnKeyStatementIdListToArrayIToArrayItemTwo.equals(returnKeyStatementIdListToArray[i+1])) {
					
					if (returnKeyStatementIdListToArray[i+1].contains("::")) {

						String[] returnKeyStatementIdListToArrayIPlusOneToArray = returnKeyStatementIdListToArray[i+1].split("::");
						
						System.out.println("returnKeyStatementIdListToArrayIToArrayItemTwo::" + returnKeyStatementIdListToArrayIToArrayItemTwo);
					
						System.out.println("returnKeyStatementIdListToArray[i+1]::" + returnKeyStatementIdListToArrayIPlusOneToArray[0]);
					
						System.out.println("There is an error here!::" + inputXmlFileName);
						
					}
				}
				
			}
		}
		
		

		return returnKeyStatementIdList;

	}	
	*/
	
	
	
	
	// readFamilyRankWithKeyDescSetStringListFromCsv
	private static Set<String> readFamilyRankWithKeyDescSetStringListFromCsv(
			String targetCsvFileName,
			Set<String> initialFamilyRankWithKeyDescSetStringFromCsv) {

		Set<String> returnFamilyRankWithKeyDescSetString = new HashSet<String>();

		/*
		 * File file = new File(targetCsvFileName); FileInputStream fis = null;
		 * BufferedInputStream bis = null; DataInputStream dis = null;
		 * 
		 * try { // fis = new FileInputStream(file); // Here BufferedInputStream
		 * is added for fast reading. // bis = new BufferedInputStream(fis); //
		 * dis = new DataInputStream(bis);
		 * 
		 * // // dis.available() returns 0 if the file does not have more lines.
		 * // while (dis.available() != 0) {
		 * 
		 * // // this statement reads the line from the file and print it to //
		 * // the console. // System.out.println(dis.readLine()); //
		 * returnFamilyRankWithKeyDescSetString.add(dis.readLine()); // }
		 * 
		 * // // dispose all the resources after using them. // fis.close(); //
		 * bis.close(); // dis.close();
		 * 
		 * 
		 * // mtheod 2 // BufferedReader in = new BufferedReader(new
		 * InputStreamReader(new FileInputStream(targetCsvFileName), //
		 * "UTF8")); ////
		 * http://www.java2s.com/Tutorial/Java/0180__File/ReadingUTF8EncodedData.htm
		 * 
		 * //while ((in.readLine()) != null) { // //
		 * returnFamilyRankWithKeyDescSetString.add(in.readLine()); // }
		 * 
		 * 
		 * 
		 * 
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */

		// java - deprecated readLine() What to change  - Stack Overflow
		// http://stackoverflow.com/questions/13445451/deprecated-readline-what-to-change
		System.out.println("targetCsvFileName::" + targetCsvFileName);

		try (InputStream is = new FileInputStream(targetCsvFileName)) { // http://tutorials.jenkov.com/java-io/inputstream.html
		// try (InputStream is = connection.getInputStream()) {
			BufferedReader lines = new BufferedReader(new InputStreamReader(is,
					"UTF-8"));
			
			
			
			while (true) {
				String line = lines.readLine();
				if (line == null) {
					break;
				}
				System.out.println("line:" + line); // eclipse useful shortcut
				returnFamilyRankWithKeyDescSetString.add(line);
				// System.out.println("Server Response " + line);

			}
			
			
			/*
			while (lines.readLine() != null) {
				returnFamilyRankWithKeyDescSetString.add(lines.readLine());
				System.out.println("line:" + lines.readLine()); // eclipse useful shortcut

			}
			*/
			
			lines.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return returnFamilyRankWithKeyDescSetString;

	}

	
	// function "walk" is for transferring data sets taht use old XML schema ( or you can call it old data sets)
	// to new XML schema
	// you need to specify targetFolderName and dataSetName
	
	public static void walk(String targetFolderName, String dataSetName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		Set<String> allSchemaAttributeName = extractAllSchemaAttributeName("semanticMarkupInput.xsd");

		String[] allSchemaAttributeNameArray = allSchemaAttributeName
				.toArray(new String[0]);
		System.out.println("Arrays.toString(allSchemaAttributeNameArray)::"
				+ Arrays.toString(allSchemaAttributeNameArray));

		Set<String> allUnvalidatedTerms = new HashSet<String>();
		Set<String> allRootElements = new HashSet<String>();

		File inputFolder = new File(targetFolderName);
		File[] inputFiles = inputFolder.listFiles();

		if (inputFiles == null)
			return;

		for (File inputFile : inputFiles) {
			if (inputFile.isDirectory()) {
				// walk(inputFile.getAbsolutePath());
				walk(inputFile.getPath(), dataSetName);

				// System.out.println( "Dir:" + inputFile.getAbsoluteFile() );

			} else {
				try {
					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getAbsoluteFile() );
					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getName() );

					// String inputXmlFileName = inputFile.getName();

					String inputXmlFileName = inputFile.getAbsoluteFile()
							.toString();

					// transferXMLFormatFromOldXMLVersion1Replaced(inputXmlFileName);
					// iterateAllElements(inputXmlFileName,
					// allSchemaAttributeName);
					//

					// /*
					Set<String> allExtractedUnvalidatedTerms = extractAllUnvalidatedTerms(
							inputXmlFileName, allSchemaAttributeName);

					// for (String stringInAllextractedUnvalidatedTerms :
					// allextractedUnvalidatedTerms) {
					// allUnvalidatedTerms.add(stringInAllextractedUnvalidatedTerms);
					// }
					allUnvalidatedTerms.addAll(allExtractedUnvalidatedTerms);
					// */

					Set<String> allExtractedRootElements = extractAllRootElements(inputXmlFileName);
					allRootElements.addAll(allExtractedRootElements);

					if (dataSetName
							.equals("transferXMLFormatFromOldXMLFNAInJSTORReplaced")) {
						transferXMLFormatFromOldXMLFNAInJSTORReplaced(
								inputXmlFileName, allSchemaAttributeName);
					} else if (dataSetName
							.equals("transferXMLFormatFromOldXMLFoC")) {
						transferXMLFormatFromOldXMLFoC(
								inputXmlFileName, allSchemaAttributeName);						
					}
					

					// transferXMLFormatFromOldXMLFNAInJSTORReplaced(inputXmlFileName,
					// allSchemaAttributeName);
					// transferXMLFormatFromOldXMLCycadReplaced(inputXmlFileName,
					// allSchemaAttributeName);
					// transferXMLFormatFromOldThackerStudentReplaced(inputXmlFileName,
					// allSchemaAttributeName);
					// transferXMLFormatFromOldComparisonReplaced(inputXmlFileName,
					// allSchemaAttributeName);
					// transferXMLFormatFromOldFNARubusReplaced(inputXmlFileName,
					// allSchemaAttributeName);
					// transferXMLFormatFromOldGrayRubusReplaced(inputXmlFileName,
					// allSchemaAttributeName);

				} catch (Exception e) {
					// handle Exception
				}
			}

		}
		String[] allUnvalidatedTermsArray = allUnvalidatedTerms
				.toArray(new String[0]);
		System.out.println("allUnvalidatedTerms::"
				+ Arrays.toString(allUnvalidatedTermsArray));

		String[] allRootElementsArray = allRootElements.toArray(new String[0]);
		System.out.println("allRootElementsArray::"
				+ Arrays.toString(allRootElementsArray));

	}

	
	
	// sort number??
	public static void walk2(String folderName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		System.out.println("folderName:" + folderName);

		// File inputFolder = new File(folderName);
		// File[] inputFiles = inputFolder.listFiles();
		// // Arrays.sort(inputFiles);
		// Arrays.sort(inputFiles, NameFileComparator.NAME_COMPARATOR);

		// // int[] inputFolderNameInt = new int[inputFiles.length];
		// // int inputFileCounter = 0;
		// // for ( File inputFile : inputFiles ) {
		// // inputFolderNameInt[inputFileCounter] =
		// Integer.parseInt(inputFile.getName().split("\\.")[0]);
		// // inputFileCounter+=1;
		// // }
		// // Arrays.sort(inputFolderNameInt);
		// //
		// // for ( int i : inputFolderNameInt ) {
		// // System.out.println(i);
		// // }

		File inputFolder = new File(folderName);
		List<File> fileList = Arrays.asList(inputFolder.listFiles());

		List<File> fileList2 = new ArrayList<File>();
		for (File file : fileList) {
			if (file.getName().equals(".DS_Store")) {
				// System.out.println("It contains \"\\.Ds_Store\"!");
			} else {
				fileList2.add(file);
			}
		}

		// System.out.println("fileList2.size():" + fileList2.size());

		boolean isAllFolders = true;
		for (File file : fileList2) {
			if (!file.isDirectory()) {
				isAllFolders = false;
			}
		}

		boolean isAllFileNameInt = true;
		for (File file : fileList2) {
			String fileNamePrefix = file.getName();
			if (fileNamePrefix.contains(".")) {
				String numberString1 = fileNamePrefix.split("\\.")[0];
				// System.out.println("Elvis 0 :" + numberString1);
				if (!numberString1.matches("\\d+")) {
					isAllFileNameInt = false;
					// System.out.println("Elvis:" + fileNamePrefix);
				}
			} // else {
				// isAllFileNameInt = false;
				// }
		}

		/*
		 * if (isAllFolders == false) {
		 * System.out.println("All are not folders!"); } else {
		 * System.out.println("All are folders!"); }
		 * 
		 * 
		 * if (isAllFileNameInt == false) {
		 * System.out.println("Not all file name are int!"); } else {
		 * System.out.println("All file name are int!"); }
		 */

		if (isAllFileNameInt == true && isAllFolders == false) {
			Collections.sort(fileList2, new Comparator<File>() {
				@Override
				public int compare(File o1, File o2) {
					String numberString1 = o1.getName().split("\\.")[0];
					int number1 = Integer.parseInt(numberString1);
					String numberString2 = o2.getName().split("\\.")[0];
					int number2 = Integer.parseInt(numberString2);
					return number1 - number2;
				}

			});
		}

		// for (File file : fileList) {
		// System.out.println(file.getName());
		// }

		if (fileList2 == null)
			return;

		// for (File inputFile : inputFiles) {
		for (File inputFile : fileList2) {

			if (inputFile.isDirectory()) {
				// walk(inputFile.getAbsolutePath());
				walk2(inputFile.getPath());

				// System.out.println("Dir:" + inputFile.getAbsoluteFile());
				// Don't use it! => // System.out.println("Dir2:" +
				// inputFile.getPath());

			} else {
				try {
					// System.out.println("folderName:" + folderName
					// + "::File:" + inputFile.getAbsoluteFile());
					// EX:
					// folderName:V23::File:/Users/ra/Documents/workspace_elvis/XMLFormatTransfer/V23/998.xml

					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getName() );
					// Ex: folderName:V23::File:998.xml

					String inputXmlFileName = inputFile.getAbsoluteFile()
							.toString();
					String returnFamilyName = extractTaxonFamilyName(inputXmlFileName);
					if (!returnFamilyName.equals("empty")) {
						System.out.println("inputXmlFileName:"
								+ inputXmlFileName + "::returnFamilyName::"
								+ returnFamilyName);
					}

					//
					// Set<String> allExtractedUnvalidatedTerms =
					// extractAllUnvalidatedTerms(inputXmlFileName,
					// allSchemaAttributeName);

					// for (String stringInAllextractedUnvalidatedTerms :
					// allextractedUnvalidatedTerms) {
					// allUnvalidatedTerms.add(stringInAllextractedUnvalidatedTerms);
					// }
					// allUnvalidatedTerms.addAll(allExtractedUnvalidatedTerms);
					//

					// Set<String> allExtractedRootElements =
					// extractAllRootElements(inputXmlFileName);
					// allRootElements.addAll(allExtractedRootElements);

				} catch (Exception e) {
					// handle Exception
				}
			}

		}

		// String[] allUnvalidatedTermsArray = allUnvalidatedTerms.toArray(new
		// String[0]);
		// System.out.println("allUnvalidatedTerms::" +
		// Arrays.toString(allUnvalidatedTermsArray));

		// String[] allRootElementsArray = allRootElements.toArray(new
		// String[0]);
		// System.out.println("allRootElementsArray::" +
		// Arrays.toString(allRootElementsArray));

	}

	
	// walk3AddUnknowInFoc
	// from => walk
	// no "String dataSetName"
	public static void walk3AddUnknowInFoc(String folderName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		Set<String> allSchemaAttributeName = extractAllSchemaAttributeName("semanticMarkupInput.xsd");

		String[] allSchemaAttributeNameArray = allSchemaAttributeName
				.toArray(new String[0]);
		System.out.println("Arrays.toString(allSchemaAttributeNameArray)::"
				+ Arrays.toString(allSchemaAttributeNameArray));

		Set<String> allUnvalidatedTerms = new HashSet<String>();
		Set<String> allRootElements = new HashSet<String>();

		File inputFolder = new File(folderName);
		File[] inputFiles = inputFolder.listFiles();

		if (inputFiles == null)
			return;

		for (File inputFile : inputFiles) {
			if (inputFile.isDirectory()) {
				// walk3AddUnknowInFoc(inputFile.getAbsolutePath());
				walk3AddUnknowInFoc(inputFile.getPath());

				// System.out.println( "Dir:" + inputFile.getAbsoluteFile() );

			} else {
				try {
					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getAbsoluteFile() );
					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getName() );

					// String inputXmlFileName = inputFile.getName();

					String inputXmlFileName = inputFile.getAbsoluteFile()
							.toString();

					// transferXMLFormatFromOldXMLVersion1Replaced(inputXmlFileName);
					// iterateAllElements(inputXmlFileName,
					// allSchemaAttributeName);
					//

					// /*
					Set<String> allExtractedUnvalidatedTerms = extractAllUnvalidatedTerms(
							inputXmlFileName, allSchemaAttributeName);

					// for (String stringInAllextractedUnvalidatedTerms :
					// allextractedUnvalidatedTerms) {
					// allUnvalidatedTerms.add(stringInAllextractedUnvalidatedTerms);
					// }
					allUnvalidatedTerms.addAll(allExtractedUnvalidatedTerms);
					// */

					Set<String> allExtractedRootElements = extractAllRootElements(inputXmlFileName);
					allRootElements.addAll(allExtractedRootElements);

					addUnknownInFoc(inputXmlFileName, allSchemaAttributeName);


				} catch (Exception e) {
					// handle Exception
				}
			}

		}
		String[] allUnvalidatedTermsArray = allUnvalidatedTerms
				.toArray(new String[0]);
		System.out.println("allUnvalidatedTerms::"
				+ Arrays.toString(allUnvalidatedTermsArray));

		String[] allRootElementsArray = allRootElements.toArray(new String[0]);
		System.out.println("allRootElementsArray::"
				+ Arrays.toString(allRootElementsArray));

	}
	

	

	
	
	// walk4CorrectKeyStatement
	// from => walk
	// no "String dataSetName"
	public static void walk4CorrectKeyStatement(String folderName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		Set<String> allSchemaAttributeName = extractAllSchemaAttributeName("semanticMarkupInput.xsd");

		String[] allSchemaAttributeNameArray = allSchemaAttributeName
				.toArray(new String[0]);
		System.out.println("Arrays.toString(allSchemaAttributeNameArray)::"
				+ Arrays.toString(allSchemaAttributeNameArray));

		Set<String> allUnvalidatedTerms = new HashSet<String>();
		Set<String> allRootElements = new HashSet<String>();

		File inputFolder = new File(folderName);
		File[] inputFiles = inputFolder.listFiles();

		if (inputFiles == null)
			return;

		for (File inputFile : inputFiles) {
			if (inputFile.isDirectory()) {
				// walk4CorrectKeyStatement(inputFile.getAbsolutePath()); // no need to get absolute path
				walk4CorrectKeyStatement(inputFile.getPath());

				// System.out.println( "Dir:" + inputFile.getAbsoluteFile() );

			} else {
				try {
					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getAbsoluteFile() );
					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getName() );

					// String inputXmlFileName = inputFile.getName();

					String inputXmlFileName = inputFile.getAbsoluteFile()
							.toString();

					// extractKeyStatementIdList(inputXmlFileName);
					correctKeyStatement(inputXmlFileName, allSchemaAttributeName);

				} catch (Exception e) {
					// handle Exception
				}
			}

		}
		String[] allUnvalidatedTermsArray = allUnvalidatedTerms
				.toArray(new String[0]);
		System.out.println("allUnvalidatedTerms::"
				+ Arrays.toString(allUnvalidatedTermsArray));

		String[] allRootElementsArray = allRootElements.toArray(new String[0]);
		System.out.println("allRootElementsArray::"
				+ Arrays.toString(allRootElementsArray));

	}	
	
	
	// walk5AddTaxonHierarchy
	// from => walk
	// no "String dataSetName"
	public static void walk5AddTaxonHierarchy(String folderName)
				throws UnsupportedEncodingException, JDOMException, IOException {

			Set<String> allSchemaAttributeName = extractAllSchemaAttributeName("semanticMarkupInput.xsd");

			String[] allSchemaAttributeNameArray = allSchemaAttributeName
					.toArray(new String[0]);
			System.out.println("Arrays.toString(allSchemaAttributeNameArray)::"
					+ Arrays.toString(allSchemaAttributeNameArray));

			Set<String> allUnvalidatedTerms = new HashSet<String>();
			Set<String> allRootElements = new HashSet<String>();

			File inputFolder = new File(folderName);
			File[] inputFiles = inputFolder.listFiles();

			if (inputFiles == null)
				return;

			for (File inputFile : inputFiles) {
				if (inputFile.isDirectory()) {
					// walk5AddTaxonHierarchy(inputFile.getAbsolutePath()); // no need to get absolute path
					walk5AddTaxonHierarchy(inputFile.getPath());

					// System.out.println( "Dir:" + inputFile.getAbsoluteFile() );

				} else {
					try {
						// System.out.println( "folderName:" + folderName +
						// "::File:" + inputFile.getAbsoluteFile() );
						// System.out.println( "folderName:" + folderName +
						// "::File:" + inputFile.getName() );

						// String inputXmlFileName = inputFile.getName();

						String inputXmlFileName = inputFile.getAbsoluteFile()
								.toString();

						// extractKeyStatementIdList(inputXmlFileName);
						checkAndAddTaxonHierarchy(inputXmlFileName, allSchemaAttributeName);

					} catch (Exception e) {
						// handle Exception
					}
				}

			}
			String[] allUnvalidatedTermsArray = allUnvalidatedTerms
					.toArray(new String[0]);
			System.out.println("allUnvalidatedTerms::"
					+ Arrays.toString(allUnvalidatedTermsArray));

			String[] allRootElementsArray = allRootElements.toArray(new String[0]);
			System.out.println("allRootElementsArray::"
					+ Arrays.toString(allRootElementsArray));

		}	

	
	
	// walk6ChangeKey_Key_DisscussionToDiscussion
	// from => walk
	// no "String dataSetName"	
	public static void walk6ChangeKey_Key_DisscussionToDiscussion(String folderName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		Set<String> allSchemaAttributeName = extractAllSchemaAttributeName("semanticMarkupInput.xsd");

		String[] allSchemaAttributeNameArray = allSchemaAttributeName
				.toArray(new String[0]);
		System.out.println("Arrays.toString(allSchemaAttributeNameArray)::"
				+ Arrays.toString(allSchemaAttributeNameArray));

		Set<String> allUnvalidatedTerms = new HashSet<String>();
		Set<String> allRootElements = new HashSet<String>();

		File inputFolder = new File(folderName);
		File[] inputFiles = inputFolder.listFiles();

		if (inputFiles == null)
			return;

		for (File inputFile : inputFiles) {
			if (inputFile.isDirectory()) {
				// walk6ChangeKey_Key_DisscussionToDiscussion(inputFile.getAbsolutePath()); // no need to get absolute path
				walk6ChangeKey_Key_DisscussionToDiscussion(inputFile.getPath());

				// System.out.println( "Dir:" + inputFile.getAbsoluteFile() );

			} else {
				try {
					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getAbsoluteFile() );
					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getName() );

					// String inputXmlFileName = inputFile.getName();

					String inputXmlFileName = inputFile.getAbsoluteFile()
							.toString();

					// extractKeyStatementIdList(inputXmlFileName);
					changeKey_Key_DisscussionToDiscussion(inputXmlFileName, allSchemaAttributeName);

				} catch (Exception e) {
					// handle Exception
				}
			}

		}
		String[] allUnvalidatedTermsArray = allUnvalidatedTerms
				.toArray(new String[0]);
		System.out.println("allUnvalidatedTerms::"
				+ Arrays.toString(allUnvalidatedTermsArray));

		String[] allRootElementsArray = allRootElements.toArray(new String[0]);
		System.out.println("allRootElementsArray::"
				+ Arrays.toString(allRootElementsArray));

	}	

	
	// walk7ChangeAllEmptyStringToUnknown
	// from => walk
	// no "String dataSetName"	
	public static void walk7ChangeAllEmptyStringToUnknown(String folderName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		Set<String> allSchemaAttributeName = extractAllSchemaAttributeName("semanticMarkupInput.xsd");

		String[] allSchemaAttributeNameArray = allSchemaAttributeName
				.toArray(new String[0]);
		System.out.println("Arrays.toString(allSchemaAttributeNameArray)::"
				+ Arrays.toString(allSchemaAttributeNameArray));

		Set<String> allUnvalidatedTerms = new HashSet<String>();
		Set<String> allRootElements = new HashSet<String>();

		File inputFolder = new File(folderName);
		File[] inputFiles = inputFolder.listFiles();

		if (inputFiles == null)
			return;

		for (File inputFile : inputFiles) {
			if (inputFile.isDirectory()) {
				// walk7ChangeAllEmptyStringToUnknown(inputFile.getAbsolutePath()); // no need to get absolute path
				walk7ChangeAllEmptyStringToUnknown(inputFile.getPath());

				// System.out.println( "Dir:" + inputFile.getAbsoluteFile() );

			} else {
				try {
					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getAbsoluteFile() );
					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getName() );

					// String inputXmlFileName = inputFile.getName();

					String inputXmlFileName = inputFile.getAbsoluteFile()
							.toString();

					// extractKeyStatementIdList(inputXmlFileName);
					changeAllEmptyStringToUnknown(inputXmlFileName, allSchemaAttributeName);

				} catch (Exception e) {
					// handle Exception
				}
			}

		}
		String[] allUnvalidatedTermsArray = allUnvalidatedTerms
				.toArray(new String[0]);
		System.out.println("allUnvalidatedTerms::"
				+ Arrays.toString(allUnvalidatedTermsArray));

		String[] allRootElementsArray = allRootElements.toArray(new String[0]);
		System.out.println("allRootElementsArray::"
				+ Arrays.toString(allRootElementsArray));

	}	
	
	
	// walk8ChangeElement_publication_title_EmptyStringToUnknown
	// from => walk
	// no "String dataSetName"	
	public static void walk8ChangeElement_publication_title_EmptyStringToUnknown(String folderName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		Set<String> allSchemaAttributeName = extractAllSchemaAttributeName("semanticMarkupInput.xsd");

		String[] allSchemaAttributeNameArray = allSchemaAttributeName
				.toArray(new String[0]);
		System.out.println("Arrays.toString(allSchemaAttributeNameArray)::"
				+ Arrays.toString(allSchemaAttributeNameArray));

		Set<String> allUnvalidatedTerms = new HashSet<String>();
		Set<String> allRootElements = new HashSet<String>();

		File inputFolder = new File(folderName);
		File[] inputFiles = inputFolder.listFiles();

		if (inputFiles == null)
			return;

		for (File inputFile : inputFiles) {
			if (inputFile.isDirectory()) {
				// walk8ChangeElement_publication_title_EmptyStringToUnknown(inputFile.getAbsolutePath()); // no need to get absolute path
				walk8ChangeElement_publication_title_EmptyStringToUnknown(inputFile.getPath());

				// System.out.println( "Dir:" + inputFile.getAbsoluteFile() );

			} else {
				try {
					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getAbsoluteFile() );
					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getName() );

					// String inputXmlFileName = inputFile.getName();

					String inputXmlFileName = inputFile.getAbsoluteFile()
							.toString();

					// extractKeyStatementIdList(inputXmlFileName);
					changeElement_publication_title_EmptyStringToUnknown(inputXmlFileName, allSchemaAttributeName);

				} catch (Exception e) {
					// handle Exception
				}
			}

		}
		String[] allUnvalidatedTermsArray = allUnvalidatedTerms
				.toArray(new String[0]);
		System.out.println("allUnvalidatedTerms::"
				+ Arrays.toString(allUnvalidatedTermsArray));

		String[] allRootElementsArray = allRootElements.toArray(new String[0]);
		System.out.println("allRootElementsArray::"
				+ Arrays.toString(allRootElementsArray));

	}
	
	
	
	
	// create family Set<String>
	public static Set<String> createFamilyRankSetStringList(String folderName,
			Set<String> oldSetString) throws UnsupportedEncodingException,
			JDOMException, IOException {

		System.out.println("folderName:" + folderName);

		File inputFolder = new File(folderName);
		List<File> fileList = Arrays.asList(inputFolder.listFiles());

		if (fileList != null) {
			// for (File inputFile : inputFiles) {
			for (File inputFile : fileList) {

				if (inputFile.isDirectory()) {
					// walk(inputFile.getAbsolutePath());
					createFamilyRankSetStringList(inputFile.getPath(),
							oldSetString);

					// System.out.println("Dir:" + inputFile.getAbsoluteFile());
					// Don't use it! => // System.out.println("Dir2:" +
					// inputFile.getPath());

				} else {
					try {
						// System.out.println("folderName:" + folderName
						// + "::File:" + inputFile.getAbsoluteFile());
						// EX:
						// folderName:V23::File:/Users/ra/Documents/workspace_elvis/XMLFormatTransfer/V23/998.xml

						// System.out.println( "folderName:" + folderName +
						// "::File:" + inputFile.getName() );
						// Ex: folderName:V23::File:998.xml

						String inputXmlFileName = inputFile.getAbsoluteFile()
								.toString();

						String returnFamilyName = extractTaxonFamilyName(inputXmlFileName);

						returnFamilyName = returnFamilyName.toLowerCase();

						if (!returnFamilyName.equals("empty")) {
							// System.out.println( "inputXmlFileName:" +
							// inputXmlFileName + "::returnFamilyName::" +
							// returnFamilyName);
							oldSetString.add(returnFamilyName);
						}

					} catch (Exception e) {
						// handle Exception
					}
				}

			}
		} else {
			oldSetString.add("Empty");

		}

		// System.out.println(oldSetString.size());

		return oldSetString;

	}

	// create tribe Set<String>
	public static Set<String> createTribeRankSetStringList(String folderName,
			Set<String> oldSetString) throws UnsupportedEncodingException,
			JDOMException, IOException {

		System.out.println("folderName:" + folderName);

		File inputFolder = new File(folderName);
		List<File> fileList = Arrays.asList(inputFolder.listFiles());

		if (fileList != null) {
			// for (File inputFile : inputFiles) {
			for (File inputFile : fileList) {

				if (inputFile.isDirectory()) {
					// walk(inputFile.getAbsolutePath());
					createTribeRankSetStringList(inputFile.getPath(),
							oldSetString);

					// System.out.println("Dir:" + inputFile.getAbsoluteFile());
					// Don't use it! => // System.out.println("Dir2:" +
					// inputFile.getPath());

				} else {
					try {
						// System.out.println("folderName:" + folderName
						// + "::File:" + inputFile.getAbsoluteFile());
						// EX:
						// folderName:V23::File:/Users/ra/Documents/workspace_elvis/XMLFormatTransfer/V23/998.xml

						// System.out.println( "folderName:" + folderName +
						// "::File:" + inputFile.getName() );
						// Ex: folderName:V23::File:998.xml

						String inputXmlFileName = inputFile.getAbsoluteFile()
								.toString();
						String returnTribeName = extractTaxonTribeName(inputXmlFileName);

						returnTribeName = returnTribeName.toLowerCase();

						if (!returnTribeName.equals("empty")) {
							System.out.println("inputXmlFileName:"
									+ inputXmlFileName + "::returnTribeName::"
									+ returnTribeName);
							oldSetString.add(returnTribeName);
						}

					} catch (Exception e) {
						// handle Exception
					}
				}

			}
		} else {
			oldSetString.add("Empty");

		}

		// System.out.println(oldSetString.size());

		return oldSetString;

	}

	// create family with key description Set<String>
	public static Set<String> createFamilyRankWithKeyDescSetStringList(
			String folderName, Set<String> oldSetString)
			throws UnsupportedEncodingException, JDOMException, IOException {

		System.out.println("folderName:" + folderName);

		File inputFolder = new File(folderName);
		List<File> fileList = Arrays.asList(inputFolder.listFiles());

		if (fileList != null) {
			// for (File inputFile : inputFiles) {
			for (File inputFile : fileList) {

				if (inputFile.isDirectory()) {
					// walk(inputFile.getAbsolutePath());
					createFamilyRankWithKeyDescSetStringList(
							inputFile.getPath(), oldSetString);

					// System.out.println("Dir:" + inputFile.getAbsoluteFile());
					// Don't use it! => // System.out.println("Dir2:" +
					// inputFile.getPath());

				} else {
					try {
						// System.out.println("folderName:" + folderName
						// + "::File:" + inputFile.getAbsoluteFile());
						// EX:
						// folderName:V23::File:/Users/ra/Documents/workspace_elvis/XMLFormatTransfer/V23/998.xml

						// System.out.println( "folderName:" + folderName +
						// "::File:" + inputFile.getName() );
						// Ex: folderName:V23::File:998.xml

						String inputXmlFileName = inputFile.getAbsoluteFile()
								.toString();
						String returnFamilyRankWithKeyDesc = extractFamilyRankWithKeyDesc(inputXmlFileName);

						returnFamilyRankWithKeyDesc = returnFamilyRankWithKeyDesc
								.toLowerCase();

						if (!returnFamilyRankWithKeyDesc.equals("empty")) {
							System.out.println("inputXmlFileName:"
									+ inputXmlFileName
									+ "::returnFamilyRankWithKeyDesc::"
									+ returnFamilyRankWithKeyDesc);
							oldSetString.add(returnFamilyRankWithKeyDesc);
						}

					} catch (Exception e) {
						// handle Exception
					}
				}

			}
		} else {
			oldSetString.add("Empty");

		}

		// System.out.println(oldSetString.size());

		return oldSetString;

	}

	// findAllExtractedRootElements
	public static void findAllExtractedRootElements(String folderName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		System.out.println("folderName:" + folderName);

		Set<String> allRootElements = new HashSet<String>();

		File inputFolder = new File(folderName);
		File[] inputFiles = inputFolder.listFiles();

		if (inputFiles == null)
			return;

		for (File inputFile : inputFiles) {
			if (inputFile.isDirectory()) {
				findAllExtractedRootElements(inputFile.getPath());

				// System.out.println( "Dir:" + inputFile.getAbsoluteFile() );

			} else {
				try {
					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getAbsoluteFile() );
					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getName() );

					// String inputXmlFileName = inputFile.getName();

					String inputXmlFileName = inputFile.getAbsoluteFile()
							.toString();

					Set<String> allExtractedRootElements = extractAllRootElements(inputXmlFileName);
					allRootElements.addAll(allExtractedRootElements);

				} catch (Exception e) {
					// handle Exception
				}
			}

		}

		String[] allRootElementsArray = allRootElements.toArray(new String[0]);
		System.out.println("allRootElementsArray::"
				+ Arrays.toString(allRootElementsArray));

	}

	// find family and tribe name
	public static void findFamilyTribeName(String folderName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		System.out.println("folderName:" + folderName);

		File inputFolder = new File(folderName);
		List<File> fileList = Arrays.asList(inputFolder.listFiles());

		if (fileList != null) {
			// for (File inputFile : inputFiles) {
			for (File inputFile : fileList) {

				if (inputFile.isDirectory()) {
					findFamilyTribeName(inputFile.getPath());

					// System.out.println("Dir:" + inputFile.getAbsoluteFile());
					// Don't use it! => // System.out.println("Dir2:" +
					// inputFile.getPath());

				} else {
					try {
						// System.out.println("folderName:" + folderName
						// + "::File:" + inputFile.getAbsoluteFile());
						// EX:
						// folderName:V23::File:/Users/ra/Documents/workspace_elvis/XMLFormatTransfer/V23/998.xml

						// System.out.println( "folderName:" + folderName +
						// "::File:" + inputFile.getName() );
						// Ex: folderName:V23::File:998.xml

						String inputXmlFileName = inputFile.getAbsoluteFile()
								.toString();
						String returnFamilyName = extractTaxonFamilyName(inputXmlFileName);

						String returnTribeName = extractTaxonTribeName(inputXmlFileName);

						if (!returnFamilyName.equals("empty")) {
							System.out.println("inputXmlFileName:"
									+ inputXmlFileName + "::returnFamilyName::"
									+ returnFamilyName);
						}
						if (!returnTribeName.equals("empty")) {
							System.out.println("inputXmlFileName:"
									+ inputXmlFileName + "::returnTribeName::"
									+ returnTribeName);
						}

					} catch (Exception e) {
						// handle Exception
					}
				}

			}
		}

	}

	// find number
	public static void findNumber(String folderName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		System.out.println("folderName:" + folderName);

		File inputFolder = new File(folderName);
		List<File> fileList = Arrays.asList(inputFolder.listFiles());

		if (fileList != null) {
			// for (File inputFile : inputFiles) {
			for (File inputFile : fileList) {

				if (inputFile.isDirectory()) {
					findNumber(inputFile.getPath());

					// System.out.println("Dir:" + inputFile.getAbsoluteFile());
					// Don't use it! => // System.out.println("Dir2:" +
					// inputFile.getPath());

				} else {
					try {
						// System.out.println("folderName:" + folderName
						// + "::File:" + inputFile.getAbsoluteFile());
						// EX:
						// folderName:V23::File:/Users/ra/Documents/workspace_elvis/XMLFormatTransfer/V23/998.xml

						// System.out.println( "folderName:" + folderName +
						// "::File:" + inputFile.getName() );
						// Ex: folderName:V23::File:998.xml

						String inputXmlFileName = inputFile.getAbsoluteFile()
								.toString();
						String returnNumber = extractNumber(inputXmlFileName);

					} catch (Exception e) {
						// handle Exception
					}
				}

			}
		}

	}

	// find TaxonHierarchy name
	public static void findTaxonHierarchyName(String folderName)
			throws UnsupportedEncodingException, JDOMException, IOException {

		System.out.println("folderName:" + folderName);

		File inputFolder = new File(folderName);
		List<File> fileList = Arrays.asList(inputFolder.listFiles());

		if (fileList != null) {
			// for (File inputFile : inputFiles) {
			for (File inputFile : fileList) {

				if (inputFile.isDirectory()) {
					findTaxonHierarchyName(inputFile.getPath());

					// System.out.println("Dir:" + inputFile.getAbsoluteFile());
					// Don't use it! => // System.out.println("Dir2:" +
					// inputFile.getPath());

				} else {
					try {
						// System.out.println("folderName:" + folderName
						// + "::File:" + inputFile.getAbsoluteFile());
						// EX:
						// folderName:V23::File:/Users/ra/Documents/workspace_elvis/XMLFormatTransfer/V23/998.xml

						// System.out.println( "folderName:" + folderName +
						// "::File:" + inputFile.getName() );
						// Ex: folderName:V23::File:998.xml

						String inputXmlFileName = inputFile.getAbsoluteFile()
								.toString();

						// String returnFamilyName =
						// extractTaxonFamilyName(inputXmlFileName);

						String returnTribeName = extractTaxonHierarchyName(inputXmlFileName);

						/*
						 * if (!returnFamilyName.equals("empty")) {
						 * System.out.println( "inputXmlFileName:" +
						 * inputXmlFileName + "::returnFamilyName::" +
						 * returnFamilyName); } if
						 * (!returnTribeName.equals("empty")) {
						 * System.out.println( "inputXmlFileName:" +
						 * inputXmlFileName + "::returnTribeName::" +
						 * returnTribeName); }
						 */

					} catch (Exception e) {
						// handle Exception
					}
				}

			}
		}

	}

	// create genus Set<String>
	public static Set<String> createGenusRankSetStringList(String folderName,
			Set<String> oldSetString) throws UnsupportedEncodingException,
			JDOMException, IOException {

		System.out.println("folderName:" + folderName);

		File inputFolder = new File(folderName);
		List<File> fileList = Arrays.asList(inputFolder.listFiles());

		if (fileList != null) {
			// for (File inputFile : inputFiles) {
			for (File inputFile : fileList) {

				if (inputFile.isDirectory()) {
					// walk(inputFile.getAbsolutePath());
					createGenusRankSetStringList(inputFile.getPath(),
							oldSetString);

					// System.out.println("Dir:" + inputFile.getAbsoluteFile());
					// Don't use it! => // System.out.println("Dir2:" +
					// inputFile.getPath());

				} else {
					try {
						// System.out.println("folderName:" + folderName
						// + "::File:" + inputFile.getAbsoluteFile());
						// EX:
						// folderName:V23::File:/Users/ra/Documents/workspace_elvis/XMLFormatTransfer/V23/998.xml

						// System.out.println( "folderName:" + folderName +
						// "::File:" + inputFile.getName() );
						// Ex: folderName:V23::File:998.xml

						String inputXmlFileName = inputFile.getAbsoluteFile()
								.toString();
						String returnGenusName = extractTaxonGenusName(inputXmlFileName);

						returnGenusName = returnGenusName.toLowerCase();

						if (!returnGenusName.equals("empty")) {
							// System.out.println( "inputXmlFileName:" +
							// inputXmlFileName + "::returnGenusName::" +
							// returnGenusName);
							oldSetString.add(returnGenusName);
						}

					} catch (Exception e) {
						// handle Exception
					}
				}

			}
		} else {
			oldSetString.add("Empty");

		}

		// System.out.println(oldSetString.size());

		return oldSetString;

	}

	// create family tribe Set<String>
	public static Set<String> createFamilyTribeRankSetStringList(
			String folderName, Set<String> oldSetString)
			throws UnsupportedEncodingException, JDOMException, IOException {

		System.out.println("folderName:" + folderName);

		File inputFolder = new File(folderName);
		List<File> fileList = Arrays.asList(inputFolder.listFiles());

		if (fileList != null) {
			// for (File inputFile : inputFiles) {
			for (File inputFile : fileList) {

				if (inputFile.isDirectory()) {
					// walk(inputFile.getAbsolutePath());
					createFamilyTribeRankSetStringList(inputFile.getPath(),
							oldSetString);

					// System.out.println("Dir:" + inputFile.getAbsoluteFile());
					// Don't use it! => // System.out.println("Dir2:" +
					// inputFile.getPath());

				} else {
					try {
						// System.out.println("folderName:" + folderName
						// + "::File:" + inputFile.getAbsoluteFile());
						// EX:
						// folderName:V23::File:/Users/ra/Documents/workspace_elvis/XMLFormatTransfer/V23/998.xml

						// System.out.println( "folderName:" + folderName +
						// "::File:" + inputFile.getName() );
						// Ex: folderName:V23::File:998.xml

						String inputXmlFileName = inputFile.getAbsoluteFile()
								.toString();

						String returnFamilyName = extractTaxonFamilyName(inputXmlFileName);
						String returnTribeName = extractTaxonTribeName(inputXmlFileName);

						returnFamilyName = returnFamilyName.toLowerCase();
						returnTribeName = returnTribeName.toLowerCase();

						if (!returnFamilyName.equals("empty")) {
							// System.out.println( "inputXmlFileName:" +
							// inputXmlFileName + "::returnFamilyName::" +
							// returnFamilyName);
							String targetString = returnFamilyName;
							if (!returnTribeName.equals("empty")) {
								targetString += "::" + returnTribeName;
							}
							oldSetString.add(targetString);

						}

					} catch (Exception e) {
						// handle Exception
					}
				}

			}
		} else {
			oldSetString.add("Empty");

		}

		// System.out.println(oldSetString.size());

		return oldSetString;

	}

	
	
	
	
	// createTaxonIdentificationList
	// extractTaxonIdentification
	public static String createTaxonIdentificationList(String folderName, String inputString)
			throws UnsupportedEncodingException, JDOMException, IOException {

		System.out.println("folderName:" + folderName);

		
		String returnString = inputString;

		File inputFolder = new File(folderName);
		List<File> fileList = Arrays.asList(inputFolder.listFiles());

		List<File> fileList2 = new ArrayList<File>();
		for (File file : fileList) {
			if (file.getName().equals(".DS_Store")) {
				// System.out.println("It contains \"\\.Ds_Store\"!");
			} else {
				fileList2.add(file);
			}
		}

		// System.out.println("fileList2.size():" + fileList2.size());

		boolean isAllFolders = true;
		for (File file : fileList2) {
			if (!file.isDirectory()) {
				isAllFolders = false;
			}
		}

		boolean isAllFileNameInt = true;
		for (File file : fileList2) {
			String fileNamePrefix = file.getName();
			if (fileNamePrefix.contains(".")) {
				String numberString1 = fileNamePrefix.split("\\.")[0];
				// System.out.println("Elvis 0 :" + numberString1);
				if (!numberString1.matches("\\d+")) {
					isAllFileNameInt = false;
					// System.out.println("Elvis:" + fileNamePrefix);
				}
			} // else {
				// isAllFileNameInt = false;
				// }
		}


		if (isAllFileNameInt == true && isAllFolders == false) {
			Collections.sort(fileList2, new Comparator<File>() {
				@Override
				public int compare(File o1, File o2) {
					String numberString1 = o1.getName().split("\\.")[0];
					int number1 = Integer.parseInt(numberString1);
					String numberString2 = o2.getName().split("\\.")[0];
					int number2 = Integer.parseInt(numberString2);
					return number1 - number2;
				}

			});
		}

		// for (File file : fileList) {
		// System.out.println(file.getName());
		// }

		if (fileList2 == null)
			return returnString;

		// for (File inputFile : inputFiles) {
		for (File inputFile : fileList2) {

			if (inputFile.isDirectory()) {
				createTaxonIdentificationList(inputFile.getPath(), inputString);

				// System.out.println("Dir:" + inputFile.getAbsoluteFile());
				// Don't use it! => // System.out.println("Dir2:" +
				// inputFile.getPath());

			} else {
				try {
					// System.out.println("folderName:" + folderName
					// + "::File:" + inputFile.getAbsoluteFile());
					// EX:
					// folderName:V23::File:/Users/ra/Documents/workspace_elvis/XMLFormatTransfer/V23/998.xml

					// System.out.println( "folderName:" + folderName +
					// "::File:" + inputFile.getName() );
					// Ex: folderName:V23::File:998.xml

					
					
					String inputXmlFileName = inputFile.getAbsoluteFile()
							.toString();
					String returnTaxonIdentification = extractTaxonIdentification(inputXmlFileName);
					if (!returnTaxonIdentification.equals("empty")) {
						System.out.println("inputXmlFileName:"
								+ inputXmlFileName + "::returnTaxonIdentification::"
								+ returnTaxonIdentification);
						
						boolean isFamilyRankRelatedInfor = false;
						boolean isGenusRankInfor = false;
						boolean isSpeciesRankInfor = false;

						
						String[] arrayOfreturnTaxonIdentification = returnTaxonIdentification.split(";");
						
						for ( String itemInArrayOfreturnTaxonIdentification : arrayOfreturnTaxonIdentification ) {
							String[] arrayOfItemInArrayOfreturnTaxonIdentification = itemInArrayOfreturnTaxonIdentification.split("::");
							
							for ( String itemInArrayOfItemInArrayOfreturnTaxonIdentification : arrayOfItemInArrayOfreturnTaxonIdentification ) {
								
								if ( itemInArrayOfItemInArrayOfreturnTaxonIdentification.equals("family") ) {
									isFamilyRankRelatedInfor = true;
								}
								
								if ( itemInArrayOfItemInArrayOfreturnTaxonIdentification.equals("genus") ) {
									isGenusRankInfor = true;
								}
								
								if ( itemInArrayOfItemInArrayOfreturnTaxonIdentification.equals("species") ) {
									isSpeciesRankInfor = true;
								}
								
							}
							
						}
						
						// System.out.println("isFamilyRankRelatedInfor::" + isFamilyRankRelatedInfor);
						// System.out.println("isGenusRankInfor::" + isGenusRankInfor);
						// System.out.println("isSpeciesRankInfor::" + isSpeciesRankInfor);

						
						
						if ( isFamilyRankRelatedInfor == true && isGenusRankInfor == false && isSpeciesRankInfor == false) {
							returnString += "\n" + returnTaxonIdentification;
						}
						else if ( isFamilyRankRelatedInfor == false && isGenusRankInfor == true && isSpeciesRankInfor == false ) {
							
							// Example: genus::IRIS;
							// Example2: genus::Iris;subgenus::Iris;
							
							String[] arrayOfReturnTaxonIdentification = returnTaxonIdentification.split(";");
							String[] arrayofItemZeroInArrayOfReturnTaxonIdentification = arrayOfReturnTaxonIdentification[0].split("::");
 							String returnGenusName = arrayofItemZeroInArrayOfReturnTaxonIdentification[1];
							
							returnString += returnGenusName + ";";
							
							// returnString += returnTaxonIdentification;
						}
						
					}
					
					
					// returnString += "\n";
					

					//
					// Set<String> allExtractedUnvalidatedTerms =
					// extractAllUnvalidatedTerms(inputXmlFileName,
					// allSchemaAttributeName);

					// for (String stringInAllextractedUnvalidatedTerms :
					// allextractedUnvalidatedTerms) {
					// allUnvalidatedTerms.add(stringInAllextractedUnvalidatedTerms);
					// }
					// allUnvalidatedTerms.addAll(allExtractedUnvalidatedTerms);
					//

					// Set<String> allExtractedRootElements =
					// extractAllRootElements(inputXmlFileName);
					// allRootElements.addAll(allExtractedRootElements);

				} catch (Exception e) {
					// handle Exception
				}
			}

		}

		// String[] allUnvalidatedTermsArray = allUnvalidatedTerms.toArray(new
		// String[0]);
		// System.out.println("allUnvalidatedTerms::" +
		// Arrays.toString(allUnvalidatedTermsArray));

		// String[] allRootElementsArray = allRootElements.toArray(new
		// String[0]);
		// System.out.println("allRootElementsArray::" +
		// Arrays.toString(allRootElementsArray));
		return returnString;
	}	
	
	
	

	
	// applyFamilyRankEtcToGenusFiles
	public static void applyFamilyRankEtcToGenusFiles(
			String folderName, Set<String> genusToCorrespondingFamilyEtcSetString)
			throws UnsupportedEncodingException, JDOMException, IOException {

		System.out.println("folderName:" + folderName);

		File inputFolder = new File(folderName);
		List<File> fileList = Arrays.asList(inputFolder.listFiles());

		if (fileList != null) {
			// for (File inputFile : inputFiles) {
			for (File inputFile : fileList) {

				if (inputFile.isDirectory()) {
					// walk(inputFile.getAbsolutePath());
					applyFamilyRankEtcToGenusFiles(inputFile.getPath(),
							genusToCorrespondingFamilyEtcSetString);

					// System.out.println("Dir:" + inputFile.getAbsoluteFile());
					// Don't use it! => // System.out.println("Dir2:" +
					// inputFile.getPath());

				} else {
					try {
						// System.out.println("folderName:" + folderName
						// + "::File:" + inputFile.getAbsoluteFile());
						// EX:
						// folderName:V23::File:/Users/ra/Documents/workspace_elvis/XMLFormatTransfer/V23/998.xml

						// System.out.println( "folderName:" + folderName +
						// "::File:" + inputFile.getName() );
						// Ex: folderName:V23::File:998.xml

						String inputXmlFileName = inputFile.getAbsoluteFile()
								.toString();

						Set<String> allSchemaAttributeName = extractAllSchemaAttributeName("semanticMarkupInput.xsd");
						applyFamilyRankAndEtcToGenusXmlfile(inputXmlFileName, genusToCorrespondingFamilyEtcSetString, allSchemaAttributeName);

					} catch (Exception e) {
						// handle Exception
					}
				}

			}
		} 

		

		

	}
	
	
	
	// create fileName Set<String>
	// walkAndFindFilesWithGivenFamilyName
	public static Set<String> walkAndFindFilesWithGivenFamilyName(
			String folderName, String givenFamilyName, Set<String> oldSetString)
			throws UnsupportedEncodingException, JDOMException, IOException {

		// System.out.println("folderName:" + folderName);

		File inputFolder = new File(folderName);
		List<File> fileList = Arrays.asList(inputFolder.listFiles());

		if (fileList != null) {
			// for (File inputFile : inputFiles) {
			for (File inputFile : fileList) {

				if (inputFile.isDirectory()) {
					// walk(inputFile.getAbsolutePath());
					walkAndFindFilesWithGivenFamilyName(inputFile.getPath(),
							givenFamilyName, oldSetString);

					// System.out.println("Dir:" + inputFile.getAbsoluteFile());
					// Don't use it! => // System.out.println("Dir2:" +
					// inputFile.getPath());

				} else {
					try {
						// System.out.println("folderName:" + folderName
						// + "::File:" + inputFile.getAbsoluteFile());
						// EX:
						// folderName:V23::File:/Users/ra/Documents/workspace_elvis/XMLFormatTransfer/V23/998.xml

						// System.out.println( "folderName:" + folderName +
						// "::File:" + inputFile.getName() );
						// Ex: folderName:V23::File:998.xml

						String inputXmlFileName = inputFile.getAbsoluteFile()
								.toString();
						String returnFamilyName = extractTaxonFamilyName(inputXmlFileName);
						if (returnFamilyName.toLowerCase().equals(givenFamilyName.toLowerCase())) {
							// System.out.println( "inputXmlFileName:" +
							// inputXmlFileName + "::returnFamilyName::" +
							// returnFamilyName);
							oldSetString.add(inputXmlFileName);
						}

					} catch (Exception e) {
						// handle Exception
					}
				}

			}
		}

		// System.out.println(oldSetString.size());

		return oldSetString;

	}

	// This function is called recursively
	private static List<Element> visitChildNodes(List<Element> elementList,
			Set<String> allSchemaAttributeName) {
		List<Element> returnElementList = new ArrayList<Element>();

		String[] allSchemaAttributeNameArray = allSchemaAttributeName
				.toArray(new String[0]);
		// System.out.println(Arrays.toString(allSchemaAttributeNameArray));

		// Java Converting a set to an array for String representation - Stack
		// Overflow
		// http://stackoverflow.com/questions/992807/java-converting-a-set-to-an-array-for-string-representation

		for (Element element : elementList) {
			String elementName = element.getName();
			String elementText = element.getText();
			// System.out.println("elementName:" + elementName +
			// "::elementText:" + elementText);

			Element reuturnElement = new Element(elementName);

			// if (!Arrays.asList(allSchemaAttributeNameArray).contains(
			// elementName)) {
			// System.out.println("Doesn't contain:" + elementName);
			// }

			// In Java, how can I test if an Array contains a certain value -
			// Stack Overflow
			// http://stackoverflow.com/questions/1128723/in-java-how-can-i-test-if-an-array-contains-a-certain-value

			if (!elementText.equals("")) {
				reuturnElement.setText(elementText);
			}

			// Check all attributes
			if (element.hasAttributes() == true) {
				// get attributes names and values
				List<Attribute> elementAttributeList = element.getAttributes();
				for (Attribute elementAttribute : elementAttributeList) {
					String elementAttributeName = elementAttribute.getName();
					String elementAttributeValue = elementAttribute.getValue();
					// System.out.println("elementAttributeName:" +
					// elementAttribute.getName() + "::elementAttributeValue:" +
					// elementAttribute.getValue());

					reuturnElement.setAttribute(elementAttributeName,
							elementAttributeValue);
				}

			}

			if (element.getChildren().size() > 0) {
				List<Element> childNodesElementList = visitChildNodes(
						element.getChildren(), allSchemaAttributeName);
				for (Element elementInChildNodesElementList : childNodesElementList) {
					reuturnElement.addContent(elementInChildNodesElementList);
				}
				returnElementList.add(reuturnElement);
			} else {
				returnElementList.add(reuturnElement);
			}

		}

		return returnElementList;
	}

	
	// visitAllChildNodesAndChangeEmptyStringToUnknown
	// This function is called recursively	
	private static List<Element> visitAllChildNodesAndChangeEmptyStringToUnknown(List<Element> elementList,
			Set<String> allSchemaAttributeName) {
		List<Element> returnElementList = new ArrayList<Element>();

		String[] allSchemaAttributeNameArray = allSchemaAttributeName
				.toArray(new String[0]);
		// System.out.println(Arrays.toString(allSchemaAttributeNameArray));

		// Java Converting a set to an array for String representation - Stack
		// Overflow
		// http://stackoverflow.com/questions/992807/java-converting-a-set-to-an-array-for-string-representation

		for (Element element : elementList) {
			String elementName = element.getName();
			String elementText = element.getText();
			// System.out.println("elementName:" + elementName +
			// "::elementText:" + elementText);

			Element reuturnElement = new Element(elementName);

			// if (!Arrays.asList(allSchemaAttributeNameArray).contains(
			// elementName)) {
			// System.out.println("Doesn't contain:" + elementName);
			// }

			// In Java, how can I test if an Array contains a certain value -
			// Stack Overflow
			// http://stackoverflow.com/questions/1128723/in-java-how-can-i-test-if-an-array-contains-a-certain-value

			if (!elementText.equals("")) {
				reuturnElement.setText(elementText);
			} else {
				reuturnElement.setText("unknown");
				
			}

			// Check all attributes
			if (element.hasAttributes() == true) {
				// get attributes names and values
				List<Attribute> elementAttributeList = element.getAttributes();
				for (Attribute elementAttribute : elementAttributeList) {
					String elementAttributeName = elementAttribute.getName();
					String elementAttributeValue = elementAttribute.getValue();
					// System.out.println("elementAttributeName:" +
					// elementAttribute.getName() + "::elementAttributeValue:" +
					// elementAttribute.getValue());

					reuturnElement.setAttribute(elementAttributeName,
							elementAttributeValue);
				}

			}

			if (element.getChildren().size() > 0) {
				List<Element> childNodesElementList = visitAllChildNodesAndChangeEmptyStringToUnknown(
						element.getChildren(), allSchemaAttributeName);
				for (Element elementInChildNodesElementList : childNodesElementList) {
					reuturnElement.addContent(elementInChildNodesElementList);
				}
				returnElementList.add(reuturnElement);
			} else {
				returnElementList.add(reuturnElement);
			}

		}

		return returnElementList;
	}
	
	
	
	// publication_title
	// visitAllChildNodesAndChangeElement_publication_title_EmptyStringToUnknown
	private static List<Element> visitAllChildNodesAndChangeElement_publication_title_EmptyStringToUnknown(List<Element> elementList,
			Set<String> allSchemaAttributeName) {
		List<Element> returnElementList = new ArrayList<Element>();

		String[] allSchemaAttributeNameArray = allSchemaAttributeName
				.toArray(new String[0]);
		// System.out.println(Arrays.toString(allSchemaAttributeNameArray));

		// Java Converting a set to an array for String representation - Stack
		// Overflow
		// http://stackoverflow.com/questions/992807/java-converting-a-set-to-an-array-for-string-representation

		for (Element element : elementList) {
			String elementName = element.getName();
			String elementText = element.getText();
			// System.out.println("elementName:" + elementName +
			// "::elementText:" + elementText);

			Element reuturnElement = new Element(elementName);

			// if (!Arrays.asList(allSchemaAttributeNameArray).contains(
			// elementName)) {
			// System.out.println("Doesn't contain:" + elementName);
			// }

			// In Java, how can I test if an Array contains a certain value -
			// Stack Overflow
			// http://stackoverflow.com/questions/1128723/in-java-how-can-i-test-if-an-array-contains-a-certain-value

			if ( elementName.equals("publication_title") ) {
				if (!elementText.equals("")) {
					reuturnElement.setText(elementText);
				} else {
					reuturnElement.setText("unknown");
				}
			} else {
				if (!elementText.equals("")) {
					reuturnElement.setText(elementText);
				}
			}
			
			

			// Check all attributes
			if (element.hasAttributes() == true) {
				// get attributes names and values
				List<Attribute> elementAttributeList = element.getAttributes();
				for (Attribute elementAttribute : elementAttributeList) {
					String elementAttributeName = elementAttribute.getName();
					String elementAttributeValue = elementAttribute.getValue();
					// System.out.println("elementAttributeName:" +
					// elementAttribute.getName() + "::elementAttributeValue:" +
					// elementAttribute.getValue());

					reuturnElement.setAttribute(elementAttributeName,
							elementAttributeValue);
				}

			}

			if (element.getChildren().size() > 0) {
				List<Element> childNodesElementList = visitAllChildNodesAndChangeElement_publication_title_EmptyStringToUnknown(
						element.getChildren(), allSchemaAttributeName);
				for (Element elementInChildNodesElementList : childNodesElementList) {
					reuturnElement.addContent(elementInChildNodesElementList);
				}
				returnElementList.add(reuturnElement);
			} else {
				returnElementList.add(reuturnElement);
			}

		}

		return returnElementList;
	}	
	
	
	
	// This function is called recursively
	private static Set<String> visitChildNodes2(List<Element> elementList) {
		Set<String> returnAttritubeNameSetString = new HashSet<String>();
		// Set<String> allSchemaAttributeNameSetString =
		// visitChildNodes3(rootChildren);

		for (Element element : elementList) {
			String elementName = element.getName();
			String elementText = element.getText();
			// System.out.println("elementName:" + elementName +
			// "::elementText:" + elementText);
			Element reuturnElement = new Element(elementName);

			if (!elementText.equals("")) {
				reuturnElement.setText(elementText);
			}

			// Check all attributes
			if (element.hasAttributes() == true) {
				// get attributes names and values
				List<Attribute> elementAttributeList = element.getAttributes();
				for (Attribute elementAttribute : elementAttributeList) {
					String elementAttributeName = elementAttribute.getName();
					String elementAttributeValue = elementAttribute.getValue();
					// System.out.println("elementAttributeName:" +
					// elementAttributeName + "::elementAttributeValue:" +
					// elementAttributeValue);

					if (elementAttributeName.equals("name")) {
						returnAttritubeNameSetString.add(elementAttributeValue);
					}
				}

			}

			if (element.getChildren().size() > 0) {
				Set<String> attritubeNameSetString = visitChildNodes2(element
						.getChildren());

				for (String stringInAttritubeNameSetString : attritubeNameSetString) {
					returnAttritubeNameSetString
							.add(stringInAttritubeNameSetString);
				}
				// java - How to Iterate over a Set HashSet without a Iterator -
				// Stack Overflow
				// http://stackoverflow.com/questions/12455737/how-to-iterate-over-a-set-hashset-without-a-iterator

			}
		}

		return returnAttritubeNameSetString;
	}

	// extractAllUnvalidatedTerms
	private static Set<String> visitAllUnvalidatedTerms(
			List<Element> elementList, Set<String> allSchemaAttributeName) {
		Set<String> returnAttritubeNameSetString = new HashSet<String>();

		String[] allSchemaAttributeNameArray = allSchemaAttributeName
				.toArray(new String[0]);
		// System.out.println(Arrays.toString(allSchemaAttributeNameArray));

		// Java Converting a set to an array for String representation - Stack
		// Overflow
		// http://stackoverflow.com/questions/992807/java-converting-a-set-to-an-array-for-string-representation

		for (Element element : elementList) {
			String elementName = element.getName();
			String elementText = element.getText();
			// System.out.println("elementName:" + elementName +
			// "::elementText:" + elementText);

			Element reuturnElement = new Element(elementName);

			if (!Arrays.asList(allSchemaAttributeNameArray).contains(
					elementName)) {
				// System.out.println("Doesn't contain:" + elementName);
				returnAttritubeNameSetString.add(elementName);
			}
			// In Java, how can I test if an Array contains a certain value -
			// Stack Overflow
			// http://stackoverflow.com/questions/1128723/in-java-how-can-i-test-if-an-array-contains-a-certain-value

			if (!elementText.equals("")) {
				reuturnElement.setText(elementText);
			}

			// Check all attributes
			if (element.hasAttributes() == true) {
				// get attributes names and values
				List<Attribute> elementAttributeList = element.getAttributes();
				for (Attribute elementAttribute : elementAttributeList) {
					String elementAttributeName = elementAttribute.getName();
					String elementAttributeValue = elementAttribute.getValue();
					// System.out.println("elementAttributeName:" +
					// elementAttribute.getName() + "::elementAttributeValue:" +
					// elementAttribute.getValue());

					reuturnElement.setAttribute(elementAttributeName,
							elementAttributeValue);
				}

			}

			// /*
			if (element.getChildren().size() > 0) {
				Set<String> attritubeNameSetString = visitAllUnvalidatedTerms(
						element.getChildren(), allSchemaAttributeName);

				for (String stringInAttritubeNameSetString : attritubeNameSetString) {
					returnAttritubeNameSetString
							.add(stringInAttritubeNameSetString);
				}
			}
			// */
		}

		return returnAttritubeNameSetString;
	}

	// matchGenusToCorrespondingFamilyEtc
	private static Set<String> matchGenusToCorrespondingFamilyEtc(
			Set<String> genusRankSetStringList,
			Set<String> familyRankWithKeyDescSetStringList) {

		Set<String> returnGenusToCorrespondingFamilyEtcSetString = new HashSet<String>();
		
		
		String[] genusRankSetStringListArray = genusRankSetStringList
				.toArray(new String[genusRankSetStringList.size()]);

		String[] familyRankWithKeyDescSetStringListArray = familyRankWithKeyDescSetStringList
				.toArray(new String[familyRankWithKeyDescSetStringList.size()]);

		// System.out.println("familyRankWithKeyDescSetStringList.size()::" +
		// familyRankWithKeyDescSetStringList.size());

		for (String genusRank : genusRankSetStringListArray) {

			// System.out.println("genusRank:" + genusRank);
			String outputString = genusRank + ";";

			for (String familyRankWithKeyDesc : familyRankWithKeyDescSetStringListArray) {

				// System.out.println("familyRankWithKeyDesc:" +
				// familyRankWithKeyDesc);
				// System.out.println("genusRank:" + genusRank);

				boolean isContainingGenusName = false;
				
				String[] familyRankWithKeyDescArray = familyRankWithKeyDesc.split(";");
				for (String stringInFamilyRankWithKeyDescArray : familyRankWithKeyDescArray) {
					
					String[] arrayOfStringInFamilyRankWithKeyDescArray = stringInFamilyRankWithKeyDescArray.split(" ");
					// if ( arrayOfStringInFamilyRankWithKeyDescArray.length == 1) {
					// 	arrayOfStringInFamilyRankWithKeyDescArray = stringInFamilyRankWithKeyDescArray.split("::");
					// }
					
					
					if (arrayOfStringInFamilyRankWithKeyDescArray.length > 1) {
						for ( String stringOfArrayOfStringInFamilyRankWithKeyDescArray : arrayOfStringInFamilyRankWithKeyDescArray) {
							stringOfArrayOfStringInFamilyRankWithKeyDescArray = stringOfArrayOfStringInFamilyRankWithKeyDescArray.replace(",", "");
							if ( stringOfArrayOfStringInFamilyRankWithKeyDescArray.toLowerCase().equals(genusRank.toLowerCase()) ) {
								isContainingGenusName = true;
							}
						}
						
						// if ( stringInFamilyRankWithKeyDescArray.split("\\s")[1].toLowerCase().equals(genusRank.toLowerCase()) ) {
						//	isContainingGenusName = true;
						// }						
					} else {
						if ( stringInFamilyRankWithKeyDescArray.toLowerCase().equals(genusRank.toLowerCase()) ) {
							isContainingGenusName = true;
						}			
					}
					

					
					
				}
				
				if ( isContainingGenusName == true ) {
				//if (familyRankWithKeyDesc.toLowerCase().contains(
				//		genusRank.toLowerCase())) {

					// System.out.println("genusRank:" + genusRank);

					

					// System.out.println("genusRank:" + genusRank);

					for (String itemInfamilyRankWithKeyDescArray : familyRankWithKeyDescArray) {
						if (itemInfamilyRankWithKeyDescArray.contains("::")) {
							// System.out.println(itemInfamilyRankWithKeyDescArray);

							outputString += itemInfamilyRankWithKeyDescArray
									+ ";";

						}

					}
				}

			}
			
			if (outputString.split(";").length < 2) {
				System.out.println("outputString::" + outputString);
				System.out.println(outputString.split(";").length);				
			}

			
			
			
			returnGenusToCorrespondingFamilyEtcSetString.add(outputString);
		}
		return returnGenusToCorrespondingFamilyEtcSetString;
	}


	
	private static void regrouping(String targetFolderName) throws UnsupportedEncodingException, JDOMException, IOException {
		
		// REGROUPING
		Set<String> initialFamilySetString = new HashSet<String>();
		
		Set<String> familyRankSetStringList = createFamilyRankSetStringList(targetFolderName, initialFamilySetString);
		String[] familyRankSetStringListArray = familyRankSetStringList.toArray(new String[familyRankSetStringList.size()]);
		System.out.println("familyRankSetStringList::");
		System.out.println(Arrays.toString(familyRankSetStringListArray));
		String regroupRootFolderName = "regroupRootFolder";
		
		// Path regroupRootFolderNamePath = regroupRootFolderName;
		// if ( Files.exists(regroupRootFolderNamePath)) {
		//	new File(regroupRootFolderName).mkdirs();
		// }
		
		File f = new File(regroupRootFolderName);
		if (f.exists() && f.isDirectory()) {
			System.out.println("regroupRootFolder exist!");
		} else {
			System.out.println("regroupRootFolder doesn't exist!");
			new File(regroupRootFolderName).mkdirs();
			for (String familyName : familyRankSetStringListArray) {
				new File(regroupRootFolderName + "/" + familyName).mkdirs();
				Set<String> initialFileNameSetString = new HashSet<String>();
				// copy and rename the file to this folder
				Set<String> initialFileNameSetStringList = walkAndFindFilesWithGivenFamilyName(targetFolderName, familyName, initialFileNameSetString);
				String[] initialFileNameSetStringListArray = initialFileNameSetStringList.toArray(new String[initialFileNameSetStringList.size()]);
				System.out.println("familyName::" + familyName);
				System.out.println(Arrays.toString(initialFileNameSetStringListArray));
				for (String fileNamePath : initialFileNameSetStringListArray) {
					System.out.println("fileNamePath:" + fileNamePath);
					String[] fileNamePathArray = fileNamePath.split("/");
					String destFileParentFolderName = fileNamePathArray[fileNamePathArray.length-2];
					String destFileName =fileNamePathArray[fileNamePathArray.length-1];
					
					String[] destfileNameArray = destFileName.split("\\.");
					String destfileNameText = destfileNameArray[0];
					
					String newDestfileName = familyName + "_" + destFileParentFolderName + "_" + destFileName;
					System.out.println("New destFileName:" + newDestfileName);
					
					FileUtils.copyFile(new File(fileNamePath), new File(regroupRootFolderName + "/" + familyName + "/" + newDestfileName));
				}
			} 
		 }
		
		
	}
	
	
	private static void generateFamilyRankWithKeyDescSetStringList(String targetFolderName) throws UnsupportedEncodingException, JDOMException, IOException {
		// Step 1: Generate familyRankWithKeyDescSetStringList.csv

		Set<String> initialFamilyRankWithKeyDescSetString = new HashSet<String>();
		Set<String> familyRankWithKeyDescSetStringList = createFamilyRankWithKeyDescSetStringList(targetFolderName, initialFamilyRankWithKeyDescSetString);
		
		String[] familyRankWithKeyDescSetStringListArray = familyRankWithKeyDescSetStringList.toArray(new String[familyRankWithKeyDescSetStringList.size()]); //
		
		// System.out.println(Arrays.toString(familyRankWithKeyDescSetStringListArray));
		// System.out.println("familyRankWithKeyDescSetStringListArray.length::" + familyRankWithKeyDescSetStringListArray.length);
		
		StringBuilder outputStringBuilder = new StringBuilder("");
		for (String familyRankWithKeyDescSetString : familyRankWithKeyDescSetStringListArray) {
			System.out.println(familyRankWithKeyDescSetString);
			outputStringBuilder.append(familyRankWithKeyDescSetString + "\n");
		}
		
		
		try (PrintWriter out = new PrintWriter(
				new BufferedWriter(new FileWriter("familyRankWithKeyDescSetStringList.csv", true)))) {
			out.println(outputStringBuilder);
		} catch (IOException e) {
			// exception handling left as an exercise for the reader
		}
		

	
		
	}
	
	
	private static void outputGenusToCorrespondingFamilyEtcSetString(Set<String> genusToCorrespondingFamilyEtcSetString) {
		String[] genusToCorrespondingFamilyEtcSetStringArray = genusToCorrespondingFamilyEtcSetString.toArray(new String[genusToCorrespondingFamilyEtcSetString.size()]);		
		// System.out.println(Arrays.toString(familyRankWithKeyDescSetStringListArray));
		// System.out.println("familyRankWithKeyDescSetStringListArray.length::" + familyRankWithKeyDescSetStringListArray.length);
		
		StringBuilder outputStringBuilder = new StringBuilder("");
		for (String itemInGenusToCorrespondingFamilyEtcSetStringArray : genusToCorrespondingFamilyEtcSetStringArray) { 
			// System.out.println(itemInGenusToCorrespondingFamilyEtcSetStringArray);
			outputStringBuilder.append(itemInGenusToCorrespondingFamilyEtcSetStringArray + "\n");
		}
				

		try (PrintWriter out = new PrintWriter(
				new BufferedWriter(new FileWriter(
						"familyRankWithKeyDescSetStringList-V21-2.csv", true)))) {
			out.println(outputStringBuilder);
		} catch (IOException e) {
			// exception handling left as an exercise for the reader
		}
		
	}
	
	
	private static Set<String> step3ToStep4(String targetFolderName, String targetCsvFileName) throws UnsupportedEncodingException, JDOMException, IOException {
		// Step 3: Match to all genus name list

		
		// One single process from Step 3-1, Step 3-2 to Step 4 
		// Step 3-1: Build genusRankSetStringList
		
		Set<String> initialGenusSetString = new HashSet<String>();
		Set<String> genusRankSetStringList = createGenusRankSetStringList(targetFolderName, initialGenusSetString);

		// Step 3-2: Build familyRankWithKeyDescSetStringList2 from csv file
		//String targetCsvFileName = "familyRankWithKeyDescSetStringList-V21.csv";
		
		Set<String> initialFamilyRankWithKeyDescSetStringFromCsv = new HashSet<String>();
		Set<String> familyRankWithKeyDescSetStringListFromCsv = readFamilyRankWithKeyDescSetStringListFromCsv(targetCsvFileName, initialFamilyRankWithKeyDescSetStringFromCsv);

		//System.out.println("familyRankWithKeyDescSetStringListFromCsv.size()::" + familyRankWithKeyDescSetStringListFromCsv.size());
		
		// Step 4: Match Genus To Corresponding Family and other information, etc.
		Set<String> genusToCorrespondingFamilyEtcSetString = matchGenusToCorrespondingFamilyEtc(genusRankSetStringList, familyRankWithKeyDescSetStringListFromCsv);
		
		// outputGenusToCorrespondingFamilyEtcSetString(genusToCorrespondingFamilyEtcSetString);
		
		// // Print Set<String> genusToCorrespondingFamilyEtcSetString
		// String[] genusToCorrespondingFamilyEtcSetStringArray = genusToCorrespondingFamilyEtcSetString.toArray(new String[genusToCorrespondingFamilyEtcSetString.size()]);
		// // System.out.println("genusToCorrespondingFamilyEtcSetStringArray.length::" + genusToCorrespondingFamilyEtcSetStringArray.length); //
		// System.out.println(Arrays.toString(genusToCorrespondingFamilyEtcSetStringArray));
		
		return genusToCorrespondingFamilyEtcSetString;
		
		
	}
	
	private static void step5Process(String targetFolderName, Set<String> genusToCorrespondingFamilyEtcSetString) throws UnsupportedEncodingException, JDOMException, IOException {
		// Step 5: add it into all xml files
		applyFamilyRankEtcToGenusFiles(targetFolderName, genusToCorrespondingFamilyEtcSetString);
		
	}
	

}
