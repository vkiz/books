﻿# Глава 1. История и развитие языка Java

Разработка и усовершенствование языков программирования обусловлены двумя основными причинами:
* Адаптация к изменяющимся средам и областям применения;
* Реализация улучшений и усовершенствований в области программирования.

## Происхождение Java

Язык **Java** тесно связан с языком C++, который, в свою очередь, является прямым наследником языка C.
Многие особенности Java унаследованы от обоих этих языков. От C язык Java унаследовал свой синтаксис, а многие его
объектно-ориентированные свойства были перенесены из C++.

* Язык **C** - _компилируемый, статически типизированный, процедурный язык программирования;
методика программирования - структурное программирование_.
Изобретён и реализован в 1972 году (в период с 1969 по 1973 годы) Деннисом Ритчи (Dennis Ritchie),
сотрудником Bell Laboratories, на ЭВМ DEC PDP-11 и ОС UNIX. Язык C явился развитием языка B,
изобретённым Кеном Томпсоном (Kenneth Thompson), сотрудником Bell Laboratories в 1969 году.
Язык B произошёл от языка BCPL, который разработал Мартин Ричардс в 1966 году в Кембриджском университете.
Язык C был формально стандартизован в 1989 году Американским национальным институтом стандартов
(American national standards institute, ANSI) - сформирован стандарт языка ANSI C (по-другому, C89).
С тех пор сменилось несколько стандартов языка: ANSI C (C89), C90, C99, C11, C18.
Считается, что создание языка C стало началом современного этапа развития языков программирования.
До C языки программирования проектировали больше в академических целях.
Язык C был спроектирован, реализован, развит практикующими программистами и для программистов.
Язык C - мощный, эффективный, структурированный, широко применяется до сих пор.
Однако растущая _сложность программ_ явилась причиной для создания новой методики программирования и новых языков.
* Язык **C++** - _компилируемый, статически типизированный язык программирования; основная методика программирования -
объектно-ориентированное программирование (ООП)._ В ООП применяются принципы наследования, инкапсуляции и полиморфизма.
C++ поддерживает также парадигмы _обобщённого, процедурного, метапрограммирования_.
Создан в 1983 году (ранняя версия "C with Classes" в 1979 году) Бьёрном Страуструпом (Bjarne Stroustrup),
сотрудником Bell Laboratories. Основные стандартизованные Международной организацией по стандартизации
(International Organization for Standardization, ISO) версии языка C++: C++98, C++03, C++11, C++14, C++17.

## Создание Java

Язык **Java** - _строго типизированный объектно-ориентированный язык программирования. Поддерживает также парадигмы
структурного, императивного, функционального программирования._
Разработку языка начали в 1991 году _Джеймс Гослинг_ (James Gosling), Патрик Нотон (Patrick Naughton), Крис Уарт
(Chris Warth), Эд Франк (Ed Frank) и Майк Шеридан (Mark Sheridan), сотрудники компании Sun Microsystems, Inc.
Изначально язык назывался Oak ("Дуб"), разрабатывался Джеймсом Гослингом для программирования бытовых электронных
устройств. Впоследствии он был переименован в Java и стал использоваться для написания клиентских приложений
и серверного программного обеспечения. Назван в честь марки кофе Java, которая, в свою очередь, получила наименование
одноимённого острова (Ява). _Дата официального выпуска языка Java - **23 мая 1995 года**_.
Первоначальной причиной разработки Java была _необходимость в независящем от платформы языке_ (т.е. архитектурно
нейтральном, переносимом между разными аппаратными платформами) для написания ПО для бытовых электронных устройств.
C началом бурного развития Всемирной паутины (World Wide Web) и Интернет (Internet) возникла та же самая необходимость
в независящем от платформы языке. И разработчики Java перенесли своё внимание на программирование для Интернет.
Развивался веб и параллельно разработчики языка Java адаптировали язык для написания программ для веб, распределённых
вычислительных систем.

