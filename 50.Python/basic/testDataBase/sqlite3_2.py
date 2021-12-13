import sqlite3

'''
    SI쪽에서 많이 볼 수 있는 데이터베이스 순위 리스트

    1. Oralce DataBase(RDB)
    2. Microsoft SQL Server(RDB)
    3. MySQL/MariaDB(RDB)

    4. MongoDB(NoSQL)
    5. SQLite(RDB) : 안드로드, 파이썬에 내장 되어있음

    6. PostgresSQL(RDB)
    7. TinyDB(NoSQL)
'''

# sqlite 데이터베이스 연결하기
dbpath = "./db/est.sqlite"
conn = sqlite3.connect(dbpath)

# 테이블을 생성하고 데이터 넣기
cur = conn.cursor()
cur.executescript("""
                    /* items 테이블이 이미 있다면 제거하기 */
                    DROP TABLE IF EXISTS items;

                    /* 테이블 생성하기 */
                    CREATE TABLE items(
                        item_id INTEGER PRIMARY KEY,
                        name TEXT UNIQUE,
                        price INTEGER
                    );

                    /* 데이터 넣기 */
                    INSERT INTO items(name, price)VALUES('Apple', 800);
                    INSERT INTO items(name, price)VALUES('Orange', 780);  
                    INSERT INTO items(name, price)VALUES('Banana', 430);
                """)

# 위의 조작을 데이터베이스에 반영하기
conn.commit()

# 데이터 추출하기
cur = conn.cursor()
cur.execute("SELECT item_id,name,price FROM items")
item_list = cur.fetchall()

# 출력하기
for it in item_list:
    print(it)