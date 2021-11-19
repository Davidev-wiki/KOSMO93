from selenium import webdriver
import time


# 100대 통계지표 엑셀 다운받기

def download_bok_statistics():
    driver = webdriver.Chrome("./driver/chromedriver.exe")
    driver.implicitly_wait(3)                                   # <<< 대기시간 3초
    driver.get("http://ecos.bok.or.kr/jsp/vis/keystat/#/key")

    excel_download = driver.find_element_by_css_selector('img[alt="download"]')
    driver.implicitly_wait(3)                                   # <<< 대기시간 3초

    excel_download.click()
    time.sleep(3)                                               # <<< 대기시간 3초

    driver.close()
    print("파일 다운로드 실행!!")

    return None

# 함수 실행 : 100대 통계지표 엑셀 다운로드
download_bok_statistics()