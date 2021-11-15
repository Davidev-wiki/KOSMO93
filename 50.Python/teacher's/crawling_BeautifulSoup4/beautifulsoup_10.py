from bs4 import BeautifulSoup

# 선택자 사용 방법 (응용)

fp = open("beausoup_frvege.html", encoding="utf-8")
soup = BeautifulSoup(fp, "html.parser")

print(soup.select_one("ul:nth-of-type(2) > li:nth-of-type(4)").string)
print(soup.select_one("#ve-list > li:nth-of-type(4)").string)
print(soup.select("#ve-list > li[data-lo='us']")[1].string)
print(soup.select("#ve-list > li.black")[1].string)

cond = {"data-lo":"us", "class":"black"}
print(soup.find("li", cond).string)
print(soup.find(id="ve-list").find("li", cond).string)


"""
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div id="main-goods" role="page">
    <h1>과일과 야채</h1>
    <ul id="fr-list">
        <li class="red green" data-lo="ko">사과</li>
        <li class="purple" data-lo="us">포도</li>
        <li class="yellow" data-lo="us">레몬</li>
        <li class="yellow" data-lo="ko">오렌지</li>
    </ul>
    <ul id="ve-list">
        <li class="white green" data-lo="ko">무</li>
        <li class="red green" data-lo="us">파프리카</li>
        <li class="black" data-lo="ko">가자</li>
        <li class="black" data-lo="us">아보카도</li>
        <li class="white" data-lo="cn">연근</li>
    </ul>
</div>

"""