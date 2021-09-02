package com.java.test;

public class Main {

	public static void main(String[] args) {
LogicService logicService = new LogicService();
		
//		String ppt = "<p>@S1</p>\r\n"
//				+ "		<h1>title</h1>\r\n"
//				+ "		<p>test</p>\r\n"
//				+ "		<p>@S2</p>\r\n"
//				+ "		<h3>subtitle</h3>\r\n"
//				+ "		<p>Lorem, ipsum dolor sit amet consectetur adipisicing elit.</p>\r\n"
//				+ "		<p>A delectus nihil labore nam sit porro, ducimus est, repellendus, maiores numquam ipsa amet.</p>";
//		
		String ppt = "<p>@S1</p>\r\n"
				+ "<h1>hihi</h1>\r\n"
				+ "<ul>\r\n"
				+ "<li>\r\n"
				+ "<p>nonono</p>\r\n"
				+ "</li>\r\n"
				+ "</ul>\r\n"
				+ "<p>testptag</p>\r\n"
				+ "<p>@S2</p>\r\n"
				+ "<h1>hihi</h1>\r\n"
				+ "<p>ppppsdf<br>\r\n"
				+ "testptag</p>\r\n"
				+ "<p>@S1</p>\r\n"
				+ "<h1>hihi</h1>\r\n"
				+ "<ul>\r\n"
				+ "<li>\r\n"
				+ "<p>nonono</p>\r\n"
				+ "</li>\r\n"
				+ "</ul>\r\n"
				+ "<p>testptag</p>\r\n"
				+ "<p>@Snjnjk</p>\r\n"
				+ "<h1>hihi</h1>\r\n"
				+ "<p>ppppsdf<br>\r\n"
				+ "testptag</p>"
				+ "<p>@S3</p>\r\n"
				+ "<h1>title3</h1>\r\n"
				+ "<p>= 첫번째 칸<br>\r\n"
				+ "= 두번째 칸<br>\r\n"
				+ "= 세번째 칸<br>\r\n"
				+ "= 네번째 칸</p>"
				+ "<p>@S3</p>\r\n"
				+ "<h2>3번입니다</h2>\r\n"
				+ "<p>= ### div1 이게 또 문제네<br>\r\n"
				+ "여긴 div1 안의 p태그<br>\r\n"
				+ "= ### div2 어떡하지<br>\r\n"
				+ "여긴 div2 안의 p태그니까 pp</p>";
		


//		String ppt = "<p>@S4</p>\r\n"
//				+ "		<h1>4번샘플</h1>\r\n"
//				+ "		<p>= 첫번째칸입니다.</p>\r\n"
//				+ "		<p>= 두번째칸 전에 엔터함<br>\r\n"
//				+ "		= 멍청이가 세번째칸도 만들었음 이건 두번째에 넣을거다</p>";
		
		
		ppt = ppt.replaceAll("<br>\r\n", "</p>\r\n<p>"); // p태그 사이에 br태그 제거
		
		String[] pptBits = ppt.split("<p>@S");
		
		
		for(int i = 1; i < pptBits.length; i++) {
			String startTag = "";
			String endTag = "";
			
			String[] pptBitBits = pptBits[i].split("\r\n");
			
			switch(Character.toString(pptBitBits[0].charAt(0))){
			case "1" :
				startTag = "<section class=\"S1\"><div class=\"wrap\">";
				endTag = "</div></section>";
				
				String resultContent = logicService.getContent(pptBitBits, startTag, endTag, pptBitBits.length);
				
				System.out.println("S1 : \r\n" + resultContent);
				
				break;
			case "2" :
				startTag = "<section class=\"S2\"><div class=\"wrap\"><div class=\"content-center\">";
				endTag = "</div></div></section>";
				
				String resultContent2 = logicService.getContent(pptBitBits, startTag, endTag, pptBitBits.length);
				
				System.out.println("S2 : \r\n" + resultContent2);
				
				break;
			case "3" : 
				startTag = "<section class=\"S3\"><div class=\"wrap\">";
				endTag = "</div></section>";
				
				String resultContent3 = logicService.getContent(pptBitBits, startTag, endTag, pptBitBits.length);
				
				System.out.println("S3 : \r\n" + resultContent3);
				break;
			case "4" : 
				
				break;
			}
			
		}

	}

}
