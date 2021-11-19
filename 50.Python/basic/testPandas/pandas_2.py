import pandas as pd
print(pd.__version__)

# DataFrame
data1 = [10, 20, 30, 40, 50]
print('data1 >>> :', data1)
print('data1 >>> :', type(data1))

data2 = ['1반', '2반', '3반', '4반', '5반']
print('data2 >>> :', data2)
print('data2 >>> :', type(data2))


data_dic = {
                'year' : [2018, 2019, 2020],
                'sales' : [350, 480, 1099]
            }
print('data_dic >>> :', data_dic)
print('data_dic >>> :', type(data_dic))


# 딕셔너리를 이용해 DataFrame 생성
df1 = pd.DataFrame(data_dic)
print(df1)
print(type(df1))


# 리스트를 이용해 DataFrame 생성
df2 = pd.DataFrame(
                    [[89.2, 92.5, 90.8],[92.8, 89.9, 95.2]],
                    index = ['중간고사', '기말고사'],
                    columns= data2[0:3]
                   )
print(df2)
print(type(df2))


# 리스트를 이용해 DataFrame 생성2
data_df = [['20201101', 'Hong', '90', '95'], ['20201102', 'Kim', '93', '94'], ['20201103', 'Lee', '87', '97']]
df3 = pd.DataFrame(data_df)
print(df3)
print(type(df3))


# DataFrame 열 이름 설정
df3.columns = ['학번', '이름', '중간고사', '기말고사']
print(df3)


# DataFrame 조회
dd = df3.head(2) # 위에서부터 2개의 행 조회
print('dd >>> :')
print(dd)


dd = df3.tail(2) # 아래서부터 2개의 행 조회
print('dd >>> :')
print(dd)


dd = df3['이름'] # '이름' 컬럼으로 조회 : 컬럼 '이름'에 해당하는 데이터만 조회
print('dd >>> :')
print(dd)


print('-------------- csv --------------')

# CSV  :  comma-seperated values  :  파일로 저장
df3.to_csv('./data/score_1.csv', header='False')


# CSV 파일을 DataFrame으로 불러오기
df4 = pd.read_csv('./data/score.csv', encoding='utf-8', index_col=0, engine='python')
print(df4)