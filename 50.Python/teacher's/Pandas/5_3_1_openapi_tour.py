import os
import sys
import urllib.request
import datetime
import time
import json
import pandas as pd

'''
http://openapi.tour.go.kr/openapi/service/EdrcntTourismStatsService/getEdrcntTourismStatsList?YM=201201&NAT_CD=100&ED_CD=D&serviceKey=TEST_SERVICE_KEY
<response>
<header>
<resultCode>0000</resultCode>
<resultMsg>OK</resultMsg>
</header>
<body>
<items>
<item>
<ed>국민해외관광객</ed>
<edCd>D</edCd>
<natCd>100</natCd>
<natKorNm>한 국</natKorNm>
<num>1200782</num>
<rnum>1</rnum>
<ym>201201</ym>
</item>
</items>
<numOfRows>10</numOfRows>
<pageNo>1</pageNo>
<totalCount>1</totalCount>
</body>
</response>
'''

'''
{"response":
	
	{
		"header":
			{"resultCode":"0000","resultMsg":"OK"},

		"body":
			
			{"items":
				
				{
					"item":
						{	"ed":"방한외래관광객",
							"edCd":"E",
							"natCd":112,
							"natKorNm":"중  국",
							"num":392814,
							"rnum":1,
							"ym":201901
						}
				},
				
				"numOfRows":10,
				"pageNo":1,
				"totalCount":1
			}
	}
}
'''

ServiceKey="Ody77GLuYeR%2FeFqbpduMN2Bi4Cka2fztbgnj6E2Eux1kUhy3e4epR28XKBUaObiqPoVzAizxXMBPXtMyuC9v9Q%3D%3D"

yyyymm = '201901'
national_code = '112'
ed_cd = 'E'

service_url = "http://openapi.tour.go.kr/openapi/service/EdrcntTourismStatsService/getEdrcntTourismStatsList"
parameters = "?_type=json&serviceKey=" + ServiceKey   #인증키
parameters += "&YM=" + yyyymm
parameters += "&NAT_CD=" + national_code
parameters += "&ED_CD=" + ed_cd

url = service_url + parameters
print('url >>> : ')
print(url)

req = urllib.request.Request(url)
response = urllib.request.urlopen(req)
retData = response.read().decode('utf-8')
print('retData >>> : ')
print(retData)
    