_Программы на Java транслируются в **байт-код** - оптимизированный набор инструкций, который выполняет исполняющая
система - **виртуальная машина Java** (Java Virtual Machine, **JVM**)._ JVM - это основная часть исполняющей системы
Java (_Java Runtime Environment, **JRE**_), JRE состоит из виртуальной машины JVM и библиотеки Java-классов.
Реализации JVM созданы для разных аппаратных платформ. Первоначальная версия JVM представляла собой
_интерпретатор_ байт-кода. Чуть позже для повышения производительности создали технологию _**HotSpot**_, которая
представляет собой _**динамический компилятор**_ (Just-In-Time, _**JIT**-компилятор_) байт-кода. Если JIT-компилятор
входит в состав JVM, то избранные _фрагменты байт-кода компилируются в исполняемый код_ по частям, в реальном времени
и по требованию. При этом JVM выполняет различные проверки и по-прежнему отвечает за целостность исполняющей среды,
обеспечивая _переносимость_ и _безопасность_ - основные факторы, обусловившие развитие Java для веб.

## Отличительные особенности Java

* **Переносимость** - выполнение программы в разных системах (процессорах, операционных системах).
Один и тот же код работает на всех системах (точнее говоря, в JVM, реализованных для этих систем). Переносимость
_достигается с помощью байт-кода и выполнении его в JVM_.
Слоган "Написано однажды, работает везде" (Write once, run anywhere/everywhere).
* **Безопасность** - Java-программа выполняется в исполняющей среде, которая изолирует программу от ресурсов ОС.
* **Простота** - синтаксически язык относительно простой, но в то же время мощный благодаря огромной библиотеке
Java-классов.
* **Объектная ориентированность** - "всё является объектом". Одновременно, примитивные типы данных не являются
объектами для увеличения производительности.
* **Надёжность**. Т.к. Java-программы выполняются в разнотипных системах, то для обеспечения надёжности на язык
накладывается ряд ограничений, которые также облегчают работу программиста. Это:
  * строгая типизация языка - проверка типов во время компиляции (во время выполнения проверка также выполняется);
  * автоматическое управление выделением и освобождением оперативной памяти (освобождение с помощью сборщика мусора);
  * объектно-ориентированный механизм обработки исключений.
* **Многопоточность** - поддержка написания многопоточных программ. Исполняющая система Java решает сложные вопросы
синхронизации процессов.
* **Архитектурная нейтральность** - независимость языка от изменяющихся операционных систем и процессоров для
достижения долговечности и переносимости кода. Например, постоянные размеры элементарных типов данных, независимо от
разрядности системы.
* **Интерпретируемость и высокая производительность** - компиляция в байт-код, интерпретируемый виртуальной машиной JVM.
Вместе с этим, JIT-компилятор выполняет налету компиляцию частей байт-кода в машиннозависимый, увеличивая
производительность. По последним оценкам, в среднем, программа, написанная на Java, выполняется всего в 1,8 раза
медленнее программы, написанной на C. Это заслуга оптимизированного байт-кода, JIT-компилятора, JVM в целом.
* **Распределённость** - язык Java адаптирован для распределённой среды Интернета, поддерживает семейство сетевых
протоколов TCP/IP. Обращение к сетевому ресурсу по унифицированному указателю информационного ресурса (URL) мало чем
отличается от обращения к файлу. Также поддерживается удалённый вызов методов (Remote Method Invocation, RMI) -
возможность вызывать методы из программ  через сеть.
* **Динамичность** - наличие в программах значительного объёма данных динамического типа. Они используются для
проверки прав и разрешения доступа к объектам во время выполнения.

## Эволюция языка Java

В настоящее время _**платформа Java**_ официально называется _**Java Platform, Standard Edition (сокращённо Java SE)**_,
далее следует номер версии продукта. _**Комплект разработчика называется Java Development Kit (JDK)**_.
Например, платформа Java SE 8, комплект разработчика JDK 8. Здесь номер 8 - это _номер версии продукта_.
Есть ещё внутренний _номер версии разработки_, в данном случае 1.8.

Язык Java постоянно развивается.
Один из способов внедрения новых возможностей в язык - это **Java Community Process (JCP)** - сформированный в 1998 году
формальный процесс, который позволяет заинтересованным лицам участвовать в формировании будущих версий спецификаций
платформ языка Java.

