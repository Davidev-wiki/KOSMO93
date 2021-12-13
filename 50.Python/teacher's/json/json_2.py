import json

price = {
    "data": "2021-11030",
    "price": {
        "Apple": 80,
        "Orange": 55,
        "Banana": 40
    }
}

s = json.dumps(price)
print(s)