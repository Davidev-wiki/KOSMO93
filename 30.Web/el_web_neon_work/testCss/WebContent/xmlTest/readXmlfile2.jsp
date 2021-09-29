<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import="javax.xml.parsers.DocumentBuilderFactory" %> 
<%@ page import="javax.xml.parsers.DocumentBuilder" %>
<%@ page import="org.w3c.dom.Document" %>
<%@ page import="org.w3c.dom.NodeList" %>
<%@ page import="org.w3c.dom.Node" %>
<%@ page import="org.w3c.dom.Element" %>
<%@ page import="java.io.File" %>

<%@ page import="a.b.c.com.common.CommonXML" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!
	// jsp 에서 함수를 사용하려먼 <%! 에서 사용하면 된다. 
	private static String getTagValue(String sTag, Element eElement) 
	{
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		Node nValue = (Node) nlList.item(0);
		return nValue.getNodeValue();
	}
%>
<%
	// 절대경로 Path : 로컬 "File"인 경우엔 절대 경로를 입력해주어야 찾을 수 있다.
	// 				 상대 경로 입력시 파일을 찾지 못함
	// String xmlFilePath = "/testCss/xmlTest";
	// /testCss/xmlTest.file.xml문서를 File객체로 만들어준다.
	String xmlFilePath = CommonXML.XML_FILE_PATH;
	File fXmlFile = new File(xmlFilePath + "/file.xml");
	
	// DocumentBuilderFactory (자바에서 제공하는 파서. XML문서에서 DOM 객체 트리를 만드는 것?)
	// 애플리케이션이 XML 문서에서 
	// DOM 개체 트리를 생성하는 파서를 얻을 수 있도록 하는 팩토리 API를 정의합니다.
	
	// DocumentBuilder (만들어진 DOM 객체 트리로부터 문서를 만든다. )
	// XML 문서에서 DOM 문서 인스턴스를 가져오는 API를 정의합니다. 
	// 이 클래스를 사용하여 응용 프로그램 프로그래머는 XML에서 문서를 얻을 수 있습니다.
	
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	
	Document doc = dBuilder.parse(fXmlFile);	
	doc.getDocumentElement().normalize();
	
	out.println("Root element : " + doc.getDocumentElement().getNodeName() + "<br>");
	NodeList nList = doc.getElementsByTagName("staff");
	out.println("-----------------------<br>");
	
	for (int temp = 0; temp < nList.getLength(); temp++) 
	{
		Node nNode = nList.item(temp);
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	
		Element eElement = (Element) nNode;
	
		out.println("First Name : " + getTagValue("firstname", eElement) + "<br>");
		out.println("Last Name : " + getTagValue("lastname", eElement) + "<br>");
		out.println("Nick Name : " + getTagValue("nickname", eElement) + "<br>");
		out.println("Salary : " + getTagValue("salary", eElement) + "<br>");
	
		}
	}
%>
</body>
</html>