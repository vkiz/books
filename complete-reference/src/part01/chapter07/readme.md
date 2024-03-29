# Глава 7. Подробно о методах и классах

## **Перегрузка**

* **Перегрузка методов** (overload) - это определение в классе двух и более методов с одинаковым именем, 
но отличающимися параметрами. Могут отличаться тип и/или количество параметров метода, а также тип возвращаемого 
методом значения.

Перегрузка методов является одной из составляющих в реализации полиморфизма.

Какой метод из перегруженных будет вызван, определяется проверкой соответсвия аргументов (переданных значений при вызове
метода) и параметров метода.

* **Перегрузка конструкторов** класса подобна перегрузке методов.

## **Передача аргументов**

В программировании существует два способа передачи аргументов методу: по значению и по ссылке.
* Аргумент примитивного типа передаётся по значению, создаётся копия аргумента и изменение переменной внутри метода 
  никак не влияет на значение переданной переменной.
* Объект передаётся по ссылке, поэтому изменение объекта в теле метода влияет на исходный объект, указанный в качестве
  аргумента.
  
  **Примечание**: считается, что в Java все аргументы передаются по значению (даже объекты). Когда методу передаётся
  ссылка на объект, то сама ссылка передаётся способом вызова по значению. В теле метода используется копия ссылки, но 
  которая ссылается на один и тот же исходный объект.

## **Рекурсия**

**Рекурсия метода** - это возможность метода вызывать самого себя. Рекурсия вообще - это процесс определения чего-либо 
относительно самого себя.

Применяется, например, в расчёте факториала, быстрой сортировке, алгоритмах ИИ.

**Плюсы**: Рекурсия используется для реализации алгоритмов более простым и понятным способом, чем с помощью итераций.

**Минусы**: Рекурсия использует стек и слишком большое количество вызовов рекурсивного метода может привести к 
переполнению стека (возникновению исключения). Выполняется медленнее итерационных аналогов из-за вызовов метода.

## **Управление доступом**

**Управление доступом** - одна из составляющих частей инкапсуляции.
Это механизм управления доступом к членам класса из отдельных частей программы.

**Составляющие** части механизма управления доступом:
* **Модификатор доступа** - это способ доступа к члену класса (public, private, protected, доступ по умолчанию):
  * **public** (открытый) - член класса доступен из любого кода (включая код из других классов и пакетов);
  * **private** (закрытый) - доступен только членам этого же класса;
  * **protected** (защищённый) - член класса доступен для любого кода из текущего пакета;
    также доступен за пределами текущего пакета, но только в классах, являющимися наследниками данного класса;
  * **доступ по умолчанию** (отсутствие модификатора доступа) - член класса доступен для кода только из текущего пакета,
    в котором находится класс.
* **Пакет** - группировка классов (контейнер классов).

На практике стремятся сделать переменные-члены класса закрытыми, а доступ к ним извне класса осуществлять с помощью
методов (setX, getX - сеттеры, геттеры).

## **Ключевое слово static**

Член класса, объявленный с ключевым словом **static** является статическим - он доступен ДО создания экземпляра класса,
без ссылки на объект.

Переменная, объявленная как static, является глобальной. И если создаются много экземпляров класса (объектов), то
все эти объекты используют одну и ту же статическую переменную (одно и то же значение для всех объектов).

**Статическими могут быть переменные и методы класса.**

**Ограничения статических методов**:
* Могут непосредственно вызывать только другие статические методы;
* Им непосредственно доступны только другие статические переменные;
* Не могут использовать ссылки на класс (this, super).

**Статический блок кода**

Если для инициализации статических переменных нужно произвести вычисления, то нужно объявить в классе
статический блок кода. Этот блок кода выполнится первым и только один раз при первой загрузке класса.
```
class StaticExample {
    static int a = 3;
    static int b;
    // ...
    static {
        b = a * 100;
        System.out.println("Статический блок кода инициализирован");
    }
}
```

