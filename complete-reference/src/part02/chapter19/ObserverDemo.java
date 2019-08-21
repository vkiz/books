package part02.chapter19;

import java.util.Observable;    // class     (наблюдаемый)
import java.util.Observer;      // interface (наблюдатель)

/**
 * Наблюдающий класс, ведёт наблюдение. Реализует интерфейс Observer.
 * Метод update() будет вызван когда наблюдаемый объект оповестит о том, что он изменился,
 * т.е. после вызова методов setChanged() и notifyObservers().
 */
class Observer1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Вызван метод Observer1.update(), аргумент = " + ((Integer)arg).intValue());
    }
}

/**
 * Второй наблюдающий класс, ведёт наблюдение.
 */
class Observer2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Вызван метод Observer2.update(), аргумент = " + ((Integer)arg).intValue());
    }
}

/**
 * Наблюдаемый класс. Расширяет класс Observable.
 */
class Observed extends Observable {
    /**
     * Произвольный метод, в котором наблюдаемый объект изменяется
     * и уведомляет объект наблюдателя о своём изменении.
     * @param n количество изменений
     */
    void counter(int n) {
        for ( ; n >= 0; n--) {
            setChanged();                       // устанавливает флаг того, что объект изменился
            notifyObservers(new Integer(n));    // оповещает всех наблюдателей об изменении, дополнительно передаёт данные в аргументе
            // просто задержка 100 мс.
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("Ожидание прервано");
            }
        }
    }
}

/**
 * Пример наблюдения за изменением объекта.
 * Наблюдают сразу два наблюдателя.
 *
 * Вывод:
 * Вызван метод Observer2.update(), аргумент = 3
 * Вызван метод Observer1.update(), аргумент = 3
 * Вызван метод Observer2.update(), аргумент = 2
 * Вызван метод Observer1.update(), аргумент = 2
 * Вызван метод Observer2.update(), аргумент = 1
 * Вызван метод Observer1.update(), аргумент = 1
 * Вызван метод Observer2.update(), аргумент = 0
 * Вызван метод Observer1.update(), аргумент = 0
 */
class ObserverDemo {
    public static void main(String[] args) {
        // наблюдаемый объект
        Observed observed = new Observed();

        // объекты-наблюдатели
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        // добавление наблюдателей
        observed.addObserver(observer1);
        observed.addObserver(observer2);

        // вызов метода с изменением наблюдаемого объекта
        observed.counter(3);
    }
}
