from bs4 import BeautifulSoup
import urllib.request as req
import datetime

# url(네이버 금융)에 모든 코드 가지고 오기
url = "https://finance.naver.com/marketindex/"
# 요청과 동시에 응답 받기
res = req.urlopen(url)

# 응답받은 url의 모든 데이터를 html.parser로 처리 후 soup에 저장
soup = BeautifulSoup(res, "html.parser")
print(soup)
# : naver finance 화면 코드 출력

# 아래 태그 내부에 값으로 존재하는 환율 데이터를 문자열로 price에 저장
price = soup.select_one("div.head_info > span.value").string
print("usd/krw = ", price)

# 오늘 시간을 변수 t에 저장함
# 현재경로/data폴더/현재시간.txt 라는 문자열을 frame에 저장
t = datetime.date.today()
frame = "./data/" + t.strftime("%Y-%m-%d") + ".txt"

# with open : 파일을 자동으로 열고 닫기
# frame 경로에 있는 파일을, 쓰기 모드로, 인코딩 타입은 utf-8로.
# 파일에 가격을 쓰고 닫기~
with open(frame, "w", encoding="utf-8") as f:
    f.write(price)

