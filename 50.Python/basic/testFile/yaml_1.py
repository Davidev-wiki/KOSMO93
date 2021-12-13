#pip install pyyaml
#pip install pyyaml==5.4.1  |  현재 버전을 지운 뒤 5.4.1을 설치함

import yaml

yaml_str = """
            Date: 2017-03-10
            PriceList:
                -
                    item_id: 1000
                    name: Banana
                    color: yellow
                    price: 800
                -
                    item_id: 1001
                    name: Orange
                    color: orange
                    price: 1400
                -
                    item_id: 1002
                    name: Apple
                    color: red
                    price: 2400
            """

# data = yaml.load(yaml_str)                            # deprecated
data = yaml.load(yaml_str, Loader=yaml.FullLoader)      # 요즘 사용방법

for item in data['PriceList']:
    print(item["name"], item["price"])
