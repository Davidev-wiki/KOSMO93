from bs4 import BeautifulSoup
import urllib.request as req

url = "http://192.168.219.112:8088/springHbe/testBeautiful/beautiful_1.html"
res = req.urlopen(url)

soup = BeautifulSoup(res, 'html.parser')
h1 = soup.html.body.h1
p1 = soup.html.body.p
p2 = p1.next_sibling.next_sibling

print('h1 >>> : ', h1.string)
print('p1 >>> : ', p1.string)
print('p2 >>> : ', p2.string)