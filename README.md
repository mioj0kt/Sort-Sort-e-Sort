# URI Problema 1252 - Ordenação por Módulo 

## Descrição 📖

Este repositório contém a solução para o **Problema 1252** da plataforma **URI Online Judge**. O desafio é realizar uma ordenação personalizada com base no módulo de um conjunto de números, levando em consideração regras específicas para números pares e ímpares.

### Enunciado 📝

Você é solicitado a ordenar uma lista de números. Será dado um número inteiro positivo `M` e uma lista de `N` números inteiros. A ordenação deverá seguir as seguintes regras:

1. Ordenar os números em ordem crescente de acordo com o valor do seu **módulo M**.
2. Se houver empate nos valores dos módulos:
   - Números **ímpares** devem preceder números **pares**.
   - Entre dois números ímpares, o **maior** número precede o menor.
   - Entre dois números pares, o **menor** número precede o maior.
3. Números negativos seguem a convenção da linguagem C, onde o módulo de um número negativo nunca é maior que zero (ex.: `-100 MOD 3 = -1`).

### Exemplo: 💡

**Entrada**: 

`6 3   -10 5 3 -2 7 8 0 0`

**Saída**:

`6 3   -10 -2 8 7 5 3 0 0`

## Entrada 📥

A entrada consiste em vários casos de teste, cada um com:

- Dois inteiros `N` (0 < N ≤ 10000) e `M` (0 < M ≤ 10000), que indicam a quantidade de números e o módulo a ser utilizado.
- `N` números inteiros de 32 bits com sinal.
- A leitura é encerrada por uma linha contendo "0 0".

## Saída 📤

A saída deve conter os valores de `N` e `M`, seguidos pelos `N` números ordenados de acordo com as regras mencionadas. A última linha deve conter "0 0" para finalizar o programa.
