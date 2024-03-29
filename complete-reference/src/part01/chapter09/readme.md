# Глава 9. Пакеты и интерфейсы

## Пакеты

**Пакеты** являются иерархическими контейнерами классов и служат для разделения пространств имён класса.

Они позволяют создавать разные классы с одинаковыми именами путём размещения этих классов в разных пакетах.

Пакет выполняет **две функции**:
* Исправляет конфликт имён классов с одинаковыми именами, размещая их в разных пакетах;
* Управляет доступностью объектов - можно определить классы и члены классов, недоступные для кода за переделами пакета.

**Определение пакета** - оператор **package** - определяет пространство имён, в котором хранятся классы.
```
package имя_пакета;
package имя_пакета_1.имя_пакета_2.имя_пакета_3; // иерархия пакетов, операция-точка
```
Если оператор package отсутствует, то имена классов размещаются в пакете, используемом по умолчанию и не имеющем имени.

Для хранения пакетов в Java используются каталоги файловой системы. Иерархия пакетов соответствует иерархии каталогов.
В именах файлов и каталогов учитывается регистр символов и они должны точно соответствовать имени пакета.

Исполняющая система Java ищет пакеты в файловой системе в следующих местах:
* В текущем рабочем каталоге. Если пакет находится в подкаталоге текущего каталога, то он будет найден.
  Программа должна быть запущена на выполнение из каталога, находящегося непосредственно над каталогом с именем пакета.
* По путям, указанным в переменной окружения CLASSPATH;
* Команды java и javac можно указывать в командной строке с параметром -classpath, обозначающим путь к классам.

При запуске программы с помощью последних двух способов путь к классу не должен включать сам пакет,
а просто указывать путь к этому пакету.

### Защита доступа

Совокупность пакетов и классов является одновременно:
* средством инкапсуляции и хранилищем пространства имён;
* средством регулирования области видимости переменных и методов класса.

**Уровни доступа к членам класса**

Совокупность **пакета** и модификаторов доступа **private, public, protected** определяют следующие уровни доступа
**к членам класса** (переменным и методам).

"Да" - член класса доступен, "Нет" - недоступен.

| Категория доступности членов класса / модификатор |   private   | отсутствует |  protected  |   public   |
| ------------------------------------------------- | ----------- | ----------- | ----------- | ---------- |
| Один и тот же класс                               |     Да      |     Да      |     Да      |     Да     |
| Подкласс суперкласса из того же пакета            |     Нет     |     Да      |     Да      |     Да     |
| Класс из того же пакета (не подкласс)             |     Нет     |     Да      |     Да      |     Да     |
| Подкласс суперкласса из другого пакета            |     Нет     |     Нет     |     Да      |     Да     |
| Класс из другого пакета (не подкласс)             |     Нет     |     Нет     |     Нет     |     Да     |

**Пояснение уровней доступа к членам класса**:
* public - доступен из любого кода;
* private - недоступен за пределами класса;
* модификатор доступа отсутствует - уровень доступа по умолчанию - 
  доступен для подклассов и других классов из данного пакета;
* protected - доступен за пределами его текущего пакета только подклассам данного суперкласса.

**Уровни доступа к классу**

Для класса, не являющегося вложенным, может быть указан только один из двух возможных уровней доступа:

* public - открытый - класс доступен из любого другого кода.
  Этот класс должен быть единственным public-классом, объявленным в файле, а имя файла должно совпадать с именем класса.
* модификатор доступа отсутствует - уровень доступа по умолчанию - класс доступен только для кода из данного пакета.

### Импорт пакетов

**Импорт пакетов** (точнее говоря, импорт _классов_ из пакетов) служит для возможности ссылаться в исходном коде на
класс по его имени, без включения длинного имени пути к пакету.

Общая форма оператора **import**:

```
import имя_пакета_1[.имя_пакета_2][.имя_пакета_n].(имя_класса | *);

import java.util.Date;
import java.io.*;       // импорт всех классов из пакета java.io
import java.lang.*;     // для всех программ компилятор неявно импортирует все классы из пакета java.lang
```

Свойства оператора import:
* Следует сразу за оператором package (если он есть) и перед определением класса;
* Указывать оператор import не обязательно, можно везде использовать _полностью уточнённое имя класса_
```java
import java.util.*;
class MyDate extends Date {
}
// равнозначно коду:
class MyDate extends java.util.Date {
}
```

### Статический импорт

**Статический импорт** - это импорт _статических_ членов класса или интерфейса (статических переменных и методов).
 
Общая форма статического импорта **import static**:

```
import static имя_пакета.имя_типа.имя_статического_члена; // имя_типа - это имя класса или интерфейса
import static имя_пакета.имя_типа.*; // импорт всех статических членов класса или интерфейса
```

Статический импорт позволяет ссылаться в коде на статические члены непосредственно по их именам,
не уточняя их именем пакета и класса.

```
// Статический импорт
// для доступа к статическим методам sqrt (квадратный корень) и pow (возведение x в степень y)
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

// для доступа к статическому полю System.out (стандартный поток вывода out)
import static java.lang.System.out;

sqrt(100);          // вместо Math.sqrt(100);
pow(10, 2);         // вместо Math.pow(10, 2);
out.println("OK");  // вместо System.out.println("OK");
```

## Интерфейсы

**Интерфейс** - средство абстракции интерфейса класса ("протокола общения") от его реализации.

Интерфейс описывает _что_ должен реализовать класс, но не _как_ это реализовать (до версии JDK 8).

Интерфейсы предназначены для поддержки динамического разрешения вызовов методов во время выполнения.

