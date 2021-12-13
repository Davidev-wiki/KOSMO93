# 코드 실행시 오라클에 접속해 하단에있는 쿼리문으로
# 데이터를 조회한 뒤
# 데이터 프레임으로 포맷을 만들어
# 콘솔 화면에 출력해준다.

import cx_Oracle
import os
import pandas as pd


# 한글 지원
os.putenv('NLS_LANG', '.UTF8')

# cx_Oracle.makedsn : 오라클에 대한 주소 정보 : 데이터 소스
# cx_Oracle.connect : 오라클 접속 유저 정보
# db.cursor : 데이터 담을 메모리의 이름을 선언
# cursor.execute : SQL의 결과가 cursor 메모리를 담는다.
# cursor.fetchall : 메모리에 담긴 데이터를 한 행씩 fetch 한다. 전부 all.
# cursor.description : 데이터의 칼럼명을 추출합니다.

# 연결에 필요한 정보(유저, 포트번호, SID)
dsn = cx_Oracle.makedsn('localhost', 1521, 'orclKOSMO00')
conn = cx_Oracle.connect('scott', 'tiger');

curser = conn.cursor()
curser.execute( """ select * from emp """)

row = curser.fetchall()
colname = curser.description
col = []

for i in colname:
     col.append(i[0])

emp = pd.DataFrame(row,columns=col)
print(emp)

