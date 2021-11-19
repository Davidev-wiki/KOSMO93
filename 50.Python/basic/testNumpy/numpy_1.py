import numpy as np

print(np.__version__)

# 리스트를 이용해 Numpy 생성
ar1 = np.array([1, 2, 3, 4, 5])
print('ar1 >>> : ', ar1)
print('type(ar1) >>> : ', type(ar1))


ar2 = np.array([[10, 20, 30], [40, 50, 60]])
print('ar2 >>> : ', ar2)
print('type(ar2) >>> : ', type(ar2))


# 값의 범위를 지정해 Numpy 생성 : np.arange(시작 값, 끝 값, 간격)
ar3 = np.arange(1, 11, 2)
print('ar3 >>> : ', ar3)


# 구조를 지정하여 Numpy 생성 : np.array().reshape(3행, 2열)
ar4 = np.array([1, 2, 3, 4, 5, 6]).reshape(3, 2)
print('ar4 >>> : ')
print(ar4)


# 초기 값과 구조를 지정하여 Numpy 생성
ar5 = np.zeros((2, 3))
print('ar5 >>> :', ar5)


# Numpy 슬라이싱 : 3행 2열 데이터 -> 2행 2열 데이터로 슬라이싱
print('ar2 >>> : ', ar2)
ar6 = ar2[0:2, 0:2]
print('ar6 >>> :', ar6)

ar7 = ar2[0, : ] # 0행(첫 번째 리스트)에 있는 것을 끝까지 출력
print('ar7 >>> : ', ar7)


# Numpy 사칙연산 (첫번째 배열의 모든 항목에 10을 더한 값이 출력된다.)
print('ar1 >>> :', ar1)
ar8 = ar1 + 10
print('ar8 >>> : ', ar8)

# 리스트 + 리스트 => 리스트 (각 순서 값의 합)
print('ar1 + ar8 >>>>')
print('ar1 >>> : ', ar1)
print('ar8 >>> : ', ar8)
aa1 = ar1 + ar8
print('aa1 >>> : ', aa1)

# 리스트 - 리스트 => 리스트 (각 순서 값의 차)
print('ar8 - ar1 >>>>')
print('ar8 >>> : ', ar8)
print('ar1 >>> : ', ar1)
aa1 = ar8 - ar1
print('aa1 >>> : ', aa1)


# 리스트 * 2 => 리스트 (각 순서 값의 곱)
print('ar8 * 2 >>>>')
print('ar8 >>> : ', ar8)
aa1 = ar8 * 2
print('aa1 >>> : ', aa1)


# 리스트 / 2 => 리스트 (각 순서 값의 나누기)
print('ar8 / 2 >>>>')
print('ar8 >>> : ', ar8)
aa1 = ar8 / 2
print('aa1 >>> : ', aa1)



# Numpy 행렬간 곱 연산 : np.dot()
print('ar2 >>> :', ar2)
print('ar4 >>> :', ar4)
ar9 = np.dot(ar2, ar4)
print('ar9 >>> :', ar9)


























