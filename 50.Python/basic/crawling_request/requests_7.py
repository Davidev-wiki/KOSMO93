import os, codecs, re, datetime, requests
import urllib.request as ur
from bs4 import BeautifulSoup as bs

url = 'https://news.daum.net/'

f = open("./data/"+str(datetime.date.today()) + '_articles.txt', 'w', encoding="utf-8")
soup = bs(ur.urlopen(url).read(), 'html.parser')

for i in soup.find_all('div', {"class":"thumb_relate"}):
	try:
		f.write(i.text + '\n')
		f.write(i.find_all('a')[0].get('href') + '\n')
		soup2 = bs(ur.urlopen(i.find_all('a')[0].get('href')).read(), 'html.parser')
		for j in soup2.find_all('p'):
			f.write(j.text)
	except:
		pass

f.close()