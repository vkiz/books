# Глава 8. Наследование

**Наследование** - один из принципов объектно-ориентированного программирования, позволяющий создавать иерархии классов.

Наследуемый класс называется **суперклассом**, а наследующий - **подклассом**.

Используется ключевое слово **extends**.
Общая форма объявления класса, который наследуется от суперкласса:
```
class имя_подкласса extends имя_суперкласса {
    // тело класса
}
```

```
// Суперкласс
class A {
    int i, j;
    void printIJ() {
        System.out.println("i и j: " + i + " " + j);
    }
}

// Подкласс
class B extends A {
    int k;
    void printK() {
        System.out.println("k: " + k);
    }
    void printIJK {
        System.out.println("i, j, k: " + i + " " + j + " " + k);
    }
}
```

**Особенность суперкласса**:
Переменной суперкласса может быть присвоена ссылка на любой подкласс, производный от этого суперкласса.
Это очень важно, т.к. используется в Java для вызовов переопределённых методов во время выполнения
(см. дальше "переопределение методов" и "динамическая диспетчеризация методов").
```
A sup = new A();
B sub = new B();
sup = sub;
```

**Особенности подкласса**:

* Подкласс наследует все члены, определённые в суперклассе, добавляя к ним собственные, особые характеристики;
* Хотя подкласс включает в себя все члены суперкласса, но он **не имеет доступа** к членам суперкласса, которые 
  объявлены как **private**;
* В Java для создаваемого подкласса можно указать только один суперкласс. Т.е. не поддерживается множественное 
  наследование классов. Но класс может дополнительно реализовать (implements) много интерфейсов;
* Чтобы из подкласса получить ссылку на суперкласс существует ключевое слово **super**.
  Ключевое слово super в подклассе содержит ссылку на его суперкласс.

**Две формы** ключевого слова **super**:
* Для вызова конструктора суперкласса.
  Вызов метода super() должен быть первым оператором в конструкторе подкласса.
  ```
  super(список_аргументов_конструктора_суперкласса);
  ```
* Для обращения к члену суперкласса (переменной или методу), скрываемому членом подкласса (т.е. имеющему такое же имя).
  Здесь ссылка super действует подобно ключевому слову this, но super ссылается на суперкласс (в отличие от this,
  которая ссылается на текущий класс).
  ```
  super.имя_члена_суперкласса
  
  class A {
      int i;
  }
  class B extends A {
      int i; // этот член скрывает член i из класса A
      B(int a, int b) {
          super.i = a;  // член i из класса A
          i = b;        // член i из класса B
      }
  }
  ```

**Порядок вызова конструкторов**

В Java можно создавать иерархию классов с любым количеством уровней наследования.

В иерархии классов конструкторы вызываются **в порядке наследования**, начиная с суперкласса и кончая подклассом.
Это логично, ведь суперклассу ничего неизвестно о своих подклассах и его инициализация должна проходить независимо от
инициализации подклассов, т.е. в первую очередь.

## **Переопределение методов**

**Переопределение методов** (override) - это создание в иерархии классов методов **с одинаковыми именами и сигнатурой 
типов**. Переопределённый в подклассе метод вызывается в этом подклассе, а вариант метода суперкласса с таким же именем 
и сигнатурой типов будет скрыт.

## **Динамическая диспетчеризация методов**

**Динамическая диспетчеризация методов** - это механизм, с помощью которого вызов переопределенного метода разрешается 
во время выполнения, а не компиляции. Основой для динамической диспетчеризации методов служит переопределение методов.

**Ссылочная переменная суперкласса может ссылаться на объект подкласса**.

Это позволяет вызывать переопределённые методы во время выполнения следующим образом:
когда переопределённый метод вызывается по ссылке на суперкласс, нужный вариант этого метода выбирается в Java
_в зависимости от типа объекта, на который делается ссылка в момент вызова_. По ссылке на разные типы объектов будут 
вызываться разные варианты переопределённого метода. Т.е. _вариант переопределённого метода выбирается для выполнения
в зависимости от  типа объекта, на который делается ссылка, а не типа ссылочной переменной_.

**Динамическая диспетчеризация методов в Java реализует полиморфизм во время выполнения (динамический полиморфизм)**.
Динамический полиморфизм - один из самых эффективных механизмов ООП, обеспечивающий повторное использование и 
надёжность кода.

## **Абстрактный класс**

**Абстрактный класс** - это класс, который содержит объявление хотя бы одного абстрактного метода (без его реализации).

**Абстрактный метод** - это метод без реализации (только объявление). Этот метод должен быть переопределён (override)
в подклассе.

Модификатор abstract при объявлении класса и метода:
```
abstract class имя_класса {
    abstract тип_возвращаемый_методом имя_метода (список_параметров_метода);
}
```

**Свойства абстрактного класса**:
* Любой класс, содержащий один или больше абстрактных методов, должен быть объявлен как абстрактный;
* В абстрактном классе помимо абстрактных методов могут быть также и обычные методы (с реализацией);
* Нельзя создать объект абстрактного класса (экземпляр с помощью оператора new). Но можно использовать абстрактный
  суперкласс как ссылку на объект подкласса (полиморфизм во время выполнения);
* Нельзя объявлять абстрактные конструкторы или абстрактные статические методы;
* Любой подкласс, производный от абстрактного класса, должен реализовать все абстрактные методы из своего суперкласса
  или должен быть сам объявлен как абстрактный.

## **Класс Object**

Класс **Object** является суперклассом для всех остальных классов, ссылочная переменная класса Object может ссылаться
на объект любого другого класса (в том числе и на массив, т.к. массив реализован в виде класса).

Методы класса Object, доступные для любого объекта.

| Метод                                          | Назначение                                                          |
| ---------------------------------------------- | ------------------------------------------------------------------- |
|            Object    clone()                   | Создает новый объект, не отличающийся от клонируемого               |
|            boolean   equals(Object obj)        | Определяет равен ли один объект другому                             |
|            void      finalize()                | Вызывается перед удалением неиспользуемого объекта                  |
| **final**  Class<?>  getClass()                | Получает класс объекта во время выполнения                          |
|            int       hashCode()                | Возвращает хеш-код, связанный с вызывающим объектом                 |
| **final**  void      notify()                  | Возобновляет исполнение потока, ожидающего вызывающего объекта      |
| **final**  void      notifyAll()               | Возобновляет исполнение всех потоков, ожидающих вызывающего объекта |
|            String    toString()                | Возвращает символьную строку, описывающую объект                    |
| **final**  void      wait()                    | Ожидает другого потока исполнения                                   |
| **final**  void      wait(long мсек)           | (миллисекунд)                                                       |
| **final**  void      wait(long мсек, int нсек) | (миллисекунд, наносекунд)                                           |