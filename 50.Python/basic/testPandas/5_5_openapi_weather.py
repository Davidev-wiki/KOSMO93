import requests


# 공공데이터 포털 (data.go.kr)에서 데이터 찾기 -> 기상청 중기예보 서비스 검색 후 이용 신청

# [중기육상예보조회]를 조회해 보기 : 요청변수 stdt

url = 'http://apis.data.go.kr/1360000/MidFcstInfoService/getMidLandFcst'
serviceKey = "HknGBOw1DcB%2Ftok7KL1O3Azqv7HIbxaFAU1xrbosndCUbf0wS1DtyKgiwwaL5RR7zlKoss8sRxGcJWDMbj2okA%3D%3D"
pageNo = 1
numOfRows = 10
dataType = "XML"
regId = "11B00000"
tmFc = "202107300600"

queryparam = {  'serviceKey':serviceKey
                ,'pageNo': pageNo
                ,'numOfRows':numOfRows
                ,'dataType': dataType
                ,'regId':regId
                ,'regId':tmFc}

res = requests.get(url, params=queryparam)
rs=res.status_code
r=res.text
print(rs)
print(r)