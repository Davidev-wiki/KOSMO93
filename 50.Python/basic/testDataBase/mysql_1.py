import pymysql

'''
전 세계에서 
웹 프로그램 : 웹 브라우저 서비스 을 개발하는 시스템 중 1등 
linix + php + mysql 

Postgres : 객체 디비 
'''

# MySQL 연결하기
conn = pymysql.connect(
                        user='root',
                        passwd='1234',
                        host='localhost',
                        db='member'
                        )

# 커서 추출하기
cur = conn.cursor()

# 데이터 추출하기
cur.execute("SELECT * FROM remember")
for row in cur.fetchall():
    print(row)
