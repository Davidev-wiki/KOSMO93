import json

price = {
    "data" : "2021-11030",
    "price" : {
        "Apple" : 80,
        "Orange" : 55,
        "Banana" : 40
    }
}
# json.jumps() 사용 전 타입 >>>   :    dictionary
print(type(price))

# json.dumps() 함수 : 객체 데이터를 json으로 바꿔주는 함수.
data = json.dumps(price)

# json.jumps() 사용 후 타입 >>>   :   str
print(type(data))
print(data)

# json  ==  "key" : "value"로 이루어진 데이터를 가진 객체 (Type : str)
