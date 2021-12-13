# json 데이터의 url만 가지고 json파일을 만들어 저장하기

import urllib.request as req
import os.path, random
import json

url = "https://api.github.com/repositories"

savename = "./data/repo.json"
if not os.path.exists(savename):
    req.urlretrieve(url, savename)

items = json.load(open(savename, "r", encoding="utf-8"))

for item in items:
    print(item["name"] + " - " + item["owner"]["login"])