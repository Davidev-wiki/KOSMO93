import pymysql

# MySQL 연결하기
conn = pymysql.connect(
                        user='root',
                        passwd='1234',
                        host='localhost',
                        db='member')

# 커서 추출하기
cur = conn.cursor()

# 테이블 생성하기
#맨 처음 실행 할 때는 테이블 지우는 루틴 주석처리 하고 하기
#테이블 생성된 이후에는 테이블 지우는 루틴 추가해서 하기
# cur.execute('DROP TABLE items')

cur.execute('''
                CREATE TABLE items (
                    item_id INTEGER PRIMARY KEY AUTO_INCREMENT,
                    name TEXT,
                    price INTEGER
                )
            ''')

# 데이터 추가하기
data = [('Banana', 300),('Mango', 640), ('Kiwi', 280)]
for i in data:
    cur.execute("INSERT INTO items(name,price) VALUES(%s,%s)", i)

# 데이터 추출하기
cur.execute("SELECT * FROM items")
for row in cur.fetchall():
    print(row)