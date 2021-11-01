<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.io.File" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Collection"%>

<%
	/************************
	전달해야 할 변수
	*************************/
	String url = null;
	String str = null;
	
	url = request.getParameter("url");
	System.out.println("url >>> : " + url);
	
	str = request.getParameter("str");
	System.out.println("str >>> : " + str);
	
	if(str != null){
		str = str + "&";
		System.out.println("str + & >>> : " + str);
	}// end of if문
	
%>

<%
	/*********************************
	페이지 네비게이션 관련 변수
	*********************************/
	// 한페이지에 보여질 게시물의 수
	int pageSize = 0;

	// 그룹의 크기
	int groupSize = 0;
	
	// 전체 게시물의 개수
	int totalCount = 0;
	
	// 현재 페이지
	int curPage = 0;
	
	// 전체 페이지의 개수
	int pageCount = 0;
	
	if(request.getParameter("pageSize") != null){
		pageSize = Integer.parseInt(request.getParameter("pageSize")); // 10
		System.out.println("pageSize >>> : " + pageSize);
	}// end of if문
	
	if(request.getParameter("groupSize") != null){
		groupSize = Integer.parseInt(request.getParameter("groupSize")); // 5
		System.out.println("groupSize >>> : " + groupSize);
	}// end of if문
	
	if(request.getParameter("curPage") != null){
		curPage = Integer.parseInt(request.getParameter("curPage")); // 1
		System.out.println("curPage >>> : " + curPage);
	}// end of if문
	
	if(request.getParameter("totalCount") != null){
		totalCount = Integer.parseInt(request.getParameter("totalCount")); // 400
		System.out.println("totalCount >>> : " + totalCount);
	}// end of if문
	
	// 전체게시물수와 페이지크기를 가지고 전체 페이지 갯수를 계산함.
	// 소수점에 따라 계산상의 오류가 없도록 한것임.
	pageCount = (int)Math.ceil(totalCount/(pageSize+0.0)); // (0/page)
	System.out.println("pageCount >>> : " + pageCount);
	
	
try{	
		// 현재 그룹 설정
		int curGroup = (curPage-1) / groupSize;
		System.out.println("curGroup >>> : " + curGroup);
	
		// 숫자가 안나올때
		// 0*0
		int linkPage = curGroup * groupSize;
		System.out.println("linkPage >>> : " + linkPage);
%>	
<p align = "right">
<%
		// 첫번째 그룹이 아닌 경우
		if(curGroup > 0){
%>
		<a href="<%=url%>?<%=str%>curPage=1">◁◁</a>&nbsp;&nbsp;&nbsp;
		<a href="<%=url%>?<%=str%>curPage=<%=linkPage%>">◀</a>&nbsp;&nbsp;&nbsp;
<%
		}
		else
		{
%>	
			◁◁&nbsp;&nbsp;&nbsp;◀&nbsp;&nbsp;&nbsp;
<%
	}


	// 다음 링크를 위해 증가시킴
	linkPage++;
	System.out.println("linkPage++ >>> :" + linkPage); // 1
	
	int loopCount = groupSize;
	System.out.println("loopCount >>> : " + loopCount); // 5
	
	// 그룹범위내에서 페이지 링크 만듬
	// 5>0 && 1<=40
	while((loopCount > 0) && (linkPage <= pageCount)){
		//1==1
		if(linkPage == curPage){
			System.out.println("그룹범위내에서 페이지 링크  if문");
		
%>
	<%=linkPage%>
<%
		}else{
			System.out.println("그룹범위내에서 페이지 링크 else");
			//[2][3][4][5]
%>
	[<a href="<%=url%>?<%=str%>curPage=<%=linkPage%>"><%=linkPage %></a>]&nbsp;
<%
		}
		
		linkPage++;
		loopCount--;
	}// end of while문
	
	// 다음그룹이 있는 경우
	// 6 	40
	if(linkPage <= pageCount){
		System.out.println("다음그룹이 있는 경우 linkPage >>> : " + linkPage);
		System.out.println("다음그룹이 있는 경우 pageCount >>> : " + pageCount);
%>
	<a href="<%=url%>?<%=str%>curPage=<%=linkPage%>">▶</a>&nbsp;&nbsp;&nbsp;
	<a href="<%=url%>?<%=str%>curPage=<%=pageCount%>">▷▷</a>&nbsp;&nbsp;&nbsp;
<%
	}
	else{
		System.out.println("다음그룹이 있는 경우 linkPage >>> : " + linkPage);
		System.out.println("다음그룹이 있는 경우 pageCount >>> : " + pageCount);
		System.out.println("다음그룹이 있는 경우_else");
%>
	▶&nbsp;&nbsp;&nbsp;▷▷&nbsp;&nbsp;&nbsp;
<%
	}
}catch(Exception e){}
%>
</p>