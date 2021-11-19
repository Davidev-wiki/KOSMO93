import requests

# data.go.kr

# 기상청_중기예보 조회서비스 신청

# 1	중기해상예보조회	예보구역코드, 발표시각의 조회 조건으로 예보일로부터 3일에서 10일까지 해상 날씨 및 파고정보를 조회하는 기능	10000	확인
# 2	중기기온조회	예보구역코드, 발표시각의 조회 조건으로 예보일로부터 3일에서 10일까지 최저/최고기온정보를 조회하는 기능	10000	확인
# 3	중기육상예보조회	예보구역코드, 발표시각의 조회 조건으로 예보일로부터 3일에서 10일까지 육상날씨정보를 조회하는 기능	10000	확인
# 4	중기전망조회	지점번호, 발표시각의 조회조건으로 기상전망정보를 조회하는 기능	10000	확인

# 중기육상예보조회 조회해 오시오


url = 'http://apis.data.go.kr/1360000/MidFcstInfoService/getMidLandFcst'
serviceKey = "OUSAbCNDddd1prl6KEvCSuNm6NfotZ%2B7h6YSwYNhuBQVZDmBZJg9wtWeBjbGu5u7unr8VyAtpYFU0VP3CeAjTA%3D%3D"
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