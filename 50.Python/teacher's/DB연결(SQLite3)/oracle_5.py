import cx_Oracle
import os


def insert(t):
    # 한글 지원
    os.putenv('NLS_LANG', '.UTF8')

    # 연결에 필요한 정보(유저, 비밀번호, 데이터베이스주소)
    conn = cx_Oracle.connect('scott/tiger@localhost:1521/orclKOSMO00')
    curser = conn.cursor()
    insert_query = """
                        insert into AUTOWIRED_TEST values(:1, :2, :3, :4)                              
                   """
    curser.execute(insert_query, t)

    conn.commit()

    curser.close()
    conn.close()




data_num = '999a1'
data_id = '999a'
data_pw = '999a'
data_name = '999a'


t = (data_num, data_id, data_pw, data_name)
insert(t)

