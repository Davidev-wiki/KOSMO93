from bs4 import BeautifulSoup

# 선택자 사용방법

# BeautifulSoup() 함수로 url도 열 수 있고, 파일도 열 수 있는 것 같다.
# html파일을 파서로 처리하고 soup 변수에 저장
fp = open("beausoup_books.html", encoding="utf-8")
soup = BeautifulSoup(fp, "html.parser")

#     람다 : 사용자가 직접 만드는 사용자 정의 함수 느낌?
#     lambda 변수 : 실행할 함수(soup.select_one(변수).string)
# id 값이 nu인 것 선택  :  #nu
# li 내 id값이 nu인 것 선택  :  li#nu
# ul 하위의 li 내 id값이 nu인 것 선택 : "ul > li#nu"
# id 값이 bible인 것 내부에 아이디가 nu인 것 선택 : "#bible #nu"
# id 값이 bible인 것 하위에 아이디가 nu인 것 선택 : #bible > #nu
# ul의 id값이 bible인 것 하위에 id값이 nu인 것 선택 : ul#bible > #nu
# li의 id값이 nu인 것 선택 : li[id='nu']
# li중 4번 째 있는 것? 선택 : li:nth-of-type(4)
sel = lambda q : print(soup.select_one(q).string)
sel("#nu")
sel("li#nu")
sel("ul > li#nu")
sel("#bible #nu")
sel("#bible > #nu")
sel("ul#bible > #nu")
sel("li[id='nu']")
sel("li:nth-of-type(4)")

print(soup.select("li")[3].string)
print(soup.find_all("li")[3].string)
