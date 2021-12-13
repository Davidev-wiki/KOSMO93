#import matplotlib
import matplotlib.pyplot as plt

# 버전 출력해보기
#print(matplotlib.__version__)


# 데이터 준비
x = [2016, 2017, 2018, 2019, 2020]
y = [350, 410, 520, 695, 543]

print('x >>> : ', x);
print('y >>> : ', y);

# x축과 y축 데이터를 지정하여 라인플롯 생성해보기 : plt.plot(x,y)
pp = plt.plot(x,y)
print("pp >>> : ", pp)

# x축 레이블 설정
pp = plt.xlabel('years')
print('pp >>> : ', pp)

# y축 레이블 설정
pp = plt.ylabel('sales')
print('pp >>> : ', pp)

# 라인플롯 표시
plt.show()