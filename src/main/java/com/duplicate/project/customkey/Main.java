package com.duplicate.project.customkey;

 class Main extends Abs {

	public static void main(String[] args) {
		Main m1=new Main();
		String text=m1.hello();
		String encryptedText=AES_Encryption.encrypt(text, "xyz");
		System.out.println(encryptedText);
String decryptedText=AES_Encryption.decrypt(encryptedText, "xyz");
System.out.println(decryptedText);
	

	

	

	
}
	@Override
	public String hello() {
		String text="hello is called";
		return text;
	}

	@Override
	public void hello1() {
		// TODO Auto-generated method stub
		
	}
}