from bs4 import BeautifulSoup

'''
BeautifulSoup
: HTML, XML 만 분석하는 모듈, 도구이다. 셀렉터 기술
: BeautifulSoup 을 잘 하려면 CSS Selecter 을 잘 해야 한다 
: 파일을 다운로드 하는 기능은 없다. 
: 스크레이핑 기술이다. 
'''

html =  """
        <html>
            <body>
                <h1>스크레이핑이란?</h1>
                <p>웹 페이지를 분석하는 것</p>
                <p>원하는 부분을 추출하는 것</p>
            </body>
        </html>
        """

soup = BeautifulSoup(html, 'html.parser')
h1 = soup.html.body.h1
p1 = soup.html.body.p
p2 = p1.next_sibling.next_sibling

print('h1 >>> : ', h1.string)
print('p1 >>> : ', p1.string)
print('p2 >>> : ', p2.string)