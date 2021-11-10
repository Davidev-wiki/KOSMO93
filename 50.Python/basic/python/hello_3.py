# 함수
'''
인수 개수가 정해진 경우
def 함수(인수):
    명령문 1
    명령문 2

인수 개수가 정해지지 않은 경우
def 함수명(*인수):
    명령문 1
    명령문 2
'''

# 함수 정의
def sum1(a, b):
    x = a + b
    return x

def sum2(*args):
    x = 0
    for i in args:
        x += i
    return x #0 + 1 + 2 + 3 + 4 + 5

# 함수 호출 : 함수명(인수)
a = 5
b = 3

x = sum1(a, b)
print('x >>> :', x)

x = sum1(3, 5)
print('x >>> :', x)

x = sum2(1, 2, 3, 4, 5)
print('x >>> :', x)

x = sum2(2, 3.5, 10)
print('x >>> :', x)


# 내장함수
z = chr(97)
print('z >>> : ', z)
z = chr(48)
print('z >>> : ', z)