from bs4 import BeautifulSoup
import urllib.request
import pandas as pd
import datetime


# [CODE 1]

def hollys_store(result):
    for page in range(1, 59):
        Hollys_url = 'https://www.hollys.co.kr/store/korea/korStore.do?pageNo=%d&sido=&gugun=&store=' % page
        print(Hollys_url)

        # 데이터 요청하고 받아오기
        html = urllib.request.urlopen(Hollys_url)

        # 받아서 저장한 데이터인 'html'을 파싱해서 변수에 저장
        soupHollys = BeautifulSoup(html, 'html.parser')

        # 원하는 데이터가 들어있는 상위 태그이름 찾기
        tag_tbody = soupHollys.find('tbody')

        # for 반복문으로 실제 데이터가 있는 태그의 데이터 값을 모두 추출
        for store in tag_tbody.find_all('tr'):
            # store의 길이가 3보다 작거나 같으면 스탑.  여기에서 store는 지점에 대한 정보??
            if len(store) <= 3:
                break
            store_td = store.find_all('td')
            store_name = store_td[1].string         # 지점이름
            store_sido = store_td[0].string         # 지역
            store_address = store_td[3].string      # 주소
            store_phone = store_td[5].string        # 전화번호
            result.append([store_name]+[store_sido]+[store_address]
                          +[store_phone])           # 4,간석오거리점,인천 남동구,,032-425-0915
        return
'''
# 할리스 홈피 내 리스트_tr 내 td는 6개씩 존재함
	<tbody>
		<tr>
				<!--
				<td class="noline center_t">
																<a href="javascript:goLogin();"><img src="https://www.hollys.co.kr/websrc/images/store/ico_favorite_off.png" alt="즐겨찾기"></a>
									</td>
				 -->
[0]지역				<td class='noline center_t'>서울 종로구</td>  
[1]지점이름				<td class='center_t'><a href="#" onclick="javascript:storeView(937); return false;">독립문역점</a></td>
[2]현재영업상태				<td class='center_t tdp0'>영업중</td>
[3]주소				<td class='center_t'><a href="#" onclick="javascript:storeView(937); return false;">서울특별시 종로구 통일로 230 (무악동, 경희궁롯데캐슬) 상가동  지하1층 117호</a></td>
[4]?				<td class='center_t'>
[5]전화번호																																														<img src='https://www.hollys.co.kr/websrc/images/store/img_store_s08.png' style='margin-right:1px' alt='주차' />
									</td>
				<td class='center_t'>02-725-7308</td>
'''

# [CODE 0]

def main():
    result = []
    print('HOLLYS STORE CRAWLING >>>> ')
    hollys_store(result)           # >>>>>>>>>   [CODE 1] 호출

    # 데이터프레임으로 만들어서 저장하기
    hollys_tbl = pd.DataFrame(result, columns=('store', 'sido-gu', 'address', 'phone'))

    # 데이터프레임을 csv파일로 만들기
    hollys_tbl.to_csv('./data/hollys.csv', encoding='utf-8', mode='w', index=True)

    # 결과는 지우고 마무리하기
    del result[:]


# ?????????????????????????????????????????
if __name__ == '__main__':
    main()