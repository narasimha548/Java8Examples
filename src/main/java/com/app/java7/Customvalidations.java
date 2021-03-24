package com.app.java7;

public class Customvalidations {
	public static void main(String[] args) {
		
		String respCode=""; 
		
		String chn="5816930000912168";
		String product="5391711101";
		String  subproduct="00000001";
		String customerId="125754778";
		String mobile="";
		
		if(chn.isEmpty() || chn.length()!=16){
			System.out.println("check chn length | chn length empty "+chn.length());
		}else if(product.isEmpty() || ! product.equals("5391711101")){
			System.out.println("check product code | product code empty ");
		}else if(subproduct.isEmpty() || !subproduct.equals("00000001")){
			System.out.println("check sub product code | sub  product code empty ");
		}else if(customerId.isEmpty()){
			System.out.println("check customer id  empty ");
		}else if(mobile.isEmpty() || mobile.length() >20){
			System.out.println("check mobile | mobile ");
		}else{
			respCode="0000";
		}
		
	}

}
