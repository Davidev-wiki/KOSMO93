import requests
'''
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

url = "https://www.python.org"

# requests.get(url) 은 요청을 한 것임
# 요청한 동작에 대한 응답을 한것이 동시에 일어남
# response 헤더에 200 이 오면 통신이 성공한 것이다.
res = requests.get(url)
print('res >>> : ', res)

aaa = res.text
print('aaa >>> : \n', aaa)
