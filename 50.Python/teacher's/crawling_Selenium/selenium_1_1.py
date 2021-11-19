from selenium import webdriver
import chromedriver_autoinstaller

chrome_ver = chromedriver_autoinstaller.get_chrome_version().split('.')[0]  #크롬드라이버 버전 확인
print('chrome_ver >>> : ', chrome_ver)

try:
    driver = webdriver.Chrome(f'./{chrome_ver}/chromedriver.exe')
except:
    chromedriver_autoinstaller.install(True)
    driver = webdriver.Chrome(f'./{chrome_ver}/chromedriver.exe')

driver.implicitly_wait(3)
driver.get("https://google.com")

'''
driver = webdriver.Chrome("./driver/chromedriver")
'''

r = driver.execute_script("return 100 + 50")
print(r)

