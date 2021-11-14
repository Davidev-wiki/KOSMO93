from bs4 import BeautifulSoup

html =  """
        <html>
            <body>
                <h1 id="title">스크레이핑이란?</h1>
                <p id="body">웹 페이지를 분석하는 것</p>
                <p>원하는 부분을 추출하는 것</p>
            </body>
        </html>
        """

soup = BeautifulSoup(html, 'html.parser')
# BeautifulSoup에서는
# HTML 구조의 루트 요소인 <html>에서부터
# . : 마침표, 링크연산자를 사용해서 값에 접근할 수 있다.
# soup.html.body.h1

print("soup.prettify()함수는 html 구조를 파악하기 쉽게 해준다. >>> : \n", soup.prettify())
title1 = soup.html.body.h1
print("title1 >>> : ", title1)
print("type(title1) >>> : ", type(title1))
print("type(title1.attrs >>> : ", type(title1.attrs))
print('id' in title1.attrs)
print("title1['id'] >>> : ", title1['id'])

title = soup.find(id="title")
body =  soup.find(id="body")

print("#title >>> : " + title.string)
print("#body >>> : " + body.string)