import os
import sys
import urllib.request
import datetime
import time
import json
import pandas as pd

# 아래와 같이 json 데이터를 받음


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

ServiceKey = "HknGBOw1DcB%2Ftok7KL1O3Azqv7HIbxaFAU1xrbosndCUbf0wS1DtyKgiwwaL5RR7zlKoss8sRxGcJWDMbj2okA%3D%3D"

yyyymm = '201201'
national_code = '112'
ed_cd = 'D'

service_url = "http://openapi.tour.go.kr/openapi/service/EdrcntTourismStatsService/getEdrcntTourismStatsList"
parameters = "?_type=json&serviceKey=" + ServiceKey  # 인증키   # type=json이라고 표기되어있으면 json, 없으면 xml이다.
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

