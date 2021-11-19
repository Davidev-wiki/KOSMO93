from selenium import webdriver

driver = webdriver.Chrome("./driver/chromedriver")

# driver로 특정 페이지를 크롤링하기!!!
driver.get('https://auto.naver.com/bike/mainList.nhn')

print("#" * 100)
print(driver.title)         # 크롤링한 페이지의 title
print(driver.current_url)   # 크롤링한 페이지의 현재 url
print("바이크 브랜드 크롤링하기!")
print("#" * 100)