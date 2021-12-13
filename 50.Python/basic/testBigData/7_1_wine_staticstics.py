# 빅데이터 종합 예제 1 (과정의 흐름 정도만 알고있어도 무방할 듯..)

# 데이터 수집

# 데이터 준비

# 데이터 병합

# 합치기


# ===================== 예제 시작 ======================


# 데이터 수집
#https://archive.ics.uci.edu/ml/machine-learning-databases/wine-quality/

# 데이터 준비
import pandas as pd

# 데이터 프레임으로 변환 후 출력
red_df = pd.read_csv('./data/winequality-red.csv', sep=';', header=0, engine='python')
white_df = pd.read_csv('./data/winequality-white.csv', sep=';', header=0, engine='python')
print(red_df)
print(white_df)
red_df.to_csv('./data/winequality-red2.csv', index=False)
white_df.to_csv('./data/winequality-white2.csv', index=False)


# 데이터 병합
r = red_df.head()
print(r)


red_df.insert(0, column='type', value='red')
r = red_df.head()
print(r)
r = red_df.shape
print(r)


w = white_df.head()
print(w)
white_df.insert(0, column='type', value='white')
w = white_df.head()
print(w)
w = white_df.shape
print(w)

# 합치기
wine = pd.concat([red_df, white_df])
print("wine 출력해보기")
print(wine)
wr = wine.shape
print("wr 출력해보기")
print(wr);
wine.to_csv('./data/wine.csv', index=False)