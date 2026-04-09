# QA Project - Browser Configuration

Acest proiect implementează o structură Java pentru configurarea browserelor folosind concepte de Programare Orientată pe Obiecte.

## 🛠️ Caracteristici Tehnice
* **Enum (`BrowserType`)**: Gestionează constantele pentru CHROME, FIREFOX și EDGE.
* **Constructor Chaining**: Utilizarea `this()` pentru a seta valori implicite (ex: `version="latest"`, `isHeadless=false`).
* **Static Factory Method**: Metoda `createDefaultChromeConfig()` pentru instanțiere rapidă.
* **Encapsulation**: Toate câmpurile clasei sunt private.

## 📂 Structură Cod
* `BrowserType.java` - Enum-ul de bază.
* `BrowserConfig.java` - Logica de configurare și constructorii.
* `TestConfigRunner.java` - Clasa de test cu metoda `main`.

## 🚀 Rulare
Rulează clasa `TestConfigRunner` din IntelliJ pentru a vedea output-ul configurațiilor în consolă.

---
**Autor:** Andra Elena Ionașcu