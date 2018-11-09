package edu.vtc.cis2271;

/**
 * Declare a class ComboLock that works like the combination lock in a gym locker, as shown here.
 * The lock is constructed with a combination—three numbers between 0 and 39. The reset method
 * resets the dial so that it points to 0. The turnLeft and turnRight methods turn the dial by
 * a given number of ticks to the left or right. The open method attempts to open the lock.
 * The lock opens if the user first turned it right to the first number in the combination,
 * then left to the second, and then right to the third.
 */

/**
 * ComboLock - Homework 3 P8.7
 * @author Bram Moreinis
 *
 */

public class ComboLock {

    public ComboLock(int secret1, int secret2, int secret3) {
        _secret1 = secret1;
        _secret2 = secret2;
        _secret3 = secret3;
        _current = 0;
        _status = 0; // note: 0 = closed 1 = rightS1, 2 = 1 & leftS2, 3 = ready, 4 = open
    }

    public void reset() {
        _status = 0;
        _current = 0;
        System.out.println("Lock is re-set");
    }

    public void turnLeft(int ticks) {
        _current = _current - ticks;
        if (_current < 0) {
            _current = 39 - _current;
        }
        System.out.println("Left ticks = [" + ticks + "] and current = " + _current);
        if (_status == 1 && _current == _secret2) {
            _status = 2;

        } else _status = 0;
    }

    public void turnRight(int ticks) {
        _current = _current + ticks;
        if (_current > 39) {
            _current = _current - 39;
        }
        System.out.println("Right ticks = [" + ticks + "] and current = " + _current);
        if (_status == 0 && _current == _secret1) {
            _status = 1;
        } else if (_status == 2 && _current == _secret3) {
            _status = 3;
        } else _status = 0;
    }

    public void open() {
        if (_status == 3) {
            _status = 4;
            System.out.println("Lock is open.");
        } else {
            _status = 0;
            System.out.println("Lock does not open.");
        }
    }

    private int _secret1;
    private int _secret2;
    private int _secret3;
    private int _status;
    private int _current;

    /**
     * Place the following in Main.java to test.
     * Output will be:
     * <p>
     * Lock is re-set
     * Right ticks = [23] and current = 23
     * Left ticks = [18] and current = 5
     * Right ticks = [9] and current = 14
     * Lock does not open.
     * Lock is re-set
     * Right ticks = [36] and current = 36
     * Left ticks = [12] and current = 24
     * Right ticks = [12] and current = 36
     * Lock is open.
     */


    public static void main(String[] args) {
        ComboLock CurrentLock = new ComboLock(36, 24, 36);
        CurrentLock.reset();
        CurrentLock.turnRight(23);
        CurrentLock.turnLeft(18);
        CurrentLock.turnRight(9);
        CurrentLock.open();
        CurrentLock.reset();
        CurrentLock.turnRight(36);
        CurrentLock.turnLeft(12);
        CurrentLock.turnRight(12);
        CurrentLock.open();
    }
}