### Версии Java

* **Java 1.0** (кодовое имя Lucatjuh, выпуск 23 января 1996 года компанией **Sun Microsystems, Inc**).
* **Java 1.1** (19 февраля 1997 года). Значимые нововведения:
  * Внутренние классы;
  * Изменённая система событий AWT;
  * JavaBeans (классы-компоненты, написанные по определённым правилам);
  * JDBC;
  * RMI;
  * Ограниченная рефлексия.
* **J2SE 1.2** (кодовое имя Playground, 8 декабря 1998 года).
Это новая базовая версия платформы - Java 2 Platform Standard Edition (J2SE), цифра "2" означает второе поколение.
В этой версии много нововведений и усовершенствований:
  * Swing;
  * Collections Framework;
  * Java 2D;
  * Полная поддержка Unicode;
  * Поддержка воспроизведения аудиофайлов;
  * Полная поддержка технологии CORBA;
  * Поддержка технологии drag-and-drop;
  * Библиотека Accessibility;
  * Policy-файлы;
  * Цифровые сертификаты пользователя;
  * Усовершенствована виртуальная машина JVM - в неё включён **JIT-компилятор**, увеличивший производительность;
  * Усовершенствованы инструменты JDK, включая поддержку профилирования Java-программ.
* **J2SE 1.3** (кодовое имя Kestrel, 8 мая 2000 года) - модернизация версии J2SE 1.2, расширившая уже существующие
функциональные возможности среды разработки;
* **J2SE 1.4** (кодовое имя Merlin, 6 февраля 2002 года). Нововведения:
  * Новое ключевое слово assert;
  * Цепочки исключений;
  * Подсистема ввода-вывода на основе каналов (New I/O, NIO).
  Основные отличия между Java IO и Java NIO:
  IO - потокоориентированный, блокирующий (синхронный) ввод-вывод;
  NIO - буфер-ориентированный, неблокирующий (асинхронный) ввод-вывод, селекторы;
  * Изменения в Collections Framework;
  * Изменения в классах, предназначенных для работы в сети.
* **J2SE 5** (кодовое имя Tiger, 30 сентября 2004 года). В эту версию внесён ряд революционных изменений,
которые изменили синтаксис, семантику языка:
  * Обобщения (средства обобщённого программирования, generics), позволившие создавать классы и методы
  с полями и параметрами произвольного объектного типа. С использованием данного механизма реализованы
  новые версии коллекций стандартной библиотеки Java;
  * Аннотации, давшие возможность добавления в текст программы метаданных, не влияющих на выполнение кода,
  но допускающих использование для получения различных сведений о коде и его исполнении;
  * Автоупаковка и автораспаковка (autoboxing/unboxing) - автоматическое преобразование между
  скалярными типами (примитивными) Java и соответствующими типами-обёртками, например, между int и Integer;
  * Перечисления (перечислимый тип, enum) со следующими возможностями:
    * Является полноценным классом Java, т.е. может иметь конструктор, поля, методы, в т.ч. скрытые и абстрактные;
    * Может реализовывать интерфейсы;
    * Для перечислений имеются встроенные методы, дающие возможность получения значений типа по имени,
    символьных значений, соответствующих именам, преобразования между номером и значением,
    проверки типа на то, что он является перечислимым;
  * Методы с неопределённым числом параметров (аргументы переменной длины, varargs);
  * Усовершенствованный цикл по коллекции элементов (for в стиле for each);
  * Статический импорт;
  * Форматированный ввод-вывод;
  * Утилиты параллельной обработки.
* **Java SE 6** (кодовое имя Mustang, 11 декабря 2006 года). В очередной раз изменено имя платформы, теперь это
Java Platform, Standard Edition 6. В этой версии нет дополнений к числу основных языковых средств Java.
Однако, в эту версию добавлено следующее:
  * Расширена библиотека API;
  * Ряд усовершенствований в исполняющей системе JRE.
