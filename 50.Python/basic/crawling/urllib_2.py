import urllib.request

url="http://uta.pw/shodou/img/28/214.png"
print('url >>> :', url)
savename="./data/test_122.png"

mem=urllib.request.urlopen(url).read()

# with : 파일을 열고 닫는 것을 자동으로 해줌.
# open(파일, 모드) : 파일 생성 함수
# mode : 파일 읽고 쓰기 모드
# r : 읽기, w : 쓰기, a : 추가, b : 바이너리

with open(savename, mode="wb") as f:
    f.write(mem)
    print("saved!")