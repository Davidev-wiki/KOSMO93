from bs4 import BeautifulSoup
import urllib.request
import pandas as pd
import datetime

from selenium import webdriver
import time

# 셀레니움을 활용한 예제

# [CODE 1]
def CoffeeBean_store(result):
    CoffeeBean_URL = "https://www.coffeebeankorea.com/store/store.asp"
    wd = webdriver.Chrome('./driver/chromedriver.exe')

    # for i in range(1, 370):  # 매장 수 만큼 반복하기
    for i in range(1, 20):
        wd.get(CoffeeBean_URL)
        time.sleep(1) # 웹 페이지를 연결할 동안 1초 대기
        try:
            # storePop : 리스트에서  "자세히보기"  버튼을 누르면 나타나는 팝업 이미지 스크립트
            '''
       
									<div class="store_txt">
										<p class="name">
											<span>상암SBS프리즘타워점 <!--strong class="distance">999m</strong--></span><!-- 2016-04-11 거리 추가 -->
											
storePop : 자세히보기 팝업					<a href="javascript:storePop2('374');" class="btn_style6">자세히보기</a>
											
										</p>
										<p class="tag">
<span class='decaf' title='디카페인'>디카페인</span><span class='soy' title='두유'>두유</span><span class='wifi' title='와이파이'>와이파이</span><span class='capsule' title='캡슐판매'>캡슐판매</span>
										</p>
										<p class="address">
											<span>서울 마포구 상암산로 82 SBS 프리즘 타워 1층 로비</span>
											<!--span class="lot">서울특별시 강남구 신사동 633-4</span-->
										</p>
										<p class="tel"><a href="tel:02-562-9605">02-562-9605</a></p>
									</div>
								</li>
            '''

            wd.execute_script("storePop2(%d)" %i)                       # [자세히보기] 버튼 누르면 나오는 팝업창을 띄우는 함수 실행
            time.sleep(1)                                               # 스크립트 실행할 동안 1초 대기
            html = wd.page_source                                       # webdriver를 이용해 page source를 html변수에 저장
            soupCB = BeautifulSoup(html, 'html.parser')                 # 뷰티풀숩으로 파싱한 데이터를 변수에 담기
            store_name_h2 = soupCB.select("div.store_txt > h2")         # h2보다 큰 div class="store_txt" (???)
            store_name = store_name_h2[0].string                        # 매장 이름 가져오기
            print(store_name)                                           # 매장 이름 출력해보기

            # 매장 정보 가져오기
            store_info = soupCB.select("div.store_txt > table.store_table > tbody > tr > td")
            store_address_list = list(store_info[2])                    # 매장 정보 : 주소 가져오기
            store_address = store_address_list[0]
            store_phone = store_info[3].string                          # 매장 정보 : 전번 가져오기
            result.append([store_name]+[store_address]+[store_phone])   # 문자열 합치기

        except:
            continue

    return

# [CODE 0]
def main():
    result = []
    print('CoffeeBean store crawling >>>>>')
    CoffeeBean_store(result)   # >>>>>>>>>>>>>>>>>>>>>>>> [CODE 1] 호출

    # '지점이름' '주소' '전화번호' 컬럼의 데이터프레임으로 만들기
    CB_tbl = pd.DataFrame(result, columns=('store', 'address', 'phone'))

    # 데이터를 CSV 파일로 만들어서 저장하기
    CB_tbl.to_csv('./data/CoffeeBean.csv', encoding='utf-8', mode='w', index=True)

if __name__ == '__main__':
    main()