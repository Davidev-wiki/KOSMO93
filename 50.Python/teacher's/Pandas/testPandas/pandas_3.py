import pandas as pd

# read_csv() 함수로 df 생성
df = pd.read_csv('./data/auto-mpg.csv', header=None)

# 열 이름을 지정
df.columns = ['mpg','cylinders','displacement','horsepower','weight',
              'acceleration','model year','origin','name']

print(df.info())


# 데이터프레임 df의 내용을 일부 확인
print('데이터프레임 df의 내용을 일부 확인  ################### ')
print(df.head())     # 처음 5개의 행
print(df.tail())     # 마지막 5개의 행

# df의 모양과 크기 확인: (행의 개수, 열의 개수)를 투플로 반환
print('df의 모양과 크기 확인: (행의 개수, 열의 개수)를 투플로 반환  ################### ')
print(df.shape)

# 데이터프레임 df의 내용 확인
print('데이터프레임 df의 내용 확인  ################### ')
print(df.info())

# 데이터프레임 df의 자료형 확인
print('데이터프레임 df의 자료형 확인  ################### ')
print(df.dtypes)

# 시리즈(mog 열)의 자료형 확인
print('시리즈(mog 열)의 자료형 확인  ################### ')
print(df.mpg.dtypes)

# 데이터프레임 df의 기술통계 정보 확인
print('데이터프레임 df의 기술통계 정보 확인  ################### ')
print(df.describe())
print(df.describe(include='all'))

# 데이터프레임 df의 각 열이 가지고 있는 원소 개수 확인
print('데이터프레임 df의 각 열이 가지고 있는 원소 개수 확인  ################### ')
print(df.count())

# df.count()가 반환하는 객체 타입 출력
print('df.count()가 반환하는 객체 타입 출력  ################### ')
print(type(df.count()))

# 데이터프레임 df의 특정 열이 가지고 있는 고유값 확인
print('데이터프레임 df의 특정 열이 가지고 있는 고유값 확인  ################### ')
unique_values = df['origin'].value_counts()
print(unique_values)

# value_counts 메소드가 반환하는 객체 타입 출력
print('value_counts 메소드가 반환하는 객체 타입 출력  ################### ')
print(type(unique_values))

# 평균값
print('평균값 ################### ')
print(df.mean())
print(df['mpg'].mean())
print(df.mpg.mean())
print(df[['mpg','weight']].mean())

# 중간값
print('중간값 ################## ')
print(df.median())
print(df['mpg'].median())

# 최대값
print('최대값 ################## ')
print(df.max())
print(df['mpg'].max())

# 최소값
print('최소값 ################## ')
print(df.min())
print(df['mpg'].min())

# 표준편차
print('표준편차 ################## ')
print(df.std())
print(df['mpg'].std())

# 상관계수
print('상관계수 ##################')
print(df.corr())
print(df[['mpg','weight']].corr())
