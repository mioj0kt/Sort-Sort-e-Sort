import java.util.Scanner;

class Number {
    int value;
    int mod;

    // Construtor
    public Number(int value, int mod) {
        this.value = value;
        this.mod = mod;
    }

    // Método para comparação personalizada
    public int compare(Number other) {
        int mod1 = this.value % this.mod;
        int mod2 = other.value % other.mod;

        // Ajuste para números negativos
        if (mod1 < 0) mod1 += this.mod;
        if (mod2 < 0) mod2 += other.mod;

        // Comparação caso o MOD dos dois números sejam diferentes
        if (mod1 != mod2) {
            return Integer.compare(mod1, mod2);
        }

        // Caso os MODs forem iguais
        boolean ehImpar1 = this.value % 2 != 0;
        boolean ehImpar2 = other.value % 2 != 0;

        if (ehImpar1 && !ehImpar2) { // Se o primeiro for impar e o segundo par
            return -1; // Então o primeiro vem antes, precede
        } else if (!ehImpar1 && ehImpar2) { // Se o primeiro for par e o segundo impar
            return 1; // Então o segundo vem antes
        }

        // Caso ambos sejam ímpares, o maior ímpar precede
        if (ehImpar1 && ehImpar2) {
            return Integer.compare(other.value, this.value); // Comparando maior valor
        }

        // Caso ambos sejam pares, o menor par precede
        if (!ehImpar1 && !ehImpar2) {
            return Integer.compare(this.value, other.value); // Comparando o menor valor
        }
        
        return 0;
    }
    
    // Método para retornar o valor do número
    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}

public class Main {
    public static void selectionSort(Number[] numbers){ // Ordenação por seleção
        int n = numbers.length;
        for (int i = 0; i < (n - 1); i++) {
            int menor = i;
            for (int j = (i + 1); j < n; j++){
                if (numbers[menor].compare(numbers[j]) > 0){
                    menor = j;
                }
            }
            Number temp = numbers[menor];
            numbers[menor] = numbers[i];
            numbers[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            // Caso de teste final, termina o programa
            if (N == 0 && M == 0) {
                System.out.println("0 0");
                break;// Sair do while para encerrar o programa
            }

            // Armazenando os números
            Number[] numbers = new Number[N];
            
            // Preenchendo o array de números
            for (int i = 0; i < N; i++) {
                int value = sc.nextInt();
                numbers[i] = new Number(value, M);
            }

            // Ordenando o array utilizando Selection Sort
            selectionSort(numbers);
            
            // Saída do resultado
            System.out.println(N + " " + M);
            for(int i = 0; i < N; i++){
                System.out.println(numbers[i]);
            }
        }
        sc.close();
    }
}