**Для доступа к статической переменной или методу используется имя класса и операция-точка**.
Именно имя класса, а не экземпляра.
```
имя_класса.имя_статической_переменной;
имя_класса.имя_статического_метода();

class StaticExample {
    static int a = 300;
    static int b = 100;
    static void printA() {
        System.out.println("a = " + a);
    }
}

class StaticByName {
    public static void main(String[] args) {
        StaticExample.printA();
        System.out.println("b = " + StaticExample.b);
    }
}
```

## **Ключевое слово final**

Ключевое слово **final** предотвращает изменение содержимого члена класса.

Переменная класса, объявленная как final (завершённая) является **константой**.
Она должна быть инициализирована при объявлении или в конструкторе класса.

Ключевое слово **final** можно использовать **тремя способами**:

* в **переменных** класса, в параметрах метода, в локальных переменных метода - для объявления константы;
  ```
  final int FILE_NEW = 1;
  ```
  
* в объявлении **метода** - для запрета его переопределения;
  ```
  class A {
      final void meth() {   // Это завершённый метод.
          // ...
      }
  }
  
  class B extends A {
      void meth() {         // Ошибка, метод недопустим, он не может быть переопределён.
          // ...
      }
  }
  ```
  
* в объявлении **класса** - для запрета его наследования.
  ```
  final class A {
      // ...
  }
  
  class B extends A {       // Ошибка, класс B недопустим, т.к. класс A не может иметь подклассы.
      // ...
  }
  ```

## **Вложенные и внутренние классы**

**Вложенный класс** - это класс, определённый внутри другого класса. Можно также определять вложенный класс внутри 
блока кода. Появился начиная с Java 1.1. Удобны для создания обработчиков событий.

**Область действия** вложенного класса ограничена областью действия внешнего класса.
Вложенный класс имеет доступ к членам класса (в том числе закрытым), в который он вложен.
Но внешний класс не имеет доступа к членам вложенного класса.

**Два типа вложенных классов**:
* Статический - который объявляется с модификатором static. Он должен обращаться к нестатическим членам внешнего класса
  через объект. Т.е. вложенный статический класс не может непосредственно ссылаться на нестатические члены своего
  внешнего класса.
* Нестатический - внутренний класс.

**Внутренний класс** - это нестатический вложенный класс. Он имеет доступ ко всем переменным и методам своего внешнего 
класса и может непосредственно ссылаться на них так же, как и остальные нестатические члены внешнего класса.
Внутренний класс можно определять в области действия любого блока кода (например, внутри метода или даже в теле цикла).

## **Аргументы командной строки**

**Аргументы командной строки** - это информация, которая передаётся во время запуска программы в метод main() 
в виде строки сразу после имени программы.
В исходном коде программы аргументы командной строки хранятся в виде символьных строк в массиве args типа String.
```
class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
```

## **Аргументы переменной длины**

**Аргументы переменной длины** (varargs, variable-length arguments) - это языковое средство, добавленное в JDK 5,
позволяющее методу принимать переменное количество аргументов. Аргументы обозначаются тремя точками (...).
Метод с аргументами переменной длины может вызываться без аргументов или с несколькими аргументами.

```
static void vaTest(int ... v) { // Метод с аргументами переменной длины. Переменная v является массивом.
    System.out.println("Количество переданных в метод аргументов = " + v.length);
    System.out.println("Значения аргументов:");
    for (int x : v) {
        System.out.println(x);
    }
}
```

У метода с аргументами переменной длины могут быть и обычные параметры, но параметр переменной длины (...)
может быть только один и быть последним среди всех параметров.
```
int doAction(int a, int b, double c, int ... vals) {
    // ...
}
```

Метод с аргументами переменной длины можно **перегружать** тремя способами:
* разными типами аргументов переменной длины:
  vaTest(int ... v) и vaTest(double ... v);
* добавлением обычных параметров:
  vaTest(int ... v) и vaTest(String s, int ... v);
* только обычными параметрами, без аргументов переменной длины:
  vaTest(int ... v) и vaTest(int x).
