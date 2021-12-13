#importUntitled1 matplotlib
import matplotlib.pyplot as plt

#print(matplotlib.__version__)

# 데이터 준비
x = [2016, 2017, 2018, 2019, 2020]
y = [350, 410, 520, 695, 543]

print('x >>> : ', x);
print('y >>> : ', y);

# x축 과 y축 데이터를 지정하여 라인플롯 생성 : plt.plot(x,y)
pp = plt.plot(x,y)
print('pp >>> : ', pp)

# 차트제목 설정
pp = plt.title('Annual sales')
print('pp >>> : ', pp)

# x축 레이블 설정
pp = plt.xlabel('years')
print('pp >>> : ', pp)

# y축 레이블 설정
pp = plt.ylabel('salse')
print('pp >>> : ', pp)

# 라인플롯 표시
plt.show()