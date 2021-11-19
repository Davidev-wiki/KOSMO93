from selenium import webdriver

driver = webdriver.Chrome("./driver/chromedriver")
driver.get("https://google.com")

r = driver.execute_script("return 100 + 50")
print(r)

# pip install --upgrade pip
# pip install selenium
# https://chromedriver.chromium.org/downloads

# https://selenium-python.readthedocs.io/


'''
Selenium에서는 web page의 elements를 찾기위해 아래와 같은 method들을 제공합니다.

아래 method들은 HTML의 page source중 가장 첫번째 element를 반환합니다.
=================================================================
find_element_by_id
find_element_by_name
find_element_by_xpath
find_element_by_link_text
find_element_by_partial_link_text
find_element_by_tag_name
find_element_by_class_name
find_element_by_css_selector

multiple elements는 아래 method를 사용합니다.
=================================================================
find_elements_by_name
find_elements_by_xpath
find_elements_by_link_text
find_elements_by_partial_link_text
find_elements_by_tag_name
find_elements_by_class_name
find_elements_by_css_selector

find_element By로 정리하기
=================================================================
from selenium.webdriver.common.by import By

driver.find_element(By.XPATH, '//button[text()="Some text"]')
driver.find_element(By.XPATH, '//button')
driver.find_element(By.ID, 'loginForm')
driver.find_element(By.LINK_TEXT, 'Continue')
driver.find_element(By.PARTIAL_LINK_TEXT, 'Conti')
driver.find_element(By.NAME, 'username')
driver.find_element(By.TAG_NAME, 'h1')
driver.find_element(By.CLASS_NAME, 'content')
driver.find_element(By.CSS_SELECTOR, 'p.content')
driver.find_elements(By.ID, 'loginForm')
driver.find_elements(By.CLASS_NAME, 'content')
'''