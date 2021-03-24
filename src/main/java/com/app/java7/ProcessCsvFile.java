package com.app.java7;

import java.io.BufferedReader;
import java.io.FileReader;

import com.service.CustomValidations;

public class ProcessCsvFile {
	
	
	CustomValidations cust=new CustomValidations();

	public void processCSVFileFormat(String fileName) {

		FileReader fr = null;
		BufferedReader br = null;
		String line = "";
		String splityBy = ",";
		int lineNo = 0;
		String[] split;

		String InsertQryValues = "VALUES ( "; 
		
	      	String batchid = "", bulkRefId = "", customerId = "", name = "", dob = "", gender = "", martialStatus = "",
				nataionality = "", documentProvided = "", documentNumber = "", fatherName = "", mobile = "", email = "",
				paccountno = "", pcurrencyCode = "", pcurrencyType = "", s1accountNo = "", s1CurrencyCode = "",
				s1CurrencyType = "", s2acctNo = "", s2CurrencyCode = "", s2CurrencyType = "", s3acctNo = "",
				s3CurrencyCode = "", s3CurrencyType = "", s4acctNo = "", s4CurrencyCode = "", s4CurrencyType = "",
				s5acctNo = "", s5CurrencyCode = "", s5CurrencyType = "", branch = "" , finalgotvalue="";

		// total columns 31

		try {

			br = new BufferedReader(new FileReader(fileName));

			while ((line = br.readLine()) != null) {
				split = line.split(splityBy);

				System.out.println("headers length "+split.length);
				
				
				if (lineNo == 0) {
					setHeader(split);
				}else if(lineNo>=1){

					
				//Reading data from row 1
				if (!split[0].isEmpty()) {
					batchid = split[0];
					InsertQryValues+= "\'" + batchid + "\' ,";
					System.out.println("batchid  " + batchid);
				}
				else if (split[0].isEmpty()) {
					batchid = split[0];
					InsertQryValues+= "\'" + batchid + "\' ,";
					System.out.println("Else block---------> batchid  " + batchid);
				}
				
				
				if (!split[1].isEmpty()) {
					bulkRefId = split[1];
					InsertQryValues+= "\'" + bulkRefId + "\',";
					System.out.println("bulkRefId  " + bulkRefId);
				}	
				else if (split[1].isEmpty()) {
					bulkRefId = split[1];
					InsertQryValues+= "\'" + bulkRefId + "\',";
					System.out.println("Else block-------> bulkRefId  " + bulkRefId);
				}
				
				
				
		
				if (!split[2].isEmpty()) {
					customerId = split[2];
					InsertQryValues+= "\'" + customerId + "\',";
					System.out.println("customerId  " + customerId);
				}
				else if (split[2].isEmpty()) {
					customerId = split[2];
					InsertQryValues+= "\'" + customerId + "\',";
					System.out.println("Else block------>customerId  " + customerId);
				}
				
				
				if (!split[3].isEmpty()) {
					name = split[3];
					InsertQryValues+= "\'" + name + "\',";
					System.out.println("name  " + name);
				}
				else if (split[3].isEmpty()) {
					name = split[3];
					InsertQryValues+= "\'" + name + "\',";
					System.out.println("Else block--------> name  " + name);
				}
				
				
				if (!split[4].isEmpty()) {
					dob = split[4];
					InsertQryValues+= "\'" + dob + "\',";
					System.out.println("dob  " + dob);
				}else if (split[4].isEmpty()) {
					dob = split[4];
					InsertQryValues+= "\'" + dob + "\',";
					System.out.println("Else block--------> dob  " + dob);
				}
				
				
				
				
				if (!split[5].isEmpty()) {
					gender = split[5];
					InsertQryValues+= "\'" + gender + "\',";
					System.out.println("gender  " + gender);
				}	else if (split[5].isEmpty()) {
					gender = split[5];
					InsertQryValues+= "\'" + gender + "\',";
					System.out.println("Else block------> gender  " + gender);
				}
				
				
				
				
				if (!split[6].isEmpty()) {
					martialStatus = split[6];
					InsertQryValues+= "\'" + martialStatus + "\',";
					System.out.println("martialStatus  " + martialStatus);
				}	else if (split[6].isEmpty()) {
					martialStatus = split[6];
					InsertQryValues+= "\'" + martialStatus + "\',";
					System.out.println("Else block---> martialStatus  " + martialStatus);
				}
				
				
		
				
				
				if (!split[7].isEmpty()) {
					nataionality = split[7];
					InsertQryValues+= "\'" + nataionality + "\',";
					System.out.println("nataionality  " + nataionality);
				}	
				else if (split[7].isEmpty()) {
					nataionality = split[7];
					InsertQryValues+= "\'" + nataionality + "\',";
					System.out.println("Else block --------> nataionality  " + nataionality);
				}
				
				if (!split[8].isEmpty()) {
					documentProvided = split[8];
					InsertQryValues+= "\'" + documentProvided + "\',";
					System.out.println("documentProvided  " + documentProvided);
				}	else if (split[8].isEmpty()) {
					documentProvided = split[8];
					InsertQryValues+= "\'" + documentProvided + "\',";
					System.out.println("Else block------> documentProvided  " + documentProvided);
				}
				
				
			
				if (!split[9].isEmpty()) {
					documentNumber = split[9];
					InsertQryValues+= "\'" + documentNumber + "\',";
					System.out.println("documentNumber  " + documentNumber);
				}
				else if (split[9].isEmpty()) {
					documentNumber = split[9];
					InsertQryValues+= "\'" + documentNumber + "\',";
					System.out.println("Else block-----> documentNumber  " + documentNumber);
				}
				
				
				if (!split[10].isEmpty()) {
					fatherName = split[10];
					InsertQryValues+= "\'" + fatherName + "\',";
					System.out.println("fatherName  " + fatherName);
				}	
				else if (split[10].isEmpty()) {
					fatherName = split[10];
					InsertQryValues+= "\'" + fatherName + "\',";
					System.out.println("Else block------> fatherName  " + fatherName);
				}
				
				
				
				if (!split[11].isEmpty()) {
					mobile = split[11];
					InsertQryValues+= "\'" + mobile + "\',";
					System.out.println("mobile  " + mobile);
				}	
				else if (split[11].isEmpty()) {
					mobile = split[11];
					InsertQryValues+= "\'" + mobile + "\',";
					System.out.println("Else block----> mobile  " + mobile);
				}
				
				
		
				if (!split[12].isEmpty()) {
					email = split[12];
					InsertQryValues+= "\'" + email + "\',";
					System.out.println("email  " + email);
				}
				else if (split[12].isEmpty()) {
					email = split[12];
					InsertQryValues+= "\'" + email + "\',";
					System.out.println("Else block-----> email  " + email);
				}
				
				
				
				
				
				if (!split[13].isEmpty()) {
					paccountno = split[13];
					InsertQryValues+= "\'" + paccountno + "\',";
					System.out.println("paccountno  " + paccountno);
				}	
				else if (split[13].isEmpty()) {
					paccountno = split[13];
					InsertQryValues+= "\'" + paccountno + "\',";
					System.out.println("Else block----> paccountno  " + paccountno);
				}
				
				
				
				if (!split[14].isEmpty()) {
					pcurrencyCode = split[14];
					InsertQryValues+= "\'" + pcurrencyCode + "\',";
					System.out.println("pcurrencyCode  " + pcurrencyCode);
				}	
				else if (split[14].isEmpty()) {
					pcurrencyCode = split[14];
					InsertQryValues+= "\'" + pcurrencyCode + "\',";
					System.out.println("Else block ----> pcurrencyCode  " + pcurrencyCode);
				}
				
				
				if (!split[15].isEmpty()) {
					pcurrencyType = split[15];
					InsertQryValues+= "\'" + pcurrencyType + "\',";
					System.out.println("pcurrencyType  " + pcurrencyType);
				}	
				else if (split[15].isEmpty()) {
					pcurrencyType = split[15];
					InsertQryValues+= "\'" + pcurrencyType + "\',";
					System.out.println(" Else block ------> pcurrencyType  " + pcurrencyType);
				}
				
				
				if (!split[16].isEmpty()) {
					s1accountNo = split[16];
					InsertQryValues+= "\'" + s1accountNo + "\',";
					System.out.println("s1accountNo  " + s1accountNo);
				}else if (split[16].isEmpty()) {
					s1accountNo = split[16];
					InsertQryValues+= "\'" + s1accountNo + "\',";
					System.out.println("else block------->  s1accountNo  " + s1accountNo);
				}
				
				
			
				if (!split[17].isEmpty()) {
					s1CurrencyCode = split[17];
					InsertQryValues+= "\'" + s1CurrencyCode + "\',";
					System.out.println("s1CurrencyCode  " + s1CurrencyCode);
				}	
				else if (split[17].isEmpty()) {
					s1CurrencyCode = split[17];
					InsertQryValues+= "\'" + s1CurrencyCode + "\',";
					System.out.println("Else block ------->   s1CurrencyCode  " + s1CurrencyCode);
				}
				
				if (!split[18].isEmpty()) {
					s1CurrencyType = split[18];
					InsertQryValues+= "\'" + s1CurrencyType + "\',";
					System.out.println("s1CurrencyType  " + s1CurrencyType);
				}else 	if (split[18].isEmpty()) {
					s1CurrencyType = split[18];
					InsertQryValues+= "\'" + s1CurrencyType + "\',";
					System.out.println("Else block ------->   s1CurrencyType  " + s1CurrencyType);
				}
				
				
				if (split[19].isEmpty()) {
					s2acctNo = split[19];
					InsertQryValues+= "\'" + s2acctNo + "\',";
					System.out.println("s2acctNo  " + s2acctNo);
				}	else if (split[19].isEmpty()) {
					s2acctNo = split[19];
					InsertQryValues+= "\'" + s2acctNo + "\',";
					System.out.println("Else block-----> s2acctNo  " + s2acctNo);
				}
				
				if (!split[20].isEmpty()) {
					s2CurrencyCode = split[20];
					InsertQryValues+= "\'" + s2CurrencyCode + "\',";
					System.out.println("s2CurrencyCode  " + s2CurrencyCode);
				}
				else if (!split[20].isEmpty()) {
					s2CurrencyCode = split[20];
					InsertQryValues+= "\'" + s2CurrencyCode + "\',";
					System.out.println("Else block------> s2CurrencyCode  " + s2CurrencyCode);
				}
				
				
				if (!split[21].isEmpty()) {
					s2CurrencyType = split[21];
					InsertQryValues+= "\'" + s2CurrencyType + "\',";
					System.out.println("Else block-------> s2CurrencyType  " + s2CurrencyType);
				}
				else if (split[21].isEmpty()) {
					s2CurrencyType = split[21];
					InsertQryValues+= "\'" + s2CurrencyType + "\',";
					System.out.println("Else block -------> s2CurrencyType  " + s2CurrencyType);
				}
				
				if (!split[22].isEmpty()) {
					s3acctNo = split[22];
					InsertQryValues+= "\'" + s3acctNo + "\',";
					System.out.println("s3acctNo  " + s3acctNo);
				}	else if (split[22].isEmpty()) {
					s3acctNo = split[22];
					InsertQryValues+= "\'" + s3acctNo + "\',";
					System.out.println("Else block -----> s3acctNo  " + s3acctNo);
				}
				
				
				
				
				
				if (!split[23].isEmpty()) {
					s3CurrencyCode = split[22];
					InsertQryValues+= "\'" + s3CurrencyCode + "\',";
					System.out.println("s3CurrencyCode  " + s3CurrencyCode);
				}
				else if (split[23].isEmpty()) {
					s3CurrencyCode = split[22];
					InsertQryValues+= "\'" + s3CurrencyCode + "\',";
					System.out.println("Else block ----> s3CurrencyCode  " + s3CurrencyCode);
				}
				
				
				
				if (!split[24].isEmpty()) {
					s3CurrencyType = split[24];
					InsertQryValues+= "\'" + s3CurrencyType + "\',";
					System.out.println("s3CurrencyType  " + s3CurrencyType);
				}
				
				else if (split[24].isEmpty()) {
					s3CurrencyType = split[24];
					InsertQryValues+= "\'" + s3CurrencyType + "\',";
					System.out.println("Else block -----s3CurrencyType  " + s3CurrencyType);
				}
				
				
				
				if (!split[25].isEmpty()) {
					s4acctNo = split[25];
					InsertQryValues+= "\'" + s4acctNo + "\',";
					System.out.println("s4acctNo  " + s4acctNo);
				}
				else if (split[25].isEmpty()) {
					s4acctNo = split[25];
					InsertQryValues+= "\'" + s4acctNo + "\',";
					System.out.println("else block s4acctNo  " + s4acctNo);
				}
				
			 if (!split[26].isEmpty()) {
					s4CurrencyCode = split[26];
					InsertQryValues+= "\'" + s4CurrencyCode + "\',";
					System.out.println("s4CurrencyCode  " + s4CurrencyCode);
				}
				
			 else  if (split[26].isEmpty()) {
				 s4CurrencyCode = split[26];
					InsertQryValues+= "\'" + s4CurrencyCode + "\',";
					System.out.println("Else block -----s4CurrencyCode  " + s4CurrencyCode);
				}
			 
				
			 if (!split[27].isEmpty()) {
					s4CurrencyType = split[27];
					InsertQryValues+= "\'" + s4CurrencyType + "\',";
					System.out.println("s4CurrencyType  " + s4CurrencyType);
				}
				
			 else if (split[27].isEmpty()) {
					s4CurrencyType = split[27];
					InsertQryValues+= "\'" + s4CurrencyType + "\',";
					System.out.println("Else block -----s4CurrencyType  " + s4CurrencyType);
				}
			 
			 
				if (!split[28].isEmpty()) {
					s5acctNo = split[28];
					InsertQryValues+= "\'" + s5acctNo + "\',";
					System.out.println("s5acctNo  " + s5acctNo);
				}
				else if (split[28].isEmpty()) {
					s5acctNo = split[28];
					InsertQryValues+= "\'" + s5acctNo + "\',";
					System.out.println("else block  s5acctNo  " + s5acctNo);
				}
				
				
				 
				if (!split[29].isEmpty()) {
					s5CurrencyCode = split[29];
					InsertQryValues+= "\'" + s5CurrencyCode + "\',";
					System.out.println("s5CurrencyCode  " + s5CurrencyCode);
				}
				else if (split[29].isEmpty()) {
					s5CurrencyCode = split[29];
					InsertQryValues+= "\'" + s5CurrencyCode + "\',";
					System.out.println("else block s5CurrencyCode  " + s5CurrencyCode);
				}
				
				if (!split[30].isEmpty()) {
					s5CurrencyType = split[30];
					InsertQryValues+= "\'" + s5CurrencyType + "\',";
					System.out.println("s5CurrencyType  " + s5CurrencyType);
				}
				else if (split[30].isEmpty()) {
					s5CurrencyType = split[30];
					InsertQryValues+= "\'" + s5CurrencyType + "\',";
					System.out.println("else block s5CurrencyType  " + s5CurrencyType);
				}
				
				
				if (!split[31].isEmpty()) {
					branch = split[31];
					InsertQryValues+= "\'" + branch + "\',";
					System.out.println("branch  " + branch);
				}
				else if (split[31].isEmpty()) {
					branch = split[31];
					InsertQryValues+= "\'" + branch + "\',";
					System.out.println("else block branch  " + branch);
				}
				
				
				
			//	System.out.println("account no length ::::::   "+paccountno.length());
			
			
			/*	else if(lineNo!=0 && customerId.isEmpty()  ){
					System.out.println("customerId no length ::::::   "+customerId.length());
					System.out.println("customerId is empty " + customerId);
				}*/
			
		/*		if (i != 0 && finalgotvalue.equalsIgnoreCase("0000")) {

					x = jdbctemplate.update(InsertQry);
					if (x > 0) {
						count++;
					}
					//
				} else {
					if (i != 0) {
						int insertfail = dao.insertbulkregcardsstatus(instid, filename, CUSTOMERID, i, usercode,
								randomreportid, finalgotvalue, respmsg, jdbctemplate);
						if (insertfail > 0) {
							failure++;
						}
					}
				}*/
				
				String value=cust.validateDataFileds(lineNo, paccountno, s1accountNo, s2acctNo, s3acctNo, s4acctNo, s5acctNo, dob);
				
				System.out.println("insert query :::::  "+InsertQryValues);
				
				
				}//end else block	

				System.out.println("row count *******  " + lineNo++);
			} // end while loop

		} catch (Exception e) {

		}

	}
	
	
	public void removingUnwantedSpace(){
		
	}

	public static void setHeader(String header[]) {

		if (header[0].equals("BATCH_ID")) {
          System.out.println("header ::::   ");
		}
		if (header[1].equals("BULK_REG_REF_ID")) {
			System.out.println("header ::::   ");
		}

	}

}
