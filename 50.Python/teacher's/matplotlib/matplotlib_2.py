import matplotlib
import matplotlib.pyplot as plt

print(matplotlib.__version__)

# 데이터 준비
y1 = [350, 410, 520, 695]
y2 = [200, 250, 385, 350]
print('y1 >>> : ', y1);
print('y2 >>> : ', y2);
x = range(len(y1))
print('x >>> : ', x);

# x축 과 y축 데이터를 지정하여 바 차트 생성 : plt.bar(x,y)
pp = plt.bar(x, y1, width=0.7, color='blue')
print('pp >>> : ', pp)

pp = plt.bar(x, y2, width=0.7, color='red')
print('pp >>> : ', pp)

# 차트제목 설정
pp = plt.title('Quarterly sales')
print('pp >>> : ', pp)

# x축 레이블 설정
pp = plt.xlabel('Quarterly')
print('pp >>> : ', pp)

# y축 레이블 설정
pp = plt.ylabel('salse')
print('pp >>> : ', pp)

# 눈금 리스트 생성
xLabel = ['first', 'second', 'third', 'fourth']

# 바 차트의 x축 누름 이름 설정
pp = plt.xticks(x, xLabel, fontsize=10)
print('pp >>> : ', pp)

# 범례 설정
pp = plt.legend(['chairs', 'desks'])
print('pp >>> : ', pp)

# 바 차트 표시
plt.show()