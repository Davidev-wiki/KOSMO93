import requests
from bs4 import BeautifulSoup

url = "https://en.wikipedia.org/wiki/Seoul_Metropolitan_Subway"
resp = requests.get(url)
html_src = resp.text
#print(html_src)

soup = BeautifulSoup(html_src, 'html.parser')

#print("type(soup) >>> : \n", type(soup))
#print("soup.head >>> : \n", soup.head)
#print("soup.body >>> \n: ", soup.body)


#print('title 태그 요소: ', soup.title)
#print('title 태그 이름: ', soup.title.name)
#print('title 태그 문자열: ', soup.title.string)

