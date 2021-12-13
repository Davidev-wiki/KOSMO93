import seaborn as sns
import pandas as pd

# 데이터 수집
titanic = sns.load_dataset("titanic")
titanic.to_csv('./data/titanic.csv', index = False)

# 데이터 준비
tn = titanic.isnull().sum()
# print(tn)

titanic['age'] = titanic['age'].fillna(titanic['age'].median())
titanic['embarked'].value_counts()

titanic['embark_town'] = titanic['embark_town'].fillna('Southampton')
titanic['deck'].value_counts()

titanic['deck'] = titanic['deck'].fillna('C')
titanic.isnull().sum()

# 데이터 탐색
titanic.info()
titanic.survived.value_counts()

import matplotlib.pyplot as plt

# 차트를 그려 데이터를 시각적으로 탐색하기

f,ax = plt.subplots(1, 2, figsize = (10, 5))
titanic['survived'][titanic['sex'] == 'male'].value_counts().plot.pie(explode = [0,0.1], autopct = '%1.1f%%', ax = ax[0], shadow = True)
titanic['survived'][titanic['sex'] == 'female'].value_counts().plot.pie(explode = [0,0.1], autopct = '%1.1f%%', ax = ax[1], shadow = True)
ax[0].set_title('Survived (Male)')
ax[1].set_title('Survived (Female)')
plt.show()


# 등급별 생존자 수를 차트로 나타내기

sns.countplot('pclass', hue = 'survived', data = titanic)
plt.title('Pclass vs Survived')
plt.show()


# 데이터 모델링
titanic_corr = titanic.corr(method = 'pearson')
#print(titanic_corr)
titanic_corr.to_csv('./data/titanic_corr.csv',index = False)
tn = titanic['survived'].corr(titanic['adult_male'])
#print('adult_male : ', tn)
tn = titanic['survived'].corr(titanic['fare'])
#print('fare : ', tn)


# 산점도 상관 분석 시각화

sns.pairplot(titanic, hue = 'survived')
plt.show()


# 두 변수의 상관 분석 시각화

sns.catplot(x = 'pclass', y = 'survived', hue = 'sex', data = titanic, kind='point')
plt.show()


# 변수 사이의 상관 계수를 히트맵으로 시각화 하기

def category_age(x):
    if x < 10:
        return 0
    elif x < 20:
        return 1
    elif x < 30:
        return 2
    elif x < 40:
        return 3
    elif x < 50:
        return 4
    elif x < 60:
        return 5
    elif x < 70:
        return 6
    else:
        return 7


titanic['age2'] = titanic['age'].apply(category_age)
titanic['sex'] = titanic['sex'].map({'male':1, 'female':0})
titanic['family'] = titanic['sibsp'] + titanic['parch'] + 1
titanic.to_csv('./data/titanic3.csv', index = False)
heatmap_data = titanic[['survived', 'sex', 'age2', 'family', 'pclass', 'fare']]
colormap = plt.cm.RdBu
sns.heatmap(heatmap_data.astype(float).corr(), linewidths = 0.1, vmax = 1.0,
            square = True, cmap = colormap, linecolor = 'white', annot = True,
             annot_kws = {"size": 10})
plt.show()






