# Prime Factors Kata 

## Descrizione
Scrivi una funzione che prende un numero intero positivo `n` e restituisce una lista contenente i suoi **fattori primi**, ordinati in ordine crescente.

## Requisiti
- Se `n == 1`, restituisci una lista vuota `[]` (1 non ha fattori primi).
- Se `n` è primo, restituisci `[n]`.
- Se `n` è composto, scomponilo nei suoi fattori primi in ordine crescente.
- Non usare librerie di fattorizzazione, l'algoritmo deve essere implementato manualmente.

## Esempi
```python
prime_factors(1)  # ➝ []
prime_factors(2)  # ➝ [2]
prime_factors(3)  # ➝ [3]
prime_factors(4)  # ➝ [2, 2]
prime_factors(6)  # ➝ [2, 3]
prime_factors(12) # ➝ [2, 2, 3]
prime_factors(15) # ➝ [3, 5]
prime_factors(28) # ➝ [2, 2, 7]
