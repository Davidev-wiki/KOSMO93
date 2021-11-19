import requests
import json

# 5_4_openapi_openweather 데이터 조회하기(해설?)

apikey = "b5a8855bd3eef31d4696972a6009d8e6"   # 내 인증키
cities = ["Seoul,KR", "Tokyo,JP", "New York,US"]
name = cities[0]
api = "http://api.openweathermap.org/data/2.5/weather?q={city}&APPID={key}"
url = api.format(city=name, key=apikey)
print('api >>> : ', api)

r = requests.get(url)
print('r >>> : ', r)

data = json.loads(r.text)
print('data >>> : ', data)

'''
----받은데이터----
'''
{'coord': {'lon': 126.9778, 'lat': 37.5683},
 'weather': [{'id': 803, 'main': 'Clouds', 'description': 'broken clouds', 'icon': '04d'}], 'base': 'stations',
 'main': {'temp': 283.75, 'feels_like': 282.67, 'temp_min': 280.57, 'temp_max': 284.91, 'pressure': 1019,
          'humidity': 69}, 'visibility': 8000, 'wind': {'speed': 4.12, 'deg': 170}, 'clouds': {'all': 75},
 'dt': 1637199695, 'sys': {'type': 1, 'id': 8105, 'country': 'KR', 'sunrise': 1637187291, 'sunset': 1637223591},
 'timezone': 32400, 'id': 1835848, 'name': 'Seoul', 'cod': 200}

'''


-----정리 후----
{
    'coord': {'lon': 126.9778, 'lat': 37.5683}, 
    'weather': [{'id': 803, 'main': 'Clouds', 'description': 'broken clouds', 'icon': '04d'}], 
    'base': 'stations', 
    'main': {'temp': 283.75, 'feels_like': 282.67, 'temp_min': 280.57, 'temp_max': 284.91, 'pressure': 1019, 'humidity': 69}, 
    'visibility': 8000, 
    'wind': {'speed': 4.12, 'deg': 170}, 
    'clouds': {'all': 75}, 'dt': 1637199695, 
    'sys': {'type': 1, 'id': 8105, 'country': 'KR', 'sunrise': 1637187291, 'sunset': 1637223591}, 
    'timezone': 32400, 
    'id': 1835848, 
    'name': 'Seoul', 
    'cod': 200
}
'''