* **Java SE 7** (кодовое имя Dolphin, 7 июля 2011 года) - первая версия, выпущенная компанией **Oracle**.
Компания Oracle приобрела компанию Sun Microsystems (процесс длился с апреля 2009 года по январь 2010 года).
В качестве эталонной реализации Java SE 7 использован не проприетарный пакет JDK, а его открытая реализация OpenJDK.
Релиз новой версии платформы готовился при тесном сотрудничестве инженеров Oracle с участниками мировой экосистемы Java,
комитетом JCP (Java Community Process) и сообществом OpenJDK.
Эта версия содержит много новых средств, дополняющих язык, библиотеки Java, исполняющую систему:
  * **Изменения в языке** Java (в рамках Project Coin):
    * Строка (тип String) может управлять ветвлением в операторе switch;
    * Автоматическое управление ресурсами - с помощью расширения оператора try, называемого "try с ресурсами"
    (try-with-resources). Это работает при использовании интерфейса AutoCloseable.
    Например, потоки ввода-вывода могут теперь быть закрыты автоматически, когда они больше не нужны;
    * Улучшенная обработка исключений: два или больше исключения могут быть обработаны в одном блоке catch (...|...|...)
    (многократный перехват, multi-catch exceptions); повторное выбрасывание исключений (rethrowing exceptions) -
    передача возникшего исключения "вверх" по стеку вызовов; улучшен контроль соответствия типов повторно генерируемых
    исключений;
    * Двоичные целочисленные литералы (префикс "0b");
    * Символы подчёркивания в числовых литералах (разделяют цифры, улучшая читаемость кода);
    * Выведение типов при создании экземпляра обобщённого (generic) класса (с помощью ромбовидного оператора <>);
    * Упрощён вызов метода с переменным количеством аргументов (varargs), уменьшено количество предупреждений
    компилятора при вызове метода с переменным количеством аргументов;
    * Поддержка коллекций на уровне языка;
  * **Изменения в библиотеке** Java API:
    * Обновлена библиотека ввода-вывода NIO (настолько, что часто обозначается как NIO.2) - улучшена
    платформонезависимость, поддержка метаданных и символьных ссылок, работа с файловым вводом-выводом
    (пакеты java.nio.file и java.nio.file.attribute), полноценная работа с zip/jar архивами как с файловой системой;
    * Добавлен каркас Fork/Join Framework - обеспечивает поддержку _параллельного программирования_, повышающего
    эффективность выполнения кода на нескольких процессорах/ядрах (автоматическое использование нескольких процессоров).
    Если алгоритм возможно распараллелить, то используя Fork/Join Framework, существенно увеличиваем скорость выполнения
    программы;
    * JavaFX включён в состав Java SE 7 (начиная с Java SE 7 Update 2);
    * Добавлена поддержка Unicode 6.0;
    * Отделение языка пользователя (языка локали) и языка пользовательского интерфейса. Теперь форматирование текста
    и отображение в пользовательском интерфейсе имеют независимые локали;
    * Поддержка алгоритмов эллиптической криптографии на уровне библиотеки Java;
    * Поддержка сетевых протоколов IPv6, TLS 1.2, SCTP, Sockets Direct Protocol на уровне библиотеки;
    * XRender для X11 в Java 2D, улучшающий управление возможностями современных GPU;
    * Новое графическое API - позволяет создавать полупрозрачные окна, окна произвольный формы, смешивать тяжеловесную
    и легковесную графику;
    * Look-and-feel Nimbus включён в стандартный API - пакет javax.swing (уже шёл в комплекте начиная с JRE 6u10,
    но как проприетарное расширение - в пакете com.sun.java.swing);
    * Базы данных: JDBC обновлён до версии 4.1, Rowset до версии 1.1;
    * Обновлён стек XML, теперь используются версии JAXP 1.4, JAXB 2.2a, JAX-WS 2.2;
    * Новый синтезатор звука Gervill (на замену старому проприетарному);
    * Новый декаратор JXLayer;
    * MBean теперь могут сообщать о загрузке процессора как всей системы, так и JVM и умеют отправлять уведомления,
    когда происходит сборка мусора;
  * **Изменения в виртуальной машине**:
    * Добавлена поддержка языков программирования с динамической типизацией, таких как Ruby, Python и JavaScript
    (InvokeDynamic, в рамках мультиязыковой виртуальной машины - расширение JVM (семантики байт-кода), языка Java
    для поддержки динамически-типизированных языков, позволяющее взаимодействовать с динамическими языками
    практически без потери производительности);
    * Сжатые 64-битные указатели (доступны и в Java 6, с параметром -XX:+UseCompressedOops);
    * Строгая проверка class-файлов. Введён новый верификатор, получивший название "проверяющий типы"
    (typechecking verifier). Он работает несколько быстрее и поддерживает новые языковые возможности.
    Теперь class-файлы версии 51 (Java Standard Edition 7) или более поздней версии должны быть проверены
    typechecking-верификатором, JVM не должна переключаться на старый верификатор;
    * Модификация загрузчика классов (classloader): избежание тупиковых ситуаций (deadlock) в неиерархической топологии
    загрузки классов; существенно расширились возможности разработчика по загрузке классов;
    * Поддержка загрузки классов по URL;
    * Возможность закрытия ресурсов, открытых URLClassLoader (метод close). Теперь можно освободить ресурсы,
    которые открыл classloader.
