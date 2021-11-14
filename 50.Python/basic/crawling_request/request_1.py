import requests

url = "https://www.python.org"
# 자바는 request, response 따로.
# 스크립트언어) requests.get(url)은 요청과 응답이 동시에 일어남.
# http protocol's 통신 응답 상태 코드
''' <강사님 주석>
웹 브라우저 에서 웹서버로 
요청 : request : 헤더 바디 
응답 : response : 헤더 (200, 300, 400, 500) 바디  

스크립트에서는
요청과 응답을 분리해서 처리한다.
이유는 응답할 내용을 처리할 시간이 필요하기 때문에 : cgi 
jsp,
Servlet

스크립트에서는 
요청과 응답이 동시에 읽어난다.
html
javaScript 
jQuery 
Ajax : $.ajax(), $.get()

'''
"""
1xx (정보): 요청을 받았으며 프로세스를 계속한다
2xx (성공): 요청을 성공적으로 받았으며 인식했고 수용하였다
3xx (리다이렉션): 요청 완료를 위해 추가 작업 조치가 필요하다
4xx (클라이언트 오류): 요청의 문법이 잘못되었거나 요청을 처리할 수 없다
5xx (서버 오류): 서버가 명백히 유효한 요청에 대해 충족을 실패했다
"""
res = requests.get(url)
print('res >>> : ', res)

python_html = res.text
print('python_html >>> : \n', python_html)