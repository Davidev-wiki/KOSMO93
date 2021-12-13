#pip install pymongo

from pymongo import MongoClient

# 방법1 - URI
# mongodb_URI = "mongodb://localhost:27017/"
# client = MongoClient(mongodb_URI)


# 방법2 - IP, 몽고DB PORT번호
client = MongoClient('localhost', 27017)

print(client.list_database_names())