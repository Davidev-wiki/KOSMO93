from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
import time

driver = webdriver.Chrome("./driver/chromedriver")
driver.get("http://localhost:8088/springHbe/index.jsp")
#driver.implicitly_wait(time_to_wait=10)
time.sleep(10)  # 웹페이지 연결할 동안 10초 대기


continue_link = driver.find_element(By.LINK_TEXT, '스프링 회원 : 로그인')
continue_link.click()
driver.find_element(By.ID,'mid').send_keys('ojy11')
driver.find_element(By.ID,'mpw').send_keys('1234')
driver.find_element(By.ID,'btn').send_keys(Keys.ENTER)


'''
continue_link = driver.find_element_by_link_text('스프링 회원 : 로그인')
continue_link.click()
driver.find_element_by_id('mid').send_keys('ojy11')
driver.find_element_by_id('mpw').send_keys('1234')
driver.find_element_by_id('btn').send_keys(Keys.ENTER)
'''

