import pandas as pd
wine = pd.read_csv('./data/wine.csv')
print(wine.info())


# 데이터 탐색
wine.columns = wine.columns.str.replace(' ', '_')
wr = wine.head()
print(wr)

wr = wine.describe()
print(wr)

wr = wine.quality.unique()
print(wr)

wr = wine.quality.value_counts()
print(wr)


# 데이터 모델링
#1. decribe() 함수
wr = wine.groupby('type')['quality'].describe()
print(wr)

wr = wine.groupby('type')['quality'].mean()
print(wr)

wr = wine.groupby('type')['quality'].std()
print(wr)

wr = wine.groupby('type')['quality'].agg(['mean', 'std'])
print(wr)


#2. t-검정 과 회귀분석으로 그룹 비교
# pip install scipy
# pip install statsmodels
from scipy import stats
from statsmodels.formula.api import ols, glm

red_wine_quality = wine.loc[wine['type'] == 'red', 'quality']
# print(red_wine_quality)
white_wine_quality = wine.loc[wine['type'] == 'white', 'quality']
# print(white_wine_quality)
wr = stats.ttest_ind(red_wine_quality, white_wine_quality, equal_var=False)
# print(wr)
Rformula = 'quality ~ fixed_acidity + volatile_acidity + citric_acid + ' \
           'residual_sugar + chlorides + free_sulfur_dioxide + ' \
           'total_sulfur_dioxide + density + pH + sulphates + alcohol'
print(Rformula)
regression_result = ols(Rformula, data=wine).fit()
wr = regression_result.summary()
print(wr)


#3. 회귀분석모델로 새로운 샘플의 품질 등급 예측하기
sample1 = wine[wine.columns.difference(['quality', 'type'])]
sample1 = sample1[0:5][:]
sample1_prdict = regression_result.predict(sample1)
#print(sample1_prdict)
wr = wine[0:5]['quality']
#print(wr)
data = {"fixed_acidity" : [8.5, 8.1], "volatile_acidity":[0.8, 0.5],"citric_acid":[0.3, 0.4],
        "residual_sugar":[6.1, 5.8], "chlorides":[0.055,0.04], "free_sulfur_dioxide":[30.0, 31.0],
        "total_sulfur_dioxide":[98.0,99], "density":[0.996, 0.91], "pH":[3.25, 3.01],
        "sulphates":[0.4, 0.35],"alcohol":[9.0, 0.88]}

sample2 = pd.DataFrame(data, columns=sample1.columns)
print(sample2)
sample2_prdict = regression_result.predict(sample1)
print(sample2_prdict)


# 시각화
#pip install seaborn
# 1. 와인 유형에 따른 품질 등급 히스트그램 그리기
import matplotlib.pyplot as plt
import seaborn as sns

sns.set_style('dark')
sns.distplot(red_wine_quality, kde = True, color = "red", label = 'red wine')
sns.distplot(white_wine_quality, kde = True, label = 'white wine')
plt.title("Quality of Wine Type")
plt.legend()
plt.show()


# 2. 부분 회귀 플롯으로 시각화
import statsmodels.api as sm
others = list(set(wine.columns).difference(set(["quality", "fixed_acidity"])))
p, resids = sm.graphics.plot_partregress("quality", "fixed_acidity", others, data = wine, ret_coords = True)
plt.show()
fig = plt.figure(figsize = (8, 13))
sm.graphics.plot_partregress_grid(regression_result, fig = fig)
plt.show()



