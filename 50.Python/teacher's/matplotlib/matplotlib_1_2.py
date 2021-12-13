#import matplotlib
import matplotlib.pyplot as plt

#print(matplotlib.__version__)

# 데이터 준비

y = [350, 410, 520, 695, 543]

print('y >>> : ', y);

# x축 과 y축 데이터를 지정하여 라인플롯 생성 : plt.plot(x,y)
pp = plt.plot(y)
print('pp >>> : ', pp)


# 라인플롯 표시
plt.show()