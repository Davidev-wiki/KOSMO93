import numpy as np

print(np.__version__)

# 리스트를 이용해서 numpy 생성
ar1 = np.array([1, 2, 3, 4, 5])
print('ar1 >>> : ', ar1)
print('ar1 >>> : ', type(ar1))

ar2 = np.array([[10, 20, 30], [40, 50, 60]])
print('ar2 >>> : ', ar2)
print('ar2 >>> : ', type(ar2))

# 값의 범위를 지정하여 numpy 생성 : np.arange(시작값, 끝값, 간격)
ar3 = np.arange(1, 11, 2)
print('ar3 >>> : ', ar3)

# 구조를 지정하여 numpy 생성 : np.array().reshape()
ar4 = np.array([1 ,2 , 3, 4, 5, 6]).reshape((3, 2))
print('ar4 >>> : ', ar4)

# 초기값과 구조를 지정하여 numpy 생성
ar5 = np.zeros((2, 3))
print('ar5 >>> : ', ar5)

# numpy 슬라이싱
print('ar2 >>> : ', ar2)
ar6 = ar2[0:2, 0:2]
print('ar6 >>> : ', ar6)

ar7 = ar2[0, :]
print('ar7 >>> : ', ar7)


# numpy 사칙연산
print('ar1 >>> : ', ar1)
ar8 = ar1 + 10
print('ar8 >>> : ', ar8)

# ++++++++++++++++++++
print('ar1 + ar8 >>>>> ')
print('ar1 >>> : ', ar1)
print('ar8 >>> : ', ar8)
aa1 = ar1 + ar8
print('aa1 >>> : ', aa1)

# --------------------
print('ar8 - ar1 >>>>> ')
print('ar8 >>> : ', ar8)
print('ar1 >>> : ', ar1)
aa1 = ar8 - ar1
print('aa1 >>> : ', aa1)

# ********************
print('ar8 * 2 >>>>> ')
print('ar8 >>> : ', ar8)
aa1 = ar8 * 2
print('aa1 >>> : ', aa1)

# ////////////////////
print('ar8 / 2 >>>>> ')
print('ar8 >>> : ', ar8)
aa1 = ar8 / 2
print('aa1 >>> : ', aa1)


# numpy 행렬곱 연산 : np.dot()
print('ar2 >>> : ', ar2)
print('ar4 >>> : ', ar4)
ar9 = np.dot(ar2, ar4)
print('ar9 >>> : ', ar9)


























