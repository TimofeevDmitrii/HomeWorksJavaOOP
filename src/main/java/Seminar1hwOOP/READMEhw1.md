# Студент: Тимофеев Дмитрий; группа "Разработчик-программист 5442, 10.10.2023"

## Домашнее задание №1
### Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
* Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
* Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
* В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
* Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

В соответствии с домашним заданием был создан класс HotBeverage - горячий напиток, наследник класса Product, а также класс HotBeverageVendingMachine - автомат горячих напитков, имплементирующий
интерфейс VendingMachine. Реализация алгоритма представлена в MainHotBeveragesVendingMachine.