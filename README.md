# 📘 Learn-ng-Gauge-Automation

## 🇦🇿 Layihə Haqqında

Bu layihə vasitəsilə **Bazarstore** şirkətinin veb istifadəçi interfeysi (UI) üçün **test avtomatlaşdırması** həyata keçirilir.  
Avtomatlaşdırma prosesində `Gauge` framework-ü əsas rol oynayır və aşağıdakı texnologiyalar istifadə olunur:

### 🛠 İstifadə olunan texnologiyalar və framework-lər:
- **Gauge** – Specification-based test framework
- **Java 21** – Proqramlaşdırma dili
- **Selenium WebDriver 4.20.0** – UI elementlərinin idarəsi
- **JUnit 4.13.2** – Test nəticələrinin yoxlanması
- **WebDriverManager 5.6.3** – Driver idarəçiliyi
- **Maven 3.9.8** – Asılılıq və layihə idarəetməsi
- **Log4j 2.21.0** – Loglama sistemi

---

### 🎯 Məqsədimiz

- **Bazarstore veb saytında əsas istifadəçi axınlarını Gauge ilə avtomatlaşdırmaq**
  - Axtarış sahəsi, düymələr, gridlər, dropdown-lar, input sahələri və s.
- Yazılan step-lərin Gauge `.spec` fayllarında insanlar tərəfindən oxunaqlı şəkildə ifadə olunması
- XPath və digər selektorlar vasitəsilə interaktiv davranışların test edilməsi
- Hər bir ssenarinin **HTML report** şəklində vizuallaşdırılması
- Daha sonra layihəyə **API test avtomatlaşdırması** modulu əlavə olunması
  - Demo API-lərlə işləmək
  - Token əsasında authentication testləri
- Gələcəkdə bu layihənin **Jenkins** və ya **GitHub Actions** ilə **CI/CD** proseslərinə inteqrasiya olunması

---

## 🇬🇧 About the Project

This project is designed to automate **Bazarstore's web user interface (UI)** using the **Gauge** testing framework.  
The automation flow is built on a modern stack with the following tools and frameworks:

### 🛠 Tools & Frameworks Used:
- **Gauge** – Specification-based test framework
- **Java 21** – Programming language
- **Selenium WebDriver 4.20.0** – UI interaction engine
- **JUnit 4.13.2** – Test assertion framework
- **WebDriverManager 5.6.3** – Driver dependency manager
- **Maven 3.9.8** – Project & dependency manager
- **Log4j 2.21.0** – Logging system

---

### 🎯 Our Objectives

- Automate key user flows on the Bazarstore website using Gauge
  - Search input, buttons, grid tables, dropdowns, form fields, etc.
- Write readable, reusable test steps mapped to `.spec` files using Gauge
- Validate UI interactions using XPath and other selectors
- Generate **detailed HTML reports** for each test suite
- Expand the project to include **API automation testing**
  - Work with demo APIs
  - Token-based authentication scenarios
- Integrate into **CI/CD pipelines** using Jenkins or GitHub Actions in the future

---

## 🚀 How to Run

```bash
git clone https://github.com/your-username/Learn-ng-Gauge-Automation.git
cd Learn-ng-Gauge-Automation
mvn clean install
gauge run specs
