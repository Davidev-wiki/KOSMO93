import pandas as pd
print(pd.__version__)

# Series 자료형  : 1차원 배열 : 판다스에서는 vector 라고 부른다.
data1 = [10, 20, 30, 40, 50]
print('data1 >>> : ', data1)
print('data1 >>> : ', type(data1))

data2 = ['1반', '2반', '3반', '4반', '5반']
print('data2 >>> : ', data2)
print('data2 >>> : ', type(data2))

# 리스트를 이용해서 Series 생성 
sr1 = pd.Series(data1)
print(sr1)
print('sr1 >>> : ', type(sr1))


sr2 = pd.Series(data2)
print(sr2)
print('sr2 >>> : ', type(sr2))


# 값을 이용해서 Series 생성
sr3 = pd.Series([101, 102, 103, 104, 105])
print(sr3)
print('sr3 >>> : ', type(sr3))


sr4 = pd.Series(['월', '화', '수', '목', '금'])
print(sr4)
print('sr4 >>> : ', type(sr4))


# 인덱스를 지정하여 Series 생성
sr5 = pd.Series(data1, index = [1001, 1002, 1003, 1004, 1005])
print(sr5)
print('sr5 >>> : ', type(sr5))


sr6 = pd.Series(data1, index = data2)
print(sr6)
print('sr6 >>> : ', type(sr6))


sr7 = pd.Series(data2, index = data1)
print(sr7)
print('sr7 >>> : ', type(sr7))

sr8 = pd.Series(data2, index = sr4)
print(sr8)
print('sr8 >>> : ', type(sr8))


# Series 인덱싱
print('sr8 >>> : ', sr8)
ss = sr8[2]
print('ss >>> : ', ss)

ss = sr8['수']
print('ss >>> : ', ss)


ss = sr8[-1]
print('ss >>> : ', ss)


# Series 슬라이싱
ss = sr8[0:4]
print('ss >>> : ', ss)


# Series 인덱스 구하기
ss = sr8.index
print('ss >>> : ', ss)


# Series 값 구하기
ss = sr8.values
print('ss >>> : ', ss)


# Series 원소가 숫자이면 덧셈 수행
ss = sr1 + sr3
print('ss >>> : ', ss)


# Series 원소가 문자열이면 문자열 연결 수행
ss = sr4 + sr2
print('ss >>> : ', ss)




