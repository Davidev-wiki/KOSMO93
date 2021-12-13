# x축 데이터만 입력하고 뽑아보기

#import matplotlib
import matplotlib.pyplot as plt

#print(matplotlib.__version__)

# 데이터 준비
x = [2016, 2017, 2018, 2019, 2020]
print('x >>> : ', x);


# x축 과 y축 데이터를 지정하여 라인플롯 생성 : plt.plot(x,y)
pp = plt.plot(x)
print('pp >>> : ', pp)


# 라인플롯 표시
plt.show()