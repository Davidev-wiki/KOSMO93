print('hello 최현준 PYTHON 책 읽으세요')
print('hello 전용구 PYTHON 책 읽으세요')

#파이썬 주석
#변수와 객체

"""
더블쿼테이션 3개 짜리 주석

자료형
------------
기본자료형
    숫자 : 정수, 실수
    논리 : True, False
    
문자열 자료형
    string : 한 개 이상의 문자열 '', "", ''' ''', """ """

리스트 자료형
    list : [] 안에 원소를 순서대로 나열
    
튜플 자료형
    tuple : () 안에 원소를 순서대로 나열, 원소값 변경 불가
    
딕셔너리 자료형
    dictionary : {} 브레이스 안에 key : value
    
집합 자료형
    set : {} 브레이스 안에 key만 가지고 있는 형태
    
"""

# 정수
a = 123
print(type(a))

# 실수
a = 12.34
print(type(a))

a = -123
print(a)
print("실수 >>> : ", type(a))


# 8진수
'''
0 : 숫자 
o : 알파벳 소문자 o, 대문자 O
'''
a = 0o12
print(a)
print("8진수 >>> : ", type(a))


# 16진수
'''
0 : 숫자 
x : 알파벳 소문자 x, 대문자 X
'''
a = 0x12A
print(a)
print("16진수 >>> : ", type(a))


#논리형
b = True
print(b)
print("논리형 >>> : ", type(b))
b = False
print(b)
print("논리형 >>> : ", type(b))



#문자열
s1 = 'Hello Python'
print(s1)
print("문자열 >>> : ",type(s1))

s2 = "Hello Python"
print(s2)
print("문자열 >>> : ",type(s2))

s3 = '''Hello Python'''
print(s3)
print("문자열 >>> : ",type(s3))

s4 = """Hello Python"""
print(s4)
print("문자열 >>> : ",type(s4))



a = "Now is better than never"
print(a[0])
print(a[4])
print(a[-1])
print(a[-2])

b = a[0] + a[1] + a[2]
print(b)
print(a[0:3])
print(a[4:6])
print(a[19:])
print(a[:3])
print(a[:])
print(a[7:-11])

# 문자 갯수 계산
a = "Python"
b = a.count("p")
print("갯수", b)
b = a.count("P")
print("갯수", b)

#문자열 위치 : find(), index()
# find : 있으면 문자열의 위치를 리턴.
#        없으면 '-1'을 리턴함
b = a.find('y')
print("문자열 위치", b)
b = a.find('p')
print("문자열 위치", b)
'''
b = a.index('p')
print("문자열 위치", b)
b = a.index('y')
print("문자열 위치", b)
'''
#문자 삽입 : join()
b = ","
c = b.join('Abcd')
print('''b.join('Abcd') >>> : ''', c)

# 대문자 변환 : upper()
print(a)
print(a.upper())

# 소문자 변환 : lower()
print(a.lower())

# 공백 제거 : lstrip(), rstrip(), strip()
d = "   py   "
print('lstrip() >>> :', d.lstrip())
print('rstrip() >>> :', d.rstrip())
print('strip() >>> :', d.strip())


# 문자열 수정 >>> : 불가능!!
# 자바처럼 수정할 수 없다... 자바는 수정 했었나..?
'''
a = "Pithon"
print(a[1])
a[1] = 'y'
print(a[1])
'''


# 문자열 바꾸기 : replace()
a = "Python is difficult"
print(a.replace("difficult", "EASY"))


# 문자열 나누기 : split()
b = a.split()
print(b)

c = "a, b, c, d"
print(c.split(','))