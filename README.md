# <img src="images/st.jpg" width="40" height="40">  Проект для SystemTechnologies

<img src="images/st.by.jpg" width="800" height="600"> 

## :gear: Использованы технологии:
| Java | Gradle | Junit5 | Selenide | GitHub | Jenkins | Selenoid | Allure Report | Allure TestOps | Jira | Telegram |
|:----:|:----:|:------:|:------:|:------:|:----:|:----:|:------:|:------:|:------:|:------:|
| <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Java.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Gradle.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/JUnit5.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Selenide.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Github.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Jenkins.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Selenoid.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Allure_Report.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/AllureTestOps.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Jira.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Telegram.png" width="40" height="40"> |

___

## <img src="images/ato1.jpg" width="20" height="20"> Проект создан в Allure TestOps
<img src="images/ato.jpg" width="800" height="600"> 

___

## :person_in_tuxedo: Запуск тестов происходит в CI [Jenkins](https://jenkins.autotests.cloud/job/08-Veronika_Monarkhovich-System_technologies/)

<img src="images/jenkins.jpg" width="800" height="600"> 

Создаем config.properties:

```bash
./src/test/resources/config/config.properties
```
Text File Content:
```bash
webUrl=https://www.st.by
remoteUrl = REMOTE_DRIVER_URL
```
Запуск тестов:
- в параметре DremoteDriverUrl - указываем логин, пароль и адрес удаленного сервера, где будут проходить тесты
- в параметре DvideoStorage указываем место для сохранения видео
- в параметре Dbrowser задаем браузер
```bash
gradle clean test -Dbrowser=${BROWSER}  -DremoteDriverUrl=${REMOTE_DRIVER_URL} -DvideoStorage=https://selenoid.autotests.cloud/video/
```

Генерация отчета:
```bash
allure serve 
```
```bash
build/allure-results
```
___

## :bar_chart: Отчет генерируется в Allure

<img src="images/all.jpg" width="800" height="600">

___

## :calling: Уведомления о прохождение тестов отправляются в Telegram

<img src="images/telegram.jpg" width="800" height="600"> 

___

## :movie_camera: Видеотчет теста "Проверка 'Связаться с нами'"

<img src="images/Connect.gif" width="1000" height="600"> 