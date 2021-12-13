# Web에 있는 xml의 링크만 있으면 코드 한 줄로 파일을 불러와 저장하고
# 원하는 데이터를 검색해 출력해볼 수 있다.

from bs4 import BeautifulSoup
import urllib.request as req
import os.path

url = "http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108"
savename = "./data/forecast.xml"

if not os.path.exists(savename):
    req.urlretrieve(url, savename)

# BeautifulSoup
xml = open(savename, "r", encoding="utf-8").read()
print(xml)
soup = BeautifulSoup(xml, 'html.parser')
print(soup)

# 각 지역 확인하기
info = {}
for location in soup.find_all("location"):
    name = location.find('city').string         # <city>태그 내 도시의 이름 값 저장
    weather = location.find('wf').string        # <wf>태그 내 현재 날씨 상태 값 저장
    tmn = location.find('tmn').string
    tmx = location.find('tmx').string
    if not (weather in info):
        info[weather] = []
    info[weather].append(name)


# 각 지역의 날씨를 구분해서 출력하기
    for weather in info.keys():
        if (-3 <= int(tmn) and int(tmx) <= 7):
            print("+", weather)
            for name in info[weather]:
                print("ㄴ", name)
