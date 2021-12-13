import cx_Oracle
import os

# pip install cx_Oracle

# 한글 지원
os.putenv('NLS_LANG', '.UTF8')

# 연결에 필요한 정보(유저, 비밀번호, 데이터베이스주소)
connection = cx_Oracle.connect('scott', 'tiger', 'localhost/orclKOSMO00');
curser = connection.cursor()

curser.execute( """
                    select empno 
                    from emp 
                    where ename = :textname 
                """,
                textname = "SMITH"
              )

for empno in curser:
    print("SMITH 사번은 : ", empno)