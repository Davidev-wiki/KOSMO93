from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
import time

driver = webdriver.Chrome("./driver/chromedriver")
driver.get("http://192.168.0.126:8080/springKck/index.jsp")     # 접속할 url
#driver.implicitly_wait(time_to_wait=1)        # driver의 자체 함수를 이용해 interval 부여
time.sleep(1)                                  # time 객체를 이용해 웹페이지 연결할 동안 1초 대기

# 강사님 ip : 192.168.219.100
# 로그인 계정 : ojy11 / 1234

# 3강의실 내 ip & port :  192.168.0.126:8080

continue_link = driver.find_element(By.LINK_TEXT, '스프링 회원 : 로그인')
continue_link.click()
driver.find_element(By.ID, 'mid').send_keys('Davidev')
driver.find_element(By.ID, 'mpw').send_keys('1')
driver.find_element(By.ID, 'btn').send_keys(Keys.ENTER)


'''
위와 같은 코드 : *deprecated code : 작동은 된다.

continue_link = driver.find_element_by_link_text('스프링 회원 : 로그인')
continue_link.click()
driver.find_element_by_id('mid').send_keys('Davidev')
driver.find_element_by_id('mpw').send_keys('1')
driver.find_element_by_id('btn').send_keys(Keys.ENTER)
'''