* **Java SE 8** (кодовое имя Spider, 19 марта 2014 года).
Нововведения, усовершенствования, добавленные в этой версии:
  * **Изменения в языке**:
    * _**Лямбда-выражения**_ (lambda expressions) - это новое языковое средство (оператор ->), добавившее в язык
    возможности функционального программирования. Введение лямбда-выражений позволило сократить и упростить объём
    исходного кода, требующегося для определённых конструкций (например, анонимных классов), а также сильно повлияло
    на библиотеки Java, которые были оптимизированы с учётом лямбда-выражений, используя их.
    _Область действия лямбд_: доступ к переменным внешней области действия из лямбда-выражения очень схож с доступом
    из анонимных объектов. Можно ссылаться на переменные, объявленные как final, на экземплярные поля класса
    и статические переменные. При доступе к полям и статическим переменным в отличии от локальных переменных, можно
    записывать значения в экземплярные поля класса и статические переменные внутри лямбда-выражений.
    _Доступ к методам интерфейсов по умолчанию_: внутри лямбда-выражений запрещено обращаться к методам по умолчанию;
    * _**Метод по умолчанию в интерфейсе**_ - возможность определять неабстрактную _реализацию_ метода в интерфейсе
    (ключевое слово default). Если реализация такого метода отсутствует в классе, то используется
    его реализация по умолчанию в интерфейсе;
    * _**Функциональные интерфейсы**_. Каждой лямбде соответствует тип, представленный интерфейсом.
    _Функциональный интерфейс_ должен содержать ровно один абстрактный метод. Каждое лямбда-выражение
    этого типа будет сопоставлено объявленному методу. Также, поскольку методы по умолчанию не являются абстрактными,
    то можно добавлять в функциональный интерфейс сколько угодно таких методов.
    Можно использовать какие угодно интерфейсы для лямбда-выражений, содержащие ровно один абстрактный метод.
    Для того, чтобы гарантировать, что интерфейс содержит ровно один абстрактный метод, используется аннотация
    @FunctionalInterface. Если добавить второй абстрактный метод в функциональный интерфейс, то компилятор выдаст
    ошибку компиляции.
    _**Встроенные функциональные интерфейсы**_ (пакет java.util.function):
      * Предикаты - это функции, принимающие один аргумент, и возвращающие значение типа boolean. Интерфейс содержит
      различные методы по умолчанию, позволяющие строить сложные условия (and, or, negate);
      * Функции - принимают один аргумент и возвращают некоторый результат. Методы по умолчанию могут использоваться
      для построения цепочек вызовов (compose, andThen);
      * Поставщики (suppliers) - предоставляют результат заданного типа. В отличии от функций,
      поставщики не принимают аргументов;
      * Потребители (consumers) - представляют собой операции, которые производятся над одним входным аргументом;
      * Компараторы, которые добавляют в интерфейс различные методы по умолчанию;
    * _**Опциональные значения**_ (optionals) - не являются функциональными интерфейсами, однако являются удобным
    средством предотвращения NullPointerException. Опциональное значение - это по сути контейнер для значения, которое
    может быть равно null. Например, если нужен метод, который возвращает какое-то значение, но иногда он должен
    возвращать пустое значение. Вместо того, чтобы возвращать null, в Java 8 можно вернуть опциональное значение:
    Optional<String> optional = Optional.of("optStr");
    * _**Ссылки на методы и конструкторы**_. Java 8 позволяет передавать ссылки на методы или конструкторы с помощью
    ключевого слова "::" (classInstance1 = classInstance0::method; constr = Class::new;);
    * _**Потоки**_ (stream) для работы с коллекциями - для конвейерных, массовых (bulk) операций с коллекциями (пакет
    java.util.stream). Тип java.util.Stream представляет собой последовательность элементов, над которой можно
    производить различные операции. Потоки создаются на основе источников, например типов, реализующих
    java.util.Collection, таких как списки или множества (ассоциативные массивы maps не поддерживаются).
    Можно быстро создавать потоки, используя вызовы Collection.stream() или Collection.parallelStream().
    Потоки могут быть последовательными и параллельными. Операции над последовательными потоками выполняются
    в одном потоке процессора, над параллельными - используя несколько потоков процессора.
    _**Операции над потоками**_ бывают промежуточными (intermediate) или конечными (terminal).
    Конечные операции возвращают результат определенного типа, а промежуточные операции возвращают тот же поток.
    Таким образом, можно строить цепочки из несколько операций над одним и тем же потоком.
    Наиболее распространённые _операции над потоками_:
      * Промежуточные операции:
        * filter - принимает предикат, который фильтрует все элементы потока;
        * sorted - возвращает отсортированное представление потока. Элементы сортируются в обычном порядке,
        если не предоставить свой компаратор;
        * map - преобразовывает каждый элемент в другой объект при помощи переданной функции. Тип результирующего потока
        зависит от типа функции, которую передают при вызове map;
      * Конечные операции:
        * match - операция сопоставления - служит для проверки, удовлетворяет ли поток заданному предикату.
        Возвращает результат типа boolean;
        * count - возвращает количество элементов в потоке. Типом возвращаемого значения является long;
        * reduce - производит свёртку элементов потока по заданной функции. Результатом является опциональное значение;
    * Параллельная сортировка массивов и коллекций (parallelStream);
    * Ассоциативные массивы (maps) не поддерживают потоки, но вместо этого теперь поддерживают различные полезные методы,
    которые решают часто встречаемые задачи: putIfAbsent (не нужно делать проверку на null), forEach (производит
    операцию над каждым элементом массива), computeIfPresent, containsKey, remove (удаляет объект по ключу, только если
    этот объект ассоциирован с ключом), getOrDefault, merge (объединяет записи двух массивов);
    * _**Аннотации типов**_: В Java 8 аннотации являются повторяемыми - можно использовать множество аннотаций одного
    типа путём указания аннотации @Repeatable (использовать повторяемую аннотацию вместо аннотации-контейнера).
  * **Изменения в библиотеке** Java API:
    * Поддержка JavaFX 8, включена в состав JDK 8;
    * Новый API для работы с датами и временем (пакет java.time): классы Clock (для доступа к текущей дате и времени),
    ZoneId (часовые пояса), LocalTime (время с учётом часового пояса), LocalDate (конкретная дата),
    LocalDateTime (комбинация даты и времени);
    * Base64 декодер (java.util.Base64). Base64 - позиционная система счисления с основанием 64, широко используется
    в электронной почте для представления бинарных файлов в тексте письма, кодирования URL в веб-приложениях.
    Base64 использует символы A-Z, a-z и 0-9;
  * **Изменения в виртуальной машине**:
    * JavaScript-движок Nashorn - разрабатываемый полностью на языке программирования Java компанией Oracle.
    Целью является предоставление возможности встраивания JavaScript в приложения, написанные на языке Java
    в соответствии с JSR-223, разработка автономных (standalone) приложений на JavaScript.
