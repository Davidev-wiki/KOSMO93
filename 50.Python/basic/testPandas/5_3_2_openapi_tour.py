import os
import sys
import urllib.request
import datetime
import time
import json
import pandas as pd

# 아래와 같이 xml 데이터를 받음

'''
http://openapi.tour.go.kr/openapi/service/EdrcntTourismStatsService/getEdrcntTourismStatsList?YM=201201&NAT_CD=100&ED_CD=D&serviceKey=TEST_SERVICE_KEY
'''

'''
retData >>> : 
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<response>
    <header>
        <resultCode>0000</resultCode>
        <resultMsg>OK</resultMsg>
    </header>
    <body>
        <items>
            <item>
                <ed>방한외래관광객</ed>
                <edCd>E</edCd>
                <natCd>112</natCd>
                <natKorNm>중  국</natKorNm>
                <num>392814</num>
                <rnum>1</rnum>
                <ym>201901</ym>
            </item>
        </items>
        <numOfRows>10</numOfRows>
        <pageNo>1</pageNo>
        <totalCount>1</totalCount>
    </body>
</response>

'''

# 일반 인증키 (인코딩) : HknGBOw1DcB%2Ftok7KL1O3Azqv7HIbxaFAU1xrbosndCUbf0wS1DtyKgiwwaL5RR7zlKoss8sRxGcJWDMbj2okA%3D%3D
# 일반 인증키 (디코딩) : HknGBOw1DcB/tok7KL1O3Azqv7HIbxaFAU1xrbosndCUbf0wS1DtyKgiwwaL5RR7zlKoss8sRxGcJWDMbj2okA==
ServiceKey = "HknGBOw1DcB/tok7KL1O3Azqv7HIbxaFAU1xrbosndCUbf0wS1DtyKgiwwaL5RR7zlKoss8sRxGcJWDMbj2okA=="


yyyymm = '201901'
national_code = '112'
ed_cd = 'E'

service_url = "http://openapi.tour.go.kr/openapi/service/EdrcntTourismStatsService/getEdrcntTourismStatsList"
parameters = "?serviceKey=" + ServiceKey
parameters += "&YM=" + yyyymm       # 요청변수 : 연월
parameters += "&NAT_CD=" + national_code   # 요청변수 : 국가 코드
parameters += "&ED_CD=" + ed_cd    # 요청변수 : 출입국구분 코드

url = service_url + parameters
print('url >>> : ')
print(url)

req = urllib.request.Request(url)
response = urllib.request.urlopen(req)
retData = response.read().decode('utf-8')
print('retData >>> :')
print(retData)


'''
체크 :  데이터를 받아오는 기본적인 형태

<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<response>
    <header>
        <resultCode>0000</resultCode
        <resultMsg>OK</resultMsg>
    </header>
    <body>
        <items>
            <item>
                <ed>방한외래관광객</ed>
                <edCd>E</edCd>
                <natCd>112</natCd>
                <natKorNm>중  국</natKorNm>
                <num>392814</num>
                <rnum>1</rnum>
                <ym>201901</ym>
            </item>
        </items>
        <numOfRows>10</numOfRows>
        <pageNo>1</pageNo>
        <totalCount>1</totalCount>
    </body>
</response>


'''
















