from selenium import webdriver

driver = webdriver.Chrome("./driver/chromedriver")
# driver로 특정 페이지를 크롤링한다.
driver.get('https://auto.naver.com/bike/mainList.nhn')

print("#" * 100)
print(driver.title)   # 크롤링한 페이지의 title 정보
print(driver.current_url)  # 현재 크롤링된 페이지의 url
print("바이크 브랜드 크롤링")
print("$" * 100)