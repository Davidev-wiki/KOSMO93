# 파일 객체 생성 : open()
f = open('C:/Users/82107/Desktop/git repo/50.Python/basic/py/test.txt', 'w')
print('f >>> :', f)

# 파일 닫기 : close()
f.close()

# 파일 쓰기 : 파일 모드 'w', write()
f = open('C:/Users/82107/Desktop/git repo/50.Python/basic/py/test.txt', 'w')
for i in range(1, 6):
    data = "%d번째 줄 입니다. \n" %i
    f.write(data)
f.close()

# 파일에 내용 추가하기 : 파일 모드 'a' 'w(쓰기모드)'랑 차이가 없는듯해보임
f = open('C:/Users/82107/Desktop/git repo/50.Python/basic/py/test.txt', 'a')
for i in range(6, 11):
    data = "%d번째 줄 입니다. \n" %i
    f.write(data)
f.close()

# 파일 읽기 : 파일 모드 'r', readline()
f = open('C:/Users/82107/Desktop/git repo/50.Python/basic/py/test.txt', 'r')
line = f.readline()
print('f.readline() >>> : ', line)

# 파일 읽기 : 파일 모드 'r', readlines() : 내용 전부 한 줄로 이어서 출력
f = open('C:/Users/82107/Desktop/git repo/50.Python/basic/py/test.txt', 'r')
lines = f.readlines()
print('f.readlines >>> :', lines)
for line in lines:
    print('f.readlines()>>> :', line)
f.close()

# 파일 읽기 : 파일 모드 'r', read()
f = open('C:/Users/82107/Desktop/git repo/50.Python/basic/py/test.txt', 'r')
data = f.read()
print('data >>> :', data)
f.close()

# 파일 처리 후 파일 닫기 (자동 처리) : with open() as 파일 객체:
with open('C:/Users/82107/Desktop/git repo/50.Python/basic/py/test_1.txt', 'w') as f:
    f.write("Now is the better than never.")

data = f.read()
print('f.write() => data >>> :', data)