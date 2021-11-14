from bs4 import BeautifulSoup
import urllib.request as req
import urllib

url = "https://ko.wikipedia.org/wiki/%ED%95%98%EB%8A%98%EA%B3%BC_%EB%B0%94%EB%9E%8C%EA%B3%BC_%EB%B3%84%EA%B3%BC_%EC%8B%9C"

# 파이썬에서 url 한글 인코딩 디코딩
# unquote : 디코딩
str_unquote = urllib.parse.unquote('%ED%95%98%EB%8A%98%EA%B3%BC_%EB%B0%94%EB%9E%8C%EA%B3%BC_%EB%B3%84%EA%B3%BC_%EC%8B%9C')
print('str_unquote >>> : ', str_unquote)

# quote : 인코딩
str_quote = urllib.parse.quote('하늘과_바람과_별과_시')
print('str_quote >>> : ', str_quote)

# url의 데이터 가져와서 파서 돌리기
res = req.urlopen(url)
soup = BeautifulSoup(res, "html.parser")

# html로 변환한 데이터에서
# 해당 경로
#   <div id="mw-content-text>
#       <div>
#           <ul>
#               <li>
#                   <a> 데이터 값1 </a>
#               <li>
#                   <a> 데이터 값2 </a>
#               <li>
#                   <a> 데이터 값3 </a>
#               <li>
#                   <a> 데이터 값4 </a>
#       위와 같은 모습에서 select() 함수로 <a> 안에 있는 데이터 값을 전부 다 가지고 a_list에 넣어준다
a_list = soup.select("#mw-content-text > div > ul > li a")

# for 반복문
# 데이터 값 1을 문자열로 저장
# - 데이터 값 1 의 형태로 출력
# 데이터 값 2를 문자열로 저장
# - 데이터 값 2 의 형태로 출력
for a in a_list:
    name = a.string
    print("-", name)