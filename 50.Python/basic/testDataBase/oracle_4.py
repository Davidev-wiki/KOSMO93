# 코드 실행시 오라클에 연결해
# 기존에 만들어둔 테이블에 데이터를 입력한다.
import cx_Oracle
import os

'''
CREATE TABLE AUTOWIRED_TEST(
    DATANUM VARCHAR2(20)
   ,DATAID VARCHAR2(20)
   ,DATAPW  VARCHAR2(20)
   ,DATANAME VARCHAR2(100)
);
'''

# 한글 지원
os.putenv('NLS_LANG', '.UTF8')

# 연결에 필요한 정보(유저, 비밀번호, 데이터베이스주소)
conn = cx_Oracle.connect('scott/tiger@localhost:1521/orclKOSMO00');

insert_query = """
                    insert into 
                    AUTOWIRED_TEST(DATANUM, DATAID, DATAPW, DATANAME)
                            values('333b', '333b', '333b', '333b')
               """

curser = conn.cursor()
curser.execute(insert_query)

conn.commit()

curser.close()
conn.close()



