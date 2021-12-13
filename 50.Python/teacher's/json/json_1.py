import urllib.request as req
import os.path, random
import json

url = "https://api.github.com/repositories"

savename = "./data/repo.json"
if not os.path.exists(savename):
    req.urlretrieve(url, savename)

items = json.load(open(savename, "r", encoding="utf-8"))
# 또는
# s = open(savename, "r", encoding="utf-8").read()
# items = json.loads(s)

for item in items:
    print(item["name"] + " - " + item["owner"]["login"])