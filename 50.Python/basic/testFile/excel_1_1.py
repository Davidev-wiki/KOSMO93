import openpyxl

# 엑셀 파일 열기
filename = "./data/stats_104102.xlsx"
book = openpyxl.load_workbook(filename)
print(book)

# 3번째 시트 추출하기
sheet = book.worksheets[2]
print(sheet)

r = sheet.rows
print(r)

for row in sheet.rows:
    print(row[0])
    print(row[0].value)

