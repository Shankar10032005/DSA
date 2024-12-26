function findNthFibonacci(n) {
    int a = 0;
    int b = 1;
    int start = 2;
    while (n > start) {
        int temp = a;
        a = b;
        b = temp + a;
        start += 1;
    }
    return b;
}
