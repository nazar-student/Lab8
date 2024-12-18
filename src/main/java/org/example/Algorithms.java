package org.example;

public class Algorithms {

    // 1. Пошук мінімального елемента масиву позитивних чисел
    public int findMinPositive(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num > 0 && num < min) {
                min = num;
            }
        }
        if (min == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Масив не містить позитивних чисел");
        }
        return min;
    }

    // 2. Розрахунок суми елементів масиву, який містить лише від'ємні числа
    public int sumNegativeArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num >= 0) {
                throw new IllegalArgumentException("Масив містить неприпустимі значення (позитивні або нуль)");
            }
            sum += num;
        }
        return sum;
    }

    // 3. Алгоритм розрахунку N-го елемента послідовності Фібоначчі
    public long calculateFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Індекс має бути невід'ємним числом");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        long prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            long temp = curr;
            curr += prev;
            prev = temp;
        }
        return curr;
    }

    // 4. Алгоритм розрахунку сили струму на ділянці кола (за законом Ома: I = U / R)
    public double calculateCurrent(double voltage, double resistance) {
        if (resistance == 0) {
            throw new IllegalArgumentException("Опір не може бути нулем");
        }
        return voltage / resistance;
    }
}
