import urllib.request
url="http://uta.pw/shodou/img/28/214.png"
savename="./data/test_1.jpg"
urllib.request.urlretrieve(url, savename)
print("saved!")
