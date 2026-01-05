class RabbitProblem {

    // Fibonacci logic
    static int rabbits(int months) {
        if (months == 0 || months == 1)
            return 1;
        return rabbits(months - 1) + rabbits(months - 2);
    }

    public static void main(String[] args) {
        int months = 6;
        System.out.println("Rabbit population after " + months + " months:");

        for (int i = 0; i <= months; i++) {
            System.out.println("Month " + i + ": " + rabbits(i));
        }
    }
}