Интерфейсы изолируют определение методов от иерархии наследования классов.
Иерархия интерфейсов не совпадает с иерархией классов. Поэтому классы, никак не связанные между собой иерархически, 
могут реализовать один и тот же интерфейс. Интерфейс в отличие от класса не хранит состояние (с помощью переменных
экземпляра), нельзя создать экземпляр интерфейса.

**Объявление интерфейса** - ключевое слово **interface**:

```
модификатор_доступа interface имя_интерфейса {
    возвращаемый_тип имя_метода_1(список_параметров);
    возвращаемый_тип имя_метода_2(список_параметров);
    тип_завершённой_переменной имя_завершённой_переменной_1 = значение; // неявно объявлена как static final (константа)
    // ...
    возвращаемый_тип имя_метода_n(список_параметров);
    тип_завершённой_переменной имя_завершённой_переменной_n = значение;
}
```

**Свойства интерфейса:**
* если модификатор доступа отсутствует, то используется доступ по умолчанию и интерфейс доступен только другим членам
того пакета, в котором он объявлен;
* если интерфейс объявлен как public, то он может быть использован в любом другом коде и должен быть единственным
public-интерфейсом в файле, а имя файла должно совпадать с именем интерфейса;
* в объявлении интерфейса могут быть объявлены **переменные**. Они неявно объявляются как **public static final**
  (их нельзя изменить в классе, реализующем интерфейс) и должны быть инициализированы;
* **методы** неявно объявляются как **public**.

**Начиная с JDK 8 появились:**
* **методы с реализацией по умолчанию**.
  До JDK 8 в интерфейсе можно только объявлять методы без реализации. Все эти методы обязательно должны быть реализованы
  в классе (необязательная аннотация @Override). Начиная с JDK 8 можно объявлять методы **с реализацией по умолчанию** 
  (ключевое слово **default**), эти методы не обязательно переопределять (реализовывать) в классе, реализующем интерфейс.
  Появившиеся возможности:
  * Благодаря методам по умолчанию можно дополнить интерфейс новыми функциональными возможностями, при этом не нарушая
  уже существующий код (не изменяя классы, реализующие этот интерфейс).
  * В Java не поддерживается множественное наследование.
    Но методы по умолчанию предоставляют похожие возможности. Ведь можно в одном классе реализовать два интерфейса.
    И если в интерфейсах есть методы по умолчанию, то класс наследует _поведение_ от обоих интерфейсов.
    Но может возникнуть конфликт идинаковых имён методов (в интерфейсах и наследующем классе), который разрешается 
    правилами:
    * Приоритет отдаётся реализации метода в классе;
    * Если в классе реализуются два интерфейса с одинаковым методом по умолчанию, но метод не переопределяется 
      (реализуется) в данном классе, то возникает ошибка компиляции;
    * Если один интерфейс наследует другой интерфейс и в обоих интерфейсах определяется одинаковый метод по умолчанию,
      то в классе будет вызван метод наследующего интерфейса (который ближе к классу по иерархии наследования).
      Но можно вызвать и метод по умолчанию наследуемого интерфейса с помощью новой формы ключевого слова **super**:
      ```
      имя_интерфейса.super.имя_метода();
      Alpha.super.reset();
      ```  
* **статические методы** - ключевое слово **static** - метод можно вызывать независимо от объекта (реализации интерфейса),
  можно даже не реализовывать метод в интерфейсе.
  Статический метод интерфейса не наследуется ни реализующими классами, ни дочерними интерфейсами.
```
public interface SampleItf {
    int YES = 1;                                    // переменная (константа)
    int getAnswer();                                // объявление метода без реализации
    default String getString() {                    // объявление метода с реализацией по умолчанию (начиная с JDK 8)
        return "Объект типа String по умолчанию";
    }
    static int getDefaultNumber() {                 // объявление статического метода (начиная с JDK 8)
        return 0;
    }
}
```
Форма вызова статического метода интерфейса:
```
имя_интерфейса.имя_статического_метода();
int defNum = SampleItf.getDefaultNumber();
```

**Реализация интерфейса**

Используется ключевое слово **implements** в объявлении класса.

В классе реализуемый метод должен иметь модификатор доступа public и необязательную аннотацию @Override.

```
модификатор_доступа class имя_класса [extends имя_суперкласса]
    [implements имя_интерфейса_1 [, имя_интерфейса_2, ..., имя_интерфейса_n]] {
    // тело класса
}
```

**Особенности интерфейса и класса, реализующего интерфейс:**

* **Доступ к реализации класса через ссылку на интерфейс**.
  Т.е. можно объявить переменную с типом интерфейса и ссылаться ею на любой экземпляр любого класса, который реализует
  этот интерфейс (полиморфные возможности ссылки).
```
Callback c = new Client();  // Callback - интерфейс, Client - класс
c.method();                 // вызов только тех методов, которые объявлены в интерфейсе
```
* **Частичная реализация классом интерфейса**.
  Если класс реализует не все методы интерфейса, то он должен быть объявлен как абстрактный (ключевое слово **abstract**).
  Класс, наследуемый от абстрактного класса, должен реализовать методы интерфейса или тоже быть объявлен как абстрактный.
```
abstract class имя_класса implements имя_интерфейса {
}
```

**Вложенный интерфейс** (интерфейс-член) - это интерфейс, объявленный внутри класса или интерфейса.
* Может быть объявлен как public, private или protected (в отличие от интерфейса верхнего уровня, который может быть
  объявлен только как public или с уровнем доступа по умолчанию);
* За пределами класса или интерфейса, в котором объявлен вложенный интерфейс, его имя должно быть уточнено полностью,
  т.е. включать их имя через точку.

**Расширение интерфейса** - наследование интерфейсом другого интерфейса с помощью ключевого слова **extends**.
Он наследует все методы, определённые по цепочке наследования от родительских интерфейсов.
```
interface B extends A {
}
```
