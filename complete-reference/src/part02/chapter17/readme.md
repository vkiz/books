# Глава 17. Пакет java.lang

Пакет java.lang автоматически импортируется во все программы. Он содержит классы и интерфейсы, которые составляют основу
всех программ на Java.

**Классы** из пакета java.lang:

|                         |                         |                         |                         |
| ----------------------  | ----------------------- | ----------------------- | ----------------------- |
| Boolean                 | Enum                    | Process                 | String                  |
| Byte                    | Float                   | ProcessBuilder          | StringBuffer            |
| Character               | InheritableThreadLocal  | ProcessBuilder.Redirect | StringBuilder           |
| Character.SubSet        | Integer                 | Runtime                 | System                  |
| Character.UnicodeBlock  | Long                    | RuntimePermission       | Thread                  |
| Class                   | Match                   | SecurityManager         | ThreadGroup             |
| ClassLoader             | Number                  | Short                   | ThreadLocal             |
| ClassValue              | Object                  | StackTraceElement       | Throwable               |
| Compiler                | Package                 | StrictMatch             | Void                    |
| Double                  |                         |                         |                         |

**Интерфейсы** из пакета java.lang:

|                         |                         |                                 |
| ----------------------  | ----------------------- | ------------------------------- |
| Appendable              | Cloneable               | Readable                        |
| AutoCloseable           | Comparable              | Runnable                        |
| CharSequence            | Iterable                | Thread.UncaughtExceptionHandler |

**Подпакеты** из пакета java.lang:

| Подпакет             | Описание                                                                                      |
| -------------------- | --------------------------------------------------------------------------------------------- |
| java.lang.annotation | поддержка аннотаций: интерфейс Annotation, перечисления ElementType, RetentionPolicy          |
| java.lang.instrument | класс ClassDefinition, интерфейсы Instrumentation, ClassFileTransformer                       |
| java.lang.invoke     | поддержка динамических языков, вызов методов: классы CallSite, MethodHandle, MethodType       |
| java.lang.management | управление виртуальной машиной JVM и исполняющей средой                                       |
| java.lang.ref        | более гибкое управление процессом сборки мусора                                               |
| java.lang.reflect    | поддержка рефлексии: классы Array,Method,Field,Constructor, инт. AnnotatedElement,Member,Туре |

* Рефлексия - это способность программы анализировать код во время выполнения. Можно получать сведения о полях, 
конструкторах, методах, модификаторах класса; необходимо для компонентов Java Beans.
Подробнее см. [главу 12](../../part01/chapter12/readme.md), [главу 30](../../part01/chapter30/readme.md).

## Классы-оболочки примитивных типов

Также см. [главу 12](../../part01/chapter12/readme.md).

**Оболочки типов** (классы-обёртки, wrapper) - это классы, заключающие примитивный тип данных в оболочку объекта.

**Классы оболочек типов** из пакета java.lang:

* Character - оболочка для char;
* Boolean - оболочка для boolean;
* Byte, Short, Integer, Long, Float, Double - оболочки числовых типов (byte, short, int, long, float, double);
  наследуются от абстрактного класса Number;
* Void - содержит единственное поле TYPE, в котором хранится ссылка на объект типа Class для типа void;
  экземпляры этого класса не создаются.

**Конструкторы классов** позволяют создавать объект из примитивного типа данных или из его строкового представления:
```
Character(char символ);

Boolean(boolean логическое_значение);   // true, false
Boolean(String строка);                 // например, "true", "True", "false", "False"

Byte(byte число);
Byte(String строка) throws NumberFormatException;

Short(short число);
Short(String строка) throws NumberFormatException;

Integer(int число);
Integer(String строка) throws NumberFormatException;

Long(long число);
Long(String строка) throws NumberFormatException;

Float(double число);
Float(float число);
Float(String строка) throws NumberFormatException;

Double(double число);
Double(String строка) throws NumberFormatException;
```

**Character и кодовая точка**

Начиная с JDK 5 класс Character поддерживает кодовые точки.

**Кодовая точка** - это 32-разрядный символ Unicode (int) в пределах от 0 до 10FFFF.

* символы в диапазоне от 0 до FFFF составляют _основную многоязыковую плоскость_;
* символы с кодом свыше FFFF - _дополнительные_.

Для представления дополнительных символов используется:
* суррогатная пара значений типа char (старший и младший суррогат);
* методы типа Character.codePointAt() для взаимного преобразования кодовых точек (типа int) и дополнительных символов.

## Класс Process

Абстрактный класс **Process** инкапсулирует процесс - выполняющуюся программу.

Класс Process используется как суперкласс для типов объектов, создаваемых c помощью:
* метода exec() из класса Runtime;
* метода start() из класса ProcessBuilder.

