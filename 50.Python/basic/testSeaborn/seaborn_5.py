# 범주형 데이터의 산점도

# -*- coding: utf-8 -*-

# 라이브러리 불러오기
import matplotlib.pyplot as plt
import seaborn as sns

# Seaborn 제공 데이터셋 가져오기
titanic = sns.load_dataset('titanic')

# 스타일 테마 설정(5가지 : darkgrid, whitegrid, dark, white, ticks)
sns.set_style('darkgrid')

# 그래프 객체 생성 (figure에 2개의 서브 플롯 생성)
fig = plt.figure(figsize=(15,5))
ax1 = fig.add_subplot(1, 2, 1)
ax2 = fig.add_subplot(1, 2, 2)

# 이산형 변수의 분포 - 데이터 분산 미고려(중복 표시 O)
sns.stripplot(x="class",        # x축 변수
              y="age",          # y축 변수
              data=titanic,     # 데이터셋 - 데이터 프레임
              ax=ax1)           # axe 객체 - 1번째 그래프

# 이산형 변수의 분포 - 데이터 분산 미고려(중복 표시 X)
sns.stripplot(x="class",        # x축 변수
              y="age",          # y축 변수
              data=titanic,     # 데이터셋 - 데이터 프레임
              ax=ax2)           # axe 객체 - 2번째 그래프

plt.show()