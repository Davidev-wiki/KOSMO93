from tinydb import TinyDB, Query

'''
Oracle : 관계형 데이터베이스 : sql : 질의문 으로 데이터를 다룬다
        ex) Oracle, MySQL, MSSQL ....

TinyDB  : 문서형 데이터베이스 : sql 문이 없다. : NoSQL : 객체 디비 : Collection, Dictionary
        : 파일을 json 으로 만들어 사용하는 문서형 데이터베이스
        ex) MongoDB, TinyDB ...

pip install tinydb
'''


# 데이터베이스 연결하기
filepath = "./db/test-tinydb.json"

db = TinyDB(filepath)
# 기존의 테이블이 있다면 제거하기


# db.purge_table('fruits')
db.truncate()

# 테이블 생성/추출하기
table = db.table('fruits')

# 테이블에 데이터 추가하기
table.insert( {'name' : 'Banana', 'price' : 6000} )
table.insert( {'name' : 'Orange', 'price' : 12000} )
table.insert( {'name' : 'Mango', 'price' : 8400} )


# 모든 데이터를 추출해서 출력하기
print(table.all())


# 특정 데이터 추출하기
# Orange 검색하기, Orange의 가격
Item = Query()
res = table.search(Item.name == 'Orange')
print('Orange is ', res[0]['price'])

# 가격이 8000원 이상인 것 추출하기
print("8000원 이상인 것 >>> : ")
res = table.search(Item.price >= 8000)
for it in res:
    print("-", it['name'])