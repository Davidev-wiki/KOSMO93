import requests

urls = ["https://www.naver.com/", "https://www.python.org/"]
filename = "robots.txt"

for url in urls:
    file_path = url + filename
    print('file_path >>> : ', file_path)
    res = requests.get(file_path)
    print(res.text)
    print('\n')

'''
User-agent: *
Disallow: /
Allow : /$ 
모든 문서에 대해 접근을 차단하고, 첫 페이지에 대해서만 허가
사용 중인 사이트: 네이버 메인화면[2], 네이트 메인화면, 줌 메인화면 등.

User-agent: *
Allow: /
모든(*) 로봇(User-agent)에게 루트 디렉토로리(/)이하의 문서에 대한 접근을 허락(Allow)한다.

User-agent: *
Disallow: /
모든(*) 로봇(User-agent)에게 루트 디렉토로리(/)이하의 문서에 대한 접근을 차단(Disallow)한다.

User-agent: *
Disallow: /temp
모든(*) 로봇(User-agent)에게 특정 디렉토로리(/temp/)이하의 문서에 대한 접근을 차단(Disallow)한다.

User-agent: googlebot
Disallow: /
특정한 로봇(googlebot)에게 모든 문선에 대한 접근을 차단(Disallow)한다.
'''