import requests

url = "http://localhost:8088/springHbe/index.jsp"

# requests.get(url) 은 요청을 한 것임
# 요청한 동작에 대한 응답을 한것이 동시에 일어남
# response 헤더에 200 이 오면 통신이 성공한 것이다.
res = requests.get(url)
print('res >>> : ', res)

ptynon_html = res.text
print('ptynon_html >>> : \n', ptynon_html)
