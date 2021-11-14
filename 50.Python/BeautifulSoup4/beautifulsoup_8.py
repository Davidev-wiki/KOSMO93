from bs4 import BeautifulSoup
import urllib.request as req
import urllib

url = "https://ko.wikipedia.org/wiki/%ED%95%98%EB%8A%98%EA%B3%BC_%EB%B0%94%EB%9E%8C%EA%B3%BC_%EB%B3%84%EA%B3%BC_%EC%8B%9C"

# 파이썬에서 url 한글 인코딩 디코딩
str_unquote = urllib.parse.unquote('%ED%95%98%EB%8A%98%EA%B3%BC_%EB%B0%94%EB%9E%8C%EA%B3%BC_%EB%B3%84%EA%B3%BC_%EC%8B%9C')
print('str_unquote >>> : ', str_unquote)
str_quote = urllib.parse.quote('하늘과_바람과_별과_시')
print('str_quote >>> : ', str_quote)


res = req.urlopen(url)
soup = BeautifulSoup(res, "html.parser")

a_list = soup.select("#mw-content-text > div > ul > li a")

for a in a_list:
    name = a.string
    print("-", name)