```
Process p = Runtime.getRuntime().exec("notepad");
ProcessBuilder pb = new ProcessBuilder("notepad"); Process p = pb.start();
```

Основные методы: destroy, extValue, getErrorStream, getInputStream, getOutputStream, waitFor;
а также destroyForcibly, isAlive, waitFor с периодом ожидания (добавлены в JDK 8).

## Класс Runtime

Класс **Runtime** инкапсулирует исполняющую среду (JVM).
Позволяет запускать процесс, загружать динамическую библиотеку, возвращать размер свободной и доступной программе
оперативной памяти, запускать сборку мусора, завершать работу JVM, включать или отключать трассировку инструкций 
и вызовов методов.

Можно получить ссылку на объект класса Runtime, но нельзя создать объект. Вызов из апплета или другого небезопасного кода
приводит к исключению SecurityException.
```
Runtime r = Runtime.getRuntime();
```

Основные методы: addShutdownHook, exec, exit, freeMemory, gc, getRuntime, halt, load, loadLibrary, removeShutdownHook,
runFinalization, totalMemory, traceInstructions, traceMethodCalls.

## Класс ProcessBuilder

Класс **ProcessBuilder** позволяет запускать процесс (стороннюю программу) с возможностью более гибкого управления им.
Класс позволяет кроме параметров командной строки установить ещё и текущий рабочий каталог, изменить параметры окружения.

Основные методы: command, directory, environment, inheritIO, redirectError, redirectErrorStream, redirectInput, 
redirectOutput, start.

Можно перенаправить (redirect) ввод/вывод процесса из/в файл с помощью абстрактного класса **ProcessBuilder.Redirect**.
Он инкапсулирует источник или адресат ввода-вывода, связанный с процессом.
Методы класса ProcessBuilder.Redirect: to, from, appendTo, type.

## Класс System

Класс **System** содержит статические методы и переменные.

Методы: arraycopy, clearProperty, console, currentTimeMillis, exit, gc, getenv, getProperties, getProperty, 
getSecurityManager, identityHashCode, inheritedChannel, lineSeparator, load, loadLibrary, mapLibraryName, nanoTime, 
runFinalization, setErr, setIn, setOut, setProperties, setProperty, setSecurityManager.
Вызов методов может порождать исключение SecurityException, если опреация не допускается диспетчером защиты.

Переменные: стандартные потоки ввода-вывода данных и ошибок (in, out, err).

**Свойства окружения** JVM, доступные в любом случае с помощью методов getProperties, getProperty
(есть также дополнительные свойства).

|                               |                               |                               |
| ----------------------------- | ----------------------------- | ----------------------------- |
| file.separator                | java.specification.version    | java.vm.version               |
| java.class.path               | java.vendor                   | line.separator                |
| java.class.version            | java.vendor.url               | os.arch                       |
| java.compiler                 | java.version                  | os.name                       |
| java.ext.dirs                 | java.vm.name                  | os.version                    |
| java.home                     | java.vm.specification.name    | path.separator                |
| java.io.tmpdir                | java.vm.specification.vendor  | user.dir                      |
| java.library.path             | java.vm.specification.version | user.home                     |
| java.specification.name       | java.vm.vendor                | user.name                     |
| java.specification.vendor     |                               |                               |

## Класс Object

Класс **Object** является суперклассом для всех остальных классов.
Ссылочная переменная класса Object может ссылаться на объект любого другого класса (в том числе и на массив).

Методы класса Object, доступные для любого объекта:

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
| **final**  void      wait()                    | Ожидает завершения другого потока исполнения (бесконечно)           |
| **final**  void      wait(long мсек)           | Ожидает зав. др. потока исп. (максимум, миллисекунд)                |
| **final**  void      wait(long мсек, int нсек) | Ожидает зав. др. потока исп. (максимум, миллисекунд и наносекунд)   |

## Класс Class

Класс **Class** инкапсулирует состояние класса или интерфейса во время выполнения.
Объект типа Class создаётся автоматически при загрузке класса, явно объявлять объект нельзя. Является обобщённым.
```
// объявление
Class Class<T> { }              // T - тип представляемого класса или интерфейса

// получение объекта типа Class
Class<?> cls = obj.getClass();  // вызов метода Object.getClass()
```
Класс Class позволяет получать информацию о типе объекта во время выполнения (RTTI) - об элементах, объявленных в классе: 
методах, полях, конструкторах, аннотациях с помощью методов getMethod(), getField(), getConstructor(), getAnnotation().
Используется для реализации компонентов Java Beans.

Рефлексия - это способность программы анализировать код во время выполнения.
Также см. [главу 12](../../part01/chapter12/readme.md).

