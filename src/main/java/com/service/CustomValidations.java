package com.service;

public class CustomValidations {

	public String validateDataFileds(int lineNo, String paccountno, String s1accountNo, String s2acctNo,
			String s3acctNo, String s4acctNo, String s5acctNo, String dob) {

		String finalgotvalue = "", respmsg = "";

		// validating the filed data

		if (lineNo != 0 && paccountno.equals("") ||  paccountno.length() != 9 && paccountno.length() != 10) {
			finalgotvalue = "2";
			respmsg = "P_ACCOUNT_NO IS EMPTY/LENGTH IS NOT 9/ 10";
		} else if (lineNo != 0 && !s1accountNo.equals("") && s1accountNo.length() != 9 && s1accountNo.length() != 10) {
			System.out.println("s1acct" + s1accountNo);
			finalgotvalue = "3";
			respmsg = "S1_ACCT_NO IS EMPTY/LENGTH IS NOT 9 /10";
		} else if (lineNo != 0 && !s2acctNo.equals("") && s2acctNo.length() != 9 && s2acctNo.length() != 10) {
			System.out.println("s2acctNo" + s2acctNo);
			finalgotvalue = "4";
			respmsg = "S2_ACCT_NO IS EMPTY/LENGTH IS NOT 9 /10";
		} else if (lineNo != 0 && !s3acctNo.equals("") && s3acctNo.length() != 9 && s3acctNo.length() != 10) {
			finalgotvalue = "5";
			System.out.println("income" + s3acctNo);
			respmsg = "S3_ACCT_NO IS EMPTY/LENGTH IS NOT 9 /10";
		} else if (lineNo != 0 && !s4acctNo.equals("") && s4acctNo.length() != 9 && s4acctNo.length() != 10) {
			finalgotvalue = "6";
			respmsg = "S4_ACCT_NO IS EMPTY/LENGTH IS NOT 9/10";
		} else if (lineNo != 0 && !s5acctNo.equals("") && s5acctNo.length() != 9 && s5acctNo.length() != 10) {
			System.out.println("account no length ::::::   " + s4acctNo.length());
			System.out.println("s4accountNo IS EMPTY/LENGTH IS NOT 9/ 10  " + paccountno);
			finalgotvalue = "7";
			respmsg = "S5_ACCT_NO IS EMPTY/LENGTH IS NOT 9/10";
		} else if (lineNo != 0 && dob.isEmpty()) {

			respmsg = "DOB IS EMPTY";
			finalgotvalue = "10";
		} else if (lineNo != 0 && !dob.isEmpty()) {
			try {
				int doblength = dob.length();
				String valuefordob = dob.substring(0, 2);
				int firstdate = 0, monthval = 0;
				String symblvalidation = dob.substring(2, 3);
				String monthvalidation = dob.substring(3, 5);
				// System.out.println("valuefordob"+valuefordob+"\n
				// symblvalidation"+symblvalidation+"\n
				// monthvalidation"+monthvalidation);
				if (valuefordob.contains("/") || monthvalidation.contains("/") || doblength > 10 || doblength < 10) {
					System.out.println("DOB formate is wrong PLEASE PROVIDE 01/12/2018 format");

				} else {
					firstdate = Integer.parseInt(valuefordob);
					monthval = Integer.parseInt(monthvalidation);
				}
				if (firstdate > 31 || !symblvalidation.equalsIgnoreCase("/") || monthval > 12) {

					System.out.println("DOB formate is wrong PLEASE PROVIDE 01/12/2018 format");
					finalgotvalue = "10";
				} else {
					finalgotvalue = "0000";
				}
			} catch (Exception e) {
				System.out.println("DOB formate is wrong PLEASE PROVIDE 01/12/2018 format");

			}

		} else {
			System.out.println("---------ELSE-----------");

		}

		
		System.out.println(" Response message ::   "+respmsg  +"            final value :::::   "+finalgotvalue);
		
		if (lineNo != 0) {

			if (finalgotvalue.equals("0000")) {
				// checking account validation

			}
			if (finalgotvalue.equals("0000")) {

			}
			if (finalgotvalue.equals("0000")) {

			}
			if (finalgotvalue.equals("0000")) {

			}

		}

		return finalgotvalue;
	}

}
