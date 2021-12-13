import openpyxl

#pip install openpyxl

# 국가지표체계 : 자치단체 행정구역 및 인구현황 엑셀
#http://www.index.go.kr/potal/main/EachDtlPageDetail.do?idx_cd=1041

# 엑셀 파일 열기
filename = "./data/stats_104102.xlsx"
book = openpyxl.load_workbook(filename)

# 맨 앞의 시트 추출하기
sheet = book.worksheets[0]

# 시트의 각 행을 순서대로 추출하기
data = []
for row in sheet.rows:
    data.append([
        row[0].value,
        row[10].value
    ])

# 필요없는 줄(헤더, 연도, 계) 제거하기
del data[0]
del data[1]
del data[2]

# 데이터를 인구 순서로 정렬합니다.
data = sorted(data, key=lambda x:x[1])

# 하위 5위를 출력합니다.
for i, a in enumerate(data):
    if (i >= 5): break
    print(i+1, a[0], int(a[1]))