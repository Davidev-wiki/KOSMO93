# titanic 데이터셋 가져오기

import seaborn as sns

titanic = sns.load_dataset('titanic')

# titanic 데이터셋 살펴보기
print(titanic.head())
print('\n')
print(titanic.info())