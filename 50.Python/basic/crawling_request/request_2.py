import requests

url = "http://192.168.219.112:8088/springHbe/index.jsp"

# requests.get(url) 은 요청을 한 것임
# 요청한 동작에 대한 응답을 한것이 동시에 일어남
# response 헤더에 200 이 오면 통신이 성공한 것이다.

# url을 이용해 요청한 결과 값(응답)을 res에 담기.
res = requests.get(url)
print('res >>> : ', res)

python_html = res.text
print('python_html >>> : ', python_html)