Основные методы класса Class: forName, getAnnotation, getAnnotations, getClasses, getClassLoader, getConstructor,
getConstructors, getDeclaredAnnotations, getDeclaredConstructors, getDeclaredFields, getDeclaredMethods, getField,
getFields, getInterfaces, getMethods, getName, getProtectionDomain, getSuperclass, isInterface, newInstance, toString;
getAnnotationsByType, getDeclaredAnnotationsByType (с JDK 8).

## Класс ClassLoader

Абстрактный класс **ClassLoader** определяет порядок загрузки классов в исполняющей системе Java.
Можно создавать подклассы, расширяющие (extends) класс ClassLoader и реализующие его методы.

## Класс Math

Класс **Math** содержит статические методы - математические функции с плавающей точкой и две константы.

**Методы** (функции):
* Тригонометрические:
  * прямые (sin, cos, tan) (значение угла в радианах);
  * обратные (asin, acos, atan, atan2);
  * гиперболические (sinh, cosh, tanh);
* Экспоненциальные: cbrt, exp, expm1, log, log10, log1p, pow, scalb, sqrt;
* Округления: abs, ceil, floor, floorDiv, floorMod, max, min, nextAfter, nextDown, nextUp, rint, round, ulp;
* Прочие: addExact, copySign, decrementExact, getExponent, hypot, IEEEremainder, incrementExact, multiplyExact,
  negateExact, random, signum, subtractExact, toDegrees, toIntExact, toRadians.
  Заканчивающиеся на суффикс Exact (точный) добавлены в JDK 8, они генерируют исключение типа ArithmeticException, 
  если происходит переполнение при выполнении различных операций.

**Константы**: double E  ~= 2.72, double PI ~= 3.14.

## Класс StrictMath

Класс **StrictMath** - более точный аналог класса Math, содержит статические методы - математические функции.

Отличия StrictMath и Math:
* методы из класса StrictMath гарантируют практически одинаковую точность во всех реализациях Java;
* методы из класса Math обеспечивают меньшую точность ради повышения производительности.

## Класс Compiler

Класс **Compiler** позволяет компилировать байт-код в исполняемый машинный код вместо интерпретируемого.

## Классы потоков

Интерфейс Runnable, классы Thread, ThreadGroup, ThreadLocal, InheritableThreadLocal.

Интерфейс **Runnable** и класс **Thread** являются основой многопоточного программирования в Java.

Два способа создания нового потока исполнения:
* Реализация интерфейса Runnable (и его метода run);
* Расширение класса Thread (и переопределение его метода run).

Cм. [главу 11](../../part01/chapter11/readme.md).

Класс **Thread** представляет поток исполнения.

Основные методы: activeCount, checkAccess, currentThread, dumpStack, enumerate, getAllStackTraces,
getContextClassLoader, getDefaultUncaughtExceptionHandler, getID, getName, getPriority, getStackTrace, getState,
getThreadGroup, holdsLock, interrupt, interrupted, isAlive, isDaemon, isInterrupted, join, run, setContextClassLoader,
setDaemon, setDefaultUncaughtExceptionHandler, setName, setPriority, setUncaughtExceptionHandler, sleep, start,
toString, yield. Не рекомендованы для использования (deprecated): stop, suspend, resume, countStackFrames.

Класс **ThreadGroup** представляет группу потоков исполнения.
Он позволяет управлять несколькими потоками (группой) как единым целым.
Конструкторы класса:
```
ТhreadGroup(String имя_группы);
ТhreadGroup(ТhreadGroup родительский_объект, String имя_группы);
```
Основные методы: activeCount, activeGroupCount, checkAccess, destroy, enumerate, getMaxPriority, getName, getParent,
interrupt, isDaemon, isDestroyed, list, parentOf, setDaemon, setMaxPriority, toString, uncaughtException.

Класс **ThreadLocal** служит для создания локальных переменных потоков исполнения.
У каждого потока исполнения будет своя копия локальной переменной.

Класс **InheritableThreadLocal** служит для создания локальных переменных потоков исполнения, которые могут наследоваться.

## Класс Package

Класс **Package** содержит информацию о пакете (имя, заголовок, версия, вендор и др.), а также аннотациях пакета.

Основные методы: getAnnotation, getAnnotations, getDeclaredAnnotations, getImplementationTitle, getImplementationVendor,
getImplementationVersion, getName, getPackage, getPackages, getSpecificationTitle, getSpecificationVendor,
getSpecificationVersion, hashCode, isAnnotationPresent, isCompatibleWith, isSealed, toString;
getAnnotationsByType, getDeclaredAnnotation, getDeclaredAnnotationsByType (c JDK 8).

## Класс RuntimePermission

Класс **RuntimePermission** относится к механизму защиты Java, управляет разрешениями времени выполнения.

## Класс Throwable

Класс **Throwable** является вершиной иерархии классов исключений в Java.

Cм. [главу 10](../../part01/chapter10/readme.md).
